package br.com.samuelweb.cte;

import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.CertificadoUtil;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.com.samuelweb.cte.util.WebServiceUtil;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.cte.schema_300.consReciCTe.TConsReciCTe;
import br.inf.portalfiscal.cte.schema_300.retConsReciCTe.TRetConsReciCTe;
import br.inf.portalfiscal.www.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub;
import br.inf.portalfiscal.www.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteCabecMsg;
import br.inf.portalfiscal.www.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteCabecMsgE;
import br.inf.portalfiscal.www.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteDadosMsg;
import br.inf.portalfiscal.www.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteRetRecepcaoResult;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe Responsavel por Consultar o Recibo da Cte.
 * 
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 */
class RetornoCte {

	private static CertificadoUtil certUtil;

	/**
	 * Metodo para Consultar o Recibo da CTE..
	 * 
	 * @param TEnviNFe
	 * @return String
	 * @throws NfeException
	 */
	static TRetConsReciCTe consultaRecibo(String recibo) throws CteException {

		try {
			/**
			 * Informacoes do Certificado Digital.
			 */
			CertificadoUtil.iniciaConfiguracoes();
			ConfiguracoesIniciais configuracoesCte = ConfiguracoesIniciais.getInstance();

			TConsReciCTe consReciCTe = new TConsReciCTe();
			consReciCTe.setVersao(configuracoesCte.getVersao());
			consReciCTe.setTpAmb(configuracoesCte.getAmbiente());
			consReciCTe.setNRec(recibo);

			/**
			 * Cria o xml
			 */
			String xml = XmlUtil.objectCteToXml(consReciCTe);

			if(configuracoesCte.isLog()){
				System.out.println("Xml Consulta Recibo: " + xml);
			}

			OMElement ome = AXIOMUtil.stringToOM(xml);

			CteDadosMsg dadosMsg = new CteDadosMsg();
			dadosMsg.setExtraElement(ome);
			CteCabecMsg cteCabecMsg = new CteCabecMsg();

			/**
			 * Codigo do Estado.
			 */
			cteCabecMsg.setCUF(String.valueOf(configuracoesCte.getEstado().getCodigoIbge()));

			/**
			 * Versao do XML
			 */
			cteCabecMsg.setVersaoDados(configuracoesCte.getVersao());

			CteCabecMsgE cteCabecMsgE = new CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteRetRecepcaoStub stub = new CteRetRecepcaoStub(WebServiceUtil.getUrl(ConstantesCte.CTE, ConstantesCte.SERVICOS.CONSULTA_RECIBO));
			CteRetRecepcaoResult result = stub.cteRetRecepcao(dadosMsg, cteCabecMsgE);
			
			return  XmlUtil.xmlToObject(result.getExtraElement().toString(), TRetConsReciCTe.class);

		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

}
