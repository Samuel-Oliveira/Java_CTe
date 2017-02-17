/**
 * 
 */
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
import br.inf.portalfiscal.cte.schema_200.consReciCTe.TConsReciCTe;
import br.inf.portalfiscal.cte.schema_200.retConsReciCTe.TRetConsReciCTe;
import br.inf.portalfiscal.www.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub;
import br.inf.portalfiscal.www.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteCabecMsg;
import br.inf.portalfiscal.www.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteCabecMsgE;
import br.inf.portalfiscal.www.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteDadosMsg;
import br.inf.portalfiscal.www.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub.CteRetRecepcaoResult;

/**
 * Classe Responsavel por Consultar o Recibo da Cte.
 * 
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 */
public class RetornoCte {

	private static CteRetRecepcaoResult result;
	private static ConfiguracoesIniciaisCte configuracoesCte;
	private static CertificadoUtil certUtil;

	/**
	 * Metodo para Consultar o Recibo da CTE..
	 * 
	 * @param TEnviNFe
	 * @return String
	 * @throws NfeException
	 */
	public static TRetConsReciCTe consultaRecibo(TConsReciCTe consReciCTe, boolean valida) throws CteException {

		try {
			/**
			 * Informacoes do Certificado Digital.
			 */
			certUtil = new CertificadoUtil();
			certUtil.iniciaConfiguracoes();
			configuracoesCte = ConfiguracoesIniciaisCte.getInstance();

			/**
			 * Cria o xml
			 */
			String xml = XmlUtil.objectToXml(consReciCTe);

			/**
			 * Valida o Xml caso sejá selecionado True
			 */
			if (valida) {
				String erros = Validar.validaXml(xml, ConstantesUtil.SERVICOS.CONSULTA_RECIBO);
				if (!ObjetoUtil.isEmpty(erros)) {
					throw new CteException("Erro Na Validação do Xml: " + erros);
				}
			}

			System.out.println("Xml Consulta Recibo: " + xml);

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
			cteCabecMsg.setVersaoDados(configuracoesCte.getVersaoCte());

			CteCabecMsgE cteCabecMsgE = new CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteRetRecepcaoStub stub = new CteRetRecepcaoStub(WebServiceUtil.getUrl(ConstantesUtil.CTE, ConstantesUtil.SERVICOS.CONSULTA_RECIBO));
			result = stub.cteRetRecepcao(dadosMsg, cteCabecMsgE);
			
			return  XmlUtil.xmlToObject(result.getExtraElement().toString(), TRetConsReciCTe.class);

		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

}
