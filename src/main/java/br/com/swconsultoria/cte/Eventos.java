package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.LoggerUtil;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.wsdl.cterecepcaoevento.CteRecepcaoEventoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.transport.http.HTTPConstants;

import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

class Eventos {

    static String enviarEvento(ConfiguracoesCte config, String xml, ServicosEnum tipoEvento, boolean valida)
            throws CteException {

        try {

            xml = Assinar.assinaCte(config, xml, AssinaturaEnum.EVENTO);

            LoggerUtil.log(Eventos.class, "[XML-ENVIO-" + tipoEvento + "]: " + xml);

            if (valida) {
                new Validar().validaXml(config, xml, ServicosEnum.EVENTO);
            }

            OMElement ome = AXIOMUtil.stringToOM(xml);

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

            LoggerUtil.log(Eventos.class, "[XML-RETORNO-" + tipoEvento + "]: " + result.getExtraElement().toString());
            return result.getExtraElement().toString();
        } catch (RemoteException | XMLStreamException e) {
            throw new CteException(e.getMessage());
        }

    }
}