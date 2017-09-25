/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.samuelweb.util;

/**
 *
 * @author john
 */
public interface ConstantesMDFe {
	 public static final String MDFE = "MDFe";
    interface SERVICOS {

        public static final String ENVIO = "MDFeRecepcao";
        public static final String CONSULTA_RECIBO = "MDFeRetRecepcao";
        public static final String EVENTO = "MDFeRecepcaoEvento";
        public static final String CONSULTA_PROTOCOLO = "MDFeConsulta";
        public static final String STATUS_SERVICO = "MDFeStatusServico";
        public static final String CONSULTA_NAO_ENCERRADO = "MDFeConsNaoEnc";
        
        public static final String CANCELAR = "cancelar";
        public static final String ENCERRAR = "encerrar";
        public static final String INCLUIR_CONDUTOR = "incluir_condutor";
        

    }

    interface XSD {

        public static final String STATUS_SERVICO = "consStatServMDFe_v3.00";
        public static final String ENVIO_MDFE = "enviMDFe_v3.00";        
        public static final String CONSULTA_RECIBO = "consReciMDFe_v3.00";
        public static final String CONSULTA_PROTOCOLO = "consSitMDFe_v3.00";        
        public static final String EVENTO = "eventoMDFe_ v3.00";
        public static final String CANCELAR = "evCancMDFe_v3.00";        
        public static final String ENCERRAR = "evEncMDFe_v3.00";
        public static final String INCLUIR_CONDUTOR = "evIncCondutorMDFe_v3.00";
        public static final String CONSULTA_NAO_ENCERRADO = "consMDFeNaoEnc_v3.00";
        
        public static final String MDFE_RODO = "MDFeModalRodoviario_v3.00";
        public static final String MDFE_AQUAVIARIO = "MDFeModalAquaviario_v3.00";
        public static final String MDFE_FERROVIARIO = "MDFeModalFerroviario_v3.00";
        public static final String MDFE_AEREO = "MDFeModalAereo_v3.00";
    }

    interface XML {

        public static final String STATUS_SERVICO = "TConsStatServ";
        public static final String ENVIO_MDFE = "TEnviMDFe";
        public static final String CONSULTA_RECIBO = "TConsReciMDFe";
        public static final String CONSULTA_NAO_ENCERRADO = "TConsMDFeNaoEnc";
        public static final String CONSULTA_PROTOCOLO = "TConsSitMDFe";
        public static final String EVENTO = "TEvento";
        public static final String PROC_EVENTO = "TProcEvento";
        public static final String PROC_MDFE = "MdfeProc";
        public static final String PROT_MDFE = "TProtMDFe";
        
        
        public static final String CANCELAR = "br.inf.portalfiscal.mdfe.schema_300.evCancMDFe.TEvento";
        public static final String ENCERRAR = "br.inf.portalfiscal.mdfe.schema_300.evEncMDFe.TEvento";
        public static final String INCLUIR_CONDUTOR = "br.inf.portalfiscal.mdfe.schema_300.evIncCondutorMDF.TEvento";

        public static final String PROC_CANCELAR = "br.inf.portalfiscal.mdfe.schema_300.evCancMDFe.TProcEvento";
        public static final String PROC_INCLUIR_CONDUTOR = "br.inf.portalfiscal.mdfe.schema_300.evIncCondutorMDF.TProcEvento";
        public static final String PROC_ENCERRAR = "br.inf.portalfiscal.mdfe.schema_300.evEncMDFe.TProcEvento";
    }

    interface AMBIENTE {

        public static final String HOMOLOGACAO = "2";
        public static final String PRODUCAO = "1";
    }

    interface VERSAO {

        public static final String V3_00 = "3_00";
    }
}
