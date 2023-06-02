package br.com.swconsultoria.cte.dom.enuns;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 02/03/2019 - 20:03
 */
public enum ServicosEnum {

    STATUS_SERVICO("ctestatusservico_3.00", "consStatServCTe_v3.00.xsd"),
    ENVIO_CTE("CTeRecepcao_3.00", "cte_v4.00.xsd"),
    ENVIO_CTE_OS("CTeRecepcaoOS_3.00", "CTeOS_v3.00.xsd"),
    CONSULTA_RECIBO("CTeRetRecepcao_3.00", "consReciCTe_v3.00.xsd"),
    INUTILIZACAO("CTeInutilizacao_3.00", "inutCTe_v3.00.xsd"),
    CONSULTA_XML("CTeConsultaProtocolo_3.00", "consSitCTe_v3.00.xsd"),
    DISTRIBUICAO_DFE("CTeDistribuicaoDFe_1.00", "distDFeInt_v1.00.xsd"),
    CANCELAMENTO("recepcaoevento_3.00", "evCancCTe_v3.00.xsd"),
    EPEC("recepcaoevento_3.00", "evEPECCTe_v3.00.xsd"),
    MULTIMODAL("recepcaoevento_3.00", "evRegMultimodal_v3.00.xsd"),
    CCE("recepcaoevento_3.00", "evCCeCTe_v3.00.xsd"),
    PRESTACAO_DESACORDO("recepcaoevento_3.00", "evPrestDesacordo_v3.00.xsd"),
    GVT("recepcaoevento_3.00", "evGTV_v3.00.xsd"),
    QRCODE("QR_Code",""),
    EVENTO("","eventoCTe_v4.00.xsd");

    //    URL_QRCODE("url-qrcode",null),
//    URL_CONSULTANFCE("url-consultanfce", null);

    private final String servico;
    private final String xsd;

    ServicosEnum(String servico, String xsd) {
        this.servico = servico;
        this.xsd = xsd;
    }

    public String getServico() {
        return servico;
    }

    public String getXsd() {
        return xsd;
    }
    }
