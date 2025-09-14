package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.consSitCTe.TRetConsSitCTe;
import br.com.swconsultoria.cte.schema_400.consSitCTe.TConsSitCTe;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.cte_consulta.CTeConsultaV4Stub;
import lombok.extern.java.Log;
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

        try {

            TConsSitCTe consSitCTe = new TConsSitCTe();
            consSitCTe.setVersao(ConstantesCte.VERSAO.CTE);
            consSitCTe.setTpAmb(config.getAmbiente().getCodigo());
            consSitCTe.setXServ("CONSULTAR");
            consSitCTe.setChCTe(chave);

            String xml = XmlCteUtil.objectToXml(consSitCTe);

            log.info("[XML-ENVIO]: " + xml);

            OMElement ome = AXIOMUtil.stringToOM(xml);

            CTeConsultaV4Stub.CteDadosMsg dadosMsg = new CTeConsultaV4Stub.CteDadosMsg();
            dadosMsg.setExtraElement(ome);

            CTeConsultaV4Stub stub = new CTeConsultaV4Stub(
                    WebServiceCteUtil.getUrl(config, ServicosEnum.CONSULTA_XML));

            // Timeout
            if (ObjetoCTeUtil.verifica(config.getTimeout()).isPresent()) {
                stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, config.getTimeout());
                stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT,
                        config.getTimeout());
            }
            CTeConsultaV4Stub.CteConsultaCTResult result = stub.cteConsultaCT(dadosMsg);

            log.info("[XML-RETORNO]: " + result.getExtraElement().toString());
            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetConsSitCTe.class);

        } catch (RemoteException | XMLStreamException | JAXBException e) {
            throw new CteException("Erro ao consultar XML", e);
        }
    }

}