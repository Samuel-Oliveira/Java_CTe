package br.com.swconsultoria.cte.dom;

import br.com.swconsultoria.cte.schema_400.evCCeCTe.EvCCeCTe;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 04/03/2019 - 10:34
 */
public class Evento {

    private String chave;
    private String protocolo;
    private String motivo;
    private String cnpj;
    private LocalDateTime dataEvento;
    private int sequencia;
    private List<EvCCeCTe.InfCorrecao> listaCorrecoesCCe;
    private EventoEpec eventoEpec;

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public EventoEpec getEventoEpec() {
        return eventoEpec;
    }

    public void setEventoEpec(EventoEpec eventoEpec) {
        this.eventoEpec = eventoEpec;
    }

    public List<EvCCeCTe.InfCorrecao> getListaCorrecoesCCe() {
        return listaCorrecoesCCe;
    }

    public void setListaCorrecoesCCe(List<EvCCeCTe.InfCorrecao> listaCorrecoesCCe) {
        this.listaCorrecoesCCe = listaCorrecoesCCe;
    }
}