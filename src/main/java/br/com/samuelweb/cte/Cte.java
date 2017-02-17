/**
 * 
 */
package br.com.samuelweb.cte;

import br.com.samuelweb.cte.exception.CteException;
import br.inf.portalfiscal.cte.schema_300.distDFeInt.DistDFeInt;
import br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe;
import br.inf.portalfiscal.cte.schema_300.retDistDFeInt.RetDistDFeInt;
import br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetCTeOS;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 *
 */
public class Cte {
	
	/**
	 * Construtor privado
	 */
	private Cte() {
	}

	/**
	 * Metodo Responsavel Buscar o Status de Serviço do Servidor da Sefaz Versao 2.00
	 * No tipo Informar ConstantesUtil.CTE ou ConstantesUtil.NFCE
	 * 
	 * @param TConsStatServ
	 * @return TRetConsStatServ
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_200.retConsStatServCTe.TRetConsStatServ statusServico(br.inf.portalfiscal.cte.schema_200.consStatServCTe.TConsStatServ consStatServ, boolean valida) throws CteException{
		
		return Status.statusServico2(consStatServ , valida);
		
	}
	/**
	 * Metodo Responsavel Buscar o Status de Serviço do Servidor da Sefaz Versao 3.00
	 * No tipo Informar ConstantesUtil.CTE ou ConstantesUtil.NFCE
	 * 
	 * @param TConsStatServ
	 * @return TRetConsStatServ
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retConsStatServCTe.TRetConsStatServ statusServico(br.inf.portalfiscal.cte.schema_300.consStatServCTe.TConsStatServ consStatServ, boolean valida) throws CteException{
		
		return Status.statusServico3(consStatServ , valida);
		
	}
	
	/**
	 * Classe Reponsavel Por Consultar o status da CTE na SEFAZ Versão 2.00
	 * 
	 * @param TConsReciCTe
	 * @return TRetConsReciCTe
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_200.retConsSitCTe.TRetConsSitCTe consultaXml(br.inf.portalfiscal.cte.schema_200.consSitCTe.TConsSitCTe consReciCTe, boolean valida) throws CteException{
		
		return ConsultaProtocolo.consultar2(consReciCTe , valida);
		
	}
	
	/**
	 * Classe Reponsavel Por Consultar o status da CTE na SEFAZ Versão 3.00
	 * 
	 * @param TConsReciCTe
	 * @return TRetConsReciCTe
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_300.retConsSitCTe.TRetConsSitCTe consultaXml(br.inf.portalfiscal.cte.schema_300.consSitCTe.TConsSitCTe consReciCTe, boolean valida) throws CteException{
		
		return ConsultaProtocolo.consultar3(consReciCTe , valida);
		
	}
	
	/**
	 * Classe Reponsavel Por Inutilizar a CTE na SEFAZ Versão 2.00
	 * No tipo Informar ConstantesUtil.CTE ou ConstantesUtil.NFCE
	 * 
	 * @param TInutCTe
	 * @return TRetInutCTe
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_200.retInutCTe.TRetInutCTe inutilizacao(br.inf.portalfiscal.cte.schema_200.inutCTe.TInutCTe inutCTe, boolean valida) throws CteException{
		
		return Inutilizacao.inutilizar2(inutCTe , valida);
		
	}
	
	/**
	 * Classe Reponsavel Por Inutilizar a CTE na SEFAZ Versao 3.00
	 * No tipo Informar ConstantesUtil.CTE ou ConstantesUtil.NFCE
	 * 
	 * @param TInutCTe
	 * @return TRetInutCTe
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe inutilizacao(br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe inutCTe, boolean valida) throws CteException{
		
		return Inutilizacao.inutilizar3(inutCTe , valida);
		
	}
	
	/**
	 * Classe Reponsavel Por Consultar a Distribuiçao da CTE na SEFAZ
	 * 
	 * @param consSitCTe
	 * @return TRetConsSitCTe
	 * @throws CteException 
	 */
	public static RetDistDFeInt distribuicaoDfe(DistDFeInt distDFeInt, boolean valida) throws CteException{
		
		return DistribuicaoDFe.consultaCte(distDFeInt , valida);
		
	}
	
	/**
	 * Metodo para Montar a CTE Versao 2.00.
	 * 
	 * @param TEnviCTe
	 * @return TEnviCTe
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe montaCte(br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe enviCTe, boolean valida) throws CteException{
		
		return EnvioCte.montaCte2(enviCTe , valida);
				
	}
	
	/**
	 * Metodo para Montar a CTE Versao 3.00.
	 * 
	 * @param TEnviCTe
	 * @return TEnviCTe
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe montaCte(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe, boolean valida) throws CteException{
		
		return EnvioCte.montaCte3(enviCTe , valida);
		
	}
	
	/**
	 * Metodo para Consulta Recibo CTE Versao 2.00.
	 * 
	 * @param TEnviCTe
	 * @return TRetConsReciCTe
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_200.retConsReciCTe.TRetConsReciCTe consultaRecibo(br.inf.portalfiscal.cte.schema_200.consReciCTe.TConsReciCTe consReciCTe, boolean valida) throws CteException{
		
		return RetornoCte.consultaRecibo(consReciCTe , valida);
		
	}
	
	/**
	 * Metodo para Enviar a CTE 2.00.
	 * 
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_200.retEnviCTe.TRetEnviCTe enviarCte(br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe enviCTe) throws CteException{
		
		return EnvioCte.enviaCte2(enviCTe);
		
	}
	
	/**
	 * Metodo para Enviar a CTE 3.00.
	 * 
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe enviarCte(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe) throws CteException{
		
		return EnvioCte.enviaCte3(enviCTe);
		
	}
	
	/**
	 * Metodo para Enviar a CTEOS.
	 * 
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException 
	 */
	public static TRetCTeOS enviarCteOS(TEnviCTe enviCTe) throws CteException{
		
		return EnvioCte.enviaCteOS(enviCTe);
		
	}
	
	/**
	 * Metodo para Cancelar a CTE 2.00.
	 * 
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_200.evCancCTe.TRetEvento cancelarCte(br.inf.portalfiscal.cte.schema_200.evCancCTe.TEvento evento, boolean valida) throws CteException{
		
		return Evento.cancelamento2(evento , valida);
		
	}
	/**
	 * Metodo para Cancelar a CTE 3.00
	 * 
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento cancelarCte(br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento evento, boolean valida) throws CteException{
		
		return Evento.cancelamento3(evento , valida);
		
	}
	
	/**
	 * Metodo para Evento EPEC da CTE.
	 * 
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento epecCte(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento evento, boolean valida) throws CteException{
		
		return Evento.epec(evento , valida);
		
	}
	
	/**
	 * Metodo para Evento MULTIMODAL da CTE.
	 * 
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento multimodalCte(br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento evento, boolean valida) throws CteException{
		
		return Evento.multimodal(evento , valida);
		
	}
	
	/**
	 * Metodo para Evento CCE da CTE 2.00.
	 * 
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_200.evCCeCTe.TRetEvento cceCte(br.inf.portalfiscal.cte.schema_200.evCCeCTe.TEvento evento, boolean valida) throws CteException{
		
		return Evento.cce2(evento , valida);
		
	}
	
	/**
	 * Metodo para Evento CCE da CTE 3.00.
	 * 
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento cceCte(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento evento, boolean valida) throws CteException{
		
		return Evento.cce3(evento , valida);
		
	}
	
	/**
	 * Metodo para Evento PrestacaoDesacordo da CTE.
	 * 
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento prestacaoDesacordoCte(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento evento, boolean valida) throws CteException{
		
		return Evento.prestacaoDesacordo(evento , valida);
		
	}
	
	/**
	 * Metodo para Evento GVT da CTE.
	 * 
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException 
	 */
	public static br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento gvtCte(br.inf.portalfiscal.cte.schema_300.evGTV.TEvento evento, boolean valida) throws CteException{
		
		return Evento.gvt(evento , valida);
		
	}
}
