package br.com.swconsultoria.cte.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClassificacaoTributariaDTO {

    @JsonProperty("cClassTrib")
    private String cClassTrib;
    @JsonProperty("DescricaoClassTrib")
    private String descricaoClassTrib;
    @JsonProperty("pRedIBS")
    private BigDecimal pRedIBS;
    @JsonProperty("pRedCBS")
    private BigDecimal pRedCBS;
    @JsonProperty("IndTribRegular")
    private Boolean indTribRegular;
    @JsonProperty("IndCredPresOper")
    private Boolean indCredPresOper;
    @JsonProperty("IndEstornoCred")
    private Boolean indEstornoCred;
    @JsonProperty("MonofasiaSujeitaRetencao")
    private Boolean monofasiaSujeitaRetencao;
    @JsonProperty("MonofasiaRetidaAnt")
    private Boolean monofasiaRetidaAnt;
    @JsonProperty("MonofasiaDiferimento")
    private Boolean monofasiaDiferimento;
    @JsonProperty("MonofasiaPadrao")
    private Boolean monofasiaPadrao;
    @JsonProperty("IndNFe")
    private Boolean indNFe;
    @JsonProperty("IndNFCe")
    private Boolean indNFCe;
    @JsonProperty("IndCTe")
    private Boolean indCTe;
    @JsonProperty("IndCTeOS")
    private Boolean indCTeOS;

    public String getCClassTrib() { return cClassTrib; }
    public void setCClassTrib(String v) { this.cClassTrib = v; }
    public String getDescricaoClassTrib() { return descricaoClassTrib; }
    public void setDescricaoClassTrib(String v) { this.descricaoClassTrib = v; }
    public BigDecimal getPRedIBS() { return pRedIBS; }
    public void setPRedIBS(BigDecimal v) { this.pRedIBS = v; }
    public BigDecimal getPRedCBS() { return pRedCBS; }
    public void setPRedCBS(BigDecimal v) { this.pRedCBS = v; }
    public Boolean getIndTribRegular() { return indTribRegular; }
    public void setIndTribRegular(Boolean v) { this.indTribRegular = v; }
    public Boolean getIndCredPresOper() { return indCredPresOper; }
    public void setIndCredPresOper(Boolean v) { this.indCredPresOper = v; }
    public Boolean getIndEstornoCred() { return indEstornoCred; }
    public void setIndEstornoCred(Boolean v) { this.indEstornoCred = v; }
    public Boolean getMonofasiaSujeitaRetencao() { return monofasiaSujeitaRetencao; }
    public void setMonofasiaSujeitaRetencao(Boolean v) { this.monofasiaSujeitaRetencao = v; }
    public Boolean getMonofasiaRetidaAnt() { return monofasiaRetidaAnt; }
    public void setMonofasiaRetidaAnt(Boolean v) { this.monofasiaRetidaAnt = v; }
    public Boolean getMonofasiaDiferimento() { return monofasiaDiferimento; }
    public void setMonofasiaDiferimento(Boolean v) { this.monofasiaDiferimento = v; }
    public Boolean getMonofasiaPadrao() { return monofasiaPadrao; }
    public void setMonofasiaPadrao(Boolean v) { this.monofasiaPadrao = v; }
    public Boolean getIndNFe() { return indNFe; }
    public void setIndNFe(Boolean v) { this.indNFe = v; }
    public Boolean getIndNFCe() { return indNFCe; }
    public void setIndNFCe(Boolean v) { this.indNFCe = v; }
    public Boolean getIndCTe() { return indCTe; }
    public void setIndCTe(Boolean v) { this.indCTe = v; }
    public Boolean getIndCTeOS() { return indCTeOS; }
    public void setIndCTeOS(Boolean v) { this.indCTeOS = v; }
}