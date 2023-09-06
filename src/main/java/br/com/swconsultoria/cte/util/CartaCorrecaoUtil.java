package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.Assinar;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.Evento;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.EventosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.evCCeCTe.EvCCeCTe;
import br.com.swconsultoria.cte.schema_400.evCCeCTe.TEvento;
import br.com.swconsultoria.cte.schema_400.evCCeCTe.TProcEvento;
import br.com.swconsultoria.cte.schema_400.evCCeCTe.TRetEvento;

import javax.xml.bind.JAXBException;
import java.time.ZoneId;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 02/03/2019 - 22:51
 */
public class CartaCorrecaoUtil {

    /**
     * MOnta o Evento de CCe unico
     *
     * @param cce
     * @param configuracao
     * @return
     * @throws CteException
     */
    public static TEvento montaCCe(Evento cce, ConfiguracoesCte configuracao) throws CteException {
        return montaCCe(cce, configuracao, ZoneId.systemDefault());
    }

    /**
     * MOnta o Evento de CCe em Lote
     *
     * @param cce
     * @param configuracao
     * @param zoneId
     * @return
     * @throws CteException
     */
    public static TEvento montaCCe(Evento cce, ConfiguracoesCte configuracao, ZoneId zoneId) throws CteException {

        String id = "ID" + EventosEnum.CCE.getCodigo() + cce.getChave() + ChaveUtil.completarComZerosAEsquerda(String.valueOf(cce.getSequencia()), 2);
        TEvento evento = new TEvento();
        evento.setVersao(ConstantesCte.VERSAO.CTE);

        TEvento.InfEvento infEvento = new TEvento.InfEvento();
        infEvento.setId(id);
        infEvento.setCOrgao(configuracao.getEstado().getCodigoUF());
        infEvento.setTpAmb(configuracao.getAmbiente().getCodigo());

        infEvento.setCNPJ(cce.getCnpj());

        infEvento.setChCTe(cce.getChave());

        infEvento.setDhEvento(XmlCteUtil.dataCte(cce.getDataEvento(), zoneId));
        infEvento.setTpEvento(EventosEnum.CCE.getCodigo());
        infEvento.setNSeqEvento(String.valueOf(cce.getSequencia()));

        EvCCeCTe evCCeCTe = new EvCCeCTe();
        evCCeCTe.setDescEvento("Carta de Correcao");
        evCCeCTe.setXCondUso("A Carta de Correcao e disciplinada pelo Art. 58-B do CONVENIO/SINIEF 06/89: Fica permitida a utilizacao de carta de correcao, para regularizacao de erro ocorrido na emissao de documentos fiscais relativos a prestacao de servico de transporte, desde que o erro nao esteja relacionado com: I - as variaveis que determinam o valor do imposto tais como: base de calculo, aliquota, diferenca de preco, quantidade, valor da prestacao;II - a correcao de dados cadastrais que implique mudanca do emitente, tomador, remetente ou do destinatario;III - a data de emissao ou de saida.");
        evCCeCTe.getInfCorrecao().addAll(cce.getListaCorrecoesCCe());

        TEvento.InfEvento.DetEvento detEvento = new TEvento.InfEvento.DetEvento();
        detEvento.setVersaoEvento(ConstantesCte.VERSAO.CTE);
        detEvento.setAny(ObjetoCTeUtil.objectToElement(evCCeCTe, EvCCeCTe.class, "evCCeCTe"));

        infEvento.setDetEvento(detEvento);
        evento.setInfEvento(infEvento);

        return evento;
    }

    /**
     * Cria o ProcEvento de CCe
     *
     * @param configuracoesCte
     * @param enviEvento
     * @param retorno
     * @return
     * @throws JAXBException
     * @throws CteException
     */
    public static String criaProcEventoCCe(ConfiguracoesCte configuracoesCte, TEvento enviEvento, TRetEvento retorno) throws JAXBException, CteException {

        String xml = XmlCteUtil.objectToXml(enviEvento);
        xml = xml.replaceAll(" xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", "");
        xml = xml.replaceAll("<evento v", "<evento xmlns=\"http://www.portalfiscal.inf.br/cte\" v");

        String assinado = Assinar.assinaCte(ConfiguracoesUtil.iniciaConfiguracoes(configuracoesCte), xml, AssinaturaEnum.EVENTO);

        TProcEvento procEvento = new TProcEvento();
        procEvento.setEventoCTe(enviEvento);
        procEvento.setRetEventoCTe(retorno);
        procEvento.setVersao(ConstantesCte.VERSAO.CTE);

        return XmlCteUtil.objectToXml(procEvento);
    }
}
