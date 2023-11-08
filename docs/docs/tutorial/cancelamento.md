# Cancelamento

Exemplo de Como Ficaria o Cancelamento da CT-e.

```java title="CancelarCte.java"
import br.com.swconsultoria.cte.Cte;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.StatusCteEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.evCancCTe.EvCancCTe;
import br.com.swconsultoria.cte.schema_400.evCancCTe.TProcEvento;
import br.com.swconsultoria.cte.schema_400.evCancCTe.TRetEvento;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.schema_400.evCancCTe.TEvento;

import javax.xml.bind.JAXBException;
import java.time.LocalDateTime;

/**
 * @author Samuel Oliveira
 *
 */
public class CancelarCte {

	public static void main(String[] args) {

        try {

            //Veja https://github.com/Samuel-Oliveira/Java_CTe/wiki/Configura%C3%A7%C3%B5es-CTe
            ConfiguracoesCte config =  ConfigTeste.iniciaConfiguracoes();

            String chave = ""; // TODO Preencha a Chave
            String protocolo = ""; // TODO Preencha o Protocolo
            String cnpj = ""; // TODO Preencha o Cnpj
            String numeroSeqCancelamento = "001"; // TODO Preencha
            String eventoCancelamento = "110111";
            String id = "ID"+ eventoCancelamento + chave + numeroSeqCancelamento;
            String justificativa = "Teste de Cancelmento"; // TODO Preencha

            TEvento enviEvento = new TEvento();
            enviEvento.setVersao(ConstantesCte.VERSAO.CTE);

            TEvento.InfEvento infoEvento = new TEvento.InfEvento();
            infoEvento.setId(id);
            infoEvento.setCOrgao(config.getEstado().getCodigoUF());
            infoEvento.setTpAmb(config.getAmbiente().getCodigo());
            infoEvento.setCNPJ(cnpj);
            infoEvento.setChCTe(chave);
            infoEvento.setDhEvento(XmlCteUtil.dataCte(LocalDateTime.now()));
            infoEvento.setTpEvento(eventoCancelamento);
            infoEvento.setNSeqEvento(Integer.valueOf(numeroSeqCancelamento).toString());

            EvCancCTe eventoCancela = new EvCancCTe();
            eventoCancela.setDescEvento("Cancelamento");
            eventoCancela.setNProt(protocolo);
            eventoCancela.setXJust(justificativa);

            TEvento.InfEvento.DetEvento detEvento = new TEvento.InfEvento.DetEvento();
            detEvento.setVersaoEvento(ConstantesCte.VERSAO.CTE);
            detEvento.setAny(ObjetoCTeUtil.objectToElement(eventoCancela, EvCancCTe.class, "evCancCTe"));

            infoEvento.setDetEvento(detEvento);
            enviEvento.setInfEvento(infoEvento);

            TRetEvento retorno = Cte.cancelarCte(config, enviEvento, true);

            if(!retorno.getInfEvento().getCStat().equals(StatusCteEnum.EVENTO_VINCULADO.getCodigo())){

                System.out.println("Erro Status:" + retorno.getInfEvento().getCStat());
                System.out.println("Erro Motivo:" + retorno.getInfEvento().getXMotivo());

            } else{

                System.out.println("Status:" + retorno.getInfEvento().getCStat());
                System.out.println("Motivo:" + retorno.getInfEvento().getXMotivo());
                System.out.println("Data:" + retorno.getInfEvento().getDhRegEvento());

                // Cria TProcEventoCTe
                TProcEvento procEvento = new TProcEvento();
                procEvento.setVersao(ConstantesCte.VERSAO.CTE);
                procEvento.setEventoCTe(enviEvento);
                procEvento.setRetEventoCTe(retorno);

                System.out.println("Xml Final Cancelamento Proc: "+ XmlCteUtil.objectToXml(procEvento));
            }

        } catch (CteException | JAXBException  e) {
            System.out.println("Erro:" + e.getMessage());
        }
	}
}
```