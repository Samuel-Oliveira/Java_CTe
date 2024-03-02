package br.com.swconsultoria.cte.eventos;

import br.com.swconsultoria.cte.Assinar;
import br.com.swconsultoria.cte.Validar;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.wsdl.cte_recepcao_evento.CTeRecepcaoEventoV4Stub;
import lombok.extern.java.Log;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.transport.http.HTTPConstants;

import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

@Log
public class Eventos {

    private Eventos() {}

    public static String enviarEvento(ConfiguracoesCte config, String xml, ServicosEnum tipoEvento, boolean valida)
            throws CteException {

        try {

            xml = Assinar.assinaCte(config, xml, AssinaturaEnum.EVENTO);

            log.info("[XML-ENVIO-" + tipoEvento + "]: " + xml);

            if (valida) {
                new Validar().validaXml(config, xml, ServicosEnum.EVENTO);
            }

            OMElement ome = AXIOMUtil.stringToOM(xml);

            return envio(config, tipoEvento, ome);
        } catch (RemoteException | XMLStreamException e) {
            throw new CteException(e);
        }

    }

    private static String envio(ConfiguracoesCte config, ServicosEnum tipoEvento, OMElement ome) throws CteException, RemoteException {
        CTeRecepcaoEventoV4Stub.CteDadosMsg dadosMsg = new CTeRecepcaoEventoV4Stub.CteDadosMsg();
        dadosMsg.setExtraElement(ome);

        String url = WebServiceCteUtil.getUrl(config, tipoEvento);

        CTeRecepcaoEventoV4Stub stub = new CTeRecepcaoEventoV4Stub(url);
        // Timeout
        if (ObjetoCTeUtil.verifica(config.getTimeout()).isPresent()) {
            stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, config.getTimeout());
            stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, config.getTimeout());
        }
        CTeRecepcaoEventoV4Stub.CteRecepcaoEventoResult result = stub.cteRecepcaoEvento(dadosMsg);

        log.info("[XML-RETORNO-" + tipoEvento + "]: " + result.getExtraElement().toString());
        return result.getExtraElement().toString();
    }
}