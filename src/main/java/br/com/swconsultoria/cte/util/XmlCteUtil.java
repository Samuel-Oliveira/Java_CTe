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
import br.com.swconsultoria.cte.schema_100.distdfeint.DistDFeInt;
import br.com.swconsultoria.cte.schema_300.enviCTe.TEnviCTe;
import br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento;
import br.com.swconsultoria.cte.schema_300.evEPECCTe.TProcEvento;
import br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento;
import br.com.swconsultoria.cte.schema_300.inutCTe.TInutCTe;
import br.com.swconsultoria.cte.schema_300.inutCTe.TProcInutCTe;
import br.com.swconsultoria.cte.schema_300.inutCTe.TRetInutCTe;
import br.com.swconsultoria.cte.schema_300.procCTe.CteProc;
import br.com.swconsultoria.cte.schema_300.procCTeOS.CteOSProc;
import br.com.swconsultoria.cte.schema_300.retCTeOS.TProtCTeOS;
import br.com.swconsultoria.cte.schema_300.retCTeOS.TRetCTeOS;
import br.com.swconsultoria.cte.schema_300.retConsReciCTe.TProtCTe;
import br.com.swconsultoria.cte.schema_300.retConsReciCTe.TRetConsReciCTe;
import br.com.swconsultoria.cte.schema_300.retConsSitCTe.TRetConsSitCTe;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TRetEnviCTe;
import lombok.extern.java.Log;

import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.StringJoiner;
import java.util.zip.GZIPInputStream;

/**
 * Classe Responsavel por Metodos referentes ao XML
 *
 * @author Samuel Oliveira
 */
@Log
public class XmlCteUtil {

    private static final String STATUS_SERVICO = "TConsStatServ";
    private static final String CTE = "TCTe";
    private static final String CTE_ENV = "br.com.swconsultoria.cte.schema_300.enviCTe.TCTe";
    private static final String CTE_PROC = "br.com.swconsultoria.cte.schema_300.procCTe.TCTe";
    private static final String ENVIO_CTE = "TEnviCTe";
    private static final String ENVIO_CTE_OS = "TCTeOS";
    private static final String CONSULTA_RECIBO = "TConsReciCTe";
    private static final String INUTILIZACAO = "TInutCTe";
    private static final String CONSULTA_PROTOCOLO = "TConsSitCTe";
    private static final String DISTRIBUICAO_DFE = "DistDFeInt";
    private static final String EVENTO = "TEvento";

    private static final String MODAL_RODOVIARIO = "Rodo";
    private static final String MODAL_RODOVIARIO_V3 = "br.com.swconsultoria.cte.schema_300.cteModalRodoviario.Rodo";

    private static final String PROT_CTE = "TProtCTe";
    private static final String PROT_CTEOS = "TProtCTeOS";
    private static final String PROT_CTE_CONSULTA_RECIBO = "br.com.swconsultoria.cte.schema_300.retConsReciCTe.TProtCTe";
    private static final String PROT_CTE_PROC = "br.com.swconsultoria.cte.schema_300.procCTe.TProtCTe";
    private static final String PROT_CTE_CONSULTA_SITUACAO = "br.com.swconsultoria.cte.schema_300.retConsSitCTe.TProtCTe";
    private static final String PROT_CTEOS_PROC = "br.com.swconsultoria.cte.schema_300.retCTeOS.TProtCTeOS";

    private static final String CANCELAR = "br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento";
    private static final String EPEC = "br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento";
    private static final String MULTIMODAL = "br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento";
    private static final String CCE = "br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento";
    private static final String PRESTDESACORDO = "br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TEvento";
    private static final String GVT = "br.com.swconsultoria.cte.schema_300.evGTV.TEvento";

    private static final String RET_EVENTO = "TRetEvento";
    private static final String RET_INUTILIZACAO = "TRetInutCTe";
    private static final String RET_CONSULTA = "TRetConsSitCTe";
    private static final String RET_ENVICTE = "TRetEnviCTe";
    private static final String RET_CTE_OS = "TRetCTeOS";
    private static final String RET_CONSULTA_RECIBO = "TRetConsReciCTe";
    private static final String RET_CANCELAR = "br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento";
    private static final String RET_EPEC = "br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento";
    private static final String RET_MULTIMODAL = "br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento";
    private static final String RET_CCE = "br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento";
    private static final String RET_PRESTDESACORDO = "br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento";
    private static final String RET_GVT = "br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento";

    private static final String PROC_CANCELAR = "br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento";
    private static final String PROC_EPEC = "br.com.swconsultoria.cte.schema_300.evEPECCTe.TProcEvento";
    private static final String PROC_MULTIMODAL = "br.com.swconsultoria.cte.schema_300.evRegMultimodal.TProcEvento";
    private static final String PROC_CCE = "br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento";
    private static final String PROC_PRESTDESACORDO = "br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TProcEvento";
    private static final String PROC_GVT = "br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento";
    private static final String PROC_EVENTO = "TProcEvento";
    private static final String PROC_CTE = "CteProc";
    private static final String PROC_CTEOS = "CteOSProc";
    private static final String PROC_INUTILIZAR = "TProcInutCTe";

    /**
     * Transforma o String do XML em Objeto
     *
     * @param xml
     * @param classe
     * @return <T> T
     */
    public static <T> T xmlToObject(String xml, Class<T> classe) {
        return JAXB.unmarshal(new StreamSource(new StringReader(xml)), classe);
    }

    /**
     * Transforma o Objeto em XML(String)
     *
     * @return String
     * @throws CteException
     */
    public static <T> String objectToXml(Object obj) throws JAXBException, CteException {

        JAXBContext context;
        JAXBElement<?> element;

        switch (obj.getClass().getSimpleName()) {

            case STATUS_SERVICO:
                context = JAXBContext.newInstance(TConsStatServ.class);
                element = new ObjectFactory()
                        .createConsStatServCte((TConsStatServ) obj);
                break;

            case ENVIO_CTE:
                context = JAXBContext.newInstance(TEnviCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.enviCTe.ObjectFactory()
                        .createEnviCTe((TEnviCTe) obj);
                break;

            case ENVIO_CTE_OS:
                context = JAXBContext.newInstance(TCTeOS.class);
                element = new br.com.swconsultoria.cte.schema_300.cteOS.ObjectFactory()
                        .createCTeOS((TCTeOS) obj);
                break;
            case CTE:

                switch (obj.getClass().getName()) {

                    case CTE_PROC:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.procCTe.TCTe.class);
                        element = XsdCteUtil.cte
                                .createTCTe((br.com.swconsultoria.cte.schema_300.procCTe.TCTe) obj);
                        break;

                    case CTE_ENV:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.enviCTe.TCTe.class);
                        element = XsdCteUtil.cte
                                .createTCTe((br.com.swconsultoria.cte.schema_300.enviCTe.TCTe) obj);
                        break;
                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case CONSULTA_RECIBO:
                context = JAXBContext.newInstance(TConsReciCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.consReciCTe.ObjectFactory()
                        .createConsReciCTe((TConsReciCTe) obj);
                break;

            case INUTILIZACAO:
                context = JAXBContext.newInstance(TInutCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.inutCTe.ObjectFactory()
                        .createInutCTe((TInutCTe) obj);
                break;

            case CONSULTA_PROTOCOLO:
                context = JAXBContext.newInstance(TConsSitCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.consSitCTe.ObjectFactory()
                        .createConsSitCTe((TConsSitCTe) obj);

                break;

            case DISTRIBUICAO_DFE:
                context = JAXBContext.newInstance(DistDFeInt.class);
                element = new br.com.swconsultoria.cte.schema_100.distdfeint.ObjectFactory()
                        .createDistDFeInt((DistDFeInt) obj);
                break;

            case RET_ENVICTE:
                context = JAXBContext.newInstance(TRetEnviCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.retEnviCTe.ObjectFactory()
                        .createRetEnviCte((TRetEnviCTe) obj);
                break;

            case RET_CTE_OS:
                context = JAXBContext.newInstance(TRetCTeOS.class);
                element = new br.com.swconsultoria.cte.schema_300.retCTeOS.ObjectFactory()
                        .createRetCTeOS((TRetCTeOS) obj);
                break;

            case RET_CONSULTA_RECIBO:
                context = JAXBContext.newInstance(TRetConsReciCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.retConsReciCTe.ObjectFactory()
                        .createRetConsReciCTe((TRetConsReciCTe) obj);
                break;

            case RET_INUTILIZACAO:
                context = JAXBContext.newInstance(TRetInutCTe.class);
                element = XsdCteUtil.retInutilizacao.createTRetInutCTe((TRetInutCTe) obj);
                break;

            case RET_CONSULTA:
                context = JAXBContext.newInstance(TRetConsSitCTe.class);
                element = new br.com.swconsultoria.cte.schema_300.retConsSitCTe.ObjectFactory()
                        .createRetConsSitCTe((TRetConsSitCTe) obj);
                break;

            case PROC_EVENTO:

                switch (obj.getClass().getName()) {

                    case PROC_CANCELAR:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento.class);
                        element = XsdCteUtil.procEvento
                                .createTProcEvento((br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento) obj);
                        break;

                    case PROC_EPEC:
                        context = JAXBContext.newInstance(TProcEvento.class);
                        element = XsdCteUtil.procEvento
                                .createTProcEvento((TProcEvento) obj);
                        break;

                    case PROC_MULTIMODAL:
                        context = JAXBContext.newInstance(TProcEvento.class);
                        element = XsdCteUtil.procEvento
                                .createTProcEvento((br.com.swconsultoria.cte.schema_300.evRegMultimodal.TProcEvento) obj);
                        break;

                    case PROC_CCE:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento.class);
                        element = XsdCteUtil.procEvento
                                .createTProcEvento((br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento) obj);
                        break;

                    case PROC_PRESTDESACORDO:
                        context = JAXBContext
                                .newInstance(br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TProcEvento.class);
                        element = XsdCteUtil.procEvento
                                .createTProcEvento((br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TProcEvento) obj);
                        break;

                    case PROC_GVT:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento.class);
                        element = XsdCteUtil.procEvento
                                .createTProcEvento((br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case PROC_CTE:
                context = JAXBContext.newInstance(CteProc.class);
                element = XsdCteUtil.cteProc
                        .createCteProc((CteProc) obj);
                break;

            case PROC_INUTILIZAR:
                context = JAXBContext.newInstance(TProcInutCTe.class);
                element = XsdCteUtil.procInut
                        .createProcInut((TProcInutCTe) obj);
                break;

            case PROC_CTEOS:
                context = JAXBContext.newInstance(CteOSProc.class);
                element = XsdCteUtil.cteOSProc
                        .createCteOSProc((CteOSProc) obj);
                break;

            case EVENTO:

                switch (obj.getClass().getName()) {

                    case CANCELAR:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento.class);
                        element = XsdCteUtil.evento
                                .createTEvento((br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento) obj);
                        break;

                    case EPEC:
                        context = JAXBContext.newInstance(TEvento.class);
                        element = XsdCteUtil.evento
                                .createTEvento((TEvento) obj);
                        break;

                    case MULTIMODAL:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento.class);
                        element = XsdCteUtil.evento
                                .createTEvento((br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento) obj);
                        break;

                    case CCE:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento.class);
                        element = XsdCteUtil.evento
                                .createTEvento((br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento) obj);
                        break;

                    case PRESTDESACORDO:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TEvento.class);
                        element = XsdCteUtil.evento
                                .createTEvento((br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TEvento) obj);
                        break;

                    case GVT:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evGTV.TEvento.class);
                        element = XsdCteUtil.evento
                                .createTEvento((br.com.swconsultoria.cte.schema_300.evGTV.TEvento) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case RET_EVENTO:

                switch (obj.getClass().getName()) {

                    case RET_CANCELAR:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento.class);
                        element = XsdCteUtil.retEvento.createTRetEvent((br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento) obj);
                        break;

                    case RET_EPEC:
                        context = JAXBContext.newInstance(TRetEvento.class);
                        element = XsdCteUtil.retEvento.createTRetEvent((TRetEvento) obj);
                        break;

                    case RET_MULTIMODAL:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento.class);
                        element = XsdCteUtil.retEvento.createTRetEvent((br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento) obj);
                        break;

                    case RET_CCE:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento.class);
                        element = XsdCteUtil.retEvento.createTRetEvent((br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento) obj);
                        break;

                    case RET_PRESTDESACORDO:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento.class);
                        element = XsdCteUtil.retEvento.createTRetEvent((br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento) obj);
                        break;

                    case RET_GVT:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento.class);
                        element = XsdCteUtil.retEvento.createTRetEvent((br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case PROT_CTE:

                switch (obj.getClass().getName()) {

                    case PROT_CTE_CONSULTA_RECIBO:
                        context = JAXBContext.newInstance(TProtCTe.class);
                        element = XsdCteUtil.protCTe
                                .createProtCte((TProtCTe) obj);
                        break;

                    case PROT_CTE_PROC:
                        context = JAXBContext.newInstance(br.com.swconsultoria.cte.schema_300.procCTe.TProtCTe.class);
                        element = XsdCteUtil.protCTe
                                .createProtCte((br.com.swconsultoria.cte.schema_300.procCTe.TProtCTe) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case PROT_CTEOS:

                switch (obj.getClass().getName()) {

                    case PROT_CTEOS_PROC:
                        context = JAXBContext.newInstance(TProtCTeOS.class);
                        element = XsdCteUtil.protCTe
                                .createProtCte((TProtCTeOS) obj);
                        break;

                    default:
                        throw new CteException("Objeto não mapeado no XmlCteUtil:" + obj.getClass().getName());
                }

                break;

            case MODAL_RODOVIARIO:

                switch (obj.getClass().getName()) {

                    case MODAL_RODOVIARIO:
                        context = JAXBContext.newInstance(Rodo.class);
                        element = XsdCteUtil.rodo
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
        cteProc.setCTe(xmlToObject(objectToXml(enviCte.getCTe().get(0)), br.com.swconsultoria.cte.schema_300.procCTe.TCTe.class));
        cteProc.setProtCTe(
                xmlToObject(objectToXml(retorno), br.com.swconsultoria.cte.schema_300.procCTe.TProtCTe.class));

        return XmlCteUtil.objectToXml(cteProc);
    }

    public static String criaCteOSProc(TCTeOS enviCte, Object retorno)
            throws JAXBException, CteException {

        CteOSProc cteProc = new CteOSProc();
        cteProc.setVersao("3.00");
        cteProc.setCTeOS(xmlToObject(objectToXml(enviCte), br.com.swconsultoria.cte.schema_300.procCTeOS.TCTeOS.class));
        cteProc.setProtCTe(
                xmlToObject(objectToXml(retorno), br.com.swconsultoria.cte.schema_300.procCTeOS.TProtCTeOS.class));

        return XmlCteUtil.objectToXml(cteProc);
    }

    /**
     * Le o Arquivo XML e retona String
     *
     * @return String
     * @throws NfeException
     */
    public static String leXml(String arquivo) throws IOException {

        ObjetoCTeUtil.verifica(arquivo).orElseThrow(() -> new IllegalArgumentException("Arquivo xml não pode ser nulo/vazio."));
        if (!Files.exists(Paths.get(arquivo))) {
            throw new FileNotFoundException("Arquivo " + arquivo + " não encontrado.");
        }
        List<String> list = Files.readAllLines(Paths.get(arquivo));
        StringJoiner joiner = new StringJoiner("\n");
        list.forEach(joiner::add);

        return joiner.toString();
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

    public static String dataCte(LocalDateTime dataASerFormatada) {
        return dataCte(dataASerFormatada, ZoneId.systemDefault());
    }

    public static String dataCte(LocalDateTime dataASerFormatada, ZoneId zoneId) {
        try {
            GregorianCalendar calendar = GregorianCalendar.from(dataASerFormatada.atZone(ObjetoCTeUtil.verifica(zoneId).orElse(ZoneId.of("Brazil/East"))));

            XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            xmlCalendar.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
            return xmlCalendar.toString();

        } catch (DatatypeConfigurationException e) {
            log.info(e.getMessage());
        }
        return null;
    }

}
