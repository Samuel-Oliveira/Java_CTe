package br.com.swconsultoria.cte.impressao;

import br.com.swconsultoria.cte.exception.DacteException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Converte o XML do CT-e (cteProc ou CTe sem protocolo) no {@link DacteDTO}.
 * <p>
 * As chaves dos Maps são os nomes das tags do XML. Exceções (nomes derivados ou normalizados):
 * <ul>
 *     <li>rem, exped, receb, dest e toma: os campos do grupo de endereço (enderReme, enderExped, enderReceb,
 *     enderDest, enderToma) ficam no mesmo Map do participante, sem o prefixo do grupo</li>
 *     <li>toma: o participante indicado em ide/toma3/toma (0 remetente, 1 expedidor, 2 recebedor, 3 destinatário)
 *     ou os dados de ide/toma4; a chave "toma" traz o código (4 para toma4)</li>
 *     <li>icms: "grupo" é o nome do grupo informado (ICMS00, ICMS20, ICMS45, ICMS60, ICMS90, ICMSOutraUF, ICMSSN);
 *     vBC, pICMS, vICMS e pRedBC também cobrem vBCSTRet, pICMSSTRet, vICMSSTRet (ICMS60) e vBCOutraUF,
 *     pICMSOutraUF, vICMSOutraUF, pRedBCOutraUF (ICMSOutraUF), como no DACTE Jasper</li>
 *     <li>ibsCbs: CST, cClassTrib, vBC, vIBS e os valores de gIBSUF, gIBSMun e gCBS. pIBSUF, pIBSMun e pCBS já trazem
 *     a alíquota efetiva (gRed/pAliqEfet) quando informada, pois é ela que gera o valor; a alíquota do XML fica
 *     em pIBSUFVigente, pIBSMunVigente e pCBSVigente</li>
 *     <li>documentos de NF-e e DC-e: chave, mais mod, serie e nDoc tirados da chave</li>
 *     <li>documentos de NF (papel) e outros: os campos de infNF e infOutros; obsCont e obsFisco: xCampo é o atributo</li>
 * </ul>
 */
public final class LeitorDacte {

    private static final String[] PARTICIPANTE = {"CNPJ", "CPF", "IE", "xNome", "xFant", "fone", "email", "ISUF"};
    private static final String[] ENDERECO = {"xLgr", "nro", "xCpl", "xBairro", "cMun", "xMun", "CEP", "UF", "cPais", "xPais"};
    /** Prefixo do grupo do ICMS (qualquer um dos grupos da escolha), relativo a infCte. */
    private static final String ICMS = "imp/ICMS/*/";
    private static final String IBSCBS = "imp/IBSCBS/";
    private static final String GIBSCBS = IBSCBS + "gIBSCBS/";

    private LeitorDacte() {
    }

    public static DacteDTO ler(XmlDacte xml) {
        Node infCte = xml.no("//infCte");
        if (infCte == null) {
            throw new DacteException("XML não contém o grupo infCte.");
        }
        DacteDTO dacte = new DacteDTO();

        copia(xml, infCte, dacte.getIde(), "ide/", "cUF", "cCT", "CFOP", "natOp", "mod", "serie", "nCT", "dhEmi",
                "tpImp", "tpEmis", "tpAmb", "tpCTe", "procEmi", "verProc", "indGlobalizado", "xMunEnv", "UFEnv", "modal",
                "tpServ", "xMunIni", "UFIni", "xMunFim", "UFFim", "retira", "xDetRetira", "indIEToma", "dhCont", "xJust");

        copia(xml, infCte, dacte.getCompl(), "compl/", "xCaracAd", "xCaracSer", "xEmi", "xObs");
        for (Node obs : xml.nos(infCte, "compl/ObsCont")) {
            dacte.getObsCont().add(observacao(xml, obs));
        }
        for (Node obs : xml.nos(infCte, "compl/ObsFisco")) {
            dacte.getObsFisco().add(observacao(xml, obs));
        }

        copia(xml, infCte, dacte.getEmit(), "emit/", "CNPJ", "CPF", "IE", "IEST", "xNome", "xFant", "CRT", "ISUFEmit");
        copia(xml, infCte, dacte.getEmit(), "emit/enderEmit/", "xLgr", "nro", "xCpl", "xBairro", "xMun", "CEP", "UF", "fone");

        participante(xml, infCte, dacte.getRem(), "rem/", "enderReme/");
        participante(xml, infCte, dacte.getExped(), "exped/", "enderExped/");
        participante(xml, infCte, dacte.getReceb(), "receb/", "enderReceb/");
        participante(xml, infCte, dacte.getDest(), "dest/", "enderDest/");
        tomador(xml, infCte, dacte);

        Node infProt = xml.no("//protCTe/infProt");
        if (infProt != null) {
            copia(xml, infProt, dacte.getProt(), "", "nProt", "dhRecbto", "chCTe", "cStat", "xMotivo");
        }
        dacte.setChave(chave(xml, infCte, dacte.getProt().get("chCTe")));

        copia(xml, infCte, dacte.getVPrest(), "vPrest/", "vTPrest", "vRec");
        for (Node comp : xml.nos(infCte, "vPrest/Comp")) {
            Map<String, String> componente = new LinkedHashMap<>();
            copia(xml, comp, componente, "", "xNome", "vComp");
            dacte.getComponentes().add(componente);
        }

        Node grupoIcms = xml.no(infCte, "imp/ICMS/*");
        if (grupoIcms != null) {
            coloca(dacte.getIcms(), "grupo", grupoIcms.getNodeName());
        }
        copiaMapeado(xml, infCte, dacte.getIcms(),
                "CST", ICMS + "CST",
                "vBC", ICMS + "vBC | " + ICMS + "vBCSTRet | " + ICMS + "vBCOutraUF",
                "pICMS", ICMS + "pICMS | " + ICMS + "pICMSSTRet | " + ICMS + "pICMSOutraUF",
                "vICMS", ICMS + "vICMS | " + ICMS + "vICMSSTRet | " + ICMS + "vICMSOutraUF",
                "pRedBC", ICMS + "pRedBC | " + ICMS + "pRedBCOutraUF",
                "vCred", ICMS + "vCred",
                "vICMSDeson", ICMS + "vICMSDeson",
                "cBenef", ICMS + "cBenef",
                "indSN", ICMS + "indSN");
        copia(xml, infCte, dacte.getImp(), "imp/", "vTotTrib", "infAdFisco", "vTotDFe");
        ibsCbs(xml, infCte, dacte.getIbsCbs());

        Node norm = xml.no(infCte, "infCTeNorm");
        if (norm != null) {
            normal(xml, norm, dacte);
        }
        for (Node comp : xml.nos(infCte, "infCteComp/chCTe")) {
            String chave = comp.getTextContent();
            if (chave != null && !chave.trim().isEmpty()) {
                dacte.getComplementados().add(chave.trim());
            }
        }

        copiaMapeado(xml, xml.getDocumento(), dacte.getSupl(), "qrCodCTe", "//infCTeSupl/qrCodCTe");
        return dacte;
    }

    /** Grupo infCTeNorm: carga, documentos originários, modal rodoviário, veículos novos e globalizado. */
    private static void normal(XmlDacte xml, Node norm, DacteDTO dacte) {
        copia(xml, norm, dacte.getCarga(), "infCarga/", "vCarga", "proPred", "xOutCat", "vCargaAverb");
        for (Node infQ : xml.nos(norm, "infCarga/infQ")) {
            Map<String, String> quantidade = new LinkedHashMap<>();
            copia(xml, infQ, quantidade, "", "cUnid", "tpMed", "qCarga");
            dacte.getQuantidades().add(quantidade);
        }

        for (Node nfe : xml.nos(norm, "infDoc/infNFe")) {
            dacte.setTipoDocumentos(DacteDTO.DOCUMENTOS_NFE);
            dacte.getDocumentos().add(documentoEletronico(xml, nfe));
        }
        for (Node nf : xml.nos(norm, "infDoc/infNF")) {
            dacte.setTipoDocumentos(DacteDTO.DOCUMENTOS_NF);
            Map<String, String> documento = new LinkedHashMap<>();
            copia(xml, nf, documento, "", "nRoma", "nPed", "mod", "serie", "nDoc", "dEmi", "vBC", "vICMS", "vBCST",
                    "vST", "vProd", "vNF", "nCFOP", "nPeso", "PIN", "dPrev");
            dacte.getDocumentos().add(documento);
        }
        for (Node outro : xml.nos(norm, "infDoc/infOutros")) {
            dacte.setTipoDocumentos(DacteDTO.DOCUMENTOS_OUTROS);
            Map<String, String> documento = new LinkedHashMap<>();
            copia(xml, outro, documento, "", "tpDoc", "descOutros", "nDoc", "dEmi", "vDocFisc", "dPrev");
            dacte.getDocumentos().add(documento);
        }
        for (Node dce : xml.nos(norm, "infDoc/infDCe")) {
            dacte.setTipoDocumentos(DacteDTO.DOCUMENTOS_DCE);
            dacte.getDocumentos().add(documentoEletronico(xml, dce));
        }

        copia(xml, norm, dacte.getRodo(), "infModal/rodo/", "RNTRC");
        for (Node veiculo : xml.nos(norm, "veicNovos")) {
            Map<String, String> dados = new LinkedHashMap<>();
            copia(xml, veiculo, dados, "", "chassi", "cCor", "xCor", "cMod", "vUnit", "vFrete");
            dacte.getVeiculos().add(dados);
        }
        copia(xml, norm, dacte.getInfGlobalizado(), "infGlobalizado/", "xObs");
    }

    /** NF-e ou DC-e: chave, mais modelo, série e número tirados dela (posições 21-22, 23-25 e 26-34). */
    private static Map<String, String> documentoEletronico(XmlDacte xml, Node documento) {
        Map<String, String> dados = new LinkedHashMap<>();
        copia(xml, documento, dados, "", "chave", "PIN", "dPrev");
        String chave = dados.get("chave");
        if (chave != null && chave.length() == 44) {
            coloca(dados, "mod", chave.substring(20, 22));
            coloca(dados, "serie", chave.substring(22, 25));
            coloca(dados, "nDoc", chave.substring(25, 34));
        }
        return dados;
    }

    private static void ibsCbs(XmlDacte xml, Node infCte, Map<String, String> ibsCbs) {
        copiaMapeado(xml, infCte, ibsCbs,
                "CST", IBSCBS + "CST",
                "cClassTrib", IBSCBS + "cClassTrib",
                "vBC", GIBSCBS + "vBC",
                "pIBSUFVigente", GIBSCBS + "gIBSUF/pIBSUF",
                "vIBSUF", GIBSCBS + "gIBSUF/vIBSUF",
                "pIBSMunVigente", GIBSCBS + "gIBSMun/pIBSMun",
                "vIBSMun", GIBSCBS + "gIBSMun/vIBSMun",
                "vIBS", GIBSCBS + "vIBS",
                "pCBSVigente", GIBSCBS + "gCBS/pCBS",
                "vCBS", GIBSCBS + "gCBS/vCBS");
        coloca(ibsCbs, "pIBSUF", primeiro(xml.valor(infCte, GIBSCBS + "gIBSUF/gRed/pAliqEfet"), ibsCbs.get("pIBSUFVigente")));
        coloca(ibsCbs, "pIBSMun", primeiro(xml.valor(infCte, GIBSCBS + "gIBSMun/gRed/pAliqEfet"), ibsCbs.get("pIBSMunVigente")));
        coloca(ibsCbs, "pCBS", primeiro(xml.valor(infCte, GIBSCBS + "gCBS/gRed/pAliqEfet"), ibsCbs.get("pCBSVigente")));
    }

    private static void participante(XmlDacte xml, Node infCte, Map<String, String> destino, String grupo, String endereco) {
        copia(xml, infCte, destino, grupo, PARTICIPANTE);
        copia(xml, infCte, destino, grupo + endereco, ENDERECO);
    }

    /** Tomador: toma3 aponta para um dos participantes; toma4 traz os próprios dados. */
    private static void tomador(XmlDacte xml, Node infCte, DacteDTO dacte) {
        String toma3 = xml.valor(infCte, "ide/toma3/toma");
        if (toma3 != null) {
            Map<String, String> participante = null;
            switch (toma3) {
                case "0": participante = dacte.getRem(); break;
                case "1": participante = dacte.getExped(); break;
                case "2": participante = dacte.getReceb(); break;
                case "3": participante = dacte.getDest(); break;
                default: break;
            }
            if (participante != null) {
                dacte.getToma().putAll(participante);
            }
            coloca(dacte.getToma(), "toma", toma3);
            return;
        }
        if (xml.existe(infCte, "ide/toma4")) {
            participante(xml, infCte, dacte.getToma(), "ide/toma4/", "enderToma/");
            coloca(dacte.getToma(), "toma", primeiro(xml.valor(infCte, "ide/toma4/toma"), "4"));
        }
    }

    private static Map<String, String> observacao(XmlDacte xml, Node obs) {
        Map<String, String> dados = new LinkedHashMap<>();
        coloca(dados, "xCampo", ((Element) obs).getAttribute("xCampo"));
        copia(xml, obs, dados, "", "xTexto");
        return dados;
    }

    private static String chave(XmlDacte xml, Node infCte, String chaveProtocolo) {
        if (chaveProtocolo != null) {
            return chaveProtocolo;
        }
        String id = xml.valor(infCte, "@Id");
        return id != null && id.startsWith("CTe") ? id.substring(3) : id;
    }

    static void copia(XmlDacte xml, Object contexto, Map<String, String> destino, String prefixo, String... tags) {
        for (String tag : tags) {
            coloca(destino, tag, xml.valor(contexto, prefixo + tag));
        }
    }

    /**
     * Pares chave, expressão XPath. Nas uniões ("a | b") vale o primeiro nó na ordem do documento; os grupos são
     * mutuamente exclusivos.
     */
    static void copiaMapeado(XmlDacte xml, Object contexto, Map<String, String> destino, String... chaveExpressao) {
        for (int i = 0; i < chaveExpressao.length; i += 2) {
            coloca(destino, chaveExpressao[i], xml.valor(contexto, chaveExpressao[i + 1]));
        }
    }

    static void coloca(Map<String, String> destino, String chave, String valor) {
        if (valor != null && !valor.trim().isEmpty()) {
            destino.put(chave, valor);
        }
    }

    private static String primeiro(String a, String b) {
        return a != null ? a : b;
    }
}
