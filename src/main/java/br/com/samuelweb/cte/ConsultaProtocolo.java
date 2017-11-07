package br.com.samuelweb.cte;

import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.CertificadoUtil;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.com.samuelweb.cte.util.WebServiceUtil;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.cte.schema_300.consSitCTe.TConsSitCTe;
import br.inf.portalfiscal.cte.schema_300.retConsSitCTe.TRetConsSitCTe;
import br.inf.portalfiscal.www.cte.wsdl.CteConsulta.CteConsultaStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe responsavel por Consultar a Situaçao do CTE na SEFAZ.
 *
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 */

class ConsultaProtocolo {

    /**
     * Classe Reponsavel Por Consultar o status da CTE na SEFAZ
     *
     * @param chave
     * @return CteConsultaCTResult
     * @throws CteException
     */
    static TRetConsSitCTe consultar(String chave) throws CteException {

        try {
            ConfiguracoesIniciais configuracoesCte = ConfiguracoesIniciais.getInstance();
            CertificadoUtil.iniciaConfiguracoes();

            TConsSitCTe consSitCTe = new TConsSitCTe();
            consSitCTe.setVersao(configuracoesCte.getVersao());
            consSitCTe.setTpAmb(configuracoesCte.getAmbiente());
            consSitCTe.setXServ("CONSULTAR");
            consSitCTe.setChCTe(chave);

            OMElement ome = AXIOMUtil.stringToOM(XmlUtil.objectCteToXml(consSitCTe));

            CteConsultaStub.CteDadosMsg dadosMsg = new CteConsultaStub.CteDadosMsg();
            dadosMsg.setExtraElement(ome);

            CteConsultaStub.CteCabecMsg cteCabecMsg = new CteConsultaStub.CteCabecMsg();
            cteCabecMsg.setCUF(String.valueOf(configuracoesCte.getEstado().getCodigoIbge()));
            cteCabecMsg.setVersaoDados(configuracoesCte.getVersao());

            CteConsultaStub.CteCabecMsgE cteCabecMsgE = new CteConsultaStub.CteCabecMsgE();
            cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

            CteConsultaStub stub = new CteConsultaStub(
                    WebServiceUtil.getUrl(ConstantesCte.CTE, ConstantesCte.SERVICOS.CONSULTA_PROTOCOLO));

            return XmlUtil.xmlToObject(stub.cteConsultaCT(dadosMsg, cteCabecMsgE).getExtraElement().toString(), TRetConsSitCTe.class);

        } catch (RemoteException | XMLStreamException | JAXBException e) {
            throw new CteException(e.getMessage());
        }
    }
}
