# Inutilização

Função para Inutilizar faixa de números da Cte.

```java title="InutilizarCte.java"
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.cte.Cte;
import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe;
import br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe;

/**
 * @author Samuel Oliveira
 *
 */
public class InutilizarCte {

    public static void main(String[] args) {

        try {
            //Veja https://github.com/Samuel-Oliveira/Java_CTe/wiki/Configura%C3%A7%C3%B5es-CTe
            ConfiguracoesIniciais config = ConfigTeste.iniciaConfiguracoes();

            String numeroInicial = "000005566"; // TODO Preencha Numeração Inicial Com 9 Digitos e 0 a esquerda
            String numeroFinal = "000005566"; // TODO Preencha Numeração Final Com 9 Digitos e 0 a esquerda
            String cnpj = ""; // TODO Preencha Cnpj
            String serie = "1"; // TODO Preencha Serie
            String modelo = "57"; // TODO Preencha MOdelo
            String id = "ID" +config.getEstado().getCodigoIbge() + cnpj + modelo + "00"+ serie +numeroInicial+numeroFinal;
            String ano = "17"; // TODO Preencha Ano
            String justificativa = "Teste na Inutilizacao da Cte";  // TODO Preencha Justificativa

            TInutCTe inutCTe = new TInutCTe();
            inutCTe.setVersao(config.getVersao());

            TInutCTe.InfInut infInut = new TInutCTe.InfInut();
            infInut.setId(id);
            infInut.setTpAmb(config.getAmbiente());
            infInut.setXServ(ConstantesCte.EVENTOS.INUTILIZAR);
            infInut.setCUF(config.getEstado().getCodigoIbge());
            infInut.setAno(Short.parseShort(ano));
            infInut.setCNPJ(cnpj);
            infInut.setMod(modelo);
            infInut.setSerie(serie);
            infInut.setNCTIni(Integer.valueOf(numeroInicial).toString());
            infInut.setNCTFin(Integer.valueOf(numeroFinal).toString());

            infInut.setXJust(justificativa);
            inutCTe.setInfInut(infInut);

            TRetInutCTe retorno = Cte.inutilizacao(inutCTe,true);
            br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe.InfInut infRetorno = retorno.getInfInut();

            System.out.println("Status:" + infRetorno.getCStat());
            System.out.println("Motivo:" + infRetorno.getXMotivo());
            System.out.println("Data:" + infRetorno.getDhRecbto());

        } catch (CteException | CertificadoException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
```