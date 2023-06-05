package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.cte.TRetCTe;
import br.com.swconsultoria.cte.schema_300.enviCTe.TCTe;
import br.com.swconsultoria.cte.schema_300.enviCTe.TEnviCTe;
import br.com.swconsultoria.cte.schema_300.procCTe.TRetConsReciCTe;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TRetEnviCTe;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.CteRecepcao.CteRecepcaoStub;
import br.com.swconsultoria.cte.wsdl.CteRecepcaoSinc.CTeRecepcaoSincV4Stub;
import br.com.swconsultoria.cte.wsdl.CteRecepcaoSinc.CteRecepcaoSincStub;
import lombok.extern.java.Log;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Base64;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;

/**
 * Classe Responsavel por Enviar o Cte.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br -
 *         www.swconsultoria.com.br
 */
@Log
class EnvioCte {

	/**
	 * Metodo para Montar a CTE
	 *
	 * @param config
	 * @param enviCTe
	 * @param valida
	 * @return TEnviCTe
	 * @throws CteException
	 */
	static TCTe montaCte(ConfiguracoesCte config, TCTe enviCTe, boolean valida) throws CteException {
		try {

			/**
			 * Cria o xml
			 */
			String xml = XmlCteUtil.objectToXml(enviCTe);

			/**
			 * Assina o Xml
			 */
			xml = Assinar.assinaCte(config, xml, AssinaturaEnum.CTE);

			// Retira Quebra de Linha
			xml = xml.replaceAll(System.lineSeparator(), "");

			log.info("[XML-ASSINADO]: " + xml);

			/**
			 * Valida o Xml caso sejá selecionado True
			 */
			if (valida) {
				new Validar().validaXml(config, xml, ServicosEnum.ENVIO_CTE);
			}
			TCTe d = XmlCteUtil.xmlToObject(xml, TCTe.class);

			return d;

		} catch (Exception e) {
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
	static br.com.swconsultoria.cte.schema_300.procCTe.TRetCTe enviaCte(ConfiguracoesCte config, TCTe enviCTe)
			throws CteException {

		try {

			String xml = XmlCteUtil.objectToXml(enviCTe);

			OMElement ome = AXIOMUtil.stringToOM(xml);

			if (config.getEstado().equals(EstadosEnum.PR) || config.getEstado().equals(EstadosEnum.MT)
					|| config.getEstado().equals(EstadosEnum.MS)) {
				Iterator<?> children = ome.getChildrenWithLocalName("CTe");
				while (children.hasNext()) {
					OMElement omElement = (OMElement) children.next();
					if (omElement != null && "CTe".equals(omElement.getLocalName())) {
						omElement.addAttribute("xmlns", "http://www.portalfiscal.inf.br/cte", null);
					}
				}
			}

			log.info("[XML-ENVIO]: " + xml);
			
			//compactar com Gzip
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream);
			gzipOutputStream.write(ome.toString().getBytes());
			gzipOutputStream.close();
			byte[] compressedData = outputStream.toByteArray();

			CTeRecepcaoSincV4Stub.CteDadosMsg dados = new CTeRecepcaoSincV4Stub.CteDadosMsg();
			dados.setCteDadosMsg(Base64.getEncoder().encodeToString(compressedData));

						 
			CTeRecepcaoSincV4Stub stub = new CTeRecepcaoSincV4Stub( WebServiceCteUtil.getUrl(config, ServicosEnum.ENVIO_CTE));

			CTeRecepcaoSincV4Stub.CteRecepcaoResult result = stub.cteRecepcao(dados);

			return XmlCteUtil.xmlToObject(result.getExtraElement()[0].toString(),
					br.com.swconsultoria.cte.schema_300.procCTe.TRetCTe.class);

		} catch (XMLStreamException | JAXBException | IOException e) {
			throw new CteException(e.getMessage());
		}

	}

}
