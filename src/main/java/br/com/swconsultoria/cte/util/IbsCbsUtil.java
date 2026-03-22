package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.dom.enuns.DocumentoCteEnum;
import br.com.swconsultoria.cte.dto.ClassificacaoTributariaDTO;
import br.com.swconsultoria.cte.dto.CstDTO;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NonNull;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class IbsCbsUtil {

    private static final String TOTAL_BC_IBS_CBS = "TOTAL_BC_IBS_CBS";
    private static final String TOTAL_IBS_UF = "TOTAL_IBS_UF";
    private static final String TOTAL_IBS_MUN = "TOTAL_IBS_MUN";
    private static final String TOTAL_CBS = "TOTAL_CBS";
    private static final String TOTAL_DIFERIMENTO_IBS_UF = "TOTAL_DIFERIMENTO_IBS_UF";
    private static final String TOTAL_DIFERIMENTO_IBS_MUN = "TOTAL_DIFERIMENTO_IBS_MUN";
    private static final String TOTAL_DIFERIMENTO_CBS = "TOTAL_DIFERIMENTO_CBS";
    private static final BigDecimal CEM = BigDecimal.valueOf(100);
    private static final int SCALE_5 = 5;

    private final List<CstDTO> listaCstIbsCbs;
    private final DocumentoCteEnum documento;
    private final Map<String, BigDecimal> mapTotais = new HashMap<>();

    private ClassificacaoTributariaDTO classTribIbsCbs;
    private CstDTO cstIbsCbs;
    private ClassificacaoTributariaDTO classTribIbsCbsTribRegular;
    private CstDTO cstIbsCbsTribRegular;

    private BigDecimal pAliqIbsUf = new BigDecimal("0.1");
    private BigDecimal pAliqIbsMun = BigDecimal.ZERO;
    private BigDecimal pAliqCbs = new BigDecimal("0.9");
    private BigDecimal pAliqDiferimento = BigDecimal.ZERO;
    private BigDecimal baseCalculo = BigDecimal.ZERO;

    public void setpAliqIbsUf(BigDecimal pAliqIbsUf) {
        this.pAliqIbsUf = pAliqIbsUf;
    }

    public void setpAliqIbsMun(BigDecimal pAliqIbsMun) {
        this.pAliqIbsMun = pAliqIbsMun;
    }

    public void setpAliqCbs(BigDecimal pAliqCbs) {
        this.pAliqCbs = pAliqCbs;
    }

    public void setpAliqDiferimento(BigDecimal pAliqDiferimento) {
        this.pAliqDiferimento = pAliqDiferimento;
    }

    public IbsCbsUtil(@NonNull List<CstDTO> listaCstIbsCbs, @NonNull DocumentoCteEnum documento) {
        this.listaCstIbsCbs = listaCstIbsCbs;
        this.documento = documento;
        inicializarTotais();
    }

    public IbsCbsUtil(@NonNull String json, @NonNull DocumentoCteEnum documento) throws CteException {
        try {
            this.listaCstIbsCbs = new ObjectMapper().readValue(json, new TypeReference<List<CstDTO>>() {});
        } catch (Exception e) {
            throw new CteException("Erro ao converter JSON de IBS/CBS: " + e.getMessage(), e);
        }
        this.documento = documento;
        inicializarTotais();
    }

    private void inicializarTotais() {
        mapTotais.put(TOTAL_BC_IBS_CBS, BigDecimal.ZERO);
        mapTotais.put(TOTAL_IBS_UF, BigDecimal.ZERO);
        mapTotais.put(TOTAL_IBS_MUN, BigDecimal.ZERO);
        mapTotais.put(TOTAL_CBS, BigDecimal.ZERO);
        mapTotais.put(TOTAL_DIFERIMENTO_IBS_UF, BigDecimal.ZERO);
        mapTotais.put(TOTAL_DIFERIMENTO_IBS_MUN, BigDecimal.ZERO);
        mapTotais.put(TOTAL_DIFERIMENTO_CBS, BigDecimal.ZERO);
    }

    public TTribCTe montaImposto(@NonNull String cclassTrib, @NonNull BigDecimal baseCalculo) throws CteException {
        return montaImposto(cclassTrib, baseCalculo, null);
    }

    public TTribCTe montaImposto(@NonNull String cclassTrib, @NonNull BigDecimal baseCalculo, String cclassTribRegular) throws CteException {
        filtraCClasstrib(cclassTrib, cclassTribRegular);
        validaClassTrib(cclassTrib);
        this.baseCalculo = baseCalculo;

        TTribCTe tribCTe = new TTribCTe();
        tribCTe.setCST(cstIbsCbs.getCst());
        tribCTe.setCClassTrib(classTribIbsCbs.getCClassTrib());

        if (deveMontarGrupoIBSCBS()) {
            tribCTe.setGIBSCBS(montarGrupoIBSCBS());
        }

        return tribCTe;
    }

    private boolean deveMontarGrupoIBSCBS() {
        return Boolean.TRUE.equals(cstIbsCbs.getIndIBSCBS())
               || Boolean.TRUE.equals(cstIbsCbs.getIndRedAliq())
               || Boolean.TRUE.equals(cstIbsCbs.getIndDif())
               || Boolean.TRUE.equals(cstIbsCbs.getIndTransfCred());
    }

    private TCIBS montarGrupoIBSCBS() {
        TCIBS gIBSCBS = new TCIBS();
        gIBSCBS.setVBC(getValor2Casas(baseCalculo));

        TCIBS.GIBSUF gIBSUF = criarGIBSUF();
        TCIBS.GIBSMun gIBSMun = criarGIBSMun();
        TCIBS.GCBS gCBS = criarGCBS();

        gIBSCBS.setGIBSUF(gIBSUF);
        gIBSCBS.setGIBSMun(gIBSMun);
        gIBSCBS.setGCBS(gCBS);
        gIBSCBS.setVIBS(getValor2Casas(
                new BigDecimal(gIBSUF.getVIBSUF()).add(new BigDecimal(gIBSMun.getVIBSMun()))));

        if (Boolean.TRUE.equals(classTribIbsCbs.getIndTribRegular())) {
            gIBSCBS.setGTribRegular(criarGTribRegular());
        }

        atualizarTotais(gIBSUF, gIBSMun, gCBS);
        return gIBSCBS;
    }

    private void atualizarTotais(TCIBS.GIBSUF gIBSUF, TCIBS.GIBSMun gIBSMun, TCIBS.GCBS gCBS) {
        mapTotais.merge(TOTAL_BC_IBS_CBS, baseCalculo, BigDecimal::add);
        mapTotais.merge(TOTAL_IBS_UF, new BigDecimal(gIBSUF.getVIBSUF()), BigDecimal::add);
        mapTotais.merge(TOTAL_IBS_MUN, new BigDecimal(gIBSMun.getVIBSMun()), BigDecimal::add);
        mapTotais.merge(TOTAL_CBS, new BigDecimal(gCBS.getVCBS()), BigDecimal::add);
        if(gIBSUF.getGDif() != null){
            mapTotais.merge(TOTAL_DIFERIMENTO_IBS_UF, new BigDecimal(gIBSUF.getGDif().getVDif()), BigDecimal::add);
        }
        if(gIBSMun.getGDif() != null){
            mapTotais.merge(TOTAL_DIFERIMENTO_IBS_MUN, new BigDecimal(gIBSMun.getGDif().getVDif()), BigDecimal::add);
        }
        if(gCBS.getGDif() != null){
            mapTotais.merge(TOTAL_DIFERIMENTO_CBS, new BigDecimal(gCBS.getGDif().getVDif()), BigDecimal::add);
        }
    }

    private void filtraCClasstrib(String cclassTrib, String cclassTribRegular) {
        buscarCstEClassificacao(cclassTrib).ifPresent(entry -> {
            cstIbsCbs = entry.getKey();
            classTribIbsCbs = entry.getValue();
        });

        if (cclassTribRegular != null && !cclassTribRegular.isEmpty()) {
            buscarCstEClassificacao(cclassTribRegular).ifPresent(entry -> {
                cstIbsCbsTribRegular = entry.getKey();
                classTribIbsCbsTribRegular = entry.getValue();
            });
        }
    }

    private Optional<AbstractMap.SimpleEntry<CstDTO, ClassificacaoTributariaDTO>> buscarCstEClassificacao(String cclassTrib) {
        return listaCstIbsCbs.stream()
                .flatMap(cst -> cst.getClassificacoesTributarias().stream()
                        .map(classTrib -> new AbstractMap.SimpleEntry<>(cst, classTrib)))
                .filter(entry -> entry.getValue().getCClassTrib().equals(cclassTrib))
                .findFirst();
    }

    private void validaClassTrib(String cclassTrib) throws CteException {
        if (classTribIbsCbs == null) {
            throw new CteException("CClassTrib inválido ou não encontrado: " + cclassTrib);
        }

        if (documento.equals(DocumentoCteEnum.CTE) && Boolean.FALSE.equals(classTribIbsCbs.getIndCTe())) {
            throw new CteException("CClassTrib não pode ser utilizado para CTe: " + cclassTrib);
        }

        if (documento.equals(DocumentoCteEnum.CTE_OS) && Boolean.FALSE.equals(classTribIbsCbs.getIndCTeOS())) {
            throw new CteException("CClassTrib não pode ser utilizado para CTe OS: " + cclassTrib);
        }

        if (Boolean.TRUE.equals(classTribIbsCbs.getIndTribRegular()) && classTribIbsCbsTribRegular == null) {
            throw new CteException("Obrigatório informar Tributação Regular para CClassTrib: " + cclassTrib);
        }
    }

    private TCIBS.GIBSUF criarGIBSUF() {
        return criarGrupoImposto(
                pAliqIbsUf,
                pAliqDiferimento,
                classTribIbsCbs.getPRedIBS(),
                TCIBS.GIBSUF::new,
                TCIBS.GIBSUF::setPIBSUF,
                TCIBS.GIBSUF::setGDif,
                TCIBS.GIBSUF::setGRed,
                TCIBS.GIBSUF::setVIBSUF
        );
    }

    private TCIBS.GIBSMun criarGIBSMun() {
        return criarGrupoImposto(
                pAliqIbsMun,
                pAliqDiferimento,
                classTribIbsCbs.getPRedIBS(),
                TCIBS.GIBSMun::new,
                TCIBS.GIBSMun::setPIBSMun,
                TCIBS.GIBSMun::setGDif,
                TCIBS.GIBSMun::setGRed,
                TCIBS.GIBSMun::setVIBSMun
        );
    }

    private TCIBS.GCBS criarGCBS() {
        return criarGrupoImposto(
                pAliqCbs,
                pAliqDiferimento,
                classTribIbsCbs.getPRedCBS(),
                TCIBS.GCBS::new,
                TCIBS.GCBS::setPCBS,
                TCIBS.GCBS::setGDif,
                TCIBS.GCBS::setGRed,
                TCIBS.GCBS::setVCBS
        );
    }

    @FunctionalInterface
    private interface GrupoImpostoFactory<T> {
        T create();
    }

    @FunctionalInterface
    private interface AliquotaSetter<T> {
        void set(T grupo, String valor);
    }

    @FunctionalInterface
    private interface RedutorSetter<T> {
        void set(T grupo, TRed redutor);
    }

    @FunctionalInterface
    private interface DifererimentoSetter<T> {
        void set(T grupo, TDif diferimento);
    }

    @FunctionalInterface
    private interface ValorSetter<T> {
        void set(T grupo, String valor);
    }

    private <T> T criarGrupoImposto(
            BigDecimal aliqPadrao,
            BigDecimal percentualDiferimento,
            BigDecimal percentualReducao,
            GrupoImpostoFactory<T> factory,
            AliquotaSetter<T> aliqSetter,
            DifererimentoSetter<T> difSetter,
            RedutorSetter<T> redSetter,
            ValorSetter<T> valorSetter) {

        T grupo = factory.create();
        BigDecimal aliq = Boolean.TRUE.equals(classTribIbsCbs.getIndTribRegular())
                ? BigDecimal.ZERO
                : getOrZero(aliqPadrao);

        aliqSetter.set(grupo, getValor4Casas(aliq));

        BigDecimal aliqEfet = aliq;

        if (Boolean.TRUE.equals(cstIbsCbs.getIndRedAliq())) {
            BigDecimal percentRed = getOrZero(percentualReducao);
            TRed gRed = criarRedutor(percentRed, aliq);
            redSetter.set(grupo, gRed);
            aliqEfet = new BigDecimal(gRed.getPAliqEfet());
        }

        BigDecimal valor = calcularValorImposto(aliqEfet);

        if (Boolean.TRUE.equals(cstIbsCbs.getIndDif())) {
            BigDecimal percentDif = getOrZero(percentualDiferimento);
            TDif gDif = criarDiferimento(percentDif, aliqEfet);
            difSetter.set(grupo, gDif);
            valor = valor.subtract(new BigDecimal(gDif.getVDif()));
        }

        valorSetter.set(grupo, getValor2Casas(valor));

        return grupo;
    }

    private BigDecimal calcularValorImposto(BigDecimal aliquota) {
        return baseCalculo.multiply(aliquota.divide(CEM, SCALE_5, RoundingMode.HALF_UP));
    }

    private TTribRegular criarGTribRegular() {
        TTribRegular gTribRegular = new TTribRegular();
        gTribRegular.setCSTReg(cstIbsCbsTribRegular.getCst());
        gTribRegular.setCClassTribReg(classTribIbsCbsTribRegular.getCClassTrib());

        configurarTributoRegular(gTribRegular, pAliqIbsUf,
                TTribRegular::setPAliqEfetRegIBSUF, TTribRegular::setVTribRegIBSUF);
        configurarTributoRegular(gTribRegular, pAliqIbsMun,
                TTribRegular::setPAliqEfetRegIBSMun, TTribRegular::setVTribRegIBSMun);
        configurarTributoRegular(gTribRegular, pAliqCbs,
                TTribRegular::setPAliqEfetRegCBS, TTribRegular::setVTribRegCBS);

        return gTribRegular;
    }

    private void configurarTributoRegular(
            TTribRegular gTribRegular,
            BigDecimal aliquota,
            java.util.function.BiConsumer<TTribRegular, String> aliqSetter,
            java.util.function.BiConsumer<TTribRegular, String> valorSetter) {

        BigDecimal pAliqEfet = getOrZero(aliquota);
        aliqSetter.accept(gTribRegular, getValor4Casas(pAliqEfet));
        valorSetter.accept(gTribRegular, getValor2Casas(calcularValorImposto(pAliqEfet)));
    }

    private static TRed criarRedutor(BigDecimal percentualReducao, BigDecimal aliqOriginal) {
        TRed gRed = new TRed();
        gRed.setPRedAliq(getValor4Casas(percentualReducao));

        BigDecimal aliqEfet = aliqOriginal.multiply(
                BigDecimal.ONE.subtract(percentualReducao.divide(BigDecimal.valueOf(100), 5, RoundingMode.HALF_UP)));
        gRed.setPAliqEfet(getValor4Casas(aliqEfet));

        return gRed;
    }

    private TDif criarDiferimento(BigDecimal percentualDiferimento, BigDecimal aliqEfet) {
        TDif gDif = new TDif();
        gDif.setPDif(getValor4Casas(percentualDiferimento));
        BigDecimal valorDif = calcularValorImposto(percentualDiferimento).multiply(aliqEfet.divide(CEM, SCALE_5, RoundingMode.HALF_UP));
        gDif.setVDif(getValor2Casas(valorDif));
        return gDif;
    }

    private static BigDecimal getOrZero(BigDecimal value) {
        return value == null ? BigDecimal.ZERO : value;
    }

    private static String getValor2Casas(BigDecimal value) {
        return (value == null ? BigDecimal.ZERO : value).setScale(2, RoundingMode.HALF_UP).toPlainString();
    }

    private static String getValor4Casas(BigDecimal value) {
        return (value == null ? BigDecimal.ZERO : value).setScale(4, RoundingMode.HALF_UP).toPlainString();
    }

    public BigDecimal calculaVTPrestTot(String vTPrest) {
        return new BigDecimal(vTPrest)
                .add(mapTotais.getOrDefault(TOTAL_IBS_UF, BigDecimal.ZERO))
                .add(mapTotais.getOrDefault(TOTAL_IBS_MUN, BigDecimal.ZERO))
                .add(mapTotais.getOrDefault(TOTAL_CBS, BigDecimal.ZERO));
    }

    public TIBSCBSTot preencheTotaisIbsCbs() {
        TIBSCBSTot totalIbsCbs = new TIBSCBSTot();
        totalIbsCbs.setVBCIBSCBS(getValor2Casas(mapTotais.getOrDefault(TOTAL_BC_IBS_CBS, BigDecimal.ZERO)));
        totalIbsCbs.setGIBS(criarTotaisIBS());
        totalIbsCbs.setGCBS(criarTotaisCBS());
        return totalIbsCbs;
    }

    private TIBSCBSTot.GIBS criarTotaisIBS() {
        TIBSCBSTot.GIBS gIbs = new TIBSCBSTot.GIBS();
        gIbs.setGIBSUF(criarGIBSUFTotal());
        gIbs.setGIBSMun(criarGIBSMunTotal());

        BigDecimal totalIBS = mapTotais.getOrDefault(TOTAL_IBS_UF, BigDecimal.ZERO)
                .add(mapTotais.getOrDefault(TOTAL_IBS_MUN, BigDecimal.ZERO));
        gIbs.setVIBS(getValor2Casas(totalIBS));

        return gIbs;
    }

    private TIBSCBSTot.GIBS.GIBSUF criarGIBSUFTotal() {
        TIBSCBSTot.GIBS.GIBSUF gIbsUF = new TIBSCBSTot.GIBS.GIBSUF();
        gIbsUF.setVDif(getValor2Casas(mapTotais.getOrDefault(TOTAL_DIFERIMENTO_IBS_UF, BigDecimal.ZERO)));
        gIbsUF.setVDevTrib("0.00");
        gIbsUF.setVIBSUF(getValor2Casas(mapTotais.getOrDefault(TOTAL_IBS_UF, BigDecimal.ZERO)));
        return gIbsUF;
    }

    private TIBSCBSTot.GIBS.GIBSMun criarGIBSMunTotal() {
        TIBSCBSTot.GIBS.GIBSMun gIbsMun = new TIBSCBSTot.GIBS.GIBSMun();
        gIbsMun.setVDif(getValor2Casas(mapTotais.getOrDefault(TOTAL_DIFERIMENTO_IBS_MUN, BigDecimal.ZERO)));
        gIbsMun.setVDevTrib("0.00");
        gIbsMun.setVIBSMun(getValor2Casas(mapTotais.getOrDefault(TOTAL_IBS_MUN, BigDecimal.ZERO)));
        return gIbsMun;
    }

    private TIBSCBSTot.GCBS criarTotaisCBS() {
        TIBSCBSTot.GCBS gCbs = new TIBSCBSTot.GCBS();
        gCbs.setVDif(getValor2Casas(mapTotais.getOrDefault(TOTAL_DIFERIMENTO_CBS, BigDecimal.ZERO)));
        gCbs.setVDevTrib("0.00");
        gCbs.setVCBS(getValor2Casas(mapTotais.getOrDefault(TOTAL_CBS, BigDecimal.ZERO)));
        return gCbs;
    }
}
