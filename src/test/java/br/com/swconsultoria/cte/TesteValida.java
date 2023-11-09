package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.util.XmlCteUtil;

public class TesteValida {

    public static void main(String[] args) {

        try {
            ConfiguracoesCte config = TesteConfig.iniciaConfiguracoes(EstadosEnum.GO, AmbienteEnum.HOMOLOGACAO);
            String xml = XmlCteUtil.leXml("d:/teste/cte-erro.xml");
            new Validar().validaXml(config, xml, ServicosEnum.ENVIO_CTE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
