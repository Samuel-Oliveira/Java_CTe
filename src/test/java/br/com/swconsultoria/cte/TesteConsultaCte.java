/**
 *
 */
package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.schema_400.cte.TProtCTe;
import br.com.swconsultoria.cte.schema_400.retConsSitCTe.TRetConsSitCTe;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import lombok.extern.java.Log;

import java.util.logging.Level;

/**
 * @author Samuel Oliveira
 *
 */
@Log
public class TesteConsultaCte {

    public static void main(String[] args) {

        try {
            ConfiguracoesCte configuracoesCte = TesteConfig.iniciaConfiguracoes(EstadosEnum.GO, AmbienteEnum.HOMOLOGACAO);

            String chave = "52230810732644000128570030000000031008968575";

            TRetConsSitCTe retorno = Cte.consultaXml(configuracoesCte, chave);

            //Resultado
            log.info("# Status: " + retorno.getCStat() + " - " + retorno.getXMotivo());
            TProtCTe.InfProt infProt = ObjetoCTeUtil.elementToObject(retorno.getProtCTe().getAny(),TProtCTe.InfProt.class);
            log.info("# Protocolo: " +infProt.getNProt());

        } catch (Exception e) {
            log.log(Level.SEVERE, "Erro ao consultar XML", e);
        }

    }
}
