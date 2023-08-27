package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.wsdl.cte_recepcao_evento.CteRecepcaoEventoStub;
import lombok.extern.java.Log;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.transport.http.HTTPConstants;

import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

@Log
class Eventos {

    static String enviarEvento(ConfiguracoesCte config, String xml, ServicosEnum tipoEvento, boolean valida)
            throws CteException {

        try {

            xml = Assinar.assinaCte(config, xml, AssinaturaEnum.EVENTO);

            log.info("[XML-ENVIO-" + tipoEvento + "]: " + xml);

            if (valida) {
                new Validar().validaXml(config, xml, ServicosEnum.EVENTO);
            }

            OMElement ome = AXIOMUtil.stringToOM(xml);

            if (config.getEstado().equals(EstadosEnum.MS) || config.getEstado().equals(EstadosEnum.MT)) {
                return envioMS(config, tipoEvento, ome);
            } else {
                return envio(config, tipoEvento, ome);
            }
        } catch (RemoteException | XMLStreamException e) {
            throw new CteException(e.getMessage());
        }

    }

    private static String envio(ConfiguracoesCte config, ServicosEnum tipoEvento, OMElement ome) throws CteException, RemoteException {
        CteRecepcaoEventoStub.CteDadosMsg dadosMsg = new CteRecepcaoEventoStub.CteDadosMsg();
        dadosMsg.setExtraElement(ome);

        CteRecepcaoEventoStub.CteCabecMsg cteCabecMsg = new CteRecepcaoEventoStub.CteCabecMsg();
        cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoUF()));
        cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

        CteRecepcaoEventoStub.CteCabecMsgE cteCabecMsgE = new CteRecepcaoEventoStub.CteCabecMsgE();
        cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

        String url = WebServiceCteUtil.getUrl(config, tipoEvento);

        CteRecepcaoEventoStub stub = new CteRecepcaoEventoStub(url);
        // Timeout
        if (ObjetoCTeUtil.verifica(config.getTimeout()).isPresent()) {
            stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, config.getTimeout());
            stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, config.getTimeout());
        }
        CteRecepcaoEventoStub.CteRecepcaoEventoResult result = stub.cteRecepcaoEvento(dadosMsg, cteCabecMsgE);

        log.info("[XML-RETORNO-" + tipoEvento + "]: " + result.getExtraElement().toString());
        return result.getExtraElement().toString();
    }

    private static String envioMS(ConfiguracoesCte config, ServicosEnum tipoEvento, OMElement ome) throws CteException, RemoteException {
        br.com.swconsultoria.cte.wsdl.cterecepcaoeventoMS.CteRecepcaoEventoStub.CteDadosMsg dadosMsg = new br.com.swconsultoria.cte.wsdl.cterecepcaoeventoMS.CteRecepcaoEventoStub.CteDadosMsg();
        dadosMsg.setExtraElement(ome);

        br.com.swconsultoria.cte.wsdl.cterecepcaoeventoMS.CteRecepcaoEventoStub.CTeCabecMsg cteCabecMsg =
                new br.com.swconsultoria.cte.wsdl.cterecepcaoeventoMS.CteRecepcaoEventoStub.CTeCabecMsg();
        cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoUF()));
        cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

        br.com.swconsultoria.cte.wsdl.cterecepcaoeventoMS.CteRecepcaoEventoStub.CteCabecMsgE cteCabecMsgE = new br.com.swconsultoria.cte.wsdl.cterecepcaoeventoMS.CteRecepcaoEventoStub.CteCabecMsgE();
        cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

        String url = WebServiceCteUtil.getUrl(config, tipoEvento);

        br.com.swconsultoria.cte.wsdl.cterecepcaoeventoMS.CteRecepcaoEventoStub stub = new br.com.swconsultoria.cte.wsdl.cterecepcaoeventoMS.CteRecepcaoEventoStub(url);
        // Timeout
        if (ObjetoCTeUtil.verifica(config.getTimeout()).isPresent()) {
            stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, config.getTimeout());
            stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, config.getTimeout());
        }
        br.com.swconsultoria.cte.wsdl.cterecepcaoeventoMS.CteRecepcaoEventoStub.CteRecepcaoEventoResult result = stub.cteRecepcaoEvento(dadosMsg, cteCabecMsgE);

        log.info("[XML-RETORNO-" + tipoEvento + "]: " + result.getExtraElement().toString());
        return result.getExtraElement().toString();
    }
}