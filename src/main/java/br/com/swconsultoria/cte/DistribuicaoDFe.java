package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.ConsultaDFeEnum;
import br.com.swconsultoria.cte.dom.enuns.PessoaEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.distdfeint.DistDFeInt;
import br.com.swconsultoria.cte.schema_300.retdistdfeint.RetDistDFeInt;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeStub;
import lombok.extern.java.Log;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.transport.http.HTTPConstants;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
@Log
class DistribuicaoDFe {

    /**
     * Classe Reponsavel Por Consultar as CTE na SEFAZ
     *
     * @param config       Configuração
     * @param tipoPessoa   Informe {@link PessoaEnum}
     * @param cpfCnpj      Informe o Cpf ou Cnpj
     * @param tipoConsulta Informe {@link ConsultaDFeEnum}
     * @param nsuChave     Informe a Chave ou o Nsu
     * @return
     * @throws CteException
     */
    static RetDistDFeInt consultaCte(ConfiguracoesCte config, PessoaEnum tipoPessoa, String cpfCnpj, ConsultaDFeEnum tipoConsulta,
                                     String nsuChave) throws CteException {

        try {

            DistDFeInt distDFeInt = new DistDFeInt();
            distDFeInt.setVersao(ConstantesCte.VERSAO.DISTRIBUICAO);
            distDFeInt.setTpAmb(config.getAmbiente().getCodigo());
            distDFeInt.setCUFAutor(config.getEstado().getCodigoUF());

            if (PessoaEnum.JURIDICA.equals(tipoPessoa)) {
                distDFeInt.setCNPJ(cpfCnpj);
            } else {
                distDFeInt.setCPF(cpfCnpj);
            }

            switch (tipoConsulta) {
                case NSU:
                    DistDFeInt.DistNSU distNSU = new DistDFeInt.DistNSU();
                    distNSU.setUltNSU(nsuChave);
                    distDFeInt.setDistNSU(distNSU);
                    break;
                case NSU_UNICO:
                    DistDFeInt.ConsNSU consNSU = new DistDFeInt.ConsNSU();
                    consNSU.setNSU(nsuChave);
                    distDFeInt.setConsNSU(consNSU);
                    break;
            }

            String xml = XmlCteUtil.objectToXml(distDFeInt);

            log.info("[XML-ENVIO]: " + xml);

            OMElement ome = AXIOMUtil.stringToOM(xml);

            CTeDistribuicaoDFeStub.CteDadosMsg_type0 dadosMsgType0 = new CTeDistribuicaoDFeStub.CteDadosMsg_type0();
            dadosMsgType0.setExtraElement(ome);

            CTeDistribuicaoDFeStub.CteDistDFeInteresse distDFeInteresse = new CTeDistribuicaoDFeStub.CteDistDFeInteresse();
            distDFeInteresse.setCteDadosMsg(dadosMsgType0);

            CTeDistribuicaoDFeStub stub = new CTeDistribuicaoDFeStub(
                    WebServiceCteUtil.getUrl(config, ServicosEnum.DISTRIBUICAO_DFE));

            // Timeout
            if (ObjetoCTeUtil.verifica(config.getTimeout()).isPresent()) {
                stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, config.getTimeout());
                stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT,
                        config.getTimeout());
            }
            CTeDistribuicaoDFeStub.CteDistDFeInteresseResponse result = stub.cteDistDFeInteresse(distDFeInteresse);

            log.info("[XML-RETORNO]: " + result.getCteDistDFeInteresseResult().getExtraElement().toString());
            return XmlCteUtil.xmlToObject(result.getCteDistDFeInteresseResult().getExtraElement().toString(),
                    RetDistDFeInt.class);

        } catch (RemoteException | XMLStreamException | JAXBException e) {
            throw new CteException(e.getMessage());
        }
    }

}
