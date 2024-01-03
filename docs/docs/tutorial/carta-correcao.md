# Carta de Correção Eletrônica

Função para Gerar a Carta De Correção Eletrônica.

```java title="CCeCte.java"
import br.com.swconsultoria.cte.Cte;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.StatusCteEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.evCCeCTe.EvCCeCTe;
import br.com.swconsultoria.cte.schema_400.evCCeCTe.TEvento;
import br.com.swconsultoria.cte.schema_400.evCCeCTe.TProcEvento;
import br.com.swconsultoria.cte.schema_400.evCCeCTe.TRetEvento;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;

import javax.xml.bind.JAXBException;
import java.time.LocalDateTime;

/**
 * @author Samuel Oliveira
 */
public class CCeCte {

    public static void main(String[] args) {

        try {
            //Veja https://github.com/Samuel-Oliveira/Java_CTe/wiki/Configura%C3%A7%C3%B5es-CTe
            ConfiguracoesCte config = ConfigTeste.iniciaConfiguracoes();

            String chave = ""; // TODO Preencha a Chave
            String numeroSeqEvento = "001"; // TODO Preencha o NUmero Sequencial com 2 Digitos e Zero a esquerda
            String codigoEvento = "110110";
            String id = "ID" + codigoEvento + chave + numeroSeqEvento;
            String cnpj = ""; // TODO Preencha o Cnpj

            TEvento enviEvento = new TEvento();
            enviEvento.setVersao(ConstantesCte.VERSAO.CTE);

            TEvento.InfEvento infoEvento = new TEvento.InfEvento();
            infoEvento.setId(id);
            infoEvento.setCOrgao(config.getEstado().getCodigoUF());
            infoEvento.setTpAmb(config.getAmbiente().getCodigo());
            infoEvento.setCNPJ(cnpj);
            infoEvento.setChCTe(chave);
            infoEvento.setDhEvento(XmlCteUtil.dataCte(LocalDateTime.now()));
            infoEvento.setTpEvento(codigoEvento);
            infoEvento.setNSeqEvento(Integer.valueOf(numeroSeqEvento).toString());

            EvCCeCTe eventoCCe = new EvCCeCTe();
            eventoCCe.setDescEvento("Carta de Correcao");
            eventoCCe.setXCondUso("A Carta de Correcao e disciplinada pelo Art. 58-B do CONVENIO/SINIEF 06/89: Fica permitida a utilizacao de carta de correcao, para regularizacao de erro ocorrido na emissao de documentos fiscais relativos a prestacao de servico de transporte, desde que o erro nao esteja relacionado com: I - as variaveis que determinam o valor do imposto tais como: base de calculo, aliquota, diferenca de preco, quantidade, valor da prestacao;II - a correcao de dados cadastrais que implique mudanca do emitente, tomador, remetente ou do destinatario;III - a data de emissao ou de saida.");

            EvCCeCTe.InfCorrecao infCorrecao = new EvCCeCTe.InfCorrecao();
            infCorrecao.setGrupoAlterado("enderReme"); // TODO Preencha
            infCorrecao.setCampoAlterado("nro"); // TODO Preencha
            infCorrecao.setValorAlterado("1234"); // TODO Preencha
            eventoCCe.getInfCorrecao().add(infCorrecao);

            TEvento.InfEvento.DetEvento detEvento = new TEvento.InfEvento.DetEvento();
            detEvento.setVersaoEvento(ConstantesCte.VERSAO.CTE);
            detEvento.setAny(ObjetoCTeUtil.objectToElement(eventoCCe, EvCCeCTe.class, "evCCeCTe"));

            infoEvento.setDetEvento(detEvento);
            enviEvento.setInfEvento(infoEvento);

            TRetEvento retorno = Cte.cceCte(config, enviEvento, true);

            if (!retorno.getInfEvento().getCStat().equals(StatusCteEnum.EVENTO_VINCULADO.getCodigo())) {
                System.out.println("Erro Status:" + retorno.getInfEvento().getCStat());
                System.out.println("Erro Motivo:" + retorno.getInfEvento().getXMotivo());
            } else {

                System.out.println("Status:" + retorno.getInfEvento().getCStat());
                System.out.println("Motivo:" + retorno.getInfEvento().getXMotivo());
                System.out.println("Data:" + retorno.getInfEvento().getDhRegEvento());

                // Cria TProcEventoCTe
                TProcEvento procEvento = new TProcEvento();
                procEvento.setVersao(ConstantesCte.VERSAO.CTE);
                procEvento.setEventoCTe(enviEvento);
                procEvento.setRetEventoCTe(retorno);

                System.out.println("Xml Final Carta de Correção Proc: " + XmlCteUtil.objectToXml(procEvento));
            }

        } catch (JAXBException | CteException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
```