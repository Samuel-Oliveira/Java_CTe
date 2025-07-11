/**
 *
 */
package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.*;
import br.com.swconsultoria.cte.dom.enuns.StatusCteEnum;
import br.com.swconsultoria.cte.schema_100.retdistdfeint.RetDistDFeInt;
import br.com.swconsultoria.cte.util.XmlCteUtil;

import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class TesteDistDfeCte {

    public static void main(String[] args) {

        try {
            //Veja https://github.com/Samuel-Oliveira/Java_CTe/wiki/Configura%C3%A7%C3%B5es-CTe
            ConfiguracoesCte config = TesteConfig.iniciaConfiguracoes(EstadosEnum.GO, AmbienteEnum.PRODUCAO);

            String cnpj = "10732644000128"; // TODO Preencher Cnpj
            String nsu = "000000000000050";// TODO Preencher Nsu

            RetDistDFeInt retorno = Cte.distribuicaoDfe(config, PessoaEnum.JURIDICA, cnpj, ConsultaDFeEnum.NSU, nsu);
            System.out.println("Status:" + retorno.getCStat());
            System.out.println("Motivo:" + retorno.getXMotivo());
            System.out.println("Max NSU:" + retorno.getMaxNSU());
            System.out.println("Ult NSU:" + retorno.getUltNSU());

            if (StatusCteEnum.DOC_LOCALIZADO_PARA_DESTINATARIO.getCodigo().equals(retorno.getCStat())) {

                List<RetDistDFeInt.LoteDistDFeInt.DocZip> listaDoc = retorno.getLoteDistDFeInt().getDocZip();

                System.out.println("Encontrado " + listaDoc.size() + " Notas.");
                for (RetDistDFeInt.LoteDistDFeInt.DocZip docZip : listaDoc) {
                    System.out.println("Schema: " + docZip.getSchema());
                    System.out.println("NSU:" + docZip.getNSU());
                    System.out.println("XML: " + XmlCteUtil.gZipToXml(docZip.getValue()));
                }
            }

        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }

    }
}
