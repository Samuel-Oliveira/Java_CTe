package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.certificado.Certificado;
import br.com.swconsultoria.certificado.CertificadoService;
import br.com.swconsultoria.certificado.exception.CertificadoException;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMResult;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;
import java.util.Collection;
import java.util.Optional;

public final class ObjetoCTeUtil {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <T> Element objectToElement(Object objeto, Class<T> classe, String qName) throws CteException {

        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            JAXB.marshal(new JAXBElement(new QName(qName), classe, objeto), new DOMResult(document));

            return document.getDocumentElement();

        } catch (ParserConfigurationException e) {
            throw new CteException("Erro Ao Converter Objeto em Elemento: " + e.getMessage());
        }
    }

    public static <T> T elementToObject(org.w3c.dom.Element element, Class<T> classe) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(classe);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return unmarshaller.unmarshal(element, classe).getValue();
    }

    public static String elementToString(Element element) {
        DOMImplementationLS lsImpl = (DOMImplementationLS) element.getOwnerDocument().getImplementation().getFeature("LS", "3.0");
        LSSerializer serializer = lsImpl.createLSSerializer();
        serializer.getDomConfig().setParameter("xml-declaration", false); //by default its true, so set it to false to get String without xml-declaration
        return serializer.writeToString(element);
    }

    public static String criaQRCode(String chave, ConfiguracoesCte configuracoesCTe) throws CteException {

        StringBuilder qrCode = new StringBuilder();
        qrCode.append(WebServiceCteUtil.getUrl(configuracoesCTe, ServicosEnum.QRCODE));
        qrCode.append("?chCTe=");
        qrCode.append(chave);
        qrCode.append("&tpAmb=");
        qrCode.append(configuracoesCTe.getAmbiente().getCodigo());
        if(chave.substring(34,35).equals("2")){
            qrCode.append("&sign=");
            try {
                qrCode.append(assinaSign(chave, configuracoesCTe.getCertificado()));
            } catch (Exception e) {
                throw new CteException("Erro ao assinar Chave contingencia: "+e.getMessage());
            }
        }

        return qrCode.toString();

    }

    private static String assinaSign(String id, Certificado certificado) throws UnsupportedEncodingException, NoSuchAlgorithmException, CertificadoException,
            UnrecoverableEntryException, KeyStoreException, InvalidKeyException, SignatureException {

        KeyStore keyStore = CertificadoService.getKeyStore(certificado);
        KeyStore.PrivateKeyEntry pkEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(certificado.getNome(),
                new KeyStore.PasswordProtection(ObjetoCTeUtil.verifica(certificado.getSenha()).orElse("").toCharArray()));
        byte[] data = id.getBytes(StandardCharsets.UTF_8);

        Signature sig = Signature.getInstance("SHA1WithRSA");
        sig.initSign(pkEntry.getPrivateKey());
        sig.update(data);
        byte[] signatureBytes = sig.sign();
        return (Base64.getEncoder().encodeToString(signatureBytes))
                .replaceAll("&#13;", "")
                .replaceAll("\r\n", "")
                .replaceAll("\n", "")
                .replaceAll(System.lineSeparator(), "");
    }

    /**
     * Verifica se um objeto é vazio.
     *
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> Optional<T> verifica(T obj) {
        if (obj == null)
            return Optional.empty();
        if (obj instanceof Collection)
            return ((Collection<?>) obj).size() == 0 ? Optional.empty() : Optional.of(obj);

        final String s = String.valueOf(obj).trim();

        return s.length() == 0 || s.equalsIgnoreCase("null") ? Optional.empty() : Optional.of(obj);
    }

}
