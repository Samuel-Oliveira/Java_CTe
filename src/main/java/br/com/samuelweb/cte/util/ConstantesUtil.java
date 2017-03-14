/**
 * 
 */
package br.com.samuelweb.cte.util;


/**
 * @author Samuel Oliveira
 *
 */
public interface ConstantesUtil {
	
	public static final String CTE = "CTe";
	public static final String CTE_OS = "CTeOS";
	
	interface SERVICOS {
		
		public static final String STATUS_SERVICO = "CTeStatusServico";
		public static final String ENVIO_CTE = "CTeRecepcao";
		public static final String CONSULTA_RECIBO = "CTeRetRecepcao";
		public static final String INUTILIZACAO = "CTeInutilizacao";
		public static final String CONSULTA_PROTOCOLO = "CTeConsultaProtocolo";
		public static final String EVENTO = "RecepcaoEvento";
		public static final String DISTRIBUICAO_DFE = "CTeDistribuicaoDFe_1.00";
		public static final String CANCELAR = "cancelar";
		public static final String EPEC = "epec";
		public static final String MULTIMODAL = "multimodal";
		public static final String CCE = "cce";
		public static final String PRESTACAO_DESACORDO = "prestacao";
		public static final String GVT = "gvt";
		public static final String MODAL_RODOVIARIO = "cteModalRodoviario";
		
	}
	
	interface XSD {
		
		public static final String STATUS_SERVICO = "consStatServCTe";
		public static final String ENVIO_CTE = "enviCTe";
		public static final String CONSULTA_RECIBO = "consReciCTe";
		public static final String INUTILIZACAO = "inutCTe";
		public static final String CONSULTA_PROTOCOLO = "consSitCTe";
		public static final String EVENTO = "eventoCTe";
		public static final String DISTRIBUICAO_DFE = "distDFeInt_v1.00";
		public static final String CANCELAR = "evCancCTe";
		public static final String EPEC = "evEPECCTe";
		public static final String MULTIMODAL = "evRegMultimodal";
		public static final String CCE = "evCCeCTe";
		public static final String PRESTACAO_DESACORDO = "evPrestDesacordo";
		public static final String GVT = "evGTV";
		public static final String MODAL_RODOVIARIO = "cteModalRodoviario";
		
	}
	
	interface XML {
		public static final String STATUS_SERVICO = "TConsStatServ";
		public static final String ENVIO_CTE = "TEnviCTe";
		public static final String CONSULTA_RECIBO = "TConsReciCTe";
		public static final String INUTILIZACAO = "TInutCTe";
		public static final String CONSULTA_PROTOCOLO = "TConsSitCTe";
		public static final String DISTRIBUICAO_DFE = "DistDFeInt";
		public static final String EVENTO = "TEvento";
		public static final String PROC_EVENTO = "TProcEvento";
		public static final String PROC_CTE = "CteProc";
		public static final String PROC_CTEOS = "CteOSProc";
		public static final String PROT_CTE = "TProtCTe";
		public static final String PROT_CTEOS = "TProtCTeOS";
		public static final String MODAL_RODOVIARIO = "Rodo";
		public static final String MODAL_RODOVIARIO_V2 = "br.inf.portalfiscal.cte.schema_200.cteModalRodoviario.Rodo";
		public static final String MODAL_RODOVIARIO_V3 = "br.inf.portalfiscal.cte.schema_300.cteModalRodoviario.Rodo";
		
		public static final String PROT_CTE_CONSULTA_RECIBO_V2 = "br.inf.portalfiscal.cte.schema_200.retConsReciCTe.TProtCTe";
		public static final String PROT_CTE_CONSULTA_RECIBO_V3 = "br.inf.portalfiscal.cte.schema_300.retConsReciCTe.TProtCTe";
		public static final String PROT_CTE_PROC_V2 = "br.inf.portalfiscal.cte.schema_200.procCTe.TProtCTe";
		public static final String PROT_CTE_PROC_V3 = "br.inf.portalfiscal.cte.schema_300.procCTe.TProtCTe";
		public static final String PROT_CTE_CONSULTA_SITUACAO_V2 = "br.inf.portalfiscal.cte.schema_200.retConsSitCTe.TProtCTe";
		public static final String PROT_CTE_CONSULTA_SITUACAO_V3 = "br.inf.portalfiscal.cte.schema_300.retConsSitCTe.TProtCTe";
		
		//TODO FAZER PROT CTEOS
		public static final String PROT_CTEOS_PROC_V3 = "br.inf.portalfiscal.cte.schema_300.retEnviCTe.TProtCTeOS";
		
		public static final String CANCELAR_V2 = "br.inf.portalfiscal.cte.schema_200.evCancCTe.TEvento";
		public static final String CANCELAR_V3 = "br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento";
		public static final String EPEC_V2 = "br.inf.portalfiscal.cte.schema_200.evEPECCTe.TEvento";
		public static final String EPEC_V3 = "br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento";
		public static final String MULTIMODAL_V2 = "br.inf.portalfiscal.cte.schema_200.evRegMultimodal.TEvento";
		public static final String MULTIMODAL_V3 = "br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento";
		public static final String CCE_V2 = "br.inf.portalfiscal.cte.schema_200.evCCeCTe.TEvento";
		public static final String CCE_V3 = "br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento";
		public static final String PRESTDESACORDO_V3 = "br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento";
		public static final String GVT_V3 = "br.inf.portalfiscal.cte.schema_300.evGTV.TEvento";
		
		public static final String PROC_CANCELAR_V2 = "br.inf.portalfiscal.cte.schema_200.evCancCTe.TProcEvento";
		public static final String PROC_CANCELAR_V3 = "br.inf.portalfiscal.cte.schema_300.evCancCTe.TProcEvento";
		public static final String PROC_EPEC_V2 = "br.inf.portalfiscal.cte.schema_200.evEPECCTe.TProcEvento";
		public static final String PROC_EPEC_V3 = "br.inf.portalfiscal.cte.schema_300.evEPECCTe.TProcEvento";
		public static final String PROC_MULTIMODAL_V2 = "br.inf.portalfiscal.cte.schema_200.evRegMultimodal.TProcEvento";
		public static final String PROC_MULTIMODAL_V3 = "br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TProcEvento";
		public static final String PROC_CCE_V2 = "br.inf.portalfiscal.cte.schema_200.evCCeCTe.TProcEvento";
		public static final String PROC_CCE_V3 = "br.inf.portalfiscal.cte.schema_300.evCCeCTe.TProcEvento";
		public static final String PROC_PRESTDESACORDO_V3 = "br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TProcEvento";
		public static final String PROC_GVT_V3 = "br.inf.portalfiscal.cte.schema_300.evGTV.TProcEvento";
	}
	
	interface AMBIENTE {
		public static final String HOMOLOGACAO = "2";
		public static final String PRODUCAO = "1";
	}
	
	interface VERSAO{
		public static final String V3_00 = "3.00";
		public static final String V2_00 = "2.00";
		public static final String V1_00 = "1.00";
	}

}
