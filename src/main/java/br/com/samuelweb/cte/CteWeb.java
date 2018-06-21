package br.com.samuelweb.cte;

import br.com.samuelweb.cte.dom.ConfiguracoesWebCte;
import br.com.samuelweb.cte.exception.CteException;
import br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe;
import br.inf.portalfiscal.cte.schema_300.retConsStatServCTe.TRetConsStatServ;
import br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetCTeOS;
import br.inf.portalfiscal.cte.schema_300.retdistdfeint.RetDistDFeInt;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 *
 */
public class CteWeb {

	/**
	 * Construtor privado
	 */
	private CteWeb() {
	}

	/**
	 * Metodo Responsavel Consultar o Status de Serviço do Servidor de Cte da Sefaz
	 *
	 * @return TRetConsStatServ
	 * @throws CteException
	 */
	public static TRetConsStatServ statusServico(ConfiguracoesWebCte config) throws CteException {

		return Status.statusServico(config);

	}

	/**
	 * Classe Reponsavel Por Consultar o status da CTE na SEFAZ
	 *
	 * @param TConsReciCTe
	 * @return TRetConsReciCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retConsSitCTe.TRetConsSitCTe consultaXml(
			ConfiguracoesWebCte config, String chave) throws CteException {

		return ConsultaProtocolo.consultar(config, chave);

	}

	/**
	 * Classe Reponsavel Por Inutilizar a CTE na SEFAZ No tipo Informar
	 * ConstantesUtil.CTE ou ConstantesUtil.NFCE
	 *
	 * @param TInutCTe
	 * @return TRetInutCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe inutilizacao(ConfiguracoesWebCte config,
			br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe inutCTe, boolean valida) throws CteException {

		return Inutilizacao.inutilizar(config, inutCTe, valida);

	}

	/**
	 * Classe Reponsavel Por Consultar a Distribuiçao da CTE na SEFAZ
	 *
	 * @param consSitCTe
	 * @return TRetConsSitCTe
	 * @throws CteException
	 */
	public static RetDistDFeInt distribuicaoDfe(ConfiguracoesWebCte config, String tipoCliente, String cpfCnpj,
			String nsu) throws CteException {

		return DistribuicaoDFe.consultaCte(config, tipoCliente, cpfCnpj, nsu);

	}

	/**
	 * Metodo para Montar a CTE.
	 *
	 * @param TEnviCTe
	 * @return TEnviCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe montaCte(ConfiguracoesWebCte config,
			br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe, boolean valida) throws CteException {

		return EnvioCte.montaCte(config, enviCTe, valida);

	}

	/**
	 * Metodo para Enviar a CTE.
	 *
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe enviarCte(ConfiguracoesWebCte config,
			br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe) throws CteException {

		return EnvioCte.enviaCte(config, enviCTe);

	}

	/**
	 * Metodo para Enviar a CTEOS.
	 *
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException
	 */
	public static TRetCTeOS enviarCteOS(ConfiguracoesWebCte config, TEnviCTe enviCTe) throws CteException {

		return EnvioCte.enviaCteOS(config, enviCTe);

	}

	/**
	 * Metodo para Cancelar a CTE 3.00
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento cancelarCte(ConfiguracoesWebCte config,
			br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento evento, boolean valida) throws CteException {

		return Evento.cancelamento(config, evento, valida);

	}

	/**
	 * Metodo para Evento EPEC da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento epecCte(ConfiguracoesWebCte config,
			br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento evento, boolean valida) throws CteException {

		return Evento.epec(config, evento, valida);

	}

	/**
	 * Metodo para Evento MULTIMODAL da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento multimodalCte(
			ConfiguracoesWebCte config, br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento evento,
			boolean valida) throws CteException {

		return Evento.multimodal(config, evento, valida);

	}

	/**
	 * Metodo para Evento CCE da CTE 3.00.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento cceCte(ConfiguracoesWebCte config,
			br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento evento, boolean valida) throws CteException {

		return Evento.cce(config, evento, valida);

	}

	/**
	 * Metodo para Evento PrestacaoDesacordo da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento prestacaoDesacordoCte(
			ConfiguracoesWebCte config, br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento evento,
			boolean valida) throws CteException {

		return Evento.prestacaoDesacordo(config, evento, valida);

	}

	/**
	 * Metodo para Evento GVT da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento gvtCte(ConfiguracoesWebCte config,
			br.inf.portalfiscal.cte.schema_300.evGTV.TEvento evento, boolean valida) throws CteException {

		return Evento.gvt(config, evento, valida);

	}

	/**
	 * Metodo para Consulta Recibo CTE.
	 *
	 * @param TEnviCTe
	 * @return TRetConsReciCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retConsReciCTe.TRetConsReciCTe consultaRecibo(
			ConfiguracoesWebCte config, String recibo) throws CteException {

		return RetornoCte.consultaRecibo(config, recibo);

	}
}
