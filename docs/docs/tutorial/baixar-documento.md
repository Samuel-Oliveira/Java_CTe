# Baixar CTe

Função para fazer a Consulta e download de Cte.

```java title="DistDfeCte.java"
import br.com.swconsultoria.cte.Cte;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.ConsultaDFeEnum;
import br.com.swconsultoria.cte.dom.enuns.PessoaEnum;
import br.com.swconsultoria.cte.dom.enuns.StatusCteEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_100.retdistdfeint.RetDistDFeInt;
import br.com.swconsultoria.cte.util.XmlCteUtil;

/**
 * @author Samuel Oliveira
 */
public class DistDfeCte {

    public static void main(String[] args) {

        try {
            //Veja https://github.com/Samuel-Oliveira/Java_CTe/wiki/Configura%C3%A7%C3%B5es-CTe
            ConfiguracoesCte config = ConfigTeste.iniciaConfiguracoes();

            String cnpj = "12345678901234"; // TODO Preencher Cnpj
            String nsu = "000000000000000"; // TODO Preencher Nsu

            RetDistDFeInt retorno = Cte.distribuicaoDfe(config, PessoaEnum.JURIDICA, cnpj,ConsultaDFeEnum.NSU, nsu);
            System.out.println("Status:" + retorno.getCStat());
            System.out.println("Motivo:" + retorno.getXMotivo());
            System.out.println("Max NSU:" + retorno.getMaxNSU());
            System.out.println("Ult NSU:" + retorno.getUltNSU());

            if (StatusCteEnum.DOC_LOCALIZADO_PARA_DESTINATARIO.equals(retorno.getCStat())) {

                List<RetDistDFeInt.LoteDistDFeInt.DocZip> listaDoc = retorno.getLoteDistDFeInt().getDocZip();

                System.out.println("Encontrado " + listaDoc.size() + " Notas.");
                for (RetDistDFeInt.LoteDistDFeInt.DocZip docZip : listaDoc) {
                    System.out.println("Schema: " + docZip.getSchema());
                    System.out.println("NSU:" + docZip.getNSU());
                    System.out.println("XML: " + XmlCteUtil.gZipToXml(docZip.getValue()));
                }
            }

        } catch (CteException | IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
```