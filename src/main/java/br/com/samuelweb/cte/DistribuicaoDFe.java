package br.com.samuelweb.cte;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.samuelweb.exception.EmissorException;
import br.com.samuelweb.util.CertificadoUtil;
import br.com.samuelweb.util.ConstantesCte;
import br.com.samuelweb.util.ObjetoUtil;
import br.com.samuelweb.util.WebServiceUtil;
import br.com.samuelweb.util.XmlUtil;
import br.inf.portalfiscal.cte.schema_300.distdfeint.DistDFeInt;
import br.inf.portalfiscal.cte.schema_300.retdistdfeint.RetDistDFeInt;
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
	public static RetDistDFeInt consultaCte(DistDFeInt distDFeInt, boolean valida) throws EmissorException{
		
		certUtil = new CertificadoUtil();

		try {

			/**
			 * Carrega Informaçoes do Certificado Digital.
			 */
			certUtil.iniciaConfiguracoes();

			String xml = XmlUtil.objectCteToXml(distDFeInt);
			
			if(valida){
				String erros = ValidarCte.validaXml(xml, ConstantesCte.SERVICOS.DISTRIBUICAO_DFE);
				
				if(!ObjetoUtil.isEmpty(erros)){
					throw new EmissorException("Erro Na Validação do Xml: "+erros);
				}
			}
			
			System.out.println("Xml DistDFe: "+xml);
			
			OMElement ome = AXIOMUtil.stringToOM(xml);
			
			CTeDistribuicaoDFeStub.CteDadosMsg_type0 dadosMsgType0 = new CTeDistribuicaoDFeStub.CteDadosMsg_type0();  
			dadosMsgType0.setExtraElement(ome);  
			  
			CTeDistribuicaoDFeStub.CteDistDFeInteresse distDFeInteresse = new CTeDistribuicaoDFeStub.CteDistDFeInteresse();  
			distDFeInteresse.setCteDadosMsg(dadosMsgType0);  
			  
			CTeDistribuicaoDFeStub stub = new CTeDistribuicaoDFeStub( WebServiceUtil.getUrl(ConstantesCte.CTE, ConstantesCte.SERVICOS.DISTRIBUICAO_DFE));  
			result = stub.cteDistDFeInteresse(distDFeInteresse);  

			return XmlUtil.xmlToObject(result.getCteDistDFeInteresseResult().getExtraElement().toString(), RetDistDFeInt.class);  


		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
	}


}
