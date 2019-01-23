package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.enviCTe.TEnviCTe;
import br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento;
import br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento;
import br.com.swconsultoria.cte.schema_300.inutCTe.TInutCTe;
import br.com.swconsultoria.cte.schema_300.retConsReciCTe.TRetConsReciCTe;
import br.com.swconsultoria.cte.schema_300.retConsSitCTe.TRetConsSitCTe;
import br.com.swconsultoria.cte.schema_300.retConsStatServCTe.TRetConsStatServ;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TRetCTeOS;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TRetEnviCTe;
import br.com.swconsultoria.cte.schema_300.retInutCTe.TRetInutCTe;
import br.com.swconsultoria.cte.schema_300.retdistdfeint.RetDistDFeInt;
import br.com.swconsultoria.cte.util.CertificadoUtil;

/**
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
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

		return Status.statusServico(CertificadoUtil.iniciaConfiguracoes());

	}

	/**
	 * Classe Reponsavel Por Consultar o status da CTE na SEFAZ
	 *
	 * @param TConsReciCTe
	 * @return TRetConsReciCTe
	 * @throws CteException
	 */
    public static TRetConsSitCTe consultaXml(String chave)
			throws CteException {

		return ConsultaProtocolo.consultar(CertificadoUtil.iniciaConfiguracoes(), chave);

	}

	/**
	 * Classe Reponsavel Por Inutilizar a CTE na SEFAZ No tipo Informar
	 * ConstantesUtil.CTE ou ConstantesUtil.NFCE
	 *
	 * @param TInutCTe
	 * @return TRetInutCTe
	 * @throws CteException
	 */
    public static TRetInutCTe inutilizacao(
            TInutCTe inutCTe, boolean valida) throws CteException {

		return Inutilizacao.inutilizar(CertificadoUtil.iniciaConfiguracoes(), inutCTe, valida);

	}

	/**
	 * Classe Reponsavel Por Consultar a Distribuiçao da CTE na SEFAZ
	 *
	 * @param consSitCTe
	 * @return TRetConsSitCTe
	 * @throws CteException
	 */
	public static RetDistDFeInt distribuicaoDfe(String tipoCliente, String cpfCnpj, String nsu) throws CteException {

		return DistribuicaoDFe.consultaCte(CertificadoUtil.iniciaConfiguracoes(), tipoCliente, cpfCnpj, nsu);

	}

	/**
	 * Metodo para Montar a CTE.
	 *
	 * @param TEnviCTe
	 * @return TEnviCTe
	 * @throws CteException
	 */
    public static TEnviCTe montaCte(
            TEnviCTe enviCTe, boolean valida) throws CteException {

		return EnvioCte.montaCte(CertificadoUtil.iniciaConfiguracoes(), enviCTe, valida);

	}

	/**
	 * Metodo para Enviar a CTE.
	 *
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException
	 */
    public static TRetEnviCTe enviarCte(
            TEnviCTe enviCTe) throws CteException {

		return EnvioCte.enviaCte(CertificadoUtil.iniciaConfiguracoes(), enviCTe);

	}

	/**
	 * Metodo para Enviar a CTEOS.
	 *
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException
	 */
	public static TRetCTeOS enviarCteOS(TEnviCTe enviCTe) throws CteException {

		return EnvioCte.enviaCteOS(CertificadoUtil.iniciaConfiguracoes(), enviCTe);

	}

	/**
	 * Metodo para Cancelar a CTE 3.00
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
    public static br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento cancelarCte(
            br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento evento, boolean valida) throws CteException {

		return Evento.cancelamento(CertificadoUtil.iniciaConfiguracoes(), evento, valida);

	}

	/**
	 * Metodo para Evento EPEC da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
    public static TRetEvento epecCte(
            TEvento evento, boolean valida) throws CteException {

		return Evento.epec(CertificadoUtil.iniciaConfiguracoes(), evento, valida);

	}

	/**
	 * Metodo para Evento MULTIMODAL da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
    public static br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento multimodalCte(
            br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento evento, boolean valida) throws CteException {

		return Evento.multimodal(CertificadoUtil.iniciaConfiguracoes(), evento, valida);

	}

	/**
	 * Metodo para Evento CCE da CTE 3.00.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
    public static br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento cceCte(
            br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento evento, boolean valida) throws CteException {

		return Evento.cce(CertificadoUtil.iniciaConfiguracoes(), evento, valida);

	}

	/**
	 * Metodo para Evento PrestacaoDesacordo da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
    public static br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento prestacaoDesacordoCte(
            br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TEvento evento, boolean valida) throws CteException {

		return Evento.prestacaoDesacordo(CertificadoUtil.iniciaConfiguracoes(), evento, valida);

	}

	/**
	 * Metodo para Evento GVT da CTE.
	 *
	 * @param TEvento
	 * @return TRetEvento
	 * @throws CteException
	 */
    public static br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento gvtCte(
            br.com.swconsultoria.cte.schema_300.evGTV.TEvento evento, boolean valida) throws CteException {

		return Evento.gvt(CertificadoUtil.iniciaConfiguracoes(), evento, valida);

	}

	/**
	 * Metodo para Consulta Recibo CTE.
	 *
	 * @param TEnviCTe
	 * @return TRetConsReciCTe
	 * @throws CteException
	 */
    public static TRetConsReciCTe consultaRecibo(String recibo)
			throws CteException {

		return RetornoCte.consultaRecibo(CertificadoUtil.iniciaConfiguracoes(), recibo);

	}
}
