package br.com.samuelweb.cte;

import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.*;
import br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe;
import br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe;
import br.inf.portalfiscal.www.cte.wsdl.cteinutilizacao.CteInutilizacaoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe Responsavel por inutilizar uma Faixa de numeracao da Cte.
 *
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 */
class Inutilizacao {


    static TRetInutCTe inutilizar(TInutCTe inutCte, boolean valida) throws CteException {
        try {

            ConfiguracoesIniciais configuracoesCte = ConfiguracoesIniciais.getInstance();
            CertificadoUtil.iniciaConfiguracoes();


            String xml = Assinatura.assinar(XmlUtil.objectCteToXml(inutCte), Assinatura.INFINUT);

            if (valida) {
                String erros = ValidarCte.validaXml(xml, ConstantesCte.SERVICOS.INUTILIZACAO);
                if (!ObjetoUtil.isEmpty(erros)) {
                    throw new CteException("Erro Na Validação do Xml: " + erros);
                }
            }

            if (configuracoesCte.isLog()) {
                System.out.println("Xml Inutilizar: " + xml);
            }

            OMElement ome = AXIOMUtil.stringToOM(xml);

            CteInutilizacaoStub.CteDadosMsg dadosMsg = new CteInutilizacaoStub.CteDadosMsg();
            dadosMsg.setExtraElement(ome);

            CteInutilizacaoStub.CteCabecMsg CteCabecMsg = new CteInutilizacaoStub.CteCabecMsg();
            CteCabecMsg.setCUF(String.valueOf(configuracoesCte.getEstado().getCodigoIbge()));
            CteCabecMsg.setVersaoDados(configuracoesCte.getVersao());

            CteInutilizacaoStub.CteCabecMsgE CteCabecMsgE = new CteInutilizacaoStub.CteCabecMsgE();
            CteCabecMsgE.setCteCabecMsg(CteCabecMsg);

            CteInutilizacaoStub stub = new CteInutilizacaoStub(WebServiceUtil.getUrl(ConstantesCte.CTE, ConstantesCte.SERVICOS.INUTILIZACAO));

            return XmlUtil.xmlToObject(stub.cteInutilizacaoCT(dadosMsg, CteCabecMsgE).getExtraElement().toString(), TRetInutCTe.class);

        } catch (RemoteException | XMLStreamException | JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

}