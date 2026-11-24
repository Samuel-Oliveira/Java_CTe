package br.com.swconsultoria.cte.impressao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Dados do DACTE extraídos do XML do CT-e (modelo 57, leiaute 4.00).
 * Cada grupo é um Map cuja chave é o nome da tag no XML (ex.: ide.nCT, emit.xNome, vPrest.vTPrest).
 * Valores são o texto bruto do XML (sem formatação); tags inexistentes não estão no Map.
 * Chaves que não são nomes de tag estão documentadas no {@link LeitorDacte}.
 * Exposto ao template Thymeleaf como "dacte".
 */
public class DacteDTO {

    /** Componentes do valor da prestação por linha, como no quadro do DACTE Jasper. */
    private static final int COMPONENTES_POR_LINHA = 4;
    /** Quantidades da carga (infQ) por linha. */
    private static final int QUANTIDADES_POR_LINHA = 5;
    /** Documentos originários e veículos novos por linha (duas colunas). */
    private static final int DOCUMENTOS_POR_LINHA = 2;

    /** Documentos originários: infNFe. */
    public static final String DOCUMENTOS_NFE = "NFE";
    /** Documentos originários: infNF (nota fiscal em papel, modelos 01 e 04). */
    public static final String DOCUMENTOS_NF = "NF";
    /** Documentos originários: infOutros. */
    public static final String DOCUMENTOS_OUTROS = "OUTROS";
    /** Documentos originários: infDCe (Declaração de Conteúdo eletrônica). */
    public static final String DOCUMENTOS_DCE = "DCE";

    private String chave;
    private String tipoDocumentos;
    private final Map<String, String> ide = new LinkedHashMap<>();
    private final Map<String, String> compl = new LinkedHashMap<>();
    private final Map<String, String> emit = new LinkedHashMap<>();
    private final Map<String, String> rem = new LinkedHashMap<>();
    private final Map<String, String> exped = new LinkedHashMap<>();
    private final Map<String, String> receb = new LinkedHashMap<>();
    private final Map<String, String> dest = new LinkedHashMap<>();
    private final Map<String, String> toma = new LinkedHashMap<>();
    private final Map<String, String> prot = new LinkedHashMap<>();
    private final Map<String, String> vPrest = new LinkedHashMap<>();
    private final Map<String, String> icms = new LinkedHashMap<>();
    private final Map<String, String> imp = new LinkedHashMap<>();
    private final Map<String, String> ibsCbs = new LinkedHashMap<>();
    private final Map<String, String> carga = new LinkedHashMap<>();
    private final Map<String, String> rodo = new LinkedHashMap<>();
    private final Map<String, String> infGlobalizado = new LinkedHashMap<>();
    private final Map<String, String> supl = new LinkedHashMap<>();
    private final List<Map<String, String>> obsCont = new ArrayList<>();
    private final List<Map<String, String>> obsFisco = new ArrayList<>();
    private final List<Map<String, String>> componentes = new ArrayList<>();
    private final List<Map<String, String>> quantidades = new ArrayList<>();
    private final List<Map<String, String>> documentos = new ArrayList<>();
    private final List<Map<String, String>> veiculos = new ArrayList<>();
    private final List<String> complementados = new ArrayList<>();

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    /**
     * Tipo dos documentos originários (o schema só aceita um tipo por CT-e): {@value #DOCUMENTOS_NFE},
     * {@value #DOCUMENTOS_NF}, {@value #DOCUMENTOS_OUTROS} ou {@value #DOCUMENTOS_DCE}; null sem infDoc.
     */
    public String getTipoDocumentos() {
        return tipoDocumentos;
    }

    public void setTipoDocumentos(String tipoDocumentos) {
        this.tipoDocumentos = tipoDocumentos;
    }

    public Map<String, String> getIde() {
        return ide;
    }

    public Map<String, String> getCompl() {
        return compl;
    }

    public Map<String, String> getEmit() {
        return emit;
    }

    public Map<String, String> getRem() {
        return rem;
    }

    public Map<String, String> getExped() {
        return exped;
    }

    public Map<String, String> getReceb() {
        return receb;
    }

    public Map<String, String> getDest() {
        return dest;
    }

    /** Tomador do serviço já resolvido: o participante indicado em toma3, ou os dados de toma4. */
    public Map<String, String> getToma() {
        return toma;
    }

    public Map<String, String> getProt() {
        return prot;
    }

    public Map<String, String> getVPrest() {
        return vPrest;
    }

    /** Grupo do ICMS normalizado (ver {@link LeitorDacte}). */
    public Map<String, String> getIcms() {
        return icms;
    }

    /** Demais campos de imp: vTotTrib, infAdFisco, vTotDFe. */
    public Map<String, String> getImp() {
        return imp;
    }

    /** Grupo imp/IBSCBS (Reforma Tributária), normalizado (ver {@link LeitorDacte}). */
    public Map<String, String> getIbsCbs() {
        return ibsCbs;
    }

    /** infCTeNorm/infCarga sem as quantidades (que estão em {@link #getQuantidades()}). */
    public Map<String, String> getCarga() {
        return carga;
    }

    /** Modal rodoviário: infModal/rodo. */
    public Map<String, String> getRodo() {
        return rodo;
    }

    /** infCTeNorm/infGlobalizado: xObs. */
    public Map<String, String> getInfGlobalizado() {
        return infGlobalizado;
    }

    public Map<String, String> getSupl() {
        return supl;
    }

    /** compl/ObsCont: xCampo (atributo) e xTexto. */
    public List<Map<String, String>> getObsCont() {
        return obsCont;
    }

    /** compl/ObsFisco: xCampo (atributo) e xTexto. */
    public List<Map<String, String>> getObsFisco() {
        return obsFisco;
    }

    /** vPrest/Comp: xNome e vComp. */
    public List<Map<String, String>> getComponentes() {
        return componentes;
    }

    /** infCarga/infQ: cUnid, tpMed e qCarga. */
    public List<Map<String, String>> getQuantidades() {
        return quantidades;
    }

    /** Documentos originários (infDoc), na ordem do XML. As chaves dependem do tipo, ver {@link LeitorDacte}. */
    public List<Map<String, String>> getDocumentos() {
        return documentos;
    }

    /** infCTeNorm/veicNovos: chassi, cCor, xCor, cMod, vUnit, vFrete. */
    public List<Map<String, String>> getVeiculos() {
        return veiculos;
    }

    /** Chaves dos CT-e complementados (infCteComp/chCTe), no CT-e de complemento de valores. */
    public List<String> getComplementados() {
        return complementados;
    }

    /** Componentes em linhas de {@value #COMPONENTES_POR_LINHA}; sem componente, uma linha em branco. */
    public List<List<Map<String, String>>> getComponentesLinhas() {
        List<List<Map<String, String>>> linhas = emLinhas(componentes, COMPONENTES_POR_LINHA);
        if (linhas.isEmpty()) {
            linhas.add(new ArrayList<Map<String, String>>(Collections.<Map<String, String>>nCopies(COMPONENTES_POR_LINHA, null)));
        }
        return linhas;
    }

    /** Quantidades da carga em linhas de {@value #QUANTIDADES_POR_LINHA}. */
    public List<List<Map<String, String>>> getQuantidadesLinhas() {
        return emLinhas(quantidades, QUANTIDADES_POR_LINHA);
    }

    /** Documentos originários em linhas de {@value #DOCUMENTOS_POR_LINHA} (duas colunas, como no DACTE Jasper). */
    public List<List<Map<String, String>>> getDocumentosLinhas() {
        return emLinhas(documentos, DOCUMENTOS_POR_LINHA);
    }

    /** Veículos novos em linhas de {@value #DOCUMENTOS_POR_LINHA}. */
    public List<List<Map<String, String>>> getVeiculosLinhas() {
        return emLinhas(veiculos, DOCUMENTOS_POR_LINHA);
    }

    /**
     * Agrupa a lista em linhas de tamanho fixo; a última linha é completada com null para manter as colunas.
     */
    private static List<List<Map<String, String>>> emLinhas(List<Map<String, String>> itens, int porLinha) {
        List<List<Map<String, String>>> linhas = new ArrayList<>();
        for (int i = 0; i < itens.size(); i += porLinha) {
            List<Map<String, String>> linha = new ArrayList<>();
            for (int j = i; j < i + porLinha; j++) {
                linha.add(j < itens.size() ? itens.get(j) : null);
            }
            linhas.add(linha);
        }
        return linhas;
    }

    /** tpAmb = 2. */
    public boolean isAmbienteHomologacao() {
        return "2".equals(ide.get("tpAmb"));
    }

    /** CT-e cancelado: cStat 101 no protocolo, como tratava o DACTE Jasper. */
    public boolean isCancelado() {
        return "101".equals(prot.get("cStat"));
    }

    /** Emissão em contingência FS-DA (tpEmis = 5). */
    public boolean isContingenciaFsda() {
        return "5".equals(ide.get("tpEmis"));
    }

    /** Emissão em contingência EPEC (tpEmis = 4). */
    public boolean isContingenciaEpec() {
        return "4".equals(ide.get("tpEmis"));
    }

    /**
     * Texto da marca d'água, na ordem de prioridade: cancelado; homologação; contingência FS-DA; produção sem
     * protocolo (pré-visualização, exceto nas contingências FS-DA e EPEC, impressas antes da autorização).
     * Null quando o DACTE sai sem marca.
     */
    public String getMarcaDagua() {
        if (isCancelado()) {
            return "CT-e CANCELADO";
        }
        if (isAmbienteHomologacao()) {
            return "EMITIDO EM AMBIENTE DE HOMOLOGAÇÃO - SEM VALOR FISCAL";
        }
        if (isContingenciaFsda()) {
            return "DACTE EM CONTINGÊNCIA - IMPRESSO EM DECORRÊNCIA DE PROBLEMAS TÉCNICOS";
        }
        if (prot.get("nProt") == null && !isContingenciaEpec()) {
            return "SEM VALOR FISCAL";
        }
        return null;
    }

    /** CT-e globalizado: ide/indGlobalizado = 1 ou grupo infGlobalizado informado. */
    public boolean isGlobalizado() {
        return "1".equals(ide.get("indGlobalizado")) || !infGlobalizado.isEmpty();
    }

    /** Expedidor ou recebedor informado: a linha dos dois quadros sai (o Jasper exigia os dois). */
    public boolean isExibirExpedidorRecebedor() {
        return !exped.isEmpty() || !receb.isEmpty();
    }

    /** CT-e normal ou substituto (infCTeNorm): carga, documentos originários e modal. */
    public boolean isExibirCarga() {
        return !carga.isEmpty() || !quantidades.isEmpty();
    }

    public boolean isExibirDocumentos() {
        return !documentos.isEmpty();
    }

    public boolean isExibirVeiculos() {
        return !veiculos.isEmpty();
    }

    public boolean isComplemento() {
        return !complementados.isEmpty();
    }

    /** modal = 01. */
    public boolean isRodoviario() {
        return "01".equals(ide.get("modal"));
    }

    /**
     * Quadro "Informações específicas do modal rodoviário": modal 01 com o grupo infModal/rodo, que só existe no
     * CT-e normal e no substituto (o de complemento não tem infCTeNorm).
     */
    public boolean isExibirModalRodoviario() {
        return isRodoviario() && !rodo.isEmpty();
    }

    public boolean isExibirIbsCbs() {
        return !ibsCbs.isEmpty();
    }

    public boolean isExibirQrCode() {
        return supl.get("qrCodCTe") != null;
    }
}
