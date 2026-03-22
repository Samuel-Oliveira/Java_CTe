package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.dom.enuns.DocumentoCteEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class IbsCbsUtilTest {

    private static String jsonIbsCbs;

    /** JSON mínimo para testar diferimento: CST 510-like entry com IndCTe=true */
    private static final String JSON_DIFERIMENTO = "[{" +
            "\"CST\":\"510\"," +
            "\"IndIBSCBS\":true,\"IndRedAliq\":false,\"IndDif\":true," +
            "\"IndTransfCred\":false,\"IndAjusteCompet\":false,\"IndIBSCBSMono\":false," +
            "\"classificacoesTributarias\":[{" +
            "\"cClassTrib\":\"510001\"," +
            "\"IndTribRegular\":false," +
            "\"IndCTe\":true,\"IndCTeOS\":true," +
            "\"pRedIBS\":null,\"pRedCBS\":null" +
            "}]}]";

    @BeforeAll
    static void carregarJson() throws Exception {
        jsonIbsCbs = new String(Files.readAllBytes(
                Paths.get("src/test/resources/ibscbs.json")));
    }

    // ─── Tributação integral ─────────────────────────────────────────────────

    @Test
    @DisplayName("CST 000 / ClassTrib 000001 – tributação integral CTe")
    void tributacaoIntegral_CTe() throws CteException {
        IbsCbsUtil util = new IbsCbsUtil(jsonIbsCbs, DocumentoCteEnum.CTE);
        util.setpAliqIbsUf(new BigDecimal("0.1"));
        util.setpAliqIbsMun(BigDecimal.ZERO);
        util.setpAliqCbs(new BigDecimal("0.9"));

        TTribCTe trib = util.montaImposto("000001", new BigDecimal("1000.00"));

        assertEquals("000", trib.getCST());
        assertEquals("000001", trib.getCClassTrib());
        assertNotNull(trib.getGIBSCBS());
        assertNull(trib.getGIBSCBS().getGTribRegular());

        TCIBS ibsCbs = trib.getGIBSCBS();
        assertEquals("1000.00", ibsCbs.getVBC());

        // IBS UF = 1000 * 0.1 / 100 = 1.00
        assertEquals("1.00", ibsCbs.getGIBSUF().getVIBSUF());
        // IBS Mun = 0
        assertEquals("0.00", ibsCbs.getGIBSMun().getVIBSMun());
        // CBS = 1000 * 0.9 / 100 = 9.00
        assertEquals("9.00", ibsCbs.getGCBS().getVCBS());
        // vIBS = 1.00 + 0.00 = 1.00
        assertEquals("1.00", ibsCbs.getVIBS());

        // Sem diferimento nem redução
        assertNull(ibsCbs.getGIBSUF().getGDif());
        assertNull(ibsCbs.getGIBSUF().getGRed());
    }

    @Test
    @DisplayName("CST 000 / ClassTrib 000001 – tributação integral CTe OS")
    void tributacaoIntegral_CTeOS() throws CteException {
        IbsCbsUtil util = new IbsCbsUtil(jsonIbsCbs, DocumentoCteEnum.CTE_OS);
        util.setpAliqIbsUf(BigDecimal.ZERO);
        util.setpAliqIbsMun(BigDecimal.ZERO);
        util.setpAliqCbs(new BigDecimal("0.9"));

        TTribCTe trib = util.montaImposto("000001", new BigDecimal("500.00"));

        assertEquals("000", trib.getCST());
        // CBS = 500 * 0.9 / 100 = 4.50
        assertEquals("4.50", trib.getGIBSCBS().getGCBS().getVCBS());
    }

    // ─── Redução de alíquota ─────────────────────────────────────────────────

    @Test
    @DisplayName("ClassTrib 200001 – redução de alíquota 100% (pRedIBS=100)")
    void reducaoAliquota() throws CteException {
        // CST "200" (IndRedAliq=true), cClassTrib "200001" (IndCTe=true, pRedIBS=100, pRedCBS=100)
        IbsCbsUtil util = new IbsCbsUtil(jsonIbsCbs, DocumentoCteEnum.CTE);
        util.setpAliqIbsUf(new BigDecimal("10.0000"));
        util.setpAliqCbs(new BigDecimal("90.0000"));

        TTribCTe trib = util.montaImposto("200001", new BigDecimal("1000.00"));

        assertNotNull(trib.getGIBSCBS());
        TCIBS ibsCbs = trib.getGIBSCBS();

        // Com redução 100%, deve ter gRed preenchido com pAliqEfet = 0
        assertNotNull(ibsCbs.getGIBSUF().getGRed());
        assertNotNull(ibsCbs.getGCBS().getGRed());

        TRed redIBSUF = ibsCbs.getGIBSUF().getGRed();
        // pAliqEfet = 10.0 * (1 - 100/100) = 0
        assertEquals(0, new BigDecimal(redIBSUF.getPAliqEfet()).compareTo(BigDecimal.ZERO));
        // Valor IBS UF deve ser 0
        assertEquals("0.00", ibsCbs.getGIBSUF().getVIBSUF());
    }

    // ─── Diferimento ─────────────────────────────────────────────────────────

    @Test
    @DisplayName("ClassTrib com diferimento (IndDif = true)")
    void diferimento() throws CteException {
        // JSON mínimo com IndDif=true e IndCTe=true
        IbsCbsUtil util = new IbsCbsUtil(JSON_DIFERIMENTO, DocumentoCteEnum.CTE);
        util.setpAliqIbsUf(new BigDecimal("10.0000"));
        util.setpAliqCbs(new BigDecimal("90.0000"));
        util.setpAliqDiferimento(new BigDecimal("50.0000")); // 50% de diferimento

        TTribCTe trib = util.montaImposto("510001", new BigDecimal("1000.00"));

        assertNotNull(trib.getGIBSCBS());
        TCIBS ibsCbs = trib.getGIBSCBS();

        // Com diferimento, deve ter gDif preenchido
        assertNotNull(ibsCbs.getGIBSUF().getGDif());
        assertNotNull(ibsCbs.getGCBS().getGDif());

        // Valor diferido deve ser positivo
        BigDecimal vDifIBS = new BigDecimal(ibsCbs.getGIBSUF().getGDif().getVDif());
        assertTrue(vDifIBS.compareTo(BigDecimal.ZERO) >= 0);
    }

    // ─── Validações ──────────────────────────────────────────────────────────

    @Test
    @DisplayName("CClassTrib inválido lança CteException")
    void classTribInvalido() {
        assertThrows(CteException.class, () -> {
            IbsCbsUtil util = new IbsCbsUtil(jsonIbsCbs, DocumentoCteEnum.CTE);
            util.montaImposto("INVALIDO", new BigDecimal("1000.00"));
        });
    }

    @Test
    @DisplayName("CClassTrib não habilitado para CTe lança CteException")
    void classTribNaoHabilitadoCTe() {
        // ClassTrib "000002" tem IndCTe=false, não pode ser usado em CTe
        assertThrows(CteException.class, () -> {
            IbsCbsUtil util = new IbsCbsUtil(jsonIbsCbs, DocumentoCteEnum.CTE);
            util.montaImposto("000002", new BigDecimal("1000.00"));
        });
    }

    @Test
    @DisplayName("JSON inválido lança CteException")
    void jsonInvalido() {
        assertThrows(CteException.class, () ->
                new IbsCbsUtil("json inválido", DocumentoCteEnum.CTE));
    }

    // ─── Totais ──────────────────────────────────────────────────────────────

    @Test
    @DisplayName("Totais acumulam corretamente para múltiplas prestações")
    void totaisAcumulam() throws CteException {
        IbsCbsUtil util = new IbsCbsUtil(jsonIbsCbs, DocumentoCteEnum.CTE);
        util.setpAliqIbsUf(new BigDecimal("0.1"));
        util.setpAliqIbsMun(BigDecimal.ZERO);
        util.setpAliqCbs(new BigDecimal("0.9"));

        util.montaImposto("000001", new BigDecimal("1000.00"));
        util.montaImposto("000001", new BigDecimal("2000.00"));

        TIBSCBSTot totais = util.preencheTotaisIbsCbs();

        assertEquals("3000.00", totais.getVBCIBSCBS());
        // IBS UF total = (1000 + 2000) * 0.1/100 = 3.00
        assertEquals("3.00", totais.getGIBS().getGIBSUF().getVIBSUF());
        // CBS total = 3000 * 0.9/100 = 27.00
        assertEquals("27.00", totais.getGCBS().getVCBS());
        // vIBS total = IBS_UF + IBS_Mun = 3.00 + 0.00 = 3.00
        assertEquals("3.00", totais.getGIBS().getVIBS());
    }

    @Test
    @DisplayName("calculaVTPrestTot inclui IBS e CBS")
    void calculaVTPrestTot() throws CteException {
        IbsCbsUtil util = new IbsCbsUtil(jsonIbsCbs, DocumentoCteEnum.CTE);
        util.setpAliqIbsUf(new BigDecimal("0.1"));
        util.setpAliqIbsMun(BigDecimal.ZERO);
        util.setpAliqCbs(new BigDecimal("0.9"));

        util.montaImposto("000001", new BigDecimal("1000.00"));

        // vTPrest = 1000 + IBS_UF(1.00) + IBS_Mun(0.00) + CBS(9.00) = 1010.00
        BigDecimal total = util.calculaVTPrestTot("1000.00");
        assertEquals(0, total.compareTo(new BigDecimal("1010.00")));
    }

    @Test
    @DisplayName("preencheTotaisIbsCbs retorna zeros quando nenhuma prestação processada")
    void totaisZerados() throws CteException {
        IbsCbsUtil util = new IbsCbsUtil(jsonIbsCbs, DocumentoCteEnum.CTE);
        TIBSCBSTot totais = util.preencheTotaisIbsCbs();

        assertEquals("0.00", totais.getVBCIBSCBS());
        assertEquals("0.00", totais.getGIBS().getVIBS());
        assertEquals("0.00", totais.getGCBS().getVCBS());
    }
}