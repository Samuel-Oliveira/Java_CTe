package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.consSitCTe.TConsSitCTe;
import br.com.swconsultoria.cte.schema_300.retConsSitCTe.TRetConsSitCTe;
import br.com.swconsultoria.cte.util.*;
import br.com.swconsultoria.cte.wsdl.CteConsulta.CteConsultaStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.transport.http.HTTPConstants;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe responsavel por Consultar a Situaçao do XML na SEFAZ.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */

class ConsultaXml {

    /**
     * Classe Reponsavel Por Consultar o status da CTE na SEFAZ
     *
     * @param config
     * @param chave
     * @return
     * @throws CteException
     */
    static TRetConsSitCTe consultaXml(ConfiguracoesCte config, String chave) throws CteException {

        try {

            TConsSitCTe consSitCTe = new TConsSitCTe();
            consSitCTe.setVersao(ConstantesCte.VERSAO.CTE);
            consSitCTe.setTpAmb(config.getAmbiente().getCodigo());
            consSitCTe.setXServ("CONSULTAR");
            consSitCTe.setChCTe(chave);

            String xml = XmlCteUtil.objectToXml(consSitCTe);

            LoggerUtil.log(ConsultaXml.class, "[XML-ENVIO]: " + xml);

            OMElement ome = AXIOMUtil.stringToOM(xml);

            CteConsultaStub.CteDadosMsg dadosMsg = new CteConsultaStub.CteDadosMsg();
            dadosMsg.setExtraElement(ome);

            CteConsultaStub stub = new CteConsultaStub(
                    WebServiceCteUtil.getUrl(config, ServicosEnum.CONSULTA_XML));

            CteConsultaStub.CteCabecMsg cteCabecMsg = new CteConsultaStub.CteCabecMsg();
            cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoUF()));
            cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

            CteConsultaStub.CteCabecMsgE cteCabecMsgE = new CteConsultaStub.CteCabecMsgE();
            cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

            // Timeout
            if (ObjetoCTeUtil.verifica(config.getTimeout()).isPresent()) {
                stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, config.getTimeout());
                stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT,
                        config.getTimeout());
            }
            CteConsultaStub.CteConsultaCTResult result = stub.cteConsultaCT(dadosMsg, cteCabecMsgE);

            LoggerUtil.log(ConsultaXml.class, "[XML-RETORNO]: " + result.getExtraElement().toString());
            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetConsSitCTe.class);

        } catch (RemoteException | XMLStreamException | JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

}