package br.com.swconsultoria.cte.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CstDTO {

    @JsonProperty("CST")
    private String cst;
    @JsonProperty("DescricaoCST")
    private String descricaoCST;
    @JsonProperty("IndIBSCBS")
    private Boolean indIBSCBS;
    @JsonProperty("IndRedBC")
    private Boolean indRedBC;
    @JsonProperty("IndRedAliq")
    private Boolean indRedAliq;
    @JsonProperty("IndTransfCred")
    private Boolean indTransfCred;
    @JsonProperty("IndDif")
    private Boolean indDif;
    @JsonProperty("IndAjusteCompet")
    private Boolean indAjusteCompet;
    @JsonProperty("IndIBSCBSMono")
    private Boolean indIBSCBSMono;
    @JsonProperty("IndCredPresIBSZFM")
    private Boolean indCredPresIBSZFM;
    @JsonProperty("classificacoesTributarias")
    private List<ClassificacaoTributariaDTO> classificacoesTributarias;

    public String getCst() { return cst; }
    public void setCst(String cst) { this.cst = cst; }
    public String getDescricaoCST() { return descricaoCST; }
    public void setDescricaoCST(String v) { this.descricaoCST = v; }
    public Boolean getIndIBSCBS() { return indIBSCBS; }
    public void setIndIBSCBS(Boolean v) { this.indIBSCBS = v; }
    public Boolean getIndRedBC() { return indRedBC; }
    public void setIndRedBC(Boolean v) { this.indRedBC = v; }
    public Boolean getIndRedAliq() { return indRedAliq; }
    public void setIndRedAliq(Boolean v) { this.indRedAliq = v; }
    public Boolean getIndTransfCred() { return indTransfCred; }
    public void setIndTransfCred(Boolean v) { this.indTransfCred = v; }
    public Boolean getIndDif() { return indDif; }
    public void setIndDif(Boolean v) { this.indDif = v; }
    public Boolean getIndAjusteCompet() { return indAjusteCompet; }
    public void setIndAjusteCompet(Boolean v) { this.indAjusteCompet = v; }
    public Boolean getIndIBSCBSMono() { return indIBSCBSMono; }
    public void setIndIBSCBSMono(Boolean v) { this.indIBSCBSMono = v; }
    public Boolean getIndCredPresIBSZFM() { return indCredPresIBSZFM; }
    public void setIndCredPresIBSZFM(Boolean v) { this.indCredPresIBSZFM = v; }
    public List<ClassificacaoTributariaDTO> getClassificacoesTributarias() { return classificacoesTributarias; }
    public void setClassificacoesTributarias(List<ClassificacaoTributariaDTO> v) { this.classificacoesTributarias = v; }
}