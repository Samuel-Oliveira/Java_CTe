/**
 *
 */
package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.schema_400.retConsStatServCTe.TRetConsStatServ;

/**
 * @author Samuel Oliveira
 */
class StatusCte {

    public static void main(String[] args) {
        try {
            ConfiguracoesCte configuracoesCte = ConfigTeste.iniciaConfiguracoes(EstadosEnum.GO, AmbienteEnum.HOMOLOGACAO);
            TRetConsStatServ retorno = Cte.statusServico(configuracoesCte);
            System.out.println();
            System.out.println("# Status: " + retorno.getCStat() + " - " + retorno.getXMotivo());
        } catch (Exception e) {
            System.err.println("# Erro: " + e.getMessage());
        }
    }
}