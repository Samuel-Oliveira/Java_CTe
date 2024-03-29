package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.cteOS.TCTeOS;
import br.com.swconsultoria.cte.schema_400.retCTeOS.TRetCTeOS;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.cte_recepcao_os.CTeRecepcaoOSV4Stub;
import lombok.extern.java.Log;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;

/**
 * Classe Responsavel por Enviar o Cte.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
@Log
class EnvioCteOS {

    private EnvioCteOS() {}

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
            throw new CteException(e);
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
            log.info("[XML-ENVIO]: " + xml);

            CTeRecepcaoOSV4Stub.CteDadosMsg dadosMsg = new CTeRecepcaoOSV4Stub.CteDadosMsg();
            dadosMsg.setCteDadosMsg(XmlCteUtil.xmlToGZip(xml));

            CTeRecepcaoOSV4Stub stub = new CTeRecepcaoOSV4Stub(
                    WebServiceCteUtil.getUrl(config, ServicosEnum.ENVIO_CTE_OS));
            CTeRecepcaoOSV4Stub.CteRecepcaoOSResult result = stub.cteRecepcaoOS(dadosMsg);

            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetCTeOS.class);

        } catch (RemoteException | JAXBException e) {
            throw new CteException(e);
        }

    }

}
