/**
 *
 */
package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.consReciCTe.TConsReciCTe;
import br.com.swconsultoria.cte.schema_300.consSitCTe.TConsSitCTe;
import br.com.swconsultoria.cte.schema_300.consStatServCTe.ObjectFactory;
import br.com.swconsultoria.cte.schema_300.consStatServCTe.TConsStatServ;
import br.com.swconsultoria.cte.schema_300.cteModalRodoviario.Rodo;
import br.com.swconsultoria.cte.schema_300.cteOS.TCTeOS;
import br.com.swconsultoria.cte.schema_300.distdfeint.DistDFeInt;
import br.com.swconsultoria.cte.schema_300.enviCTe.CteProc;
import br.com.swconsultoria.cte.schema_300.enviCTe.TEnviCTe;
import br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento;
import br.com.swconsultoria.cte.schema_300.evEPECCTe.TProcEvento;
import br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento;
import br.com.swconsultoria.cte.schema_300.inutCTe.TInutCTe;
import br.com.swconsultoria.cte.schema_300.procCTeOS.CteOSProc;
import br.com.swconsultoria.cte.schema_300.retConsReciCTe.TProtCTe;
import br.com.swconsultoria.cte.schema_300.retConsReciCTe.TRetConsReciCTe;
import br.com.swconsultoria.cte.schema_300.retConsSitCTe.TRetConsSitCTe;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TProtCTeOS;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TRetEnviCTe;
import br.com.swconsultoria.cte.schema_300.retInutCTe.TRetInutCTe;

import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.zip.GZIPInputStream;

/**
 * Classe Responsavel por Metodos referentes ao XML
 *
 * @author Samuel Oliveira
 *
 */
public class XmlCteUtil {

    /**
     * Transforma o String do XML em Objeto
     *
     * @param xml
     * @param classe
     * @return <T> T
     */
    public static <T> T xmlToObject(String xml, Class<T> classe) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(classe);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        return unmarshaller.unmarshal(new StreamSource(new StringReader(xml)), classe).getValue();
    }

    /**
     * Le o Arquivo XML e retona String
     *
     * @return String
     * @throws CteException
     */
    public static String leXml(String arquivo) throws CteException {

        StringBuilder xml = new StringBuilder();
        BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF-8"));
            String linha;

            while ((linha = in.readLine()) != null) {
                xml.append(linha);

            }
            in.close();
        } catch (IOException e) {
            throw new CteException("Ler Xml: " + e.getMessage());
        }
        return xml.toString();
    }

    /**
     * Transforma o Objeto em XML(String)
     *
     * @return String
     * @throws CteException
     */
    public static <T> String objectCteToXml(Object obj) throws JAXBException, CteException {

        JAXBContext context;
        JAXBElement<?> element;

        switch (obj.getClass().getSimpleName()) {

            case ConstantesCte.XML.STATUS_SERVICO:
                context = JAXBContext.newInstance(TConsStatServ.class);
                element = new ObjectFactory()
                        .createConsStatServCte((TConsStatServ) obj);
                break;

            case ConstantesCte.XML.ENVIO_CTE:
                context = JAXBContext.newInstance(TEnviCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.enviCTe.ObjectFactory()
                        .createEnviCTe((TEnviCTe) obj);
                break;

            case ConstantesCte.XML.ENVIO_CTE_OS:
                context = JAXBContext.newInstance(TCTeOS.class);
                element = new br.com.swconsultoria.cte.schema_300.cteOS.ObjectFactory()
                        .createCTeOS((TCTeOS) obj);
                break;

            case ConstantesCte.XML.CONSULTA_RECIBO:
                context = JAXBContext.newInstance(TConsReciCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.consReciCTe.ObjectFactory()
                        .createConsReciCTe((TConsReciCTe) obj);
                break;

            case ConstantesCte.XML.INUTILIZACAO:
                context = JAXBContext.newInstance(TInutCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.inutCTe.ObjectFactory()
                        .createInutCTe((TInutCTe) obj);
                break;

            case ConstantesCte.XML.CONSULTA_PROTOCOLO:
                context = JAXBContext.newInstance(TConsSitCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.consSitCTe.ObjectFactory()
                        .createConsSitCTe((TConsSitCTe) obj);

                break;

            case ConstantesCte.XML.DISTRIBUICAO_DFE:
                context = JAXBContext.newInstance(DistDFeInt.class);
                element = new br.com.swconsultoria.cte.schema_300.distdfeint.ObjectFactory()
                        .createDistDFeInt((DistDFeInt) obj);
                break;

            case ConstantesCte.XML.RET_ENVICTE:
                context = JAXBContext.newInstance(TRetEnviCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.retEnviCTe.ObjectFactory()
                        .createRetEnviCte((TRetEnviCTe) obj);
                break;

            case ConstantesCte.XML.RET_CONSULTA_RECIBO:
                context = JAXBContext.newInstance(TRetConsReciCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.retConsReciCTe.ObjectFactory()
                        .createRetConsReciCTe((TRetConsReciCTe) obj);
                break;

            case ConstantesCte.XML.RET_INUTILIZACAO:
                context = JAXBContext.newInstance(TRetInutCTe.class);
                element = XsdUtil.retInutilizacao.createTRetInutCTe((TRetInutCTe) obj);
                break;

            case ConstantesCte.XML.RET_CONSULTA:
                context = JAXBContext.newInstance(TRetConsSitCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.retConsSitCTe.ObjectFactory()
                        .createRetConsSitCTe((TRetConsSitCTe) obj);
                break;

            case ConstantesCte.XML.PROC_EVENTO:

                switch (obj.getClass().getName()) {

                    case ConstantesCte.XML.PROC_CANCELAR:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evCancCTe.ObjectFactory()
                                .createTProcEvento((br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento) obj);
                        break;

                    case ConstantesCte.XML.PROC_EPEC:
                        context = JAXBContext.newInstance(TProcEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evEPECCTe.ObjectFactory()
                                .createTProcEvento((TProcEvento) obj);
                        break;

                    case ConstantesCte.XML.PROC_MULTIMODAL:
                        context = JAXBContext.newInstance(TProcEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evRegMultimodal.ObjectFactory()
                                .createTProcEvento((br.com.swconsultoria.cte.schema_300.evRegMultimodal.TProcEvento) obj);
                        break;

                    case ConstantesCte.XML.PROC_CCE:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evCCeCTe.ObjectFactory()
                                .createTProcEvento((br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento) obj);
                        break;

                    case ConstantesCte.XML.PROC_PRESTDESACORDO:
                        context = JAXBContext
                                .newInstance(br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TProcEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evPrestDesacordo.ObjectFactory()
                                .createTProcEvento((br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TProcEvento) obj);
                        break;

                    case ConstantesCte.XML.PROC_GVT:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evGTV.ObjectFactory()
                                .createTProcEvento((br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case ConstantesCte.XML.PROC_CTE:
                context = JAXBContext.newInstance(CteProc.class);
                element = new br.com.swconsultoria.cte.schema_300.enviCTe.ObjectFactory()
                        .createCteProc((CteProc) obj);
                break;

            case ConstantesCte.XML.PROC_CTEOS:
                context = JAXBContext.newInstance(CteOSProc.class);
                element = new br.com.swconsultoria.cte.schema_300.procCTeOS.ObjectFactory()
                        .createCteOSProc((CteOSProc) obj);
                break;

            case ConstantesCte.XML.EVENTO:

                switch (obj.getClass().getName()) {

                    case ConstantesCte.XML.CANCELAR:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evCancCTe.ObjectFactory()
                                .createTEvento((br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento) obj);
                        break;

                    case ConstantesCte.XML.EPEC:
                        context = JAXBContext.newInstance(TEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evEPECCTe.ObjectFactory()
                                .createTEvento((TEvento) obj);
                        break;

                    case ConstantesCte.XML.MULTIMODAL:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evRegMultimodal.ObjectFactory()
                                .createTEvento((br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento) obj);
                        break;

                    case ConstantesCte.XML.CCE:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evCCeCTe.ObjectFactory()
                                .createTEvento((br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento) obj);
                        break;

                    case ConstantesCte.XML.PRESTDESACORDO:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evPrestDesacordo.ObjectFactory()
                                .createTEvento((br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TEvento) obj);
                        break;

                    case ConstantesCte.XML.GVT:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evGTV.TEvento.class);
                        element = new br.com.swconsultoria.cte.schema_300.evGTV.ObjectFactory()
                                .createTEvento((br.com.swconsultoria.cte.schema_300.evGTV.TEvento) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case ConstantesCte.XML.RET_EVENTO:

                switch (obj.getClass().getName()) {

                    case ConstantesCte.XML.RET_CANCELAR:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento.class);
                        element = XsdUtil.retEvento.createTRetEvent((br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento) obj);
                        break;

                    case ConstantesCte.XML.RET_EPEC:
                        context = JAXBContext.newInstance(TRetEvento.class);
                        element = XsdUtil.retEvento.createTRetEvent((TRetEvento) obj);
                        break;

                    case ConstantesCte.XML.RET_MULTIMODAL:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento.class);
                        element = XsdUtil.retEvento.createTRetEvent((br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento) obj);
                        break;

                    case ConstantesCte.XML.RET_CCE:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento.class);
                        element = XsdUtil.retEvento.createTRetEvent((br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento) obj);
                        break;

                    case ConstantesCte.XML.RET_PRESTDESACORDO:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento.class);
                        element = XsdUtil.retEvento.createTRetEvent((br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento) obj);
                        break;

                    case ConstantesCte.XML.RET_GVT:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento.class);
                        element = XsdUtil.retEvento.createTRetEvent((br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case ConstantesCte.XML.PROT_CTE:

                switch (obj.getClass().getName()) {

                    case ConstantesCte.XML.PROT_CTE_CONSULTA_RECIBO:
                        context = JAXBContext.newInstance(TProtCTe.class);
                        element = new br.com.swconsultoria.cte.schema_300.retConsReciCTe.ObjectFactory()
                                .createTProcCTe((TProtCTe) obj);
                        break;

                    case ConstantesCte.XML.PROT_CTE_PROC:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.procCTe.TProtCTe.class);
                        element = new br.com.swconsultoria.cte.schema_300.procCTe.ObjectFactory()
                                .createTProcCTe((br.com.swconsultoria.cte.schema_300.procCTe.TProtCTe) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case ConstantesCte.XML.PROT_CTEOS:

                switch (obj.getClass().getName()) {

                    case ConstantesCte.XML.PROT_CTEOS_PROC:
                        context = JAXBContext.newInstance(TProtCTeOS.class);
                        element = new br.com.swconsultoria.cte.schema_300.retEnviCTe.ObjectFactory()
                                .createTProcCTeOS((TProtCTeOS) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case ConstantesCte.XML.MODAL_RODOVIARIO:

                switch (obj.getClass().getName()) {

                    case ConstantesCte.XML.MODAL_RODOVIARIO:
                        context = JAXBContext.newInstance(Rodo.class);
                        element = new br.com.swconsultoria.cte.schema_300.cteModalRodoviario.ObjectFactory()
                                .createRodo((Rodo) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            default:
                throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getSimpleName());
        }

        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty("jaxb.encoding", "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

        StringWriter sw = new StringWriter();
        marshaller.marshal(element, sw);

        return replacesCte("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + sw.toString());

    }

    public static String gZipToXml(byte[] conteudo) throws IOException {
        if (conteudo == null || conteudo.length == 0) {
            return "";
        }
        GZIPInputStream gis;
        gis = new GZIPInputStream(new ByteArrayInputStream(conteudo));
        BufferedReader bf = new BufferedReader(new InputStreamReader(gis, "UTF-8"));
        StringBuilder outStr = new StringBuilder();
        String line;
        while ((line = bf.readLine()) != null) {
            outStr.append(line);
        }

        return outStr.toString();
    }

    public static String criaCteProc(TEnviCTe enviCte, Object retorno)
            throws JAXBException, CteException {

        CteProc cteProc = new CteProc();
        cteProc.setVersao("3.00");
        cteProc.setCTe(enviCte.getCTe().get(0));
        cteProc.setProtCTe(
                xmlToObject(objectCteToXml(retorno), br.com.swconsultoria.cte.schema_300.enviCTe.TProtCTe.class));

        return XmlCteUtil.objectCteToXml(cteProc);
    }

    public static String criaCteOSProc(TCTeOS enviCte, Object retorno)
            throws JAXBException, CteException {

        CteOSProc cteProc = new CteOSProc();
        cteProc.setVersao("3.00");
        cteProc.setCTeOS( xmlToObject(objectCteToXml(enviCte), br.com.swconsultoria.cte.schema_300.procCTeOS.TCTeOS.class));
        cteProc.setProtCTe(
                xmlToObject(objectCteToXml(retorno), br.com.swconsultoria.cte.schema_300.procCTeOS.TProtCTeOS.class));

        return XmlCteUtil.objectCteToXml(cteProc);
    }

    private static String replacesCte(String xml) {
        xml = xml.replaceAll("ns2:", "");
        xml = xml.replaceAll("ns3:", "");
        xml = xml.replaceAll("&lt;", "<");
        xml = xml.replaceAll("&gt;", ">");
        xml = xml.replaceAll("<Signature>", "<Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\">");
        xml = xml.replaceAll(" xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", "");
        xml = xml.replaceAll(" xmlns:ns3=\"http://www.portalfiscal.inf.br/cte\"", "");
        xml = xml.replaceAll(" xmlns:ns2=\"http://www.portalfiscal.inf.br/cte\"", "");
        xml = xml.replaceAll(" xmlns=\"\"", "");
        return xml;
    }

    public static String dataCte(LocalDateTime data) throws CteException {
        XMLGregorianCalendar xmlCalendar;
        try {
            GregorianCalendar calendar = GregorianCalendar.from(data.atZone(ZoneId.of("Brazil/East")));

            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            xmlCalendar.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);

        } catch (DatatypeConfigurationException e) {
            throw new CteException(e.getMessage());
        }

        return (xmlCalendar.toString());
    }

    public static int modulo11(String chave) {
        int total = 0;
        int peso = 2;

        for (int i = 0; i < chave.length(); i++) {
            total += (chave.charAt((chave.length() - 1) - i) - '0') * peso;
            peso++;
            if (peso == 10)
                peso = 2;
        }
        int resto = total % 11;
        return (resto == 0 || resto == 1) ? 0 : (11 - resto);
    }

}
