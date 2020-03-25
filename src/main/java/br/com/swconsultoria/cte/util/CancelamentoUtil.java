package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.Assinar;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.Evento;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.EventosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.evCancCTe.EvCancCTe;
import br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento;
import br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento;
import br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento;

import javax.xml.bind.JAXBException;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 02/03/2019 - 22:51
 */
public class CancelamentoUtil {

    /**
     * MOnta o Evento de cancelamento unico
     *
     * @param cancela
     * @param configuracao
     * @return
     * @throws CteException
     */
    public static TEvento montaCancelamento(Evento cancela, ConfiguracoesCte configuracao) throws CteException {
        return montaCancelamento(cancela, configuracao,ZoneId.systemDefault());
    }

    /**
     * MOnta o Evento de cancelamento Lote
     *
     * @param listaCancela
     * @param configuracao
     * @return
     * @throws CteException
     */
    public static TEvento montaCancelamento(Evento evento, ConfiguracoesCte config, ZoneId zoneId) throws CteException {

        TEvento enviEvento = new TEvento();
        enviEvento.setVersao(ConstantesCte.VERSAO.CTE);

        String id = "ID" + EventosEnum.CANCELAMENTO.getCodigo() + evento.getChave() + "01";

        TEvento eventoCancela = new TEvento();
        eventoCancela.setVersao(ConstantesCte.VERSAO.CTE);

        TEvento.InfEvento infoEvento = new TEvento.InfEvento();
        infoEvento.setId(id);
        infoEvento.setCOrgao(config.getEstado().getCodigoUF());
        infoEvento.setTpAmb(config.getAmbiente().getCodigo());
        infoEvento.setCNPJ(evento.getCnpj());
        infoEvento.setChCTe(evento.getChave());
        infoEvento.setDhEvento(XmlCteUtil.dataCte(LocalDateTime.now(zoneId)));
        infoEvento.setTpEvento(EventosEnum.CANCELAMENTO.getCodigo());
        infoEvento.setNSeqEvento("1");

        EvCancCTe evCancCTe = new EvCancCTe();
        evCancCTe.setDescEvento("Cancelamento");
        evCancCTe.setNProt(evento.getProtocolo());
        evCancCTe.setXJust(evento.getMotivo());

        TEvento.InfEvento.DetEvento detEvento = new TEvento.InfEvento.DetEvento();
        detEvento.setVersaoEvento(ConstantesCte.VERSAO.CTE);
        detEvento.setAny(ObjetoCTeUtil.objectToElement(evCancCTe, EvCancCTe.class, "evCancCTe"));

        infoEvento.setDetEvento(detEvento);
        enviEvento.setInfEvento(infoEvento);

        return enviEvento;
    }

    /**
     * Cria o ProcEvento de Cancelamento
     *
     * @param config
     * @param enviEvento
     * @param retorno
     * @return
     * @throws JAXBException
     * @throws CteException
     */
    public static String criaProcEventoCancelamento(ConfiguracoesCte config, TEvento enviEvento, TRetEvento retorno) throws JAXBException, CteException {

        String xml = XmlCteUtil.objectToXml(enviEvento);
        xml = xml.replaceAll(" xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", "");
        xml = xml.replaceAll("<evento v", "<evento xmlns=\"http://www.portalfiscal.inf.br/cte\" v");

        String assinado = Assinar.assinaCte(ConfiguracoesUtil.iniciaConfiguracoes(config), xml, AssinaturaEnum.EVENTO);

        TProcEvento procEvento = new TProcEvento();
        procEvento.setVersao(ConstantesCte.VERSAO.CTE);
        procEvento.setEventoCTe(XmlCteUtil.xmlToObject(assinado, TEvento.class));
        procEvento.setRetEventoCTe(retorno);

        return XmlCteUtil.objectToXml(procEvento);
    }

}
