package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import lombok.extern.java.Log;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

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

            return envio(config, tipoEvento, ome);
        } catch (RemoteException | XMLStreamException e) {
            throw new CteException(e.getMessage());
        }

    }

    private static String envio(ConfiguracoesCte config, ServicosEnum tipoEvento, OMElement ome) throws CteException, RemoteException {
//
        return null;
    }

}