package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.ConsultaDFeEnum;
import br.com.swconsultoria.cte.dom.enuns.PessoaEnum;
import br.com.swconsultoria.cte.eventos.*;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_100.retdistdfeint.RetDistDFeInt;
import br.com.swconsultoria.cte.schema_400.cte.TCTe;
import br.com.swconsultoria.cte.schema_400.cte.TRetCTe;
import br.com.swconsultoria.cte.schema_400.cteOS.TCTeOS;
import br.com.swconsultoria.cte.schema_400.evEPECCTe.TEvento;
import br.com.swconsultoria.cte.schema_400.evEPECCTe.TRetEvento;
import br.com.swconsultoria.cte.schema_400.retCTeOS.TRetCTeOS;
import br.com.swconsultoria.cte.schema_400.retConsSitCTe.TRetConsSitCTe;
import br.com.swconsultoria.cte.schema_400.retConsStatServCTe.TRetConsStatServ;
import br.com.swconsultoria.cte.util.ConfiguracoesUtil;

/**
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
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
     * @param configuracoesCte
     * @return
     * @throws CteException
     */
    public static TRetConsStatServ statusServico(ConfiguracoesCte configuracoesCte) throws CteException {

        return Status.statusServico(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte));

    }

    /**
     * Classe Reponsavel Por Consultar o status da CTE na SEFAZ
     *
     * @param configuracoesCte
     * @param chave
     * @return
     * @throws CteException
     */
    public static TRetConsSitCTe consultaXml(ConfiguracoesCte configuracoesCte, String chave)
            throws CteException {

        return ConsultaXml.consultaXml(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), chave);

    }

    /**
     * Classe Reponsavel Por Consultar a Distribuiçao da CTE na SEFAZ
     *
     * @param configuracoesCte
     * @param tipoPessoa
     * @param cpfCnpj
     * @param tipoConsulta
     * @param nsu
     * @return
     * @throws CteException
     */
    public static RetDistDFeInt distribuicaoDfe(ConfiguracoesCte configuracoesCte, PessoaEnum tipoPessoa, String cpfCnpj,
                                                ConsultaDFeEnum tipoConsulta, String nsu) throws CteException {

        return DistribuicaoDFe.consultaCte(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), tipoPessoa, cpfCnpj, tipoConsulta, nsu);

    }

    /**
     * Metodo para Montar a CTE.
     *
     * @param configuracoesCte
     * @param enviCTe
     * @param valida
     * @return
     * @throws CteException
     */
    public static TCTe montaCte(ConfiguracoesCte configuracoesCte, TCTe enviCTe, boolean valida) throws CteException {

        return EnvioCte.montaCte(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), enviCTe, valida);

    }

    /**
     * Metodo para Montar a CTE OS.
     *
     * @param configuracoesCte
     * @param enviCTe
     * @param valida
     * @return
     * @throws CteException
     */
    public static TCTeOS montaCteOS(ConfiguracoesCte configuracoesCte,
                                    TCTeOS enviCTe, boolean valida) throws CteException {
        return EnvioCteOS.montaCteOS(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), enviCTe, valida);

    }

    /**
     * Metodo para Enviar a CTE.
     *
     * @param configuracoesCte
     * @param cte
     * @return
     * @throws CteException
     */
    public static TRetCTe enviarCte(ConfiguracoesCte configuracoesCte,
                                    TCTe cte) throws CteException {

        return EnvioCte.enviaCte(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), cte);

    }

    /**
     * Metodo para Enviar a CTEOS.
     *
     * @param configuracoesCte
     * @param enviCTe
     * @return
     * @throws CteException
     */
    public static TRetCTeOS enviarCteOS(ConfiguracoesCte configuracoesCte, TCTeOS enviCTe) throws CteException {
        return EnvioCteOS.enviaCteOS(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), enviCTe);
    }

    /**
     * Metodo para Cancelar a CTE 4.00
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_400.evCancCTe.TRetEvento cancelarCte(ConfiguracoesCte configuracoesCte,
                                                                                       br.com.swconsultoria.cte.schema_400.evCancCTe.TEvento evento,
                                                                                       boolean valida) throws CteException {

        return Cancelar.eventoCancelamento(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

    /**
     * Metodo para Evento EPEC da CTE.
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static TRetEvento epecCte(ConfiguracoesCte configuracoesCte,
                                     TEvento evento, boolean valida) throws CteException {

        return Epec.eventoEpec(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

    /**
     * Metodo para Evento MULTIMODAL da CTE.
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_400.evRegMultimodal.TRetEvento multimodalCte(ConfiguracoesCte configuracoesCte,
                                                                                               br.com.swconsultoria.cte.schema_400.evRegMultimodal.TEvento evento, boolean valida) throws CteException {

        return Multimodal.eventoMulti(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

    /**
     * Metodo para Evento CCE da CTE 4.00.
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_400.evCCeCTe.TRetEvento cceCte(ConfiguracoesCte configuracoesCte,
                                                                                 br.com.swconsultoria.cte.schema_400.evCCeCTe.TEvento evento, boolean valida) throws CteException {

        return CartaCorrecao.eventoCCe(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

    /**
     * Metodo para Evento PrestacaoDesacordo da CTE.
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_400.evPrestDesacordo.TRetEvento prestacaoDesacordoCte(ConfiguracoesCte configuracoesCte,
                                                                                                        br.com.swconsultoria.cte.schema_400.evPrestDesacordo.TEvento evento, boolean valida) throws CteException {

        return PrestacaoDesacordo.eventoPrestacaoDesacordo(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

    /**
     * Metodo para Evento Cancelamento PrestacaoDesacordo da CTE.
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_400.evCancPrestDesacordo.TRetEvento cancelamentoPrestacaoDesacordoCte(ConfiguracoesCte configuracoesCte,
                                                                                                                        br.com.swconsultoria.cte.schema_400.evCancPrestDesacordo.TEvento evento, boolean valida) throws CteException {

        return CancelamentoPrestacaoDesacordo.eventoCancPrestacaoDesacordo(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

    /**
     * Metodo para Evento GVT da CTE.
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_400.evGTV.TRetEvento gvtCte(ConfiguracoesCte configuracoesCte,
                                                                              br.com.swconsultoria.cte.schema_400.evGTV.TEvento evento, boolean valida) throws CteException {

        return Gvt.eventoGvt(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

    /**
     * Metodo para Evento Comprovante Entrega.
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_400.evCECTe.TRetEvento comprovanteEntrega(ConfiguracoesCte configuracoesCte,
                                                                                            br.com.swconsultoria.cte.schema_400.evCECTe.TEvento evento, boolean valida) throws CteException {

        return ComprovanteEntrega.eventoComprovanteEntrega(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

    /**
     * Metodo para Evento Cancela Comprovante Entrega.
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_400.evCancCECTe.TRetEvento cancComprovanteEntrega(ConfiguracoesCte configuracoesCte,
                                                                                                    br.com.swconsultoria.cte.schema_400.evCancCECTe.TEvento evento, boolean valida) throws CteException {

        return CancelamentoComprovanteEntrega.eventoCancComprovanteEntrega(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

    /**
     * Metodo para Evento Insucesso Entrega.
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_400.evIECTe.TRetEvento insucessoEntrega(ConfiguracoesCte configuracoesCte,
                                                                                          br.com.swconsultoria.cte.schema_400.evIECTe.TEvento evento, boolean valida) throws CteException {

        return InsucessoEntrega.eventoInsucessoEntrega(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

    /**
     * Metodo para Evento Cancela Insucesso Entrega.
     *
     * @param configuracoesCte
     * @param evento
     * @param valida
     * @return
     * @throws CteException
     */
    public static br.com.swconsultoria.cte.schema_400.evCancIECTe.TRetEvento cancelaInsucessoEntrega(ConfiguracoesCte configuracoesCte,
                                                                                                     br.com.swconsultoria.cte.schema_400.evCancIECTe.TEvento evento, boolean valida) throws CteException {

        return CancelamentoInsucessoEntrega.eventoCancelamentoInsucessoEntrega(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), evento, valida);

    }

}
