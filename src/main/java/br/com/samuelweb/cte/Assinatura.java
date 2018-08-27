package br.com.samuelweb.cte;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.certificado.CertificadoService;
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.cte.dom.Configuracoes;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.XmlUtil;

/**
 * Classe Responsavel Por Assinar O Xml.
 *
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 */
class Assinatura {

	static final String INFINUT = "infInut";

	static final String EVENTO = "eventoCTe";

	public static final String CTE = "CTe";

	private static Configuracoes configuracoesCte;

	private static PrivateKey privateKey;

	private static KeyInfo keyInfo;

	Assinatura assinarXMLsCertfificadoA1;

	/**
	 * @param stringXml
	 * @param certificado
	 * @param tipo
	 *            ('Cte' para cte normal , 'infInut' para inutilizacao, 'evento'
	 *            para eventos)
	 * @return String do Xml Assinado
	 * @throws CteException
	 */
	static String assinar(Configuracoes config, String stringXml, String tipo) throws CteException {

		configuracoesCte = config;

		stringXml = XmlUtil.removeAcentos(stringXml);
		stringXml = assinaDoc(stringXml, tipo);

		return stringXml;
	}

	/**
	 * Assinatura do XML de Envio de Lote da CT-e utilizando Certificado Digital.
	 *
	 * @param Conteudo
	 *            do Xml
	 * @param Nome
	 *            do Certificado Digital
	 * @return String do XMl Assinado
	 * @throws Exception
	 */
	private static String assinaDoc(String xml, String tipo) throws CteException {

		try {
			Document document = documentFactory(xml);
			XMLSignatureFactory signatureFactory = XMLSignatureFactory.getInstance("DOM");
			ArrayList<Transform> transformList = signatureFactory(signatureFactory);
			loadCertificates(signatureFactory);

			if (tipo.equals(EVENTO)) {
				assinar(tipo, signatureFactory, transformList, privateKey, keyInfo, document, 0);

			} else {
				for (int i = 0; i < document.getDocumentElement().getElementsByTagName(tipo).getLength(); i++) {
					assinar(tipo, signatureFactory, transformList, privateKey, keyInfo, document, i);
				}
			}

			return outputXML(document);
		} catch (SAXException | IOException | ParserConfigurationException | NoSuchAlgorithmException
				| InvalidAlgorithmParameterException | KeyStoreException | UnrecoverableEntryException
				| NoSuchProviderException | CertificateException | MarshalException | XMLSignatureException
				| CertificadoException e) {
			throw new CteException("Erro ao Assinar Cte" + e.getMessage());
		}

	}

	private static void assinar(String tipo, XMLSignatureFactory fac, ArrayList<Transform> transformList,
			PrivateKey privateKey, KeyInfo ki, Document document, int indexCTe) throws NoSuchAlgorithmException,
			InvalidAlgorithmParameterException, MarshalException, XMLSignatureException {

		NodeList elements;
		switch (tipo) {
		case EVENTO:
			elements = document.getElementsByTagName("infEvento");
			break;
		case INFINUT:
			elements = document.getElementsByTagName("infInut");
			break;
		default:
			elements = document.getElementsByTagName("infCte");
			break;
		}

		org.w3c.dom.Element el = (org.w3c.dom.Element) elements.item(indexCTe);
		String id = el.getAttribute("Id");

		el.setIdAttribute("Id", true);

		Reference ref = fac.newReference("#" + id, fac.newDigestMethod(DigestMethod.SHA1, null), transformList, null,
				null);

		SignedInfo si = fac.newSignedInfo(
				fac.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE, (C14NMethodParameterSpec) null),
				fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null), Collections.singletonList(ref));

		XMLSignature signature = fac.newXMLSignature(si, ki);

		DOMSignContext dsc;

		if (tipo.equals(INFINUT) || tipo.equals(EVENTO)) {
			dsc = new DOMSignContext(privateKey, document.getFirstChild());
		} else {
			dsc = new DOMSignContext(privateKey,
					document.getDocumentElement().getElementsByTagName(tipo).item(indexCTe));
		}

		dsc.setBaseURI("ok");

		signature.sign(dsc);
	}

	private static ArrayList<Transform> signatureFactory(XMLSignatureFactory signatureFactory)
			throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {

		ArrayList<Transform> transformList = new ArrayList<Transform>();
		TransformParameterSpec tps = null;
		Transform envelopedTransform = signatureFactory.newTransform(Transform.ENVELOPED, tps);
		Transform c14NTransform = signatureFactory.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);

		transformList.add(envelopedTransform);
		transformList.add(c14NTransform);
		return transformList;
	}

	private static Document documentFactory(String xml) throws SAXException, IOException, ParserConfigurationException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		return factory.newDocumentBuilder().parse(new ByteArrayInputStream(xml.getBytes()));
	}

	private static void loadCertificates(XMLSignatureFactory signatureFactory)
			throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException, NoSuchProviderException,
			CertificateException, IOException, CertificadoException {

		Certificado certificado = configuracoesCte.getCertificado();
		KeyStore keyStore = CertificadoService.getKeyStore(certificado);
		KeyStore.PrivateKeyEntry pkEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(certificado.getNome(),
				new KeyStore.PasswordProtection(certificado.getSenha().toCharArray()));
		privateKey = pkEntry.getPrivateKey();

		KeyInfoFactory keyInfoFactory = signatureFactory.getKeyInfoFactory();
		List<X509Certificate> x509Content = new ArrayList<X509Certificate>();

		x509Content.add(CertificadoService.getCertificate(certificado, keyStore));
		X509Data x509Data = keyInfoFactory.newX509Data(x509Content);
		keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));
	}

	private static String outputXML(Document doc) throws CteException {

		try {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer trans = tf.newTransformer();
			trans.transform(new DOMSource(doc), new StreamResult(os));
			String xml = os.toString();
			xml = xml.replaceAll("\\r\\n", "");
			xml = xml.replaceAll(" standalone=\"no\"", "");
			return xml;
		} catch (TransformerException e) {
			throw new CteException("Erro ao Transformar Documento:" + e.getMessage());
		}

	}

}
