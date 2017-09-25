/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.samuelweb.mdfe;

import java.io.File;

import br.com.samuelweb.cte.ConfiguracoesIniciais;
import br.com.samuelweb.exception.EmissorException;
import br.com.samuelweb.util.ConstantesMDFe;
import br.com.samuelweb.util.Valida;

/**
 *
 * @author john
 */
public class ValidarMDFe extends Valida{
    
    public static String validaXml(String xml, String tipo) throws EmissorException {
        String errosValidacao = null;

        configuracoes = ConfiguracoesIniciais.getInstance();

        switch (tipo) {
            case ConstantesMDFe.SERVICOS.STATUS_SERVICO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesMDFe.XSD.STATUS_SERVICO;
                break;
            case ConstantesMDFe.SERVICOS.ENVIO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesMDFe.XSD.ENVIO_MDFE;
                break;
            case ConstantesMDFe.SERVICOS.EVENTO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesMDFe.XSD.EVENTO;
                break;
            case ConstantesMDFe.SERVICOS.CANCELAR:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesMDFe.XSD.CANCELAR;
                break;
            case ConstantesMDFe.SERVICOS.ENCERRAR:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesMDFe.XSD.ENCERRAR;
                break;
            case ConstantesMDFe.SERVICOS.INCLUIR_CONDUTOR:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesMDFe.XSD.INCLUIR_CONDUTOR;
                break;

            case ConstantesMDFe.SERVICOS.CONSULTA_NAO_ENCERRADO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesMDFe.XSD.CONSULTA_NAO_ENCERRADO;
                break;

            case ConstantesMDFe.SERVICOS.CONSULTA_PROTOCOLO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesMDFe.XSD.CONSULTA_PROTOCOLO;
                break;
            case ConstantesMDFe.SERVICOS.CONSULTA_RECIBO:
                xsd = configuracoes.getPastaSchemas() + "/" + ConstantesMDFe.XSD.CONSULTA_RECIBO;
                break;

            default:
                throw new EmissorException("Não Encontrado XSD para:" + tipo);
        }

        xsd += ".xsd";

        if (!new File(xsd).exists()) {
            throw new EmissorException("Schema Nfe não Localizado: " + xsd);
        }

        ValidarMDFe validar = new ValidarMDFe();

        errosValidacao = validar.validateXml(xml, xsd);

        return errosValidacao;
    }

}
