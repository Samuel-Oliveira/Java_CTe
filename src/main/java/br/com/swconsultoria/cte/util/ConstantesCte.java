/**
 * 
 */
package br.com.swconsultoria.cte.util;


/**
 * @author Samuel Oliveira
 *
 */
public interface ConstantesCte {
	
	String CTE = "CTe";
	String CTE_OS = "CTeOS";
	
	interface SERVICOS {
		
		String STATUS_SERVICO = "CTeStatusServico";
		String ENVIO_CTE = "CTeRecepcao";
		String CONSULTA_RECIBO = "CTeRetRecepcao";
		String INUTILIZACAO = "CTeInutilizacao";
		String CONSULTA_PROTOCOLO = "CTeConsultaProtocolo";
		String EVENTO = "RecepcaoEvento";
		String DISTRIBUICAO_DFE = "CTeDistribuicaoDFe_1.00";
		String CANCELAR = "cancelar";
		String EPEC = "epec";
		String MULTIMODAL = "multimodal";
		String CCE = "cce";
		String PRESTACAO_DESACORDO = "prestacao";
		String GVT = "gvt";
		String MODAL_RODOVIARIO = "cteModalRodoviario";
		
	}
	
	interface XSD {
		
		String STATUS_SERVICO = "consStatServCTe";
		String ENVIO_CTE = "enviCTe";
		String CONSULTA_RECIBO = "consReciCTe";
		String INUTILIZACAO = "inutCTe";
		String CONSULTA_PROTOCOLO = "consSitCTe";
		String EVENTO = "eventoCTe";
		String DISTRIBUICAO_DFE = "distDFeInt_v1.00";
		String CANCELAR = "evCancCTe";
		String EPEC = "evEPECCTe";
		String MULTIMODAL = "evRegMultimodal";
		String CCE = "evCCeCTe";
		String PRESTACAO_DESACORDO = "evPrestDesacordo";
		String GVT = "evGTV";
		String MODAL_RODOVIARIO = "cteModalRodoviario";
		
	}
	
	interface XML {
		String STATUS_SERVICO = "TConsStatServ";
		String ENVIO_CTE = "TEnviCTe";
		String CONSULTA_RECIBO = "TConsReciCTe";
		String INUTILIZACAO = "TInutCTe";
		String CONSULTA_PROTOCOLO = "TConsSitCTe";
		String DISTRIBUICAO_DFE = "DistDFeInt";
		String EVENTO = "TEvento";
        String RET_EVENTO = "TRetEvento";
        String RET_INUTILIZACAO = "TRetInutCTe";
        String RET_CONSULTA = "TRetConsSitCTe";
		String PROC_EVENTO = "TProcEvento";
        String RET_ENVICTE = "TRetEnviCTe";
        String RET_CONSULTA_RECIBO = "TRetConsReciCTe";
        String PROC_CTE = "CteProc";
        String PROC_CTEOS = "CteOSProc";
        String PROT_CTE = "TProtCTe";
        String PROT_CTEOS = "TProtCTeOS";
        String MODAL_RODOVIARIO = "Rodo";
        String MODAL_RODOVIARIO_V3 = "br.com.swconsultoria.cte.schema_300.cteModalRodoviario.Rodo";
        String PROT_CTE_CONSULTA_RECIBO = "br.com.swconsultoria.cte.schema_300.retConsReciCTe.TProtCTe";
        String PROT_CTE_PROC = "br.com.swconsultoria.cte.schema_300.procCTe.TProtCTe";
        String PROT_CTE_CONSULTA_SITUACAO = "br.com.swconsultoria.cte.schema_300.retConsSitCTe.TProtCTe";

		//TODO FAZER PROT CTEOS
        String PROT_CTEOS_PROC = "br.com.swconsultoria.cte.schema_300.retEnviCTe.TProtCTeOS";

        String CANCELAR = "br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento";
        String EPEC = "br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento";
        String MULTIMODAL = "br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento";
        String CCE = "br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento";
        String PRESTDESACORDO = "br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TEvento";
        String GVT = "br.com.swconsultoria.cte.schema_300.evGTV.TEvento";

        String RET_CANCELAR = "br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento";
        String RET_EPEC = "br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento";
        String RET_MULTIMODAL = "br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento";
        String RET_CCE = "br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento";
        String RET_PRESTDESACORDO = "br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento";
        String RET_GVT = "br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento";

        String PROC_CANCELAR = "br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento";
        String PROC_EPEC = "br.com.swconsultoria.cte.schema_300.evEPECCTe.TProcEvento";
        String PROC_MULTIMODAL = "br.com.swconsultoria.cte.schema_300.evRegMultimodal.TProcEvento";
        String PROC_CCE = "br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento";
        String PROC_PRESTDESACORDO = "br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TProcEvento";
        String PROC_GVT = "br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento";
	}
	
	interface AMBIENTE {
		String HOMOLOGACAO = "2";
		String PRODUCAO = "1";
	}
	
	interface VERSAO{
        String CTE = "3.00";
		String DISTRIBUICAO = "1.00";
	}

	interface TIPOS {
		String CNPJ = "CNPJ";
		String CPF = "CPF";
		String NSU = "NSU";
		String CHAVE = "CHAVE";
	}

	interface EVENTOS {
		String CANCELAMENTO_COD = "110111";
		String CANCELAMENTO_DESC = "Cancelamento";

		String CCE_COD = "110110";
		String CCE_DESC = "Carta de Correcao";
		String CCE_COND_USO = "A Carta de Correcao e disciplinada pelo Art. 58-B do CONVENIO/SINIEF 06/89: Fica permitida a utilizacao de carta de correcao, para regularizacao de erro ocorrido na emissao de documentos fiscais relativos a prestacao de servico de transporte, desde que o erro nao esteja relacionado com: I - as variaveis que determinam o valor do imposto tais como: base de calculo, aliquota, diferenca de preco, quantidade, valor da prestacao;II - a correcao de dados cadastrais que implique mudanca do emitente, tomador, remetente ou do destinatario;III - a data de emissao ou de saida.";

		String INUTILIZAR = "INUTILIZAR";

	}

}
