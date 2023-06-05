package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.Cte;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.StatusCteEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.consSitCTe.TRetConsSitCTe;
import br.com.swconsultoria.cte.schema_300.cte.TProtCTe;
import br.com.swconsultoria.cte.schema_300.cte.TRetCTe;
import br.com.swconsultoria.cte.schema_300.cteModalRodoviario.Rodo;
import br.com.swconsultoria.cte.schema_300.enviCTe.TCTe;
import br.com.swconsultoria.cte.schema_300.enviCTe.TEnviCTe;
import br.com.swconsultoria.cte.schema_300.evCCeCTe.EvCCeCTe;
import br.com.swconsultoria.cte.schema_300.evCancCTe.EvCancCTe;
import br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento;
import br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento;
import br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento;
import br.com.swconsultoria.cte.schema_300.procCTe.TRetConsReciCTe;
import br.com.swconsultoria.cte.schema_300.retConsStatServCTe.TRetConsStatServ;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TRetEnviCTe;
import br.com.swconsultoria.cte.util.ChaveUtil;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.certificado.Certificado;
import br.com.swconsultoria.certificado.CertificadoService;
import br.com.swconsultoria.certificado.exception.CertificadoException;
import br.com.swconsultoria.cte.Cte;

import br.com.swconsultoria.cte.exception.CteException;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Random;

import javax.xml.bind.JAXBException;

/**
 * @author Samuel Oliveira
 */
public class Teste {

    public static void main(String[] args) throws FileNotFoundException, CertificadoException {
    	Certificado certificado =      CertificadoService.certificadoPfx("D:\\simetris\\emissao\\lazarin.pfx",  "");
      	ConfiguracoesCte config =  ConfiguracoesCte.criarConfiguracoes(EstadosEnum.SC, AmbienteEnum.HOMOLOGACAO, certificado, "C:\\Users\\progr\\Downloads\\PL_CTe_400");
         
    	//autorizar(config);
    	//cancelar();
    	//cartaCorrecao(config);
  //consultar(config);
      status(config);

    }

    public static void status(ConfiguracoesCte config)  {
    	  
    	try {
          TRetConsStatServ retorno;
		
			retorno = Cte.statusServico(config);
		
          System.out.println("Status:" + retorno.getCStat());
          System.out.println("Motivo:" + retorno.getXMotivo());
          System.out.println("Data:" + retorno.getDhRecbto());

    	} catch (CteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

          
    }
    
    public static void consultar(ConfiguracoesCte config) {
    	try {
    		//Veja https://github.com/Samuel-Oliveira/Java_CTe/wiki/Configura%C3%A7%C3%B5es-CTe
            

            String chave = "42230679945705000131570010000147491442496045"; // TODO Preencha A Chave

            br.com.swconsultoria.cte.schema_300.retConsSitCTe.TRetConsSitCTe retorno = Cte.consultaXml(config,chave);

    		System.out.println("Status:" + retorno.getCStat());
    		System.out.println("Motivo:" + retorno.getXMotivo());

    		// Transforma O ProtCte do Retorno em XML
    		String infProt = ObjetoCTeUtil.elementToString(retorno.getProtCTe().getAny());
    		TProtCTe tProtCTe = new TProtCTe();
    		tProtCTe.setVersao(retorno.getProtCTe().getVersao());
    		tProtCTe.setInfProt( XmlCteUtil.xmlToObject(infProt, TProtCTe.InfProt.class));

    		

    	} catch (CteException  e) {
    		System.out.println("Erro:" + e.getMessage());
    	}

    }
    
    public static void cartaCorrecao(ConfiguracoesCte config) {
    	 try {
    		 
    	        String chave = "42230679945705000131570010000147491442496045"; // TODO Preencha a Chave
    	        String numeroSeqEvento = "002"; // TODO Preencha o NUmero Sequencial com 2 Digitos e Zero a esquerda
    	        String id = "ID" + "110110" + chave + numeroSeqEvento;
    	        String cnpj = "79945705000131"; // TODO Preencha o Cnpj

    	        br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento enviEvento = new br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento();
    	        enviEvento.setVersao(ConstantesCte.VERSAO.CTE);

    	        br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento.InfEvento infoEvento = new br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento.InfEvento();
    	        infoEvento.setId(id);
    	        infoEvento.setCOrgao(config.getEstado().getCodigoUF());
    	        infoEvento.setTpAmb(config.getAmbiente().getCodigo());
    	        infoEvento.setCNPJ(cnpj);
    	        infoEvento.setChCTe(chave);
    	        infoEvento.setDhEvento(XmlCteUtil.dataCte(LocalDateTime.now()));
    	        infoEvento.setTpEvento("110110");
    	        infoEvento.setNSeqEvento(Integer.valueOf(numeroSeqEvento).toString());

    	        br.com.swconsultoria.cte.schema_300.evCCeCTe.EvCCeCTe eventoCCe = new br.com.swconsultoria.cte.schema_300.evCCeCTe.EvCCeCTe();
    	        eventoCCe.setDescEvento("Carta de Correcao");
    	        eventoCCe.setXCondUso("A Carta de Correcao e disciplinada pelo Art. 58-B do CONVENIO/SINIEF 06/89: Fica permitida a utilizacao de carta de correcao, para regularizacao de erro ocorrido na emissao de documentos fiscais relativos a prestacao de servico de transporte, desde que o erro nao esteja relacionado com: I - as variaveis que determinam o valor do imposto tais como: base de calculo, aliquota, diferenca de preco, quantidade, valor da prestacao;II - a correcao de dados cadastrais que implique mudanca do emitente, tomador, remetente ou do destinatario;III - a data de emissao ou de saida.");

    	        br.com.swconsultoria.cte.schema_300.evCCeCTe.EvCCeCTe.InfCorrecao infCorrecao = new EvCCeCTe.InfCorrecao();
    	        infCorrecao.setGrupoAlterado("enderReme"); // TODO Preencha
    	        infCorrecao.setCampoAlterado("nro"); // TODO Preencha
    	        infCorrecao.setValorAlterado("1234"); // TODO Preencha
    	        eventoCCe.getInfCorrecao().add(infCorrecao);

    	        br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento.InfEvento.DetEvento detEvento = new br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento.InfEvento.DetEvento();
    	        detEvento.setVersaoEvento(ConstantesCte.VERSAO.CTE);
    	        detEvento.setAny(ObjetoCTeUtil.objectToElement(eventoCCe, EvCCeCTe.class, "evCCeCTe"));

    	        infoEvento.setDetEvento(detEvento);
    	        enviEvento.setInfEvento(infoEvento);

    	        br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento retorno = Cte.cceCte(config,enviEvento, true);

    	        if (!retorno.getInfEvento().getCStat().equals(StatusCteEnum.EVENTO_VINCULADO.getCodigo())) {
    	            System.out.println("Erro Status:" + retorno.getInfEvento().getCStat());
    	            System.out.println("Erro Motivo:" + retorno.getInfEvento().getXMotivo());
    	        } else {

    	            System.out.println("Status:" + retorno.getInfEvento().getCStat());
    	            System.out.println("Motivo:" + retorno.getInfEvento().getXMotivo());
    	            System.out.println("Data:" + retorno.getInfEvento().getDhRegEvento());

    	            // Cria TProcEventoCTe
    	            br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento procEvento = new br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento();
    	            procEvento.setVersao(ConstantesCte.VERSAO.CTE);
    	            procEvento.setEventoCTe(enviEvento);
    	            procEvento.setRetEventoCTe(retorno);

    	            System.out.println("Xml Final Carta de Correção Proc: " + XmlCteUtil.objectToXml(procEvento));
    	        }

    	    } catch (CteException | JAXBException e) {
    	        System.out.println("Erro:" + e.getMessage());
    	    }
    }
    
    
    public static void cancelar() {    
    	try {
    		
    		Certificado certificado =      CertificadoService.certificadoPfx("D:\\simetris\\emissao\\lazarin.pfx", "34422105");
         	ConfiguracoesCte config =  ConfiguracoesCte.criarConfiguracoes(EstadosEnum.SC, AmbienteEnum.HOMOLOGACAO, certificado, "C:\\Users\\progr\\Downloads\\PL_CTe_400");
            
    		
    		String chave = "42230679945705000131570010000147481259588150"; // TODO Preencha a Chave
    		String protocolo = "342230000122646"; // TODO Preencha o Protocolo
    		String cnpj = "79945705000131"; // TODO Preencha o Cnpj
    		String numeroSeqCancelamento = "001"; // TODO Preencha
    		String id = "ID"+  "110111" + chave + numeroSeqCancelamento;
    		String justificativa = "Teste de Cancelmento"; // TODO Preencha

    		TEvento enviEvento = new TEvento();
    		enviEvento.setVersao(ConstantesCte.VERSAO.CTE);

    		TEvento.InfEvento infoEvento = new TEvento.InfEvento();
    		infoEvento.setId(id);
    		infoEvento.setCOrgao(config.getEstado().getCodigoUF());
    		infoEvento.setTpAmb(config.getAmbiente().getCodigo());
    		infoEvento.setCNPJ(cnpj);
    		infoEvento.setChCTe(chave);
    		infoEvento.setDhEvento(XmlCteUtil.dataCte(LocalDateTime.now()));
    		infoEvento.setTpEvento("110111");
    		infoEvento.setNSeqEvento(Integer.valueOf(numeroSeqCancelamento).toString());

    		EvCancCTe eventoCancela = new EvCancCTe();
    		eventoCancela.setDescEvento("Cancelamento");
    		eventoCancela.setNProt(protocolo);
    		eventoCancela.setXJust(justificativa);

    		TEvento.InfEvento.DetEvento detEvento = new TEvento.InfEvento.DetEvento();
    		detEvento.setVersaoEvento(ConstantesCte.VERSAO.CTE);
    		detEvento.setAny(ObjetoCTeUtil.objectToElement(eventoCancela, EvCancCTe.class, "evCancCTe"));

    		infoEvento.setDetEvento(detEvento);
    		enviEvento.setInfEvento(infoEvento);

    		TRetEvento retorno = Cte.cancelarCte(config, enviEvento, false);

    		if(!retorno.getInfEvento().getCStat().equals(StatusCteEnum.EVENTO_VINCULADO.getCodigo())){

    			System.out.println("Erro Status:" + retorno.getInfEvento().getCStat());
    			System.out.println("Erro Motivo:" + retorno.getInfEvento().getXMotivo());

    		} else{

    			System.out.println("Status:" + retorno.getInfEvento().getCStat());
    			System.out.println("Motivo:" + retorno.getInfEvento().getXMotivo());
    			System.out.println("Data:" + retorno.getInfEvento().getDhRegEvento());

    			// Cria TProcEventoCTe
    			TProcEvento procEvento = new TProcEvento();
    			procEvento.setVersao(ConstantesCte.VERSAO.CTE);
    			procEvento.setEventoCTe(enviEvento);
    			procEvento.setRetEventoCTe(retorno);

    			System.out.println("Xml Final Cancelamento Proc: "+ XmlCteUtil.objectToXml(procEvento));
    		}

    	} catch (CteException | JAXBException | CertificadoException | FileNotFoundException e) {
    		System.out.println("Erro:" + e.getMessage());
    	}
    	
    }
    
    public static void autorizar(ConfiguracoesCte config) {
    	 try {
             
             String cnpj = "79945705000131"; //TODO Preencha o Cnpj
             String modelo = "57";
             int serie = 1;
             int numero = 14750;
             String tipoEmissao = "1";
             String cct = String.format("%08d", new Random().nextInt(99999999));

             // Inicia As Configurações

             TCTe cte = new TCTe();
             TCTe.InfCte infCTe = new TCTe.InfCte();

             // Substitua X Pela Chave
             ChaveUtil chaveUtil = new ChaveUtil(config.getEstado(),
                     cnpj, modelo, serie, numero,
                     tipoEmissao, cct, LocalDateTime.now());

             String chave = chaveUtil.getChaveCT();

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
             ide.setCMunEnv("4204301");
             ide.setXMunEnv("Anapolis");
             ide.setUFEnv(br.com.swconsultoria.cte.schema_300.enviCTe.TUf.valueOf("SC"));
             ide.setModal("01");
             ide.setTpServ("0");
             ide.setCMunIni("4204301");
             ide.setXMunIni("Anapolis");
             ide.setUFIni(br.com.swconsultoria.cte.schema_300.enviCTe.TUf.valueOf("SC"));
             ide.setCMunFim("4204301");
             ide.setXMunFim("Anapolis");
             ide.setUFFim(br.com.swconsultoria.cte.schema_300.enviCTe.TUf.valueOf("SC"));
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
             emit.setIE("251803082");
             emit.setXNome("TRC TRANSPORTES LTDA");
             emit.setXFant("TRC TRANSPORTES LTDA");
             emit.setCRT("1");

             br.com.swconsultoria.cte.schema_300.enviCTe.TEndeEmi enderEmit = new br.com.swconsultoria.cte.schema_300.enviCTe.TEndeEmi();
             enderEmit.setXLgr("AV SANTO ANTONIO & CIA");
             enderEmit.setNro("0");
             enderEmit.setXCpl("QD 17 LT 01-02-03");
             enderEmit.setXBairro("PQ STO ANTONIO");
             enderEmit.setCMun("4204301");
             enderEmit.setXMun("SANTO ANTONIO DO DESCOBERTO");
             enderEmit.setUF(br.com.swconsultoria.cte.schema_300.enviCTe.TUFSemEX.valueOf("SC"));
             enderEmit.setCEP("72900000");
             enderEmit.setFone("6233215175");

             emit.setEnderEmit(enderEmit);
             infCTe.setEmit(emit);

             TCTe.InfCte.Rem rem = new TCTe.InfCte.Rem();
             rem.setCNPJ("83568246000434");
             rem.setIE("253190525");
             rem.setXNome("CT-E EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
             rem.setEmail("samuel@autocomsistemas.com.br");

             br.com.swconsultoria.cte.schema_300.enviCTe.TEndereco enderRem = new br.com.swconsultoria.cte.schema_300.enviCTe.TEndereco();
             enderRem.setXLgr("Rua: Teste");
             enderRem.setNro("0");
             enderRem.setXBairro("TESTE");
             enderRem.setCMun("4204301");
             enderRem.setXMun("SANTO ANTONIO DO DESCOBERTO");
             enderRem.setUF(br.com.swconsultoria.cte.schema_300.enviCTe.TUf.SC);
             enderRem.setCEP("75120683");
             enderRem.setCPais("1058");
             enderRem.setXPais("Brasil");
             rem.setEnderReme(enderRem);
             infCTe.setRem(rem);

             TCTe.InfCte.Dest dest = new TCTe.InfCte.Dest();
             dest.setCNPJ("92791243000294");
             dest.setIE("250168464");
             dest.setXNome("CT-E EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
             dest.setEmail("samuel@autocomsistemas.com.br");

             br.com.swconsultoria.cte.schema_300.enviCTe.TEndereco enderDest = new br.com.swconsultoria.cte.schema_300.enviCTe.TEndereco();
             enderDest.setXLgr("Rua: Teste");
             enderDest.setNro("0");
             enderDest.setXBairro("TESTE");
             enderDest.setCMun("4204301");
             enderDest.setXMun("SANTO ANTONIO DO DESCOBERTO");
             enderDest.setUF(br.com.swconsultoria.cte.schema_300.enviCTe.TUf.SC);
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

             br.com.swconsultoria.cte.schema_300.enviCTe.TImp icms = new br.com.swconsultoria.cte.schema_300.enviCTe.TImp();

             br.com.swconsultoria.cte.schema_300.enviCTe.TImp.ICMS45 icms45 = new br.com.swconsultoria.cte.schema_300.enviCTe.TImp.ICMS45();
             icms45.setCST("40");
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
             infNFe.setChave("52170101241994000605550030002868271002045403");
             infDoc.getInfNFe().add(infNFe);

             TCTe.InfCte.InfCTeNorm.InfModal infModal = new TCTe.InfCte.InfCTeNorm.InfModal();
             infModal.setVersaoModal(ConstantesCte.VERSAO.CTE);

             Rodo rodo = new Rodo();
             rodo.setRNTRC("00418422");

             infModal.setAny(ObjetoCTeUtil.objectToElement(rodo, Rodo.class, "rodo"));

             infCTeNorm.setInfCarga(infCarga);
             infCTeNorm.setInfDoc(infDoc);
             infCTeNorm.setInfModal(infModal);

             infCTe.setInfCTeNorm(infCTeNorm);

             // Monta EnviCte
             TEnviCTe enviCTe = new TEnviCTe();
             enviCTe.setVersao(ConstantesCte.VERSAO.CTE);
           

             cte.setInfCte(infCTe);
             enviCTe.getCTe().add(cte);
             	enviCTe.setIdLote("1");
             // MOnta e Assina o XML
             cte = Cte.montaCte(config, cte, true);

             //Adiciona QRCode
             TCTe.InfCTeSupl infCTeSupl = new TCTe.InfCTeSupl();
             infCTeSupl.setQrCodCTe(ObjetoCTeUtil.criaQRCode(
                     cte.getInfCte().getId().substring(3),
                     config));

             cte.setInfCTeSupl(infCTeSupl);

             // Envia a Cte para a Sefaz
             br.com.swconsultoria.cte.schema_300.procCTe.TRetCTe retorno = Cte.enviarCte(config, cte);
             
             
           
           /*  
             if (!retorno.getCStat().equals(StatusCteEnum.LOTE_RECEBIDO.getCodigo())) {
                 throw new CteException("Status:" + retorno.getCStat() + " - Motivo:" + retorno.getXMotivo());
             }

             

             br.com.swconsultoria.cte.schema_300.retConsReciCTe.TRetConsReciCTe retornoCte;
             while (true) {
                 retornoCte = Cte.consultaRecibo(config, recibo);
                 if (retornoCte.getCStat().equals("105")) {
                     System.out.println("Lote Em Processamento, vai tentar novamente apos 2 Segundo.");
                     Thread.sleep(2000);
                 } else {
                     break;
                 }
             }
 */
             if (!retorno.getCStat().equals(StatusCteEnum.AUTORIZADO.getCodigo())) {
                 throw new CteException("Status:" + retorno.getCStat() + " - " + retorno.getXMotivo());
             }

             System.out.println("Status: " + retorno.getCStat() + " - " + retorno.getXMotivo());
             System.out.println("Data: " + retorno.getProtCTe().getInfProt().getDhRecbto());

             if (retorno.getCStat().equals(StatusCteEnum.AUTORIZADO.getCodigo())) {
                 System.out.println("Protocolo: " + retorno.getProtCTe().getInfProt().getNProt());
                 System.out.println("XML Final: " + XmlCteUtil.criaCteProc(cte, retorno.getProtCTe()));
             }

         } catch (Exception e) {
             System.out.println("Erro:" + e.getMessage());
         }
    }

}