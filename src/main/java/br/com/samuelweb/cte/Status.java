package br.com.samuelweb.cte;

import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.CertificadoUtil;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.com.samuelweb.cte.util.WebServiceUtil;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.cte.schema_300.consStatServCTe.TConsStatServ;
import br.inf.portalfiscal.cte.schema_300.retConsStatServCTe.TRetConsStatServ;
import br.inf.portalfiscal.www.cte.wsdl.CteStatusServico.CteStatusServicoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;


/**
 * Classe responsavel por fazer a Verificacao do Status Do Webservice
 *
 * @autor Samuel Oliveira
 */
class Status {

    static TRetConsStatServ statusServico() throws CteException {

        ConfiguracoesIniciais config = ConfiguracoesIniciais.getInstance();
        CertificadoUtil.iniciaConfiguracoes();

        try {

            TConsStatServ consStatServ = new TConsStatServ();
            consStatServ.setTpAmb(config.getAmbiente());
            consStatServ.setVersao(config.getVersao());
            consStatServ.setXServ("STATUS");

            String xml = XmlUtil.objectCteToXml(consStatServ);

            OMElement ome = AXIOMUtil.stringToOM(xml);
            CteStatusServicoStub.CteDadosMsg dadosMsg = new CteStatusServicoStub.CteDadosMsg();
            dadosMsg.setExtraElement(ome);

            CteStatusServicoStub.CteCabecMsg cteCabecMsg = new CteStatusServicoStub.CteCabecMsg();
            /**
             * Codigo do Estado.
             */
            cteCabecMsg.setCUF(config.getEstado().getCodigoIbge());

            /**
             * Versao do XML
             */
            cteCabecMsg.setVersaoDados(config.getVersao());
            CteStatusServicoStub.CteCabecMsgE cteCabecMsgE = new CteStatusServicoStub.CteCabecMsgE();
            cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

            CteStatusServicoStub stub = new CteStatusServicoStub(WebServiceUtil.getUrl(ConstantesCte.CTE, ConstantesCte.SERVICOS.STATUS_SERVICO));
            return XmlUtil.xmlToObject(stub.cteStatusServicoCT(dadosMsg, cteCabecMsgE).getExtraElement().toString() , TRetConsStatServ.class);

        } catch (RemoteException | XMLStreamException | JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

}