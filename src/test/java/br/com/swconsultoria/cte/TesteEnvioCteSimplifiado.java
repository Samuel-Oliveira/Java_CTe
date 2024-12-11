/**
 *
 */
package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.StatusCteEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.cteModalRodoviario.Rodo;
import br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp;
import br.com.swconsultoria.cte.schema_400.cteSimp.TRetCTeSimp;
import br.com.swconsultoria.cte.util.ChaveUtil;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import lombok.extern.java.Log;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.logging.Level;

/**
 * @author Ismael Luan Lawrenz
 */
@Log
class TesteEnvioCteSimplifiado {

    public static void main(String[] args) {

        try {
            ConfiguracoesCte config = TesteConfig.iniciaConfiguracoes(EstadosEnum.SC, AmbienteEnum.HOMOLOGACAO);

            //TODO: Preencher com o cnpj do emissor
            String cnpj = "25149469000118";
            int serie = 4;
            int numero = 23;

            TCTeSimp cte = preencheObjetoCte(config, cnpj, serie, numero);


            // Monta e Assina o XML
            cte = Cte.montaCteSimp(config, cte, true);

            //Adiciona QRCode
            TCTeSimp.InfCTeSupl infCTeSupl = new TCTeSimp.InfCTeSupl();
            infCTeSupl.setQrCodCTe(ObjetoCTeUtil.criaQRCode(
                    cte.getInfCte().getId().substring(3),
                    config));
            cte.setInfCTeSupl(infCTeSupl);

            // Envia a Cte para a Sefaz
            TRetCTeSimp retorno = Cte.enviarCteSimp(config, cte);

            log.info("Status: " + retorno.getCStat() + " - " + retorno.getXMotivo());

            if (retorno.getCStat().equals(StatusCteEnum.AUTORIZADO.getCodigo())) {
                log.info("Protocolo: " + retorno.getProtCTe().getInfProt().getNProt());
                log.info("XML Final: " + XmlCteUtil.criaCteSimpProc(cte, retorno.getProtCTe()));
            }

        } catch (Exception e) {
            log.log(Level.SEVERE, "Erro ao enviar Cte", e);
        }

    }

    private static TCTeSimp preencheObjetoCte(ConfiguracoesCte config, String cnpj, int serie, int numero) throws CteException {
        TCTeSimp cte = new TCTeSimp();


        String tipoEmissao = "1";
        String cct = String.format("%08d", new Random().nextInt(99999999));
        String modelo = "57";

        ChaveUtil chaveUtil = new ChaveUtil(config.getEstado(),
                cnpj, modelo, serie, numero,
                tipoEmissao, cct, LocalDateTime.now());

        String chave = chaveUtil.getChaveCT();

        br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte infCTe = new br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte();
        infCTe.setId(chave);
        infCTe.setVersao(ConstantesCte.VERSAO.CTE);

        br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.Ide ide = new br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.Ide();
        ide.setCUF(config.getEstado().getCodigoUF());
        ide.setCCT(cct);
        ide.setCFOP("5351");
        ide.setNatOp("TRANSPORTE INTERNO");
        ide.setMod(modelo);
        ide.setSerie(String.valueOf(serie));
        ide.setNCT(String.valueOf(numero));
        ide.setDhEmi(XmlCteUtil.dataCte(LocalDateTime.now()));
        ide.setTpImp("1");
        ide.setTpEmis(tipoEmissao);
        ide.setCDV(chaveUtil.getDigitoVerificador());
        ide.setTpAmb(config.getAmbiente().getCodigo());
        ide.setTpCTe("5");
        ide.setProcEmi("0");
        ide.setVerProc("1.0");
        ide.setCMunEnv("4204301");
        ide.setXMunEnv("Concordia");
        ide.setUFEnv(br.com.swconsultoria.cte.schema_400.cteSimp.TUf.valueOf("SC"));
        ide.setModal("01");
        ide.setTpServ("0");
        ide.setUFIni(br.com.swconsultoria.cte.schema_400.cteSimp.TUf.valueOf("SC"));
        ide.setUFFim(br.com.swconsultoria.cte.schema_400.cteSimp.TUf.valueOf("SC"));
        ide.setRetira("1");
        infCTe.setIde(ide);


        br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.Compl compl = new br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.Compl();
        compl.setXObs("FORMA DE PAGAMENTO DEPOSITO BANCARIO,FAVOR ENVIAR COPIA DO COMPROVANTE PARA O TRANSPORTADOR E ANEXAR VIA A DA CONTABILIDADE");
        infCTe.setCompl(compl);

        br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.Emit emit = new br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.Emit();
        emit.setCNPJ(cnpj);
        emit.setIE("251803082");
        emit.setXNome("TESTE");
        emit.setXFant("TESTE");
        emit.setCRT("3");

        br.com.swconsultoria.cte.schema_400.cteSimp.TEndeEmi enderEmit = new br.com.swconsultoria.cte.schema_400.cteSimp.TEndeEmi();
        enderEmit.setXLgr("AV SANTO ANTONIO & CIA");
        enderEmit.setNro("0");
        enderEmit.setXCpl("QD 17 LT 01-02-03");
        enderEmit.setXBairro("PQ STO ANTONIO");
        enderEmit.setCMun("4204301");
        enderEmit.setXMun("Concordia");
        enderEmit.setUF(br.com.swconsultoria.cte.schema_400.cteSimp.TUFSemEX.valueOf("SC"));
        enderEmit.setCEP("72900000");
        enderEmit.setFone("6233215175");

        emit.setEnderEmit(enderEmit);
        infCTe.setEmit(emit);

        TCTeSimp.InfCte.Toma toma = new TCTeSimp.InfCte.Toma();
        toma.setToma("0");
        toma.setCNPJ("83011247002346");
        toma.setIndIEToma("1");
        toma.setIE("254804438");
        toma.setXNome("CTE EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
        toma.setEmail("teste@teste.com.br");
        br.com.swconsultoria.cte.schema_400.cteSimp.TEndereco enderToma = new br.com.swconsultoria.cte.schema_400.cteSimp.TEndereco();
        enderToma.setXLgr("Rua: Teste");
        enderToma.setNro("0");
        enderToma.setXBairro("TESTE");
        enderToma.setCMun("4204301");
        enderToma.setXMun("SANTO ANTONIO DO DESCOBERTO");
        enderToma.setUF(br.com.swconsultoria.cte.schema_400.cteSimp.TUf.SC);
        enderToma.setCEP("44079002");
        enderToma.setCPais("1058");
        enderToma.setXPais("Brasil");
        toma.setEnderToma(enderToma);
        infCTe.setToma(toma);

        TCTeSimp.InfCte.InfCarga infCarga = new TCTeSimp.InfCte.InfCarga();
        infCarga.setVCarga("1.00");
        infCarga.setProPred("TESTE");
        TCTeSimp.InfCte.InfCarga.InfQ infQ = new TCTeSimp.InfCte.InfCarga.InfQ();
        infQ.setCUnid("04");
        infQ.setTpMed("07");
        infQ.setQCarga("10000.0000");
        infCarga.getInfQ().add(infQ);
        infCTe.setInfCarga(infCarga);

        TCTeSimp.InfCte.Det det = new TCTeSimp.InfCte.Det();
        det.setNItem("1");
        det.setCMunIni("4204301");
        det.setXMunIni("Concórdia");
        det.setCMunFim("4204301");
        det.setXMunFim("Concórdia");
        det.setVPrest("1.00");
        det.setVRec("1.00");


        br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.Det.Comp comp = new br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.Det.Comp();
        comp.setVComp("500.00");
        comp.setXNome("TESTE");

        det.getComp().add(comp);

        TCTeSimp.InfCte.Det.InfNFe infNFe = new TCTeSimp.InfCte.Det.InfNFe();
        infNFe.setChNFe("42241083011247002346550080018136131182627760");
        det.getInfNFe().add(infNFe);
        infCTe.getDet().add(det);

        br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.InfModal infModal = new br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.InfModal();
        infModal.setVersaoModal(ConstantesCte.VERSAO.CTE);
        Rodo rodo = new Rodo();
        rodo.setRNTRC("47008950");
        infModal.setAny(ObjetoCTeUtil.objectToElement(rodo, Rodo.class, "rodo"));
        infCTe.setInfModal(infModal);


        br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.Imp imp = new br.com.swconsultoria.cte.schema_400.cteSimp.TCTeSimp.InfCte.Imp();

        br.com.swconsultoria.cte.schema_400.cteSimp.TImp icms = new br.com.swconsultoria.cte.schema_400.cteSimp.TImp();

        br.com.swconsultoria.cte.schema_400.cteSimp.TImp.ICMS45 icms45 = new br.com.swconsultoria.cte.schema_400.cteSimp.TImp.ICMS45();
        icms45.setCST("40");
        icms45.setCBenef("SC850001");
        icms45.setVICMSDeson("0");
        icms.setICMS45(icms45);

        imp.setICMS(icms);

        TCTeSimp.InfCte.Total total = new TCTeSimp.InfCte.Total();
        total.setVTPrest("1.00");
        total.setVTRec("1.00");

        infCTe.setTotal(total);
        infCTe.setImp(imp);

        cte.setInfCte(infCTe);
        return cte;
    }

}