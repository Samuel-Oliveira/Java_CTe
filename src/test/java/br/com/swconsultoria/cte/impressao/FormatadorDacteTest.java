package br.com.swconsultoria.cte.impressao;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FormatadorDacteTest {

    private final FormatadorDacte fmt = new FormatadorDacte();

    @Test
    void numeros() {
        assertEquals("1.234,50", fmt.valor("1234.5"));
        assertEquals("1,01", fmt.valor("1.005"), "HALF_UP, não HALF_EVEN");
        assertEquals("12,00", fmt.aliquota("12.00"));
        assertEquals("0,36", fmt.aliquota("0.3600"));
        assertEquals("1.250,5", fmt.quantidade("1250.5000"));
        assertEquals("42", fmt.quantidade("42.0000"));
        assertEquals("abc", fmt.valor("abc"), "valor não numérico sai como veio");
        assertEquals("", fmt.valor(null));
        assertEquals("", fmt.quantidade(" "));
    }

    @Test
    void documentosEContato() {
        assertEquals("12.345.678/0001-95", fmt.documento("12345678000195"));
        assertEquals("123.456.789-09", fmt.documento("12345678909"));
        assertEquals("74000-000", fmt.cep("74000000"));
        assertEquals("(62) 3210-0000", fmt.fone("6232100000"));
        assertEquals("(62) 99999-0000", fmt.fone("62999990000"));
        assertEquals("5226 1112 3456", fmt.chave("522611123456"));
        assertEquals("000.001.234", fmt.numeroDocumento("1234"));
        assertEquals("DC-77", fmt.numeroDocumento("DC-77"), "número com letras sai como veio");
        assertEquals("001", fmt.serie("1"));
        assertEquals("20/11/2026 10:15:30", fmt.dataHora("2026-11-20T10:15:30-03:00"));
        assertEquals("19/11/2026", fmt.data("2026-11-19"));

        Map<String, String> participante = new HashMap<>();
        assertEquals("", fmt.documentoParticipante(participante));
        assertEquals("", fmt.endereco(participante));
        assertEquals("", fmt.municipio(participante));
        participante.put("CPF", "12345678909");
        participante.put("xLgr", "RUA A");
        participante.put("nro", "S/N");
        participante.put("xBairro", "CENTRO");
        participante.put("xMun", "GOIANIA");
        participante.put("UF", "GO");
        assertEquals("123.456.789-09", fmt.documentoParticipante(participante));
        assertEquals("RUA A, S/N, CENTRO", fmt.endereco(participante));
        assertEquals("GOIANIA - GO", fmt.municipio(participante));
        assertEquals("", fmt.documentoParticipante(null));
    }

    @Test
    void codigosPorExtenso() {
        assertEquals("RODOVIÁRIO", fmt.modal("01"));
        assertEquals("MULTIMODAL", fmt.modal("06"));
        assertEquals("NORMAL", fmt.tipoCte("0"));
        assertEquals("SUBSTITUIÇÃO", fmt.tipoCte("3"));
        assertEquals("REDESPACHO INTERMEDIÁRIO", fmt.tipoServico("3"));
        assertEquals("SERVIÇO VINCULADO A MULTIMODAL", fmt.tipoServico("4"));
        assertEquals("RECEBEDOR", fmt.tomador("2"));
        assertEquals("OUTROS", fmt.tomador("4"));
        assertEquals("TON", fmt.unidade("02"));
        assertEquals("PESO CUBADO", fmt.tipoMedida("04"));
        assertEquals("PESO BRUTO", fmt.tipoMedida("PESO BRUTO"), "leiaute 3.00: texto livre");
        assertEquals("65 - NFC-E", fmt.tipoDocumentoOutros("65"));
        assertEquals("SIM", fmt.simNao(true));
        assertEquals("NÃO", fmt.simNao(false));

        Map<String, String> icms = new HashMap<>();
        icms.put("CST", "90");
        icms.put("grupo", "ICMSOutraUF");
        assertEquals("90 - ICMS OUTRA UF", fmt.classificacaoIcms(icms));
        icms.put("grupo", "ICMS90");
        assertEquals("90 - ICMS OUTROS", fmt.classificacaoIcms(icms));
        icms.put("CST", "51");
        assertEquals("51 - ICMS DIFERIDO", fmt.classificacaoIcms(icms));
        assertEquals("", fmt.classificacaoIcms(new HashMap<String, String>()));
    }

    @Test
    void textos() {
        assertEquals("6353 - PRESTACAO", fmt.cfopNatureza("6353", "PRESTACAO"));
        assertEquals("000 / 000001", fmt.juntar("000", " / ", "000001"), "sem somar os códigos numéricos");
        assertEquals("000001", fmt.juntar(null, " / ", "000001"));
        assertEquals("", fmt.juntar(null, " / ", null));

        Map<String, String> obs = new HashMap<>();
        obs.put("xTexto", "PED-1");
        assertEquals("PED-1", fmt.observacao(obs));
        obs.put("xCampo", "PEDIDO");
        assertEquals("PEDIDO: PED-1", fmt.observacao(obs));

        Map<String, String> infQ = new HashMap<>();
        infQ.put("tpMed", "02");
        infQ.put("cUnid", "01");
        assertEquals("PESO BRUTO DA NF-E (KG)", fmt.rotuloQuantidade(infQ));
        assertEquals("", fmt.rotuloQuantidade(null));

        assertTrue(fmt.naoZero("0.01"));
        assertFalse(fmt.naoZero("0.00"));
        assertEquals("b", fmt.primeiro(" ", "b"));
    }
}
