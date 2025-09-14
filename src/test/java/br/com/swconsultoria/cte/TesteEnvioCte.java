/**
 *
 */
package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.StatusCteEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.cte.*;
import br.com.swconsultoria.cte.schema_400.cteModalRodoviario.Rodo;
import br.com.swconsultoria.cte.util.ChaveUtil;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import lombok.extern.java.Log;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.logging.Level;

/**
 * @author Samuel Oliveira
 */
@Log
class TesteEnvioCte {

    public static void main(String[] args) {

        try {
            ConfiguracoesCte config = TesteConfig.iniciaConfiguracoes(EstadosEnum.GO, AmbienteEnum.HOMOLOGACAO);

            String cnpj = "10732644000128";
            int serie = 3;
            int numero = 6;

            TCTe cte = preencheObjetoCte(config, cnpj, serie, numero);


            // MOnta e Assina o XML
            cte = Cte.montaCte(config, cte, true);

            //Adiciona QRCode
            TCTe.InfCTeSupl infCTeSupl = new TCTe.InfCTeSupl();
            infCTeSupl.setQrCodCTe(ObjetoCTeUtil.criaQRCode(
                    cte.getInfCte().getId().substring(3),
                    config));
            cte.setInfCTeSupl(infCTeSupl);

            // Envia a Cte para a Sefaz
            TRetCTe retorno = Cte.enviarCte(config, cte);

            log.info("Status: " + retorno.getCStat() + " - " + retorno.getXMotivo());

            if (retorno.getCStat().equals(StatusCteEnum.AUTORIZADO.getCodigo())) {
                log.info("Protocolo: " + retorno.getProtCTe().getInfProt().getNProt());
                log.info("XML Final: " + XmlCteUtil.criaCteProc(cte, retorno.getProtCTe()));
            }

        } catch (Exception e) {
            log.log(Level.SEVERE, "Erro ao enviar Cte", e);
        }

    }

    private static TCTe preencheObjetoCte(ConfiguracoesCte config, String cnpj, int serie, int numero) throws CteException {
        TCTe cte = new TCTe();

        String tipoEmissao = "1";
        String cct = String.format("%08d", new Random().nextInt(99999999));
        String modelo = "57";
        // Substitua X Pela Chave
        ChaveUtil chaveUtil = new ChaveUtil(config.getEstado(),
                cnpj, modelo, serie, numero,
                tipoEmissao, cct, LocalDateTime.now());

        String chave = chaveUtil.getChaveCT();

        TCTe.InfCte infCTe = new TCTe.InfCte();
        infCTe.setId(chave);
        infCTe.setVersao(ConstantesCte.VERSAO.CTE);

        TCTe.InfCte.Ide ide = new TCTe.InfCte.Ide();
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
        ide.setTpCTe("0");
        ide.setProcEmi("0");
        ide.setVerProc("1.0");
        ide.setCMunEnv("5219753");
        ide.setXMunEnv("Anapolis");
        ide.setUFEnv(TUf.valueOf("GO"));
        ide.setModal("01");
        ide.setTpServ("0");
        ide.setCMunIni("5219753");
        ide.setXMunIni("Anapolis");
        ide.setUFIni(TUf.valueOf("GO"));
        ide.setCMunFim("5219753");
        ide.setXMunFim("Anapolis");
        ide.setUFFim(TUf.valueOf("GO"));
        ide.setRetira("1");
        ide.setIndIEToma("1");

        TCTe.InfCte.Ide.Toma3 toma3 = new TCTe.InfCte.Ide.Toma3();
        toma3.setToma("3");
        ide.setToma3(toma3);
        infCTe.setIde(ide);

        TCTe.InfCte.Compl compl = new TCTe.InfCte.Compl();
        compl.setXObs("FORMA DE PAGAMENTO DEPOSITO BANCARIO,FAVOR ENVIAR COPIA DO COMPROVANTE PARA O TRANSPORTADOR E ANEXAR VIA A DA CONTABILIDADE");
        infCTe.setCompl(compl);

        TCTe.InfCte.Emit emit = new TCTe.InfCte.Emit();
        emit.setCNPJ(cnpj);
        emit.setIE("104519304");
        emit.setXNome("TESTE");
        emit.setXFant("TESTE");
        emit.setCRT("3");

        TEndeEmi enderEmit = new TEndeEmi();
        enderEmit.setXLgr("AV SANTO ANTONIO & CIA");
        enderEmit.setNro("0");
        enderEmit.setXCpl("QD 17 LT 01-02-03");
        enderEmit.setXBairro("PQ STO ANTONIO");
        enderEmit.setCMun("5219753");
        enderEmit.setXMun("SANTO ANTONIO DO DESCOBERTO");
        enderEmit.setUF(TUFSemEX.valueOf("GO"));
        enderEmit.setCEP("72900000");
        enderEmit.setFone("6233215175");

        emit.setEnderEmit(enderEmit);
        infCTe.setEmit(emit);

        TCTe.InfCte.Rem rem = new TCTe.InfCte.Rem();
        rem.setCNPJ("02116946000143");
        rem.setIE("47233579");
        rem.setXNome("CTE EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
        rem.setEmail("samuel@autocomsistemas.com.br");

        TEndereco enderRem = new TEndereco();
        enderRem.setXLgr("Rua: Teste");
        enderRem.setNro("0");
        enderRem.setXBairro("TESTE");
        enderRem.setCMun("2910800");
        enderRem.setXMun("SANTO ANTONIO DO DESCOBERTO");
        enderRem.setUF(TUf.BA);
        enderRem.setCEP("44079002");
        enderRem.setCPais("1058");
        enderRem.setXPais("Brasil");
        rem.setEnderReme(enderRem);
        infCTe.setRem(rem);

        TCTe.InfCte.Dest dest = new TCTe.InfCte.Dest();
        dest.setCNPJ("04737552003749");
        dest.setIE("2231523813408");
        dest.setXNome("CTE EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
        dest.setEmail("samuel@autocomsistemas.com.br");

        TEndereco enderDest = new TEndereco();
        enderDest.setXLgr("Rua: Teste");
        enderDest.setNro("0");
        enderDest.setXBairro("TESTE");
        enderDest.setCMun("3122306");
        enderDest.setXMun("SANTO ANTONIO DO DESCOBERTO");
        enderDest.setUF(TUf.MG);
        enderDest.setCEP("75120683");
        enderDest.setCPais("1058");
        enderDest.setXPais("Brasil");
        dest.setEnderDest(enderDest);
        infCTe.setDest(dest);

        TCTe.InfCte.VPrest prest = new TCTe.InfCte.VPrest();
        prest.setVTPrest("410.00");
        prest.setVRec("410.00");

        TCTe.InfCte.VPrest.Comp comp = new TCTe.InfCte.VPrest.Comp();
        comp.setVComp("500.00");
        comp.setXNome("TESTE");
        prest.getComp().add(comp);
        infCTe.setVPrest(prest);

        TCTe.InfCte.Imp imp = new TCTe.InfCte.Imp();

        TImp icms = new TImp();

        TImp.ICMS45 icms45 = new TImp.ICMS45();
        icms45.setCST("40");
        icms45.setCBenef("SC850001");
        icms45.setVICMSDeson("0");
        icms.setICMS45(icms45);

        imp.setICMS(icms);
        infCTe.setImp(imp);

        TCTe.InfCte.InfCTeNorm infCTeNorm = new TCTe.InfCte.InfCTeNorm();

        TCTe.InfCte.InfCTeNorm.InfCarga infCarga = new TCTe.InfCte.InfCTeNorm.InfCarga();
        infCarga.setVCarga("29100.00");
        infCarga.setProPred("OLEO DIESEL");

        TCTe.InfCte.InfCTeNorm.InfCarga.InfQ infQ = new TCTe.InfCte.InfCTeNorm.InfCarga.InfQ();
        infQ.setCUnid("04");
        infQ.setTpMed("LT");
        infQ.setQCarga("10000.0000");
        infCarga.getInfQ().add(infQ);

        TCTe.InfCte.InfCTeNorm.InfDoc infDoc = new TCTe.InfCte.InfCTeNorm.InfDoc();

        TCTe.InfCte.InfCTeNorm.InfDoc.InfNFe infNFe = new TCTe.InfCte.InfCTeNorm.InfDoc.InfNFe();
        infNFe.setChave("52250910732644000128550010000927521413308064");
        infDoc.getInfNFe().add(infNFe);

        TCTe.InfCte.InfCTeNorm.InfModal infModal = new TCTe.InfCte.InfCTeNorm.InfModal();
        infModal.setVersaoModal(ConstantesCte.VERSAO.CTE);

        Rodo rodo = new Rodo();
        rodo.setRNTRC("47008950");

        infModal.setAny(ObjetoCTeUtil.objectToElement(rodo, Rodo.class, "rodo"));

        infCTeNorm.setInfCarga(infCarga);
        infCTeNorm.setInfDoc(infDoc);
        infCTeNorm.setInfModal(infModal);

        infCTe.setInfCTeNorm(infCTeNorm);

        cte.setInfCte(infCTe);
        return cte;
    }

}