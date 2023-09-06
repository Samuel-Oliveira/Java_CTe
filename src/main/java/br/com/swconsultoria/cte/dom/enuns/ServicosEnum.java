package br.com.swconsultoria.cte.dom.enuns;

import lombok.Getter;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 */
@Getter
public enum ServicosEnum {

    STATUS_SERVICO("CTeStatusServico_4.00", "consStatServCTe_v4.00.xsd"),
    ENVIO_CTE("CTeRecepcaoSinc_4.00", "cte_v4.00.xsd"),
    CONSULTA_XML("CTeConsultaProtocolo_4.00", "consSitCTe_v4.00.xsd"),
    DISTRIBUICAO_DFE("CTeDistribuicaoDFe_1.00", "distDFeInt_v1.00.xsd"),
    QRCODE("URL-QRCode", ""),
    CANCELAMENTO("RecepcaoEvento_4.00", "evCancCTe_v4.00.xsd"),
    EVENTO("", "eventoCTe_v4.00.xsd"),
    ENVIO_CTE_OS("CTeRecepcaoOS_4.00", "cteOS_v4.00.xsd"),
    EPEC("RecepcaoEvento_4.00", "evEPECCTe_v4.00.xsd"),
    MULTIMODAL("RecepcaoEvento_4.00", "evRegMultimodal_v4.00.xsd"),
    CCE("RecepcaoEvento_4.00", "evCCeCTe_v4.00.xsd"),
    PRESTACAO_DESACORDO("RecepcaoEvento_4.00", "evPrestDesacordo_v4.00.xsd"),
    CANCELA_PRESTACAO_DESACORDO("RecepcaoEvento_4.00", "evCancPrestDesacordo_v4.00.xsd"),
    COMPROVANTE_ENTREGA("RecepcaoEvento_4.00", "evCECTe_v4.00.xsd"),
    CANCELA_COMPROVANTE_ENTREGA("RecepcaoEvento_4.00", "evCancCECTe_v4.00.xsd"),
    GVT("RecepcaoEvento_4.00", "evGTV_v4.00.xsd");

    private final String servico;
    private final String xsd;

    ServicosEnum(String servico, String xsd) {
        this.servico = servico;
        this.xsd = xsd;
    }

}
