package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.cte.TCTeSimp;
import br.com.swconsultoria.cte.schema_400.cte.TRetCTeSimp;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.cte_recepcao_simp.CTeRecepcaoSimpV4Stub;
import lombok.extern.java.Log;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Classe Responsavel por Enviar o Cte simplificado.
 *
 * @author Ismael Luan Lawrenz
 */
@Log
class EnvioCteSimp {

    private EnvioCteSimp() {
    }

    /**
     * Metodo para Montar a CTE simplificado
     *
     * @param config
     * @param cte
     * @param valida
     * @return TCTeSimp
     * @throws CteException
     */
    static TCTeSimp montaCteSimp(ConfiguracoesCte config, TCTeSimp cte, boolean valida) throws CteException {
        try {

            /**
             * Cria o xml
             */
            String xml = XmlCteUtil.objectToXml(cte);

            /**
             * Assina o Xml
             */
            xml = Assinar.assinaCte(config, xml, AssinaturaEnum.CTE_SIMP);
            log.info("[XML-ASSINADO]: " + xml);

            /**
             * Valida o Xml caso sejá selecionado True
             */
            if (valida) {
                new Validar().validaXml(config, xml, ServicosEnum.ENVIO_CTE_SIMP);
            }

            return XmlCteUtil.xmlToObject(xml, TCTeSimp.class);

        } catch (Exception e) {
            throw new CteException(e);
        }

    }

    /**
     * Metodo para Enviar a CTE simplificado
     *
     * @param config
     * @param cte
     * @return TRetCTeSimp
     * @throws CteException
     */
    static TRetCTeSimp enviaCteSimp(ConfiguracoesCte config, TCTeSimp cte) throws CteException {

        try {

            String xml = XmlCteUtil.objectToXml(cte);

            log.info("[XML-ENVIO]: " + xml);

            CTeRecepcaoSimpV4Stub.CteDadosMsg dadosMsg = new CTeRecepcaoSimpV4Stub.CteDadosMsg();
            dadosMsg.setCteDadosMsg(XmlCteUtil.xmlToGZip(xml));

            CTeRecepcaoSimpV4Stub stub = new CTeRecepcaoSimpV4Stub(
                    WebServiceCteUtil.getUrl(config, ServicosEnum.ENVIO_CTE_SIMP));
            CTeRecepcaoSimpV4Stub.CteRecepcaoSimpResult result = stub.cteRecepcaoSimp(dadosMsg);

            TRetCTeSimp retCte = XmlCteUtil.xmlToObject(result.getExtraElement().toString(),
                    TRetCTeSimp.class);

            log.info("[XML-RETORNO]: " + XmlCteUtil.objectToXml(retCte));
            return retCte;

        } catch (IOException | JAXBException e) {
            throw new CteException("Erro ao enviar CTe", e);
        }
    }

}
