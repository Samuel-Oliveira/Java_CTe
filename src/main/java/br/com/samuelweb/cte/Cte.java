package br.com.samuelweb.cte;

import br.com.samuelweb.cte.exception.CteException;
import br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe;
import br.inf.portalfiscal.cte.schema_300.retConsStatServCTe.TRetConsStatServ;
import br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetCTeOS;
import br.inf.portalfiscal.cte.schema_300.retdistdfeint.RetDistDFeInt;

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
	 * Metodo Responsavel Consultar o Status de Serviço do Servidor de Cte da Sefaz
	 *
	 * @return TRetConsStatServ
	 * @throws CteException
	 */
	public static TRetConsStatServ statusServico() throws CteException {
		
		return Status.statusServico();
		
	}

	/**
	 * Classe Reponsavel Por Consultar o status da CTE na SEFAZ
	 *
	 * @param TConsReciCTe
	 * @return TRetConsReciCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retConsSitCTe.TRetConsSitCTe consultaXml(String chave) throws CteException {

		return ConsultaProtocolo.consultar(chave);

	}


	/**
	 * Classe Reponsavel Por Inutilizar a CTE na SEFAZ
	 * No tipo Informar ConstantesUtil.CTE ou ConstantesUtil.NFCE
	 *
	 * @param TInutCTe
	 * @return TRetInutCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe inutilizacao(br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe inutCTe, boolean valida) throws CteException {

		return Inutilizacao.inutilizar(inutCTe , valida);

	}

	/**
	 * Classe Reponsavel Por Consultar a Distribuiçao da CTE na SEFAZ
	 *
	 * @param consSitCTe
	 * @return TRetConsSitCTe
	 * @throws CteException
	 */
	public static RetDistDFeInt distribuicaoDfe(String tipoCliente, String cpfCnpj, String nsu) throws CteException {

		return DistribuicaoDFe.consultaCte(tipoCliente, cpfCnpj , nsu);

	}

	/**
	 * Metodo para Montar a CTE.
	 *
	 * @param TEnviCTe
	 * @return TEnviCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe montaCte(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe, boolean valida) throws CteException {

		return EnvioCte.montaCte(enviCTe , valida);

	}

	/**
	 * Metodo para Enviar a CTE.
	 *
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe enviarCte(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe) throws CteException {

		return EnvioCte.enviaCte(enviCTe);

	}

	/**
	 * Metodo para Enviar a CTEOS.
	 *
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException
	 */
	public static TRetCTeOS enviarCteOS(TEnviCTe enviCTe) throws CteException {

		return EnvioCte.enviaCteOS(enviCTe);

	}

	/**
	 * Metodo para Cancelar a CTE 3.00
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento cancelarCte(br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento evento, boolean valida) throws CteException {

		return Evento.cancelamento(evento , valida);

	}

	/**
	 * Metodo para Evento EPEC da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento epecCte(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento evento, boolean valida) throws CteException {

		return Evento.epec(evento , valida);

	}

	/**
	 * Metodo para Evento MULTIMODAL da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento multimodalCte(br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento evento, boolean valida) throws CteException {

		return Evento.multimodal(evento , valida);

	}

	/**
	 * Metodo para Evento CCE da CTE 3.00.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento cceCte(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento evento, boolean valida) throws CteException {

		return Evento.cce(evento , valida);

	}

	/**
	 * Metodo para Evento PrestacaoDesacordo da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento prestacaoDesacordoCte(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento evento, boolean valida) throws CteException {

		return Evento.prestacaoDesacordo(evento , valida);

	}

	/**
	 * Metodo para Evento GVT da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento gvtCte(br.inf.portalfiscal.cte.schema_300.evGTV.TEvento evento, boolean valida) throws CteException {

		return Evento.gvt(evento , valida);

	}

	/**
	 * Metodo para Consulta Recibo CTE.
	 *
	 * @param TEnviCTe
	 * @return TRetConsReciCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retConsReciCTe.TRetConsReciCTe consultaRecibo(String recibo) throws CteException {

		return RetornoCte.consultaRecibo(recibo);

	}
}
