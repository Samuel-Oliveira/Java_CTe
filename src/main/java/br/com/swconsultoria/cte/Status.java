package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.consStatServCTe.TConsStatServ;
import br.com.swconsultoria.cte.schema_400.retConsStatServCTe.TRetConsStatServ;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.WebServiceCteUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.cte_status_servico.CTeStatusServicoV4Stub;
import lombok.extern.java.Log;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe responsável por fazer a Verificação do Status Do Webservice
 *
 * @author Samuel Oliveira
 */
@Log
class Status {

    private Status(){}

    /**
     * Metodo para Consulta de Status de Serviço
     * <p>
     * Cria um objeto do tipo TConsStatServ usando as propriedades passadas
     * pelo argumento <b>config</b>. Após, este objeto é convertido em um obejto
     * OMElement manipulável onde é passado para o atributo extraElement da
     * classe CTeStatusServico4Stub.CteDadosMsg.
     * </p>
     *
     * <p>
     * O método statusServico então cria uma instância de CTeStatusServico4Stub
     * passando o argumento <b>tipo</b> e <b>config</b> em seu construtor, onde será montada a URL
     * de consulta do status do serviço dependendo das configuções
     * (ambiente, Estado, CT-e)
     * </p>
     *
     * <p>
     * Então o método cteStatusServicoCT efetuará a consulta e retornará o
     * resultado que será convertido em um objeto e enfim retornado por este
     * método.
     * </p>
     *
     * @param config ConfiguracoesCte, interface de configuração da CT-e.
     * @return TRetConsStatServ - objeto que contém o resultado da transmissão do XML.
     * @throws CteException
     * @see ConfiguracoesCte
     * @see ConstantesUtil
     * @see WebServiceCteUtil
     * @see XmlCteUtil
     */
    static TRetConsStatServ statusServico(ConfiguracoesCte config) throws CteException {

        try {

            TConsStatServ consStatServ = new TConsStatServ();
            consStatServ.setTpAmb(config.getAmbiente().getCodigo());
            consStatServ.setVersao(ConstantesCte.VERSAO.CTE);
            consStatServ.setCUF(config.getEstado().getCodigoUF());
            consStatServ.setXServ("STATUS");
            String xml = XmlCteUtil.objectToXml(consStatServ);

            log.info("[XML-ENVIO]: " + xml);

            OMElement ome = AXIOMUtil.stringToOM(xml);

            CTeStatusServicoV4Stub.CteDadosMsg dadosMsg = new CTeStatusServicoV4Stub.CteDadosMsg();
            dadosMsg.setExtraElement(ome);

            CTeStatusServicoV4Stub stub = new CTeStatusServicoV4Stub(
                    WebServiceCteUtil.getUrl(config, ServicosEnum.STATUS_SERVICO));

            CTeStatusServicoV4Stub.CteStatusServicoCTResult result = stub.cteStatusServicoCT(dadosMsg);

            log.info("[XML-RETORNO]: " + result.getExtraElement().toString());
            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetConsStatServ.class);

        } catch (RemoteException | XMLStreamException | JAXBException e) {
            throw new CteException(e.getMessage());
        }
    }

}