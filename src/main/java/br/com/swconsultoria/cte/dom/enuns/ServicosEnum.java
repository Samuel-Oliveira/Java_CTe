package br.com.swconsultoria.cte.dom.enuns;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 02/03/2019 - 20:03
 */
public enum ServicosEnum {

    STATUS_SERVICO("ctestatusservico_4.00", "consStatServCTe_v4.00.xsd"),
    ENVIO_CTE("CTeRecepcaoSinc_4.00", "cte_v4.00.xsd"),
    ENVIO_CTE_OS("CTeRecepcaoOS_4.00", "CTeOS_v4.00.xsd"),
    CONSULTA_RECIBO("CTeRetRecepcao_3.00", "consReciCTe_v3.00.xsd"),
    INUTILIZACAO("CTeInutilizacao_3.00", "inutCTe_v3.00.xsd"),
    CONSULTA_XML("CTeConsultaProtocolo_4.00", "consSitCTe_v4.00.xsd"),
    DISTRIBUICAO_DFE("CTeDistribuicaoDFe_1.00", "distDFeInt_v1.00.xsd"),
    CANCELAMENTO("recepcaoevento_4.00", "evCancCTe_v4.00.xsd"),
    EPEC("recepcaoevento_4.00", "evEPECCTe_v4.00.xsd"),
    MULTIMODAL("recepcaoevento_4.00", "evRegMultimodal_v4.00.xsd"),
    CCE("recepcaoevento_4.00", "evCCeCTe_v4.00.xsd"),
    PRESTACAO_DESACORDO("recepcaoevento_4.00", "evPrestDesacordo_v4.00.xsd"),
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
