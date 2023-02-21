# Baixar CTe

Função para fazer a Consulta e download de Cte.

```java title="DistDfeCte.java"
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.cte.Cte;
import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.dom.StatusEnum;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.cte.schema_300.retdistdfeint.RetDistDFeInt;
import java.io.IOException;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class DistDfeCte {

    public static void main(String[] args) {

        try {
            //Veja https://github.com/Samuel-Oliveira/Java_CTe/wiki/Configura%C3%A7%C3%B5es-CTe
            ConfiguracoesIniciais config = ConfigTeste.iniciaConfiguracoes();

            String cnpj = ""; // TODO Preencher Cnpj
            String nsu = "000000000000000"; // TODO Preencher Nsu

            RetDistDFeInt retorno = Cte.distribuicaoDfe(ConstantesCte.TIPOS.CNPJ, cnpj, nsu);
            System.out.println("Status:" + retorno.getCStat());
            System.out.println("Motivo:" + retorno.getXMotivo());
            System.out.println("Max NSU:" + retorno.getMaxNSU());
            System.out.println("Ult NSU:" + retorno.getUltNSU());

            if (StatusEnum.DOC_LOCALIZADO_PARA_DESTINATARIO.equals(retorno.getCStat())) {

                List<RetDistDFeInt.LoteDistDFeInt.DocZip> listaDoc = retorno.getLoteDistDFeInt().getDocZip();

                System.out.println("Encontrado " + listaDoc.size() + " Notas.");
                for (RetDistDFeInt.LoteDistDFeInt.DocZip docZip : listaDoc) {
                    System.out.println("Schema: " + docZip.getSchema());
                    System.out.println("NSU:" + docZip.getNSU());
                    System.out.println("XML: " + XmlUtil.gZipToXml(docZip.getValue()));
                }
            }

        } catch (CteException | CertificadoException | IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
```