package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.retConsSitCTe.TRetConsSitCTe;
import lombok.extern.java.Log;

/**
 * Classe responsavel por Consultar a Situaçao do XML na SEFAZ.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
@Log
class ConsultaXml {

    private ConsultaXml() {}

    /**
     * Classe Reponsavel Por Consultar o status da CTE na SEFAZ
     *
     * @param config
     * @param chave
     * @return
     * @throws CteException
     */
    static TRetConsSitCTe consultaXml(ConfiguracoesCte config, String chave) throws CteException {

//        try {
//
//            TConsSitCTe consSitCTe = new TConsSitCTe();
//            consSitCTe.setVersao(ConstantesCte.VERSAO.CTE);
//            consSitCTe.setTpAmb(config.getAmbiente().getCodigo());
//            consSitCTe.setXServ("CONSULTAR");
//            consSitCTe.setChCTe(chave);
//
//            String xml = XmlCteUtil.objectToXml(consSitCTe);
//
//            log.info("[XML-ENVIO]: " + xml);
//
//            OMElement ome = AXIOMUtil.stringToOM(xml);
//
//            CteConsultaStub.CteDadosMsg dadosMsg = new CteConsultaStub.CteDadosMsg();
//            dadosMsg.setExtraElement(ome);
//
//            CteConsultaStub stub = new CteConsultaStub(
//                    WebServiceCteUtil.getUrl(config, ServicosEnum.CONSULTA_XML));
//
//            CteConsultaStub.CteCabecMsg cteCabecMsg = new CteConsultaStub.CteCabecMsg();
//            cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoUF()));
//            cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);
//
//            CteConsultaStub.CteCabecMsgE cteCabecMsgE = new CteConsultaStub.CteCabecMsgE();
//            cteCabecMsgE.setCteCabecMsg(cteCabecMsg);
//
//            // Timeout
//            if (ObjetoCTeUtil.verifica(config.getTimeout()).isPresent()) {
//                stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, config.getTimeout());
//                stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT,
//                        config.getTimeout());
//            }
//            CteConsultaStub.CteConsultaCTResult result = stub.cteConsultaCT(dadosMsg, cteCabecMsgE);
//
//            log.info("[XML-RETORNO]: " + result.getExtraElement().toString());
//            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetConsSitCTe.class);
//
//        } catch (RemoteException | XMLStreamException | JAXBException e) {
//            throw new CteException(e);
//        }
        return null;
    }

}