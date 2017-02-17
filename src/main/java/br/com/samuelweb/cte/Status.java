package br.com.samuelweb.cte;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.CertificadoUtil;
import br.com.samuelweb.cte.util.ConstantesUtil;
import br.com.samuelweb.cte.util.ObjetoUtil;
import br.com.samuelweb.cte.util.WebServiceUtil;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.www.cte.wsdl.CteStatusServico.CteStatusServicoStub;
import br.inf.portalfiscal.www.cte.wsdl.CteStatusServico.CteStatusServicoStub.CteStatusServicoCTResult;


/**
 * Classe responsavel por fazer a Verificacao do Status Do Webservice
 * 
 * @autor Samuel Oliveira
 */
public class Status {

	private static ConfiguracoesIniciaisCte configuracoesNfe;
	
	public static br.inf.portalfiscal.cte.schema_200.retConsStatServCTe.TRetConsStatServ statusServico2(br.inf.portalfiscal.cte.schema_200.consStatServCTe.TConsStatServ consStatServ, boolean valida) throws CteException {
	
		try{
			return XmlUtil.xmlToObject(statusServico(XmlUtil.objectToXml(consStatServ) , valida).getExtraElement().toString(), br.inf.portalfiscal.cte.schema_200.retConsStatServCTe.TRetConsStatServ.class);
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.retConsStatServCTe.TRetConsStatServ statusServico3(br.inf.portalfiscal.cte.schema_300.consStatServCTe.TConsStatServ consStatServ, boolean valida) throws CteException {
		
		try{
			return XmlUtil.xmlToObject(statusServico(XmlUtil.objectToXml(consStatServ) , valida).getExtraElement().toString(), br.inf.portalfiscal.cte.schema_300.retConsStatServCTe.TRetConsStatServ.class);
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
		
	}

	private static CteStatusServicoCTResult statusServico(String xml, boolean valida) throws CteException {
		
		configuracoesNfe = ConfiguracoesIniciaisCte.getInstance();
		CertificadoUtil certificadoUtil = new CertificadoUtil();
		certificadoUtil.iniciaConfiguracoes();

		try {

			if(valida){
				String erros = Validar.validaXml(xml, ConstantesUtil.SERVICOS.STATUS_SERVICO);
				if(!ObjetoUtil.isEmpty(erros)){
					throw new CteException("Erro Na Validação do Xml: "+erros);
				}
			}
			

			OMElement ome = AXIOMUtil.stringToOM(xml);
			CteStatusServicoStub.CteDadosMsg dadosMsg = new CteStatusServicoStub.CteDadosMsg();
			dadosMsg.setExtraElement(ome);

			CteStatusServicoStub.CteCabecMsg cteCabecMsg = new CteStatusServicoStub.CteCabecMsg();
			/**
			 * Codigo do Estado.
			 */
			cteCabecMsg.setCUF(configuracoesNfe.getEstado().getCodigoIbge());

			/**
			 * Versao do XML
			 */
			cteCabecMsg.setVersaoDados(configuracoesNfe.getVersaoCte());
			CteStatusServicoStub.CteCabecMsgE cteCabecMsgE = new CteStatusServicoStub.CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteStatusServicoStub stub = new CteStatusServicoStub(WebServiceUtil.getUrl(ConstantesUtil.CTE,ConstantesUtil.SERVICOS.STATUS_SERVICO));
			return stub.cteStatusServicoCT(dadosMsg, cteCabecMsgE);
		
		} catch (RemoteException | XMLStreamException e) {
			throw new CteException(e.getMessage());
		}
		
	}
	
}