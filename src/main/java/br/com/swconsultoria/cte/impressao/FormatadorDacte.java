package br.com.swconsultoria.cte.impressao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Map;

/**
 * Formatação dos valores brutos do XML para impressão do DACTE.
 * Exposto ao template Thymeleaf como "fmt": ${fmt.valor(dacte.vPrest.vTPrest)}
 * Todos os métodos aceitam null e retornam "" nesse caso.
 */
public class FormatadorDacte {

    private static final DecimalFormatSymbols SIMBOLOS_BR = DecimalFormatSymbols.getInstance(new Locale("pt", "BR"));

    /** Valor monetário: 1.234,56 */
    public String valor(String valor) {
        return numero(valor, "#,##0.00");
    }

    /** Quantidade da carga (infQ/qCarga, até 4 casas): sem os zeros à direita, 1.250,5 */
    public String quantidade(String valor) {
        return numero(valor, "#,##0.####");
    }

    /** Alíquota ou percentual: 2 a 4 casas, sem símbolo (o rótulo do campo já diz que é percentual). */
    public String aliquota(String valor) {
        return numero(valor, "#,##0.00##");
    }

    /**
     * CNPJ (14 caracteres, inclusive o alfanumérico: 12 letras ou dígitos e 2 dígitos verificadores) ou CPF
     * (11 dígitos); outros valores são devolvidos como estão.
     */
    public String documento(String valor) {
        if (vazio(valor)) {
            return "";
        }
        String d = alfanumericos(valor);
        if (d.matches("[0-9A-Z]{12}[0-9]{2}")) {
            return d.substring(0, 2) + "." + d.substring(2, 5) + "." + d.substring(5, 8) + "/" + d.substring(8, 12) + "-" + d.substring(12);
        }
        if (d.matches("[0-9]{11}")) {
            return d.substring(0, 3) + "." + d.substring(3, 6) + "." + d.substring(6, 9) + "-" + d.substring(9);
        }
        return valor;
    }

    /**
     * CNPJ ou CPF de um participante (Map com as chaves CNPJ e CPF), formatado. Nome próprio, e não uma sobrecarga
     * de {@link #documento(String)}: com argumento null o OGNL não saberia qual chamar.
     */
    public String documentoParticipante(Map<String, String> participante) {
        return participante == null ? "" : documento(primeiro(participante.get("CNPJ"), participante.get("CPF")));
    }

    public String cep(String valor) {
        if (vazio(valor)) {
            return "";
        }
        String d = digitos(valor);
        return d.length() == 8 ? d.substring(0, 5) + "-" + d.substring(5) : valor;
    }

    public String fone(String valor) {
        if (vazio(valor)) {
            return "";
        }
        String d = digitos(valor);
        if (d.length() == 10) {
            return "(" + d.substring(0, 2) + ") " + d.substring(2, 6) + "-" + d.substring(6);
        }
        if (d.length() == 11) {
            return "(" + d.substring(0, 2) + ") " + d.substring(2, 7) + "-" + d.substring(7);
        }
        return valor;
    }

    /** Chave de acesso em grupos de 4 caracteres (a chave com CNPJ alfanumérico traz letras). */
    public String chave(String valor) {
        if (vazio(valor)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String d = alfanumericos(valor);
        for (int i = 0; i < d.length(); i += 4) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(d, i, Math.min(i + 4, d.length()));
        }
        return sb.toString();
    }

    /** Número do documento: 000.001.234 (valores não numéricos são devolvidos como estão). */
    public String numeroDocumento(String valor) {
        if (vazio(valor)) {
            return "";
        }
        String d = digitos(valor);
        if (d.isEmpty() || d.length() > 9 || !d.equals(valor.trim())) {
            return valor;
        }
        String n = String.format("%9s", d).replace(' ', '0');
        return n.substring(0, 3) + "." + n.substring(3, 6) + "." + n.substring(6);
    }

    /** Série: 001 */
    public String serie(String valor) {
        if (vazio(valor)) {
            return "";
        }
        String d = digitos(valor);
        return d.isEmpty() || d.length() > 3 ? valor : String.format("%3s", d).replace(' ', '0');
    }

    /** Data ISO (aaaa-mm-dd ou aaaa-mm-ddThh:mm:ss...) para dd/mm/aaaa. */
    public String data(String valor) {
        if (vazio(valor) || valor.length() < 10) {
            return vazio(valor) ? "" : valor;
        }
        return valor.substring(8, 10) + "/" + valor.substring(5, 7) + "/" + valor.substring(0, 4);
    }

    /** Hora de uma data/hora ISO: hh:mm:ss */
    public String hora(String valor) {
        return vazio(valor) || valor.length() < 19 ? "" : valor.substring(11, 19);
    }

    public String dataHora(String valor) {
        return (data(valor) + " " + hora(valor)).trim();
    }

    /** Logradouro, número, complemento e bairro: "Rua X, 10 - Sala 2, Centro" */
    public String endereco(Map<String, String> grupo) {
        if (grupo == null || vazio(grupo.get("xLgr"))) {
            return "";
        }
        StringBuilder sb = new StringBuilder(grupo.get("xLgr"));
        if (!vazio(grupo.get("nro"))) {
            sb.append(", ").append(grupo.get("nro"));
        }
        if (!vazio(grupo.get("xCpl"))) {
            sb.append(" - ").append(grupo.get("xCpl"));
        }
        if (!vazio(grupo.get("xBairro"))) {
            sb.append(", ").append(grupo.get("xBairro"));
        }
        return sb.toString();
    }

    /** Município e UF: "Goiânia - GO" (ex.: início e término da prestação, ide/xMunIni e ide/UFIni). */
    public String municipioUf(String xMun, String uf) {
        if (vazio(xMun)) {
            return vazio(uf) ? "" : uf;
        }
        return vazio(uf) ? xMun : xMun + " - " + uf;
    }

    /** Município e UF de um participante ou do emitente. */
    public String municipio(Map<String, String> grupo) {
        return grupo == null ? "" : municipioUf(grupo.get("xMun"), grupo.get("UF"));
    }

    /** CFOP e natureza da operação: "6353 - PRESTACAO DE SERVICO..." */
    public String cfopNatureza(String cfop, String natOp) {
        if (vazio(cfop)) {
            return vazio(natOp) ? "" : natOp;
        }
        return vazio(natOp) ? cfop : cfop + " - " + natOp;
    }

    /** Modal (ide/modal). */
    public String modal(String valor) {
        if (vazio(valor)) {
            return "";
        }
        switch (valor) {
            case "01": return "RODOVIÁRIO";
            case "02": return "AÉREO";
            case "03": return "AQUAVIÁRIO";
            case "04": return "FERROVIÁRIO";
            case "05": return "DUTOVIÁRIO";
            case "06": return "MULTIMODAL";
            default: return valor;
        }
    }

    /** Tipo do CT-e (ide/tpCTe). */
    public String tipoCte(String valor) {
        if (vazio(valor)) {
            return "";
        }
        switch (valor) {
            case "0": return "NORMAL";
            case "1": return "COMPLEMENTO";
            case "2": return "ANULAÇÃO";
            case "3": return "SUBSTITUIÇÃO";
            default: return valor;
        }
    }

    /** Tipo do serviço (ide/tpServ). */
    public String tipoServico(String valor) {
        if (vazio(valor)) {
            return "";
        }
        switch (valor) {
            case "0": return "NORMAL";
            case "1": return "SUBCONTRATAÇÃO";
            case "2": return "REDESPACHO";
            case "3": return "REDESPACHO INTERMEDIÁRIO";
            case "4": return "SERVIÇO VINCULADO A MULTIMODAL";
            default: return valor;
        }
    }

    /** Papel do tomador do serviço (toma3/toma ou toma4/toma). */
    public String tomador(String valor) {
        if (vazio(valor)) {
            return "";
        }
        switch (valor) {
            case "0": return "REMETENTE";
            case "1": return "EXPEDIDOR";
            case "2": return "RECEBEDOR";
            case "3": return "DESTINATÁRIO";
            case "4": return "OUTROS";
            default: return valor;
        }
    }

    /** "SIM" para "1" (indicadores do schema que só aceitam 1), "NÃO" para os demais. */
    public String simNao(boolean valor) {
        return valor ? "SIM" : "NÃO";
    }

    /**
     * Classificação tributária do serviço (CST do ICMS) por extenso, a partir do Map icms do {@link DacteDTO}.
     * O CST 90 é descrito pelo grupo: ICMS90, ICMSOutraUF ou ICMSSN.
     */
    public String classificacaoIcms(Map<String, String> icms) {
        if (icms == null || vazio(icms.get("CST"))) {
            return "";
        }
        String cst = icms.get("CST");
        String grupo = icms.get("grupo");
        if ("90".equals(cst) && "ICMSOutraUF".equals(grupo)) {
            return "90 - ICMS OUTRA UF";
        }
        if ("90".equals(cst) && "ICMSSN".equals(grupo)) {
            return "90 - ICMS SIMPLES NACIONAL";
        }
        switch (cst) {
            case "00": return "00 - TRIBUTAÇÃO NORMAL DO ICMS";
            case "20": return "20 - TRIBUTAÇÃO COM BC REDUZIDA DO ICMS";
            case "40": return "40 - ICMS ISENÇÃO";
            case "41": return "41 - ICMS NÃO TRIBUTADA";
            case "51": return "51 - ICMS DIFERIDO";
            case "60": return "60 - ICMS COBRADO POR SUBSTITUIÇÃO TRIBUTÁRIA";
            case "90": return "90 - ICMS OUTROS";
            default: return cst;
        }
    }

    /** Unidade de medida da carga (infQ/cUnid). */
    public String unidade(String valor) {
        if (vazio(valor)) {
            return "";
        }
        switch (valor) {
            case "00": return "M3";
            case "01": return "KG";
            case "02": return "TON";
            case "03": return "UNIDADE";
            case "04": return "LITROS";
            case "05": return "MMBTU";
            default: return valor;
        }
    }

    /**
     * Tipo da medida da carga (infQ/tpMed). No leiaute 4.00 é um código; no 3.00 era texto livre, devolvido como
     * veio.
     */
    public String tipoMedida(String valor) {
        if (vazio(valor)) {
            return "";
        }
        switch (valor) {
            case "00": return "CUBAGEM DA NF-E";
            case "01": return "CUBAGEM AFERIDA";
            case "02": return "PESO BRUTO DA NF-E";
            case "03": return "PESO BRUTO AFERIDO";
            case "04": return "PESO CUBADO";
            case "05": return "PESO BASE DE CÁLCULO";
            case "06": return "PESO PARA USO OPERACIONAL";
            case "07": return "CAIXAS";
            case "08": return "PALETES";
            case "09": return "SACAS";
            case "10": return "CONTAINERS";
            case "11": return "ROLOS";
            case "12": return "BOMBONAS";
            case "13": return "LATAS";
            case "14": return "LITRAGEM";
            case "15": return "MILHÃO DE BTU";
            case "99": return "OUTROS";
            default: return valor;
        }
    }

    /** Rótulo de uma quantidade da carga: tipo da medida e unidade, "PESO BRUTO DA NF-E (KG)". */
    public String rotuloQuantidade(Map<String, String> infQ) {
        if (infQ == null) {
            return "";
        }
        String tipo = tipoMedida(infQ.get("tpMed"));
        String unidade = unidade(infQ.get("cUnid"));
        if (unidade.isEmpty()) {
            return tipo;
        }
        return tipo.isEmpty() ? unidade : tipo + " (" + unidade + ")";
    }

    /** Tipo de documento originário de infOutros (tpDoc). */
    public String tipoDocumentoOutros(String valor) {
        if (vazio(valor)) {
            return "";
        }
        switch (valor) {
            case "00": return "00 - DECLARAÇÃO";
            case "10": return "10 - DUTOVIÁRIO";
            case "59": return "59 - CF-E SAT";
            case "65": return "65 - NFC-E";
            case "99": return "99 - OUTROS";
            default: return valor + " - OUTROS";
        }
    }

    /** Observação de ObsCont ou ObsFisco: "xCampo: xTexto" (só o texto quando não há xCampo). */
    public String observacao(Map<String, String> obs) {
        if (obs == null || vazio(obs.get("xTexto"))) {
            return "";
        }
        return vazio(obs.get("xCampo")) ? obs.get("xTexto") : obs.get("xCampo") + ": " + obs.get("xTexto");
    }

    /** O valor existe e é diferente de zero (valor não numérico conta como presente). */
    public boolean naoZero(String valor) {
        if (vazio(valor)) {
            return false;
        }
        try {
            return new BigDecimal(valor.trim()).signum() != 0;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    /**
     * Junta dois valores com o separador, omitindo o que faltar: juntar("000", " / ", "000001") = "000 / 000001".
     * Concatenar códigos no template com "+" não serve: o Thymeleaf soma strings numéricas.
     */
    public String juntar(String a, String separador, String b) {
        if (vazio(a)) {
            return vazio(b) ? "" : b;
        }
        return vazio(b) ? a : a + separador + b;
    }

    /** Primeiro valor não vazio (ex.: fmt.primeiro(dest.CNPJ, dest.CPF)); "" se os dois forem vazios. */
    public String primeiro(String a, String b) {
        return !vazio(a) ? a : (vazio(b) ? "" : b);
    }

    private static String numero(String valor, String padrao) {
        if (vazio(valor)) {
            return "";
        }
        try {
            // DecimalFormat arredonda HALF_EVEN por padrão (1,005 -> 1,00); documento fiscal usa HALF_UP
            DecimalFormat formato = new DecimalFormat(padrao, SIMBOLOS_BR);
            formato.setRoundingMode(RoundingMode.HALF_UP);
            return formato.format(new BigDecimal(valor.trim()));
        } catch (NumberFormatException e) {
            return valor;
        }
    }

    private static String digitos(String valor) {
        return valor.replaceAll("\\D", "");
    }

    /** Só letras e dígitos, com as letras em maiúsculas (CNPJ e chave alfanuméricos). */
    private static String alfanumericos(String valor) {
        return valor.replaceAll("[^0-9A-Za-z]", "").toUpperCase(Locale.ROOT);
    }

    private static boolean vazio(String valor) {
        return valor == null || valor.trim().isEmpty();
    }
}
