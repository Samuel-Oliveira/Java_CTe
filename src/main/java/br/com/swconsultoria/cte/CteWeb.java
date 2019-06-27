package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesWebCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.cteOS.TCTeOS;
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
public class CteWeb {

	/**
	 * Construtor privado
	 */
	private CteWeb() {
	}

    /**
     * Metodo Responsavel Consultar o Status de Serviço do Servidor de Cte da Sefaz
     *
     * @param config
     * @return
     * @throws CteException
     */
	public static TRetConsStatServ statusServico(ConfiguracoesWebCte config) throws CteException {

        return Status.statusServico(CertificadoUtil.iniciaConfiguracoes(config));

	}

    /**
     * Classe Reponsavel Por Consultar o status da CTE na SEFAZ
     *
     * @param config
     * @param chave
     * @return
     * @throws CteException
     */
    public static TRetConsSitCTe consultaXml(
			ConfiguracoesWebCte config, String chave) throws CteException {

        return ConsultaProtocolo.consultar(CertificadoUtil.iniciaConfiguracoes(config), chave);

	}

    /**
     * Classe Reponsavel Por Inutilizar a CTE na SEFAZ No tipo Informar
     * ConstantesUtil.CTE ou ConstantesUtil.NFCE
     *
     * @param config
     * @param inutCTe
     * @param valida
     * @return
     * @throws CteException
     */
    public static TRetInutCTe inutilizacao(ConfiguracoesWebCte config,
                                           TInutCTe inutCTe, boolean valida) throws CteException {

        return Inutilizacao.inutilizar(CertificadoUtil.iniciaConfiguracoes(config), inutCTe, valida);

	}

    /**
     * Classe Reponsavel Por Consultar a Distribuiçao da CTE na SEFAZ
     *
     * @param config
     * @param tipoCliente
     * @param cpfCnpj
     * @param nsu
     * @return
     * @throws CteException
     */
	public static RetDistDFeInt distribuicaoDfe(ConfiguracoesWebCte config, String tipoCliente, String cpfCnpj,
                                                String nsu) throws CteException {

		return DistribuicaoDFe.consultaCte(CertificadoUtil.iniciaConfiguracoes(config), tipoCliente, cpfCnpj, nsu);

	}

    /**
     * Metodo para Montar a CTE.
     *
     * @param config
     * @param enviCTe
     * @param valida
     * @return
     * @throws CteException
     */
    public static TEnviCTe montaCte(ConfiguracoesWebCte config,
                                    TEnviCTe enviCTe, boolean valida) throws CteException {

		return EnvioCte.montaCte(CertificadoUtil.iniciaConfiguracoes(config), enviCTe, valida);

	}

    /**
     * Metodo para Enviar a CTE.
     *
     * @param config
     * @param enviCTe
     * @return
     * @throws CteException
     */
    public static TRetEnviCTe enviarCte(ConfiguracoesWebCte config,
                                        TEnviCTe enviCTe) throws CteException {

		return EnvioCte.enviaCte(CertificadoUtil.iniciaConfiguracoes(config), enviCTe);

	}

	/**
	 * Metodo para Enviar a CTEOS.
	 *
	 * @param enviCTe
	 * @return
	 * @throws CteException
	 */
	public static TRetCTeOS enviarCteOS(ConfiguracoesWebCte config,TCTeOS enviCTe) throws CteException {

		return EnvioCteOS.enviaCteOS(CertificadoUtil.iniciaConfiguracoes(config), enviCTe);

	}

	/**
	 * Metodo para Montar a CTE OS.
	 *
	 * @param TCTeOS
	 * @param valida
	 * @return
	 * @throws CteException
	 */
	public static TCTeOS montaCteOS(ConfiguracoesWebCte config,
			TCTeOS enviCTe, boolean valida) throws CteException {

		return EnvioCteOS.montaCteOS(CertificadoUtil.iniciaConfiguracoes(config), enviCTe, valida);

	}

    /**
     * Metodo para Cancelar a CTE 3.00
     *
     * @param config
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento cancelarCte(ConfiguracoesWebCte config,
                                                                                       br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento evento, boolean valida) throws CteException {

        return Evento.cancelamento(CertificadoUtil.iniciaConfiguracoes(config), evento, valida);

	}

    /**
     * Metodo para Evento EPEC da CTE.
     *
     * @param config
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static TRetEvento epecCte(ConfiguracoesWebCte config,
                                     TEvento evento, boolean valida) throws CteException {

		return Evento.epec(CertificadoUtil.iniciaConfiguracoes(config), evento, valida);

	}

    /**
     * Metodo para Evento MULTIMODAL da CTE.
     *
     * @param config
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento multimodalCte(
            ConfiguracoesWebCte config, br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento evento,
			boolean valida) throws CteException {

        return Evento.multimodal(CertificadoUtil.iniciaConfiguracoes(config), evento, valida);

	}

    /**
     * Metodo para Evento CCE da CTE 3.00.
     *
     * @param config
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento cceCte(ConfiguracoesWebCte config,
                                                                                 br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento evento, boolean valida) throws CteException {

		return Evento.cce(CertificadoUtil.iniciaConfiguracoes(config), evento, valida);

	}

    /**
     * Metodo para Evento PrestacaoDesacordo da CTE.
     *
     * @param config
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento prestacaoDesacordoCte(
            ConfiguracoesWebCte config, br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TEvento evento,
			boolean valida) throws CteException {

        return Evento.prestacaoDesacordo(CertificadoUtil.iniciaConfiguracoes(config), evento, valida);

	}

    /**
     * Metodo para Evento GVT da CTE.
     *
     * @param config
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento gvtCte(ConfiguracoesWebCte config,
                                                                              br.com.swconsultoria.cte.schema_300.evGTV.TEvento evento, boolean valida) throws CteException {

		return Evento.gvt(CertificadoUtil.iniciaConfiguracoes(config), evento, valida);

	}

    /**
     * Metodo para Consulta Recibo CTE.
     *
     * @param config
     * @param recibo
     * @return
     * @throws CteException
     */
    public static TRetConsReciCTe consultaRecibo(
			ConfiguracoesWebCte config, String recibo) throws CteException {

		return RetornoCte.consultaRecibo(CertificadoUtil.iniciaConfiguracoes(config), recibo);

	}
}
