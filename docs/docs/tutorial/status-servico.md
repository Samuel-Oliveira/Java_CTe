# Status de Serviço

Função para consultar o Status de Serviço Da Sefaz.

```java title="StatusCte.java"
import br.com.swconsultoria.cte.Cte;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.retConsStatServCTe.TRetConsStatServ;

/**
 * @author Samuel Oliveira
 */
public class StatusCte {

    public static void main(String[] args) {
        try {

            //Veja https://github.com/Samuel-Oliveira/Java_CTe/wiki/Configura%C3%A7%C3%B5es-CTe
            ConfiguracoesCte config = ConfigTeste.iniciaConfiguracoes();

            TRetConsStatServ retorno = Cte.statusServico(config);

            System.out.println("Status:" + retorno.getCStat());
            System.out.println("Motivo:" + retorno.getXMotivo());
            System.out.println("Data:" + retorno.getDhRecbto());

        } catch (CteException  e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
```