package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.cte.TCTe;
import br.com.swconsultoria.cte.schema_400.cte.TRetCTe;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.cte_recepcao_sinc.CTeRecepcaoSincV4Stub;
import lombok.extern.java.Log;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Classe Responsavel por Enviar o Cte.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
@Log
class EnvioCte {

    private EnvioCte() {}

    /**
     * Metodo para Montar a CTE
     *
     * @param config
     * @param cte
     * @param valida
     * @return TEnviCTe
     * @throws CteException
     */
    static TCTe montaCte(ConfiguracoesCte config, TCTe cte, boolean valida) throws CteException {
        try {

            /**
             * Cria o xml
             */
            String xml = XmlCteUtil.objectToXml(cte);

            /**
             * Assina o Xml
             */
            xml = Assinar.assinaCte(config, xml, AssinaturaEnum.CTE);
            log.info("[XML-ASSINADO]: " + xml);

            /**
             * Valida o Xml caso sejá selecionado True
             */
            if (valida) {
                new Validar().validaXml(config, xml, ServicosEnum.ENVIO_CTE);
            }

            return XmlCteUtil.xmlToObject(xml, TCTe.class);

        } catch (Exception e) {
            throw new CteException(e);
        }

    }

    /**
     * Metodo para Enviar a CTE
     *
     * @param config
     * @param cte
     * @return TRetEnviCTe
     * @throws CteException
     */
    static TRetCTe enviaCte(ConfiguracoesCte config, TCTe cte) throws CteException {

        try {

            String xml = XmlCteUtil.objectToXml(cte);

            log.info("[XML-ENVIO]: " + xml);

            CTeRecepcaoSincV4Stub.CteDadosMsg dadosMsg = new CTeRecepcaoSincV4Stub.CteDadosMsg();
            dadosMsg.setCteDadosMsg(XmlCteUtil.xmlToGZip(xml));

            CTeRecepcaoSincV4Stub stub = new CTeRecepcaoSincV4Stub(
                    WebServiceCteUtil.getUrl(config, ServicosEnum.ENVIO_CTE));
            CTeRecepcaoSincV4Stub.CteRecepcaoResult result = stub.cteRecepcao(dadosMsg);

            TRetCTe retCte = XmlCteUtil.xmlToObject(result.getExtraElement().toString(),
                    TRetCTe.class);

            log.info("[XML-RETORNO]: " + XmlCteUtil.objectToXml(retCte));
            return retCte;

        } catch (IOException | JAXBException e) {
            throw new CteException("Erro ao enviar CTe", e);
        }
    }

}
