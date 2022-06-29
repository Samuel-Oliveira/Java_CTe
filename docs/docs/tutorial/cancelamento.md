# Cancelamento

Exemplo de Como Ficaria o Cancelamento da CT-e.

```java title="CancelarCte.java"
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.cte.Cte;
import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.dom.StatusEnum;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.com.samuelweb.cte.util.ObjetoUtil;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.cte.schema_300.evCancCTe.EvCancCTe;
import br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento;
import br.inf.portalfiscal.cte.schema_300.evCancCTe.TProcEvento;
import br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento;
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
			ConfiguracoesIniciais config =  ConfigTeste.iniciaConfiguracoes();

			String chave = ""; // TODO Preencha a Chave
			String protocolo = ""; // TODO Preencha o Protocolo
			String cnpj = ""; // TODO Preencha o Cnpj
			String numeroSeqCancelamento = "01"; // TODO Preencha
			String id = "ID"+ ConstantesCte.EVENTOS.CANCELAMENTO_COD + chave + numeroSeqCancelamento;
			String justificativa = "Teste de Cancelmento"; // TODO Preencha

			TEvento enviEvento = new TEvento();
			enviEvento.setVersao(config.getVersao());

			TEvento.InfEvento infoEvento = new TEvento.InfEvento();
			infoEvento.setId(id);
			infoEvento.setCOrgao(config.getEstado().getCodigoIbge());
			infoEvento.setTpAmb(config.getAmbiente());
			infoEvento.setCNPJ(cnpj);
			infoEvento.setChCTe(chave);
			infoEvento.setDhEvento(XmlUtil.dataCte(LocalDateTime.now()));
			infoEvento.setTpEvento(ConstantesCte.EVENTOS.CANCELAMENTO_COD);
			infoEvento.setNSeqEvento(Integer.valueOf(numeroSeqCancelamento).toString());

			EvCancCTe eventoCancela = new EvCancCTe();
			eventoCancela.setDescEvento(ConstantesCte.EVENTOS.CANCELAMENTO_DESC);
			eventoCancela.setNProt(protocolo);
			eventoCancela.setXJust(justificativa);

			TEvento.InfEvento.DetEvento detEvento = new TEvento.InfEvento.DetEvento();
			detEvento.setVersaoEvento(config.getVersao());
			detEvento.setAny(ObjetoUtil.objectToElement(eventoCancela, EvCancCTe.class, "evCancCTe"));

			infoEvento.setDetEvento(detEvento);
			enviEvento.setInfEvento(infoEvento);

			TRetEvento retorno = Cte.cancelarCte(enviEvento, true);

			if(!retorno.getInfEvento().getCStat().equals(StatusEnum.EVENTO_VINCULADO.getCode())){

				System.out.println("Erro Status:" + retorno.getInfEvento().getCStat());
				System.out.println("Erro Motivo:" + retorno.getInfEvento().getXMotivo());

			} else{

				System.out.println("Status:" + retorno.getInfEvento().getCStat());
				System.out.println("Motivo:" + retorno.getInfEvento().getXMotivo());
				System.out.println("Data:" + retorno.getInfEvento().getDhRegEvento());

				// Cria TProcEventoCTe
				TProcEvento procEvento = new TProcEvento();
				procEvento.setVersao(config.getVersao());
				procEvento.setEventoCTe(enviEvento);
				procEvento.setRetEventoCTe(retorno);

				System.out.println("Xml Final Cancelamento Proc: "+ XmlUtil.objectCteToXml(procEvento));
			}

		} catch (CteException | JAXBException | CertificadoException e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}
}
```