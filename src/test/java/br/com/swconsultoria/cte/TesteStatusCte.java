/**
 *
 */
package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.schema_400.consStatServCTe.TRetConsStatServ;
import lombok.extern.java.Log;

import java.util.logging.Level;

/**
 * @author Samuel Oliveira
 */
@Log
class TesteStatusCte {

    public static void main(String[] args) {
        try {
            ConfiguracoesCte configuracoesCte = TesteConfig.iniciaConfiguracoes(EstadosEnum.GO, AmbienteEnum.HOMOLOGACAO);
            TRetConsStatServ retorno = Cte.statusServico(configuracoesCte);
            log.info("# Status: " + retorno.getCStat() + " - " + retorno.getXMotivo());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Erro ao consultar Status", e);
        }
    }
}