package br.com.swconsultoria.cte;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.cteOS.TCTeOS;
import br.com.swconsultoria.cte.schema_300.retCTeOS.TRetCTeOS;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CTeRecepcaoOSV4Stub;
import lombok.extern.java.Log;

/**
 * Classe Responsavel por Enviar o Cte.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
@Log
class EnvioCteOS {

    /**
     * Metodo para Montar a CTE
     *
     * @param config
     * @param enviCTe
     * @param valida
     * @return TEnviCTe
     * @throws CteException
     */
    static TCTeOS montaCteOS(ConfiguracoesCte config, TCTeOS enviCTe, boolean valida) throws CteException {
        try {

            /**
             * Cria o xml
             */
            String xml = XmlCteUtil.objectToXml(enviCTe);

            /**
             * Assina o Xml
             */
            xml = Assinar.assinaCte(config, xml, AssinaturaEnum.CTE_OS);

            //Retira Quebra de Linha
            xml = xml.replaceAll(System.lineSeparator(), "");

            log.info("[XML-ASSINADO]: " + xml);

            /**
             * Valida o Xml caso sejá selecionado True
             */
            if (valida) {
                new Validar().validaXml(config, xml, ServicosEnum.ENVIO_CTE_OS);
            }

            return XmlCteUtil.xmlToObject(xml, TCTeOS.class);
        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    /**
     * Metodo para Enviar a CTE
     *
     * @param config
     * @param enviCTe
     * @return TRetEnviCTe
     * @throws CteException
     */
    static TRetCTeOS enviaCteOS(ConfiguracoesCte config, TCTeOS enviCTe)
            throws CteException {

        try {

            String xml = XmlCteUtil.objectToXml(enviCTe);
            OMElement ome = AXIOMUtil.stringToOM(xml);

            if (config.getEstado().equals(EstadosEnum.PR)
                    || config.getEstado().equals(EstadosEnum.MT)
                    || config.getEstado().equals(EstadosEnum.MS)) {
                Iterator<?> children = ome.getChildrenWithLocalName("CTe");
                while (children.hasNext()) {
                    OMElement omElement = (OMElement) children.next();
                    if (omElement != null && "CTe".equals(omElement.getLocalName())) {
                        omElement.addAttribute("xmlns", "http://www.portalfiscal.inf.br/cte", null);
                    }
                }
            }

            log.info("[XML-ENVIO]: " + ome);

        	//compactar com Gzip
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream);
			gzipOutputStream.write(ome.toString().getBytes());
			gzipOutputStream.close();
			byte[] compressedData = outputStream.toByteArray();

            
            CTeRecepcaoOSV4Stub.CteDadosMsg dadosMsg = new CTeRecepcaoOSV4Stub.CteDadosMsg();            
            dadosMsg.setString(Base64.getEncoder().encodeToString(compressedData));
           
           

            CTeRecepcaoOSV4Stub stub = new CTeRecepcaoOSV4Stub(
                    WebServiceCteUtil.getUrl(config, ServicosEnum.ENVIO_CTE_OS));
            CTeRecepcaoOSV4Stub.CteRecepcaoOSResult result = stub.cteRecepcaoOS( dadosMsg);

            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetCTeOS.class);

        } catch (IOException | XMLStreamException | JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

}
