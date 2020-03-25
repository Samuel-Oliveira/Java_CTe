package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.consReciCTe.TConsReciCTe;
import br.com.swconsultoria.cte.schema_300.retConsReciCTe.TRetConsReciCTe;
import br.com.swconsultoria.cte.util.*;
import br.com.swconsultoria.cte.wsdl.cteRetRecepcaoMS.CteRetRecepcaoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.transport.http.HTTPConstants;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe Responsavel Por pegar o Retorno da CTE, apos o Envio.
 *
 * @author Samuel Oliveira
 */
class ConsultaRecibo {

    /**
     * Metodo Responsavel Por Pegar o Xml De Retorno.
     *
     * @param config Configuracoes
     * @param recibo Número Do Recibo para Consulta
     * @return
     * @throws CteException
     */
    static TRetConsReciCTe reciboCte(ConfiguracoesCte config, String recibo) throws CteException {

        try {

            /**
             * Informaçoes do Certificado Digital.
             */

            TConsReciCTe consReciCTe = new TConsReciCTe();
            consReciCTe.setVersao(ConstantesCte.VERSAO.CTE);
            consReciCTe.setTpAmb(config.getAmbiente().getCodigo());
            consReciCTe.setNRec(recibo);

            String xml = XmlCteUtil.objectToXml(consReciCTe);

            LoggerUtil.log(ConsultaRecibo.class, "[XML-ENVIO]: " + xml);

            OMElement ome = AXIOMUtil.stringToOM(xml);

            if (config.getEstado().equals(EstadosEnum.MS)) {
                return envioStubMS(config, ome);
            } else {
                return envioStub(config, ome);
            }

        } catch (RemoteException | XMLStreamException | JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    private static TRetConsReciCTe envioStubMS(ConfiguracoesCte config, OMElement ome) throws CteException, RemoteException, JAXBException {

        CteRetRecepcaoStub.CteDadosMsg dadosMsg = new CteRetRecepcaoStub.CteDadosMsg();
        dadosMsg.setExtraElement(ome);

        CteRetRecepcaoStub stub = new CteRetRecepcaoStub(WebServiceCteUtil.getUrl(config, ServicosEnum.CONSULTA_RECIBO));

        CteRetRecepcaoStub.CTeCabecMsg cteCabecMsg = new CteRetRecepcaoStub.CTeCabecMsg();
        cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoUF()));
        cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

        CteRetRecepcaoStub.CteCabecMsgE cteCabecMsgE = new CteRetRecepcaoStub.CteCabecMsgE();
        cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

        // Timeout
        if (ObjetoCTeUtil.verifica(config.getTimeout()).isPresent()) {
            stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, config.getTimeout());
            stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT,
                    config.getTimeout());
        }
        CteRetRecepcaoStub.CteRetRecepcaoResult result = stub.cteRetRecepcao(dadosMsg, cteCabecMsgE);

        LoggerUtil.log(ConsultaRecibo.class, "[XML-RETORNO]: " + result.getExtraElement().toString());
        return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetConsReciCTe.class);
    }

    private static TRetConsReciCTe envioStub(ConfiguracoesCte config, OMElement ome) throws CteException, RemoteException, JAXBException {

        br.com.swconsultoria.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteDadosMsg dadosMsg = new br.com.swconsultoria.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteDadosMsg();
        dadosMsg.setExtraElement(ome);

        br.com.swconsultoria.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub stub = new br.com.swconsultoria.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub(WebServiceCteUtil.getUrl(config, ServicosEnum.CONSULTA_RECIBO));

        br.com.swconsultoria.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteCabecMsg cteCabecMsg =
                new br.com.swconsultoria.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteCabecMsg();
        cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoUF()));
        cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

        br.com.swconsultoria.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteCabecMsgE cteCabecMsgE = new br.com.swconsultoria.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteCabecMsgE();
        cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

        // Timeout
        if (ObjetoCTeUtil.verifica(config.getTimeout()).isPresent()) {
            stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, config.getTimeout());
            stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT,
                    config.getTimeout());
        }
        br.com.swconsultoria.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteRetRecepcaoResult result = stub.cteRetRecepcao(dadosMsg, cteCabecMsgE);

        LoggerUtil.log(ConsultaRecibo.class, "[XML-RETORNO]: " + result.getExtraElement().toString());
        return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetConsReciCTe.class);
    }
}
