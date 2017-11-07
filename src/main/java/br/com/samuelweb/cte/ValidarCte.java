package br.com.samuelweb.cte;

import java.io.File;

import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.com.samuelweb.cte.util.Valida;

/**
 *
 * @author Samuel Oliveira
 */
public class ValidarCte extends Valida {
    
    public static String validaXml(String xml, String tipo) throws CteException {

        String errosValidacao;

        configuracoes = ConfiguracoesIniciais.getInstance();

        switch (tipo) {
            case ConstantesCte.SERVICOS.STATUS_SERVICO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.STATUS_SERVICO + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.ENVIO_CTE:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.ENVIO_CTE + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.CONSULTA_RECIBO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.CONSULTA_RECIBO + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.CONSULTA_PROTOCOLO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.CONSULTA_PROTOCOLO + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.DISTRIBUICAO_DFE:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.DISTRIBUICAO_DFE;
                break;
            case ConstantesCte.SERVICOS.INUTILIZACAO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.INUTILIZACAO + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.EVENTO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.EVENTO + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.CANCELAR:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.CANCELAR + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.EPEC:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.EPEC + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.MULTIMODAL:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.MULTIMODAL + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.CCE:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.CCE + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.PRESTACAO_DESACORDO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.PRESTACAO_DESACORDO + "_v" + configuracoes.getVersao();
                break;
            case ConstantesCte.SERVICOS.GVT:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesCte.XSD.GVT + "_v" + configuracoes.getVersao();
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
