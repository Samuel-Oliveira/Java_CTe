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
import br.inf.portalfiscal.cte.schema_300.distDFeInt.DistDFeInt;
import br.inf.portalfiscal.cte.schema_300.retDistDFeInt.RetDistDFeInt;
import br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeStub;


/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 *
 */
public class DistribuicaoDFe {
	
	private static CTeDistribuicaoDFeStub.CteDistDFeInteresseResponse result;
	private static CertificadoUtil certUtil;

	/**
	 * Classe Reponsavel Por Consultar as CTE na SEFAZ
	 * 
	 * @param DistDFeInt
	 * @return RetDistDFeInt
	 */
	public static RetDistDFeInt consultaCte(DistDFeInt distDFeInt, boolean valida) throws CteException{
		
		certUtil = new CertificadoUtil();

		try {

			/**
			 * Carrega Informaçoes do Certificado Digital.
			 */
			certUtil.iniciaConfiguracoes();

			String xml = XmlUtil.objectToXml(distDFeInt);
			
			if(valida){
				String erros = Validar.validaXml(xml, ConstantesUtil.SERVICOS.DISTRIBUICAO_DFE);
				
				if(!ObjetoUtil.isEmpty(erros)){
					throw new CteException("Erro Na Validação do Xml: "+erros);
				}
			}
			
			System.out.println("Xml: "+xml);
			
			OMElement ome = AXIOMUtil.stringToOM(xml);
			
			CTeDistribuicaoDFeStub.CteDadosMsg_type0 dadosMsgType0 = new CTeDistribuicaoDFeStub.CteDadosMsg_type0();  
			dadosMsgType0.setExtraElement(ome);  
			  
			CTeDistribuicaoDFeStub.CteDistDFeInteresse distDFeInteresse = new CTeDistribuicaoDFeStub.CteDistDFeInteresse();  
			distDFeInteresse.setCteDadosMsg(dadosMsgType0);  
			  
			CTeDistribuicaoDFeStub stub = new CTeDistribuicaoDFeStub( WebServiceUtil.getUrl(ConstantesUtil.CTE, ConstantesUtil.SERVICOS.DISTRIBUICAO_DFE));  
			result = stub.cteDistDFeInteresse(distDFeInteresse);  

			return XmlUtil.xmlToObject(result.getCteDistDFeInteresseResult().getExtraElement().toString(), RetDistDFeInt.class);  


		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new CteException(e.getMessage());
		}
	}


}
