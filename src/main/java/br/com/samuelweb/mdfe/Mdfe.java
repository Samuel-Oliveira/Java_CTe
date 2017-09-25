/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.samuelweb.mdfe;

import br.com.samuelweb.exception.EmissorException;
import br.inf.portalfiscal.mdfe.schema_300.consReciMDFe.TConsReciMDFe;
import br.inf.portalfiscal.mdfe.schema_300.enviMDFe.TEnviMDFe;
import br.inf.portalfiscal.mdfe.schema_300.retConsReciMDFe.TRetConsReciMDFe;
import br.inf.portalfiscal.mdfe.schema_300.retEnviMDFe.TRetEnviMDFe;
import br.inf.portalfiscal.mdfe.schema_300.evCancMDFe.TEvento;
import br.inf.portalfiscal.mdfe.schema_300.evCancMDFe.TRetEvento;

/**
 *
 * @author john
 */
public class Mdfe {
    
    
    public static TEnviMDFe montaMDFe(TEnviMDFe enviMdfe, boolean validar) throws EmissorException{
        return EnvioMdfe.montaMdfe(enviMdfe, validar);
    }
    
    public static TRetEnviMDFe enviar(TEnviMDFe enviMdfe) throws Exception{
        return EnvioMdfe.enviarMdfe(enviMdfe);
    }
    
    public static TRetConsReciMDFe consultarRecibo(TConsReciMDFe consReciMdfe, boolean validar) throws Exception{
        return RetornoMdfe.consultarRecibo(consReciMdfe, validar);
    }
    
    
    public static br.inf.portalfiscal.mdfe.schema_300.consSitMDFe.TRetConsSitMDFe consultarXml(br.inf.portalfiscal.mdfe.schema_300.consSitMDFe.TConsSitMDFe consSitMdfe, boolean validar) throws EmissorException, Exception{
        return ConsultarProtocolo.consultarProtocolo(consSitMdfe, validar);
    }
    
    public static br.inf.portalfiscal.mdfe.schema_300.consMDFeNaoEnc.TRetConsMDFeNaoEnc consultarNaoEncerrado(br.inf.portalfiscal.mdfe.schema_300.consMDFeNaoEnc.TConsMDFeNaoEnc consMDFeNaoEnc,boolean validar ) throws Exception{
        return ConsultarNaoEncerrado.consultar(consMDFeNaoEnc,validar);
    }
    
    public static br.inf.portalfiscal.mdfe.schema_300.consStatServMDFe.TRetConsStatServ statusServico(br.inf.portalfiscal.mdfe.schema_300.consStatServMDFe.TConsStatServ consStatServ, boolean validar) throws Exception{
        return Status.statusServico(consStatServ, validar);
    }
    
    
    public static TRetEvento cancelar(TEvento evento, boolean valida) throws Exception{
        return Evento.cancelar(evento, valida);
    }
    
    public static br.inf.portalfiscal.mdfe.schema_300.evIncCondutorMDF.TRetEvento incluirCondutor(br.inf.portalfiscal.mdfe.schema_300.evIncCondutorMDF.TEvento evento, boolean validar) throws Exception{
        return Evento.incluirCondutor(evento, true);
    }
    
    public static br.inf.portalfiscal.mdfe.schema_300.evEncMDFe.TRetEvento encerrar(br.inf.portalfiscal.mdfe.schema_300.evEncMDFe.TEvento evento, boolean validar) throws Exception{
        return Evento.encerrar(evento, validar);
    }
    
    
    
    
}
