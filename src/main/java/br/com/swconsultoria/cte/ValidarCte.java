package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.Valida;

import java.io.File;

/**
 * @author Samuel Oliveira
 */
class ValidarCte extends Valida {

    static String validaXml(ConfiguracoesCte config, String xml, String tipo) throws CteException {

        String errosValidacao;

        switch (tipo) {
            case ConstantesCte.SERVICOS.STATUS_SERVICO:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.STATUS_SERVICO + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.ENVIO_CTE:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.ENVIO_CTE + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.ENVIO_CTE_OS:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.ENVIO_CTE_OS + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.CONSULTA_RECIBO:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.CONSULTA_RECIBO + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.CONSULTA_PROTOCOLO:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.CONSULTA_PROTOCOLO + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.DISTRIBUICAO_DFE:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.DISTRIBUICAO_DFE;
                break;
            case ConstantesCte.SERVICOS.INUTILIZACAO:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.INUTILIZACAO + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.EVENTO:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.EVENTO + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.CANCELAR:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.CANCELAR + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.EPEC:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.EPEC + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.MULTIMODAL:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.MULTIMODAL + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.CCE:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.CCE + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.PRESTACAO_DESACORDO:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.PRESTACAO_DESACORDO + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            case ConstantesCte.SERVICOS.GVT:
                xsd = config.getPastaSchemas() + "/" + ConstantesCte.XSD.GVT + "_v" + ConstantesCte.VERSAO.CTE;
                break;
            default:
                throw new CteException("Não Encontrado XSD para:" + tipo);
        }

        xsd += ".xsd";

        if (!new File(xsd).exists()) {
            throw new CteException("Schema Nfe não Localizado: " + xsd);
        }

        ValidarCte validar = new ValidarCte();

        errosValidacao = validar.validateXml(xml, xsd);

        return errosValidacao;
    }
}
