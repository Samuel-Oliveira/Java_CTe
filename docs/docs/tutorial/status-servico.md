# Status de Serviço

Função para consultar o Status de Serviço Da Sefaz.

```java title="StatusCte.java"
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.cte.Cte;
import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;
import br.inf.portalfiscal.cte.schema_300.retConsStatServCTe.TRetConsStatServ;

/**
 * @author Samuel Oliveira
 */
public class StatusCte {

    public static void main(String[] args) {
        try {

            //Veja https://github.com/Samuel-Oliveira/Java_CTe/wiki/Configura%C3%A7%C3%B5es-CTe
            ConfiguracoesIniciais config = ConfigTeste.iniciaConfiguracoes();

            TRetConsStatServ retorno = Cte.statusServico();

            System.out.println("Status:" + retorno.getCStat());
            System.out.println("Motivo:" + retorno.getXMotivo());
            System.out.println("Data:" + retorno.getDhRecbto());

        } catch (CteException | CertificadoException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
```