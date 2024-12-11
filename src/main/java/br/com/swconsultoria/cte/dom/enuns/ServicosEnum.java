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
    CANCELAMENTO(Constants.RECEPCAO_EVENTO_4_00, "evCancCTe_v4.00.xsd"),
    EVENTO("", "eventoCTe_v4.00.xsd"),
    ENVIO_CTE_OS("CTeRecepcaoOS_4.00", "cteOS_v4.00.xsd"),
    ENVIO_CTE_SIMP("CTeRecepcaoSimp_4.00", "cteSimp_v4.00.xsd"),
    EPEC(Constants.RECEPCAO_EVENTO_4_00, "evEPECCTe_v4.00.xsd"),
    MULTIMODAL(Constants.RECEPCAO_EVENTO_4_00, "evRegMultimodal_v4.00.xsd"),
    CCE(Constants.RECEPCAO_EVENTO_4_00, "evCCeCTe_v4.00.xsd"),
    PRESTACAO_DESACORDO(Constants.RECEPCAO_EVENTO_4_00, "evPrestDesacordo_v4.00.xsd"),
    CANCELA_PRESTACAO_DESACORDO(Constants.RECEPCAO_EVENTO_4_00, "evCancPrestDesacordo_v4.00.xsd"),
    COMPROVANTE_ENTREGA(Constants.RECEPCAO_EVENTO_4_00, "evCECTe_v4.00.xsd"),
    CANCELA_COMPROVANTE_ENTREGA(Constants.RECEPCAO_EVENTO_4_00, "evCancCECTe_v4.00.xsd"),
    GVT(Constants.RECEPCAO_EVENTO_4_00, "evGTV_v4.00.xsd"),
    INSUCESSO_ENTREGA(Constants.RECEPCAO_EVENTO_4_00, "evIECTe_v4.00.xsd"),
    CANCELA_INSUCESSO_ENTREGA(Constants.RECEPCAO_EVENTO_4_00, "evCancIECTe_v4.00.xsd");

    private final String servico;
    private final String xsd;

    ServicosEnum(String servico, String xsd) {
        this.servico = servico;
        this.xsd = xsd;
    }

    private static class Constants {
        private static final String RECEPCAO_EVENTO_4_00 = "RecepcaoEvento_4.00";
    }
}
