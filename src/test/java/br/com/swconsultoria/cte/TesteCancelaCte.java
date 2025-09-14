package br.com.swconsultoria.cte; /**
 *
 */

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.Evento;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.StatusCteEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.evCancCTe.TEvento;
import br.com.swconsultoria.cte.schema_400.evCancCTe.TRetEvento;
import br.com.swconsultoria.cte.util.CancelamentoUtil;

import java.time.LocalDateTime;

/**
 * @author Samuel Oliveira
 */
public class TesteCancelaCte {

    public static void main(String[] args) {

        try {

            // Inicia As Configurações
            ConfiguracoesCte config = TesteConfig.iniciaConfiguracoes(EstadosEnum.GO, AmbienteEnum.HOMOLOGACAO);

            //Foi criado o Objeto Cancela
            Evento cancela = new Evento();
            //Informe a chave da Nota a ser Cancelada
            cancela.setChave("52250910732644000128570030000000061419489289");
            //Informe o protocolo da Nota a ser Cancelada
            cancela.setProtocolo("352250000094946");
            //Informe o CNPJ do emitente
            cancela.setCnpj("10732644000128");
            //Informe o Motivo do Cancelamento
            cancela.setMotivo("Teste de Cancelamento");
            //Informe a data do Cancelamento
            cancela.setDataEvento(LocalDateTime.now());

            //Monta o Evento de Cancelamento
            TEvento enviEvento = CancelamentoUtil.montaCancelamento(cancela, config);

            //Envia o Evento de Cancelamento
            TRetEvento retorno = Cte.cancelarCte(config, enviEvento, true);

            //Valida o Retorno do Cancelamento
            if (!StatusCteEnum.EVENTO_VINCULADO.getCodigo().equals(retorno.getInfEvento().getCStat())) {
                throw new CteException(retorno.getInfEvento().getCStat() + " - " + retorno.getInfEvento().getXMotivo());
            }

            //Resultado
            System.out.println();
            System.out.println("# Chave: " + retorno.getInfEvento().getChCTe());
            System.out.println("# Status: " + retorno.getInfEvento().getCStat() + " - " + retorno.getInfEvento().getXMotivo());
            System.out.println("# Protocolo: " + retorno.getInfEvento().getNProt());

            //Cria ProcEvento de Cacnelamento
            String proc = CancelamentoUtil.criaProcEventoCancelamento(config, enviEvento, retorno);
            System.out.println();
            System.out.println("# ProcEvento : " + proc);

        } catch (Exception e) {
            System.err.println();
            System.err.println("# Erro: " + e.getMessage());
        }
    }
}