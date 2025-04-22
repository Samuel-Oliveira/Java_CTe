package br.com.swconsultoria.cte; /**
 *
 */

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.EventosEnum;
import br.com.swconsultoria.cte.dom.enuns.StatusCteEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.evPrestDesacordo.EvPrestDesacordo;
import br.com.swconsultoria.cte.schema_400.evPrestDesacordo.TEvento;
import br.com.swconsultoria.cte.schema_400.evPrestDesacordo.TRetEvento;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;

import java.time.LocalDateTime;

/**
 * @author Samuel Oliveira
 */
public class TestePrestacaoDesacordoCte {

    public static void main(String[] args) {

        try {
            // Dados para pegar do CTE
            String chave = "";
            String cnpj = "";

            //Pegar Do usuário - Opcional.
            String obs = "";

            // Inicia As Configurações
            ConfiguracoesCte config = TesteConfig.iniciaConfiguracoes(EstadosEnum.GO, AmbienteEnum.HOMOLOGACAO);

            String id = "ID610110" + chave + "001";
            TEvento evento = new TEvento();
            evento.setVersao(ConstantesCte.VERSAO.CTE);

            TEvento.InfEvento infEvento = new TEvento.InfEvento();
            infEvento.setId(id);
            infEvento.setCOrgao(config.getEstado().getCodigoUF());
            infEvento.setTpAmb(config.getAmbiente().getCodigo());
            infEvento.setCNPJ(cnpj);
            infEvento.setChCTe(chave);
            infEvento.setDhEvento(XmlCteUtil.dataCte(LocalDateTime.now()));
            infEvento.setTpEvento(EventosEnum.CCE.getCodigo());
            infEvento.setNSeqEvento("001");

            EvPrestDesacordo evPrestDesacordo = new EvPrestDesacordo();
            evPrestDesacordo.setDescEvento("Prestacao do Servico em Desacordo");
            evPrestDesacordo.setIndDesacordoOper("1");
            evPrestDesacordo.setXObs(obs);

            TEvento.InfEvento.DetEvento detEvento = new TEvento.InfEvento.DetEvento();
            detEvento.setVersaoEvento(ConstantesCte.VERSAO.CTE);
            detEvento.setAny(ObjetoCTeUtil.objectToElement(evPrestDesacordo, EvPrestDesacordo.class, "evPrestDesacordo"));

            infEvento.setDetEvento(detEvento);
            evento.setInfEvento(infEvento);

            //Envia o Evento de Cancelamento
            TRetEvento retorno = Cte.prestacaoDesacordoCte(config, evento, true);

            //Valida o Retorno
            if (!StatusCteEnum.EVENTO_VINCULADO.getCodigo().equals(retorno.getInfEvento().getCStat())) {
                throw new CteException(retorno.getInfEvento().getCStat() + " - " + retorno.getInfEvento().getXMotivo());
            }

            //Resultado
            System.out.println();
            System.out.println("# Chave: " + retorno.getInfEvento().getChCTe());
            System.out.println("# Status: " + retorno.getInfEvento().getCStat() + " - " + retorno.getInfEvento().getXMotivo());
            System.out.println("# Protocolo: " + retorno.getInfEvento().getNProt());

        } catch (Exception e) {
            System.err.println();
            System.err.println("# Erro: " + e.getMessage());
        }
    }
}