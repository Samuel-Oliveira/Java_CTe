package br.com.swconsultoria.cte.eventos;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.evCancCTe.TEvento;
import br.com.swconsultoria.cte.schema_400.evCancCTe.TRetEvento;
import br.com.swconsultoria.cte.util.XmlCteUtil;

import javax.xml.bind.JAXBException;

/**
 * @author Samuel Oliveira - samuel@swconsultoria.com.br Data: 28/09/2017 - 11:11
 */
public class Cancelar {

    private Cancelar(){}

    public static TRetEvento eventoCancelamento(ConfiguracoesCte config, TEvento enviEvento, boolean valida)
            throws CteException {

        try {

            String xml = XmlCteUtil.objectToXml(enviEvento)
                    .replace(" xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", "");

            xml = Eventos.enviarEvento(config, xml, ServicosEnum.CANCELAMENTO, valida);

            return XmlCteUtil.xmlToObject(xml, TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException("Erro ao cancelar CTe", e);
        }

    }

}
