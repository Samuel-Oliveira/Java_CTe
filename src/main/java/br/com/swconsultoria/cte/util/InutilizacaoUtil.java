package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.Assinar;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.inutCTe.TInutCTe;
import br.com.swconsultoria.cte.schema_300.inutCTe.TProcInutCTe;
import br.com.swconsultoria.cte.schema_300.inutCTe.TRetInutCTe;

import javax.xml.bind.JAXBException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 02/03/2019 - 22:51
 */
public class InutilizacaoUtil {

    /**
     * Monta o Evento de Inutilização
     *
     * @param cnpj
     * @param serie
     * @param numeroInicial
     * @param numeroFinal
     * @param justificativa
     * @param dataInutilizacao
     * @param configuracao
     * @return
     * @throws CteException
     */
    public static TInutCTe montaInutilizacao(String cnpj, int serie, int numeroInicial, int numeroFinal, String justificativa, LocalDateTime dataInutilizacao, ConfiguracoesCte configuracao) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy");
        String cUf = configuracao.getEstado().getCodigoUF();
        String ano = dataInutilizacao.format(formatter);
        String serieCompleta = ChaveUtil.completarComZerosAEsquerda(String.valueOf(serie), 3);
        String nInicial = ChaveUtil.completarComZerosAEsquerda(String.valueOf(numeroInicial), 9);
        String nFinal = ChaveUtil.completarComZerosAEsquerda(String.valueOf(numeroFinal), 9);

        String id = "ID" + cUf + cnpj + "57" + serieCompleta + nInicial + nFinal;

        TInutCTe inutCTe = new TInutCTe();
        inutCTe.setVersao(ConstantesCte.VERSAO.CTE);

        TInutCTe.InfInut infInut = new TInutCTe.InfInut();
        infInut.setId(id);
        infInut.setTpAmb(configuracao.getAmbiente().getCodigo());
        infInut.setXServ("INUTILIZAR");
        infInut.setCUF(cUf);
        infInut.setAno(Short.parseShort(ano));

        infInut.setCNPJ(cnpj);
        infInut.setMod("57");
        infInut.setSerie(String.valueOf(serie));

        infInut.setNCTIni(String.valueOf(numeroInicial));
        infInut.setNCTFin(String.valueOf(numeroFinal));

        infInut.setXJust(justificativa);
        inutCTe.setInfInut(infInut);

        return inutCTe;

    }

    /**
     * Cria o ProcEvento da Inutilização
     *
     * @param configuracoesCte
     * @param inutCTe
     * @param retorno
     * @return
     * @throws JAXBException
     * @throws CteException
     */
    public static String criaProcInutilizacao(ConfiguracoesCte configuracoesCte, TInutCTe inutCTe, TRetInutCTe retorno) throws JAXBException, CteException {

        String xml = XmlCteUtil.objectToXml(inutCTe);
        xml = xml.replaceAll(" xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", "");
        xml = Assinar.assinaCte(configuracoesCte, xml, AssinaturaEnum.INUTILIZACAO);

        String assinado = Assinar.assinaCte(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), xml, AssinaturaEnum.INUTILIZACAO);

        // Criação do ProcInutCte
        TProcInutCTe procInutCTe = new TProcInutCTe();
        procInutCTe.setInutCTe(XmlCteUtil.xmlToObject(assinado, TInutCTe.class));
        procInutCTe.setRetInutCTe(retorno);
        procInutCTe.setVersao(ConstantesCte.VERSAO.CTE);

        return XmlCteUtil.objectToXml(procInutCTe);
    }

}
