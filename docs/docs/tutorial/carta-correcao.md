# Carta de Correção Eletrônica

Função para Gerar a Carta De Correção Eletrônica.

```java title="CCeCte.java"
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.cte.Cte;
import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.dom.StatusEnum;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.com.samuelweb.cte.util.ObjetoUtil;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.cte.schema_300.evCCeCTe.EvCCeCTe;
import br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento;
import br.inf.portalfiscal.cte.schema_300.evCCeCTe.TProcEvento;
import br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento;
import javax.xml.bind.JAXBException;
import java.time.LocalDateTime;

/**
 * @author Samuel Oliveira
 */
public class CCeCte {

	public static void main(String[] args) {

	    try {
	        //Veja https://github.com/Samuel-Oliveira/Java_CTe/wiki/Configura%C3%A7%C3%B5es-CTe
	        ConfiguracoesIniciais config = ConfigTeste.iniciaConfiguracoes();

	        String chave = ""; // TODO Preencha a Chave
	        String numeroSeqEvento = "01"; // TODO Preencha o NUmero Sequencial com 2 Digitos e Zero a esquerda
	        String id = "ID" + ConstantesCte.EVENTOS.CCE_COD + chave + numeroSeqEvento;
	        String cnpj = ""; // TODO Preencha o Cnpj

	        TEvento enviEvento = new TEvento();
	        enviEvento.setVersao(config.getVersao());

	        TEvento.InfEvento infoEvento = new TEvento.InfEvento();
	        infoEvento.setId(id);
	        infoEvento.setCOrgao(config.getEstado().getCodigoIbge());
	        infoEvento.setTpAmb(config.getAmbiente());
	        infoEvento.setCNPJ(cnpj);
	        infoEvento.setChCTe(chave);
	        infoEvento.setDhEvento(XmlUtil.dataCte(LocalDateTime.now()));
	        infoEvento.setTpEvento(ConstantesCte.EVENTOS.CCE_COD);
	        infoEvento.setNSeqEvento(Integer.valueOf(numeroSeqEvento).toString());

	        EvCCeCTe eventoCCe = new EvCCeCTe();
	        eventoCCe.setDescEvento(ConstantesCte.EVENTOS.CCE_DESC);
	        eventoCCe.setXCondUso(ConstantesCte.EVENTOS.CCE_COND_USO);

	        EvCCeCTe.InfCorrecao infCorrecao = new EvCCeCTe.InfCorrecao();
	        infCorrecao.setGrupoAlterado("enderReme"); // TODO Preencha
	        infCorrecao.setCampoAlterado("nro"); // TODO Preencha
	        infCorrecao.setValorAlterado("1234"); // TODO Preencha
	        eventoCCe.getInfCorrecao().add(infCorrecao);

	        TEvento.InfEvento.DetEvento detEvento = new TEvento.InfEvento.DetEvento();
	        detEvento.setVersaoEvento(config.getVersao());
	        detEvento.setAny(ObjetoUtil.objectToElement(eventoCCe, EvCCeCTe.class, "evCCeCTe"));

	        infoEvento.setDetEvento(detEvento);
	        enviEvento.setInfEvento(infoEvento);

	        TRetEvento retorno = Cte.cceCte(enviEvento, true);

	        if (!retorno.getInfEvento().getCStat().equals(StatusEnum.EVENTO_VINCULADO.getCode())) {
	            System.out.println("Erro Status:" + retorno.getInfEvento().getCStat());
	            System.out.println("Erro Motivo:" + retorno.getInfEvento().getXMotivo());
	        } else {

	            System.out.println("Status:" + retorno.getInfEvento().getCStat());
	            System.out.println("Motivo:" + retorno.getInfEvento().getXMotivo());
	            System.out.println("Data:" + retorno.getInfEvento().getDhRegEvento());

	            // Cria TProcEventoCTe
	            TProcEvento procEvento = new TProcEvento();
	            procEvento.setVersao(config.getVersao());
	            procEvento.setEventoCTe(enviEvento);
	            procEvento.setRetEventoCTe(retorno);

	            System.out.println("Xml Final Carta de Correção Proc: " + XmlUtil.objectCteToXml(procEvento));
	        }

	    } catch (CteException | JAXBException | CertificadoException e) {
	        System.out.println("Erro:" + e.getMessage());
	    }
	}
}
```