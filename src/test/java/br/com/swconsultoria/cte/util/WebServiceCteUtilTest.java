package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WebServiceCteUtilTest {

    @ParameterizedTest
    @MethodSource("getUrlDataTest")
    void getUrl(final AmbienteEnum ambiente, final EstadosEnum estado, final boolean isContingenciaSVC,
                final String expectedUrl) throws CteException {

        ConfiguracoesCte config = new ConfiguracoesCte();
        config.setAmbiente(ambiente);
        config.setEstado(estado);
        config.setContigenciaSVC(isContingenciaSVC);

        String actualUrl = WebServiceCteUtil.getUrl(config, ServicosEnum.ENVIO_CTE);

        assertEquals(expectedUrl, actualUrl);
    }

    private static Stream<Arguments> getUrlDataTest() {
        return Stream.of(
                Arguments.of(AmbienteEnum.HOMOLOGACAO, EstadosEnum.MT, false, "https://homologacao.sefaz.mt.gov.br/ctews/services/CteRecepcao"),
                Arguments.of(AmbienteEnum.PRODUCAO, EstadosEnum.MT, false, "https://cte.sefaz.mt.gov.br/ctews/services/CteRecepcao"),
                Arguments.of(AmbienteEnum.HOMOLOGACAO, EstadosEnum.MT, true, "https://cte-homologacao.svrs.rs.gov.br/ws/cterecepcao/CTeRecepcao.asmx"),
                Arguments.of(AmbienteEnum.PRODUCAO, EstadosEnum.MT, true, "https://cte.svrs.rs.gov.br/ws/cterecepcao/CTeRecepcao.asmx"),
                Arguments.of(AmbienteEnum.HOMOLOGACAO, EstadosEnum.MG, false, "https://hcte.fazenda.mg.gov.br/cte/services/CteRecepcao"),
                Arguments.of(AmbienteEnum.PRODUCAO, EstadosEnum.MG, false, "https://cte.fazenda.mg.gov.br/cte/services/CteRecepcao"),
                Arguments.of(AmbienteEnum.HOMOLOGACAO, EstadosEnum.MG, true, "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/CteRecepcao.asmx"),
                Arguments.of(AmbienteEnum.PRODUCAO, EstadosEnum.MG, true, "https://nfe.fazenda.sp.gov.br/cteWEB/services/CteRecepcao.asmx")
        );
    }
}