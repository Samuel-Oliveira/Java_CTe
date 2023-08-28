/**
 *
 */
package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.schema_400.cte.TCTe;
import br.com.swconsultoria.cte.schema_400.cteOS.TCTeOS;
import br.com.swconsultoria.cte.schema_400.procCTe.CteProc;
import br.com.swconsultoria.cte.schema_400.procCTeOS.CteOSProc;
import lombok.extern.java.Log;

import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.logging.Level;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Classe Responsavel por Metodos referentes ao XML
 *
 * @author Samuel Oliveira
 */
@Log
public class XmlCteUtil {

    private XmlCteUtil() {}

    public static <T> T xmlToObject(String xml, Class<T> classe) {
        return JAXB.unmarshal(new StreamSource(new StringReader(xml)), classe);
    }

    /**
     * Transforma o Objeto em XML(String)
     *
     * @param objeto
     * @return
     * @throws JAXBException
     */
    public static String objectToXml(Object objeto) throws JAXBException {
        return objectToXml(objeto, null, null);
    }

    /**
     * Transforma o Objeto em XML(String)
     *
     * @param objeto
     * @return
     * @throws JAXBException
     */
    public static <T> String objectToXml(T objeto, Class<T> clazz, String nomeElemento) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(objeto.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.encoding", "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        Result result = new StreamResult(sw);

        if (nomeElemento != null) {
            marshaller.marshal(new JAXBElement<>(
                    new QName("http://www.portalfiscal.inf.br/cte", nomeElemento),
                    clazz, objeto), result);
        } else {
            marshaller.marshal(objeto, result);
        }

        return replacesCte("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + sw);
    }

    public static String gZipToXml(byte[] conteudo) throws IOException {
        if (conteudo == null || conteudo.length == 0) {
            return "";
        }
        GZIPInputStream gis;
        gis = new GZIPInputStream(new ByteArrayInputStream(conteudo));
        BufferedReader bf = new BufferedReader(new InputStreamReader(gis, UTF_8));
        StringBuilder outStr = new StringBuilder();
        String line;
        while ((line = bf.readLine()) != null) {
            outStr.append(line);
        }

        return outStr.toString();
    }

    public static String xmlToGZip(final String xml) {
        if (Objects.isNull(xml) || xml.isEmpty()) {
            return null;
        }

        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
             final GZIPOutputStream gzipOutput = new GZIPOutputStream(baos)) {
            gzipOutput.write(xml.getBytes(UTF_8));
            gzipOutput.finish();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            throw new UncheckedIOException("Erro ao compactar GZIp", e);
        }
    }

    public static String criaCteProc(TCTe cte, Object retorno)
            throws JAXBException {

        CteProc cteProc = new CteProc();
        cteProc.setVersao("4.00");
        cteProc.setCTe(xmlToObject(objectToXml(cte), br.com.swconsultoria.cte.schema_400.procCTe.TCTe.class));
        cteProc.setProtCTe(
                xmlToObject(objectToXml(retorno), br.com.swconsultoria.cte.schema_400.procCTe.TProtCTe.class));

        return XmlCteUtil.objectToXml(cteProc);
    }

    public static String criaCteOSProc(TCTeOS cteOS, Object retorno)
            throws JAXBException {

        CteOSProc cteProc = new CteOSProc();
        cteProc.setVersao("4.00");
        cteProc.setCTeOS(xmlToObject(objectToXml(cteOS), br.com.swconsultoria.cte.schema_400.procCTeOS.TCTeOS.class));
        cteProc.setProtCTe(
                xmlToObject(objectToXml(retorno), br.com.swconsultoria.cte.schema_400.procCTeOS.TProtCTeOS.class));

        return XmlCteUtil.objectToXml(cteProc);
    }

    /**
     * Le o Arquivo XML e retona String
     *
     * @return String
     * @throws NfeException
     */
    public static String leXml(String arquivo) throws IOException {

        if (!Files.exists(Paths.get(
                ObjetoCTeUtil.verifica(arquivo)
                        .orElseThrow(() -> new IllegalArgumentException("Arquivo xml não pode ser nulo/vazio."))))) {
            throw new FileNotFoundException("Arquivo " + arquivo + " não encontrado.");
        }
        List<String> list = Files.readAllLines(Paths.get(arquivo));
        StringJoiner joiner = new StringJoiner("\n");
        list.forEach(joiner::add);

        return joiner.toString();
    }

    private static String replacesCte(String xml) {
        return xml.replace("ns2:", "")
                .replace("ns3:", "")
                .replace("&lt;", "<")
                .replace("&gt;", ">")
                .replace("<Signature>", "<Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\">")
                .replace(" xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", "")
                .replace(" xmlns:ns3=\"http://www.portalfiscal.inf.br/cte\"", "")
                .replace(" xmlns:ns2=\"http://www.portalfiscal.inf.br/cte\"", "")
                .replace(" xmlns=\"\"", "");
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
            log.log(Level.SEVERE, "Erro ao converter Data CTe", e);
        }
        return null;
    }

}
