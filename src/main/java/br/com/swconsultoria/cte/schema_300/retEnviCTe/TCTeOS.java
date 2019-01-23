
package br.com.swconsultoria.cte.schema_300.retEnviCTe;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * Tipo Conhecimento de Transporte Eletrônico Outros Serviços (Modelo 67)
 *
 * <p>Classe Java de TCTeOS complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TCTeOS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infCte">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ide">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
 *                             &lt;element name="cCT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{8}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
 *                             &lt;element name="natOp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCTOS"/>
 *                             &lt;element name="serie">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TSerie">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nCT" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
 *                             &lt;element name="dhEmi">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpImp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpEmis">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="5"/>
 *                                   &lt;enumeration value="7"/>
 *                                   &lt;enumeration value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cDV">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{1}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
 *                             &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTe"/>
 *                             &lt;element name="procEmi" type="{http://www.portalfiscal.inf.br/cte}TProcEmi"/>
 *                             &lt;element name="verProc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cMunEnv" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
 *                             &lt;element name="xMunEnv">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UFEnv" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                             &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTranspOS"/>
 *                             &lt;element name="tpServ">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="6"/>
 *                                   &lt;enumeration value="7"/>
 *                                   &lt;enumeration value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indIEToma">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE" minOccurs="0"/>
 *                             &lt;element name="xMunIni" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf" minOccurs="0"/>
 *                             &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE" minOccurs="0"/>
 *                             &lt;element name="xMunFim" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf" minOccurs="0"/>
 *                             &lt;element name="infPercurso" maxOccurs="25" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="UFPer" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="dhCont" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/>
 *                               &lt;element name="xJust">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                     &lt;minLength value="15"/>
 *                                     &lt;maxLength value="256"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="compl" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="xCaracAd" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xCaracSer" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xEmi" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xObs" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ObsCont" maxOccurs="10" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="xTexto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="160"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="xCampo" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="20"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ObsFisco" maxOccurs="10" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="xTexto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="60"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="xCampo" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="20"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="emit">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                             &lt;element name="IE">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="IEST" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xFant" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="enderEmit" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="toma" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                             &lt;/choice>
 *                             &lt;element name="IE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xFant" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
 *                             &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                             &lt;element name="email" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TEmail">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vPrest">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                             &lt;element name="vRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                             &lt;element name="Comp" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="xNome">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;maxLength value="15"/>
 *                                             &lt;minLength value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="imp">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImpOS"/>
 *                             &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                             &lt;element name="infAdFisco" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="2000"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ICMSUFFim" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="vBCUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                       &lt;element name="pFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                                       &lt;element name="pICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                                       &lt;element name="pICMSInter" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                                       &lt;element name="pICMSInterPart" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                                       &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                       &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                       &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infTribFed" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                                       &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                                       &lt;element name="vIR" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                                       &lt;element name="vINSS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                                       &lt;element name="vCSLL" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="infCTeNorm">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="infServico">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="xDescServ">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="30"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="infQ" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infDocRef" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="nDoc">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="20"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="serie" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="3"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="subserie" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="3"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                         &lt;element name="vDoc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="seg" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="respSeg">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="1"/>
 *                                               &lt;enumeration value="4"/>
 *                                               &lt;enumeration value="5"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="xSeg" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="30"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="nApol" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="20"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infModal" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;any processContents='skip'/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="versaoModal" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;pattern value="3\.(0[0-9]|[1-9][0-9])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infCteSub" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="chCte">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;pattern value="[0-9]{44}"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;choice>
 *                                           &lt;element name="refCteAnu">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChNFe">
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="tomaICMS">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;choice>
 *                                                     &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                                                     &lt;element name="refNF">
 *                                                       &lt;complexType>
 *                                                         &lt;complexContent>
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             &lt;sequence>
 *                                                               &lt;choice>
 *                                                                 &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                                                                 &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                                                               &lt;/choice>
 *                                                               &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
 *                                                               &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
 *                                                               &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
 *                                                               &lt;element name="nro">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                     &lt;whiteSpace value="preserve"/>
 *                                                                     &lt;pattern value="[0-9]{1,6}"/>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/element>
 *                                                               &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                             &lt;/sequence>
 *                                                           &lt;/restriction>
 *                                                         &lt;/complexContent>
 *                                                       &lt;/complexType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="refCte" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                                                   &lt;/choice>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/choice>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="infCteComp">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="infCteAnu">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="chCte">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;pattern value="[0-9]{44}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="autXML" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="versao" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TVerCTe">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *                       &lt;pattern value="CTe[0-9]{44}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TVerCTe">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCTeOS", propOrder = {
        "infCte",
        "signature"
})
public class TCTeOS {

    @XmlElement(required = true)
    protected InfCte infCte;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade infCte.
     *
     * @return possible object is
     * {@link InfCte }
     */
    public InfCte getInfCte() {
        return infCte;
    }

    /**
     * Define o valor da propriedade infCte.
     *
     * @param value allowed object is
     *              {@link InfCte }
     */
    public void setInfCte(InfCte value) {
        this.infCte = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     *
     * @return possible object is
     * {@link SignatureType }
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     *
     * @param value allowed object is
     *              {@link SignatureType }
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersao(String value) {
        this.versao = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ide">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
     *                   &lt;element name="cCT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{8}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
     *                   &lt;element name="natOp">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCTOS"/>
     *                   &lt;element name="serie">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TSerie">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nCT" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
     *                   &lt;element name="dhEmi">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpImp">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpEmis">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="5"/>
     *                         &lt;enumeration value="7"/>
     *                         &lt;enumeration value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cDV">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{1}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
     *                   &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTe"/>
     *                   &lt;element name="procEmi" type="{http://www.portalfiscal.inf.br/cte}TProcEmi"/>
     *                   &lt;element name="verProc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cMunEnv" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
     *                   &lt;element name="xMunEnv">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UFEnv" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                   &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTranspOS"/>
     *                   &lt;element name="tpServ">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="6"/>
     *                         &lt;enumeration value="7"/>
     *                         &lt;enumeration value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indIEToma">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE" minOccurs="0"/>
     *                   &lt;element name="xMunIni" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf" minOccurs="0"/>
     *                   &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE" minOccurs="0"/>
     *                   &lt;element name="xMunFim" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf" minOccurs="0"/>
     *                   &lt;element name="infPercurso" maxOccurs="25" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="UFPer" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="dhCont" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/>
     *                     &lt;element name="xJust">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                           &lt;minLength value="15"/>
     *                           &lt;maxLength value="256"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="compl" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="xCaracAd" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xCaracSer" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xEmi" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xObs" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ObsCont" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="xTexto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="160"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="xCampo" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="20"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ObsFisco" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="xTexto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="60"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="xCampo" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="20"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="emit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *                   &lt;element name="IE">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="IEST" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xFant" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="enderEmit" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="toma" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                   &lt;/choice>
     *                   &lt;element name="IE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xFant" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
     *                   &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                   &lt;element name="email" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TEmail">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vPrest">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                   &lt;element name="vRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                   &lt;element name="Comp" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="xNome">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;maxLength value="15"/>
     *                                   &lt;minLength value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="imp">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImpOS"/>
     *                   &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *                   &lt;element name="infAdFisco" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="2000"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ICMSUFFim" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vBCUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                             &lt;element name="pFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *                             &lt;element name="pICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *                             &lt;element name="pICMSInter" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *                             &lt;element name="pICMSInterPart" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *                             &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                             &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                             &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infTribFed" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *                             &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *                             &lt;element name="vIR" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *                             &lt;element name="vINSS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *                             &lt;element name="vCSLL" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="infCTeNorm">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="infServico">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="xDescServ">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="30"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="infQ" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="infDocRef" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="nDoc">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="20"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="serie" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="3"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="subserie" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="3"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                               &lt;element name="vDoc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="seg" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="respSeg">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="1"/>
     *                                     &lt;enumeration value="4"/>
     *                                     &lt;enumeration value="5"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="xSeg" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="30"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="nApol" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="20"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="infModal" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;any processContents='skip'/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="versaoModal" use="required">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;pattern value="3\.(0[0-9]|[1-9][0-9])"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="infCteSub" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="chCte">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;pattern value="[0-9]{44}"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;choice>
     *                                 &lt;element name="refCteAnu">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChNFe">
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="tomaICMS">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         &lt;choice>
     *                                           &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
     *                                           &lt;element name="refNF">
     *                                             &lt;complexType>
     *                                               &lt;complexContent>
     *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                   &lt;sequence>
     *                                                     &lt;choice>
     *                                                       &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *                                                       &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                                                     &lt;/choice>
     *                                                     &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
     *                                                     &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
     *                                                     &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
     *                                                     &lt;element name="nro">
     *                                                       &lt;simpleType>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                           &lt;whiteSpace value="preserve"/>
     *                                                           &lt;pattern value="[0-9]{1,6}"/>
     *                                                         &lt;/restriction>
     *                                                       &lt;/simpleType>
     *                                                     &lt;/element>
     *                                                     &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                                                     &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                                   &lt;/sequence>
     *                                                 &lt;/restriction>
     *                                               &lt;/complexContent>
     *                                             &lt;/complexType>
     *                                           &lt;/element>
     *                                           &lt;element name="refCte" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
     *                                         &lt;/choice>
     *                                       &lt;/restriction>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                               &lt;/choice>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="infCteComp">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="infCteAnu">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="chCte">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;pattern value="[0-9]{44}"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="autXML" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="versao" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TVerCTe">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
     *             &lt;pattern value="CTe[0-9]{44}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "ide",
            "compl",
            "emit",
            "toma",
            "vPrest",
            "imp",
            "infCTeNorm",
            "infCteComp",
            "infCteAnu",
            "autXML"
    })
    public static class InfCte {

        @XmlElement(required = true)
        protected Ide ide;
        protected Compl compl;
        @XmlElement(required = true)
        protected Emit emit;
        protected Toma toma;
        @XmlElement(required = true)
        protected VPrest vPrest;
        @XmlElement(required = true)
        protected Imp imp;
        protected InfCTeNorm infCTeNorm;
        protected InfCteComp infCteComp;
        protected InfCteAnu infCteAnu;
        protected List<AutXML> autXML;
        @XmlAttribute(name = "versao", required = true)
        protected String versao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ide.
         *
         * @return possible object is
         * {@link Ide }
         */
        public Ide getIde() {
            return ide;
        }

        /**
         * Define o valor da propriedade ide.
         *
         * @param value allowed object is
         *              {@link Ide }
         */
        public void setIde(Ide value) {
            this.ide = value;
        }

        /**
         * Obtém o valor da propriedade compl.
         *
         * @return possible object is
         * {@link Compl }
         */
        public Compl getCompl() {
            return compl;
        }

        /**
         * Define o valor da propriedade compl.
         *
         * @param value allowed object is
         *              {@link Compl }
         */
        public void setCompl(Compl value) {
            this.compl = value;
        }

        /**
         * Obtém o valor da propriedade emit.
         *
         * @return possible object is
         * {@link Emit }
         */
        public Emit getEmit() {
            return emit;
        }

        /**
         * Define o valor da propriedade emit.
         *
         * @param value allowed object is
         *              {@link Emit }
         */
        public void setEmit(Emit value) {
            this.emit = value;
        }

        /**
         * Obtém o valor da propriedade toma.
         *
         * @return possible object is
         * {@link Toma }
         */
        public Toma getToma() {
            return toma;
        }

        /**
         * Define o valor da propriedade toma.
         *
         * @param value allowed object is
         *              {@link Toma }
         */
        public void setToma(Toma value) {
            this.toma = value;
        }

        /**
         * Obtém o valor da propriedade vPrest.
         *
         * @return possible object is
         * {@link VPrest }
         */
        public VPrest getVPrest() {
            return vPrest;
        }

        /**
         * Define o valor da propriedade vPrest.
         *
         * @param value allowed object is
         *              {@link VPrest }
         */
        public void setVPrest(VPrest value) {
            this.vPrest = value;
        }

        /**
         * Obtém o valor da propriedade imp.
         *
         * @return possible object is
         * {@link Imp }
         */
        public Imp getImp() {
            return imp;
        }

        /**
         * Define o valor da propriedade imp.
         *
         * @param value allowed object is
         *              {@link Imp }
         */
        public void setImp(Imp value) {
            this.imp = value;
        }

        /**
         * Obtém o valor da propriedade infCTeNorm.
         *
         * @return possible object is
         * {@link InfCTeNorm }
         */
        public InfCTeNorm getInfCTeNorm() {
            return infCTeNorm;
        }

        /**
         * Define o valor da propriedade infCTeNorm.
         *
         * @param value allowed object is
         *              {@link InfCTeNorm }
         */
        public void setInfCTeNorm(InfCTeNorm value) {
            this.infCTeNorm = value;
        }

        /**
         * Obtém o valor da propriedade infCteComp.
         *
         * @return possible object is
         * {@link InfCteComp }
         */
        public InfCteComp getInfCteComp() {
            return infCteComp;
        }

        /**
         * Define o valor da propriedade infCteComp.
         *
         * @param value allowed object is
         *              {@link InfCteComp }
         */
        public void setInfCteComp(InfCteComp value) {
            this.infCteComp = value;
        }

        /**
         * Obtém o valor da propriedade infCteAnu.
         *
         * @return possible object is
         * {@link InfCteAnu }
         */
        public InfCteAnu getInfCteAnu() {
            return infCteAnu;
        }

        /**
         * Define o valor da propriedade infCteAnu.
         *
         * @param value allowed object is
         *              {@link InfCteAnu }
         */
        public void setInfCteAnu(InfCteAnu value) {
            this.infCteAnu = value;
        }

        /**
         * Gets the value of the autXML property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autXML property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutXML().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AutXML }
         */
        public List<AutXML> getAutXML() {
            if (autXML == null) {
                autXML = new ArrayList<AutXML>();
            }
            return this.autXML;
        }

        /**
         * Obtém o valor da propriedade versao.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVersao() {
            return versao;
        }

        /**
         * Define o valor da propriedade versao.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVersao(String value) {
            this.versao = value;
        }

        /**
         * Obtém o valor da propriedade id.
         *
         * @return possible object is
         * {@link String }
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *         &lt;/choice>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "cnpj",
                "cpf"
        })
        public static class AutXML {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;

            /**
             * Obtém o valor da propriedade cnpj.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obtém o valor da propriedade cpf.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Define o valor da propriedade cpf.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="xCaracAd" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xCaracSer" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xEmi" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xObs" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ObsCont" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xTexto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="160"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="xCampo" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ObsFisco" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xTexto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="xCampo" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "xCaracAd",
                "xCaracSer",
                "xEmi",
                "xObs",
                "obsCont",
                "obsFisco"
        })
        public static class Compl {

            protected String xCaracAd;
            protected String xCaracSer;
            protected String xEmi;
            protected String xObs;
            @XmlElement(name = "ObsCont")
            protected List<ObsCont> obsCont;
            @XmlElement(name = "ObsFisco")
            protected List<ObsFisco> obsFisco;

            /**
             * Obtém o valor da propriedade xCaracAd.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXCaracAd() {
                return xCaracAd;
            }

            /**
             * Define o valor da propriedade xCaracAd.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXCaracAd(String value) {
                this.xCaracAd = value;
            }

            /**
             * Obtém o valor da propriedade xCaracSer.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXCaracSer() {
                return xCaracSer;
            }

            /**
             * Define o valor da propriedade xCaracSer.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXCaracSer(String value) {
                this.xCaracSer = value;
            }

            /**
             * Obtém o valor da propriedade xEmi.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXEmi() {
                return xEmi;
            }

            /**
             * Define o valor da propriedade xEmi.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXEmi(String value) {
                this.xEmi = value;
            }

            /**
             * Obtém o valor da propriedade xObs.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXObs() {
                return xObs;
            }

            /**
             * Define o valor da propriedade xObs.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXObs(String value) {
                this.xObs = value;
            }

            /**
             * Gets the value of the obsCont property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the obsCont property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObsCont().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ObsCont }
             */
            public List<ObsCont> getObsCont() {
                if (obsCont == null) {
                    obsCont = new ArrayList<ObsCont>();
                }
                return this.obsCont;
            }

            /**
             * Gets the value of the obsFisco property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the obsFisco property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObsFisco().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ObsFisco }
             */
            public List<ObsFisco> getObsFisco() {
                if (obsFisco == null) {
                    obsFisco = new ArrayList<ObsFisco>();
                }
                return this.obsFisco;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xTexto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="160"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="xCampo" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="20"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "xTexto"
            })
            public static class ObsCont {

                @XmlElement(required = true)
                protected String xTexto;
                @XmlAttribute(name = "xCampo", required = true)
                protected String xCampo;

                /**
                 * Obtém o valor da propriedade xTexto.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Define o valor da propriedade xTexto.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Obtém o valor da propriedade xCampo.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Define o valor da propriedade xCampo.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXCampo(String value) {
                    this.xCampo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xTexto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="xCampo" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="20"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "xTexto"
            })
            public static class ObsFisco {

                @XmlElement(required = true)
                protected String xTexto;
                @XmlAttribute(name = "xCampo", required = true)
                protected String xCampo;

                /**
                 * Obtém o valor da propriedade xTexto.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Define o valor da propriedade xTexto.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Obtém o valor da propriedade xCampo.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Define o valor da propriedade xCampo.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXCampo(String value) {
                    this.xCampo = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
         *         &lt;element name="IE">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="IEST" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xFant" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="enderEmit" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "cnpj",
                "ie",
                "iest",
                "xNome",
                "xFant",
                "enderEmit"
        })
        public static class Emit {

            @XmlElement(name = "CNPJ", required = true)
            protected String cnpj;
            @XmlElement(name = "IE", required = true)
            protected String ie;
            @XmlElement(name = "IEST")
            protected String iest;
            @XmlElement(required = true)
            protected String xNome;
            protected String xFant;
            @XmlElement(required = true)
            protected TEndeEmi enderEmit;

            /**
             * Obtém o valor da propriedade cnpj.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obtém o valor da propriedade ie.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Obtém o valor da propriedade iest.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIEST() {
                return iest;
            }

            /**
             * Define o valor da propriedade iest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIEST(String value) {
                this.iest = value;
            }

            /**
             * Obtém o valor da propriedade xNome.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Define o valor da propriedade xNome.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXNome(String value) {
                this.xNome = value;
            }

            /**
             * Obtém o valor da propriedade xFant.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXFant() {
                return xFant;
            }

            /**
             * Define o valor da propriedade xFant.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXFant(String value) {
                this.xFant = value;
            }

            /**
             * Obtém o valor da propriedade enderEmit.
             *
             * @return possible object is
             * {@link TEndeEmi }
             */
            public TEndeEmi getEnderEmit() {
                return enderEmit;
            }

            /**
             * Define o valor da propriedade enderEmit.
             *
             * @param value allowed object is
             *              {@link TEndeEmi }
             */
            public void setEnderEmit(TEndeEmi value) {
                this.enderEmit = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
         *         &lt;element name="cCT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{8}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
         *         &lt;element name="natOp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCTOS"/>
         *         &lt;element name="serie">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TSerie">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nCT" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
         *         &lt;element name="dhEmi">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpImp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpEmis">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="5"/>
         *               &lt;enumeration value="7"/>
         *               &lt;enumeration value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cDV">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{1}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
         *         &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTe"/>
         *         &lt;element name="procEmi" type="{http://www.portalfiscal.inf.br/cte}TProcEmi"/>
         *         &lt;element name="verProc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cMunEnv" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
         *         &lt;element name="xMunEnv">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UFEnv" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *         &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTranspOS"/>
         *         &lt;element name="tpServ">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="6"/>
         *               &lt;enumeration value="7"/>
         *               &lt;enumeration value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indIEToma">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE" minOccurs="0"/>
         *         &lt;element name="xMunIni" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf" minOccurs="0"/>
         *         &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE" minOccurs="0"/>
         *         &lt;element name="xMunFim" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf" minOccurs="0"/>
         *         &lt;element name="infPercurso" maxOccurs="25" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="UFPer" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="dhCont" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/>
         *           &lt;element name="xJust">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                 &lt;minLength value="15"/>
         *                 &lt;maxLength value="256"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *         &lt;/sequence>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "cuf",
                "cct",
                "cfop",
                "natOp",
                "mod",
                "serie",
                "nct",
                "dhEmi",
                "tpImp",
                "tpEmis",
                "cdv",
                "tpAmb",
                "tpCTe",
                "procEmi",
                "verProc",
                "cMunEnv",
                "xMunEnv",
                "ufEnv",
                "modal",
                "tpServ",
                "indIEToma",
                "cMunIni",
                "xMunIni",
                "ufIni",
                "cMunFim",
                "xMunFim",
                "ufFim",
                "infPercurso",
                "dhCont",
                "xJust"
        })
        public static class Ide {

            @XmlElement(name = "cUF", required = true)
            protected String cuf;
            @XmlElement(name = "cCT", required = true)
            protected String cct;
            @XmlElement(name = "CFOP", required = true)
            protected String cfop;
            @XmlElement(required = true)
            protected String natOp;
            @XmlElement(required = true)
            protected String mod;
            @XmlElement(required = true)
            protected String serie;
            @XmlElement(name = "nCT", required = true)
            protected String nct;
            @XmlElement(required = true)
            protected String dhEmi;
            @XmlElement(required = true)
            protected String tpImp;
            @XmlElement(required = true)
            protected String tpEmis;
            @XmlElement(name = "cDV", required = true)
            protected String cdv;
            @XmlElement(required = true)
            protected String tpAmb;
            @XmlElement(required = true)
            protected String tpCTe;
            @XmlElement(required = true)
            protected String procEmi;
            @XmlElement(required = true)
            protected String verProc;
            @XmlElement(required = true)
            protected String cMunEnv;
            @XmlElement(required = true)
            protected String xMunEnv;
            @XmlElement(name = "UFEnv", required = true)
            protected TUf ufEnv;
            @XmlElement(required = true)
            protected String modal;
            @XmlElement(required = true)
            protected String tpServ;
            @XmlElement(required = true)
            protected String indIEToma;
            protected String cMunIni;
            protected String xMunIni;
            @XmlElement(name = "UFIni")
            protected TUf ufIni;
            protected String cMunFim;
            protected String xMunFim;
            @XmlElement(name = "UFFim")
            protected TUf ufFim;
            protected List<InfPercurso> infPercurso;
            protected String dhCont;
            protected String xJust;

            /**
             * Obtém o valor da propriedade cuf.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCUF() {
                return cuf;
            }

            /**
             * Define o valor da propriedade cuf.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCUF(String value) {
                this.cuf = value;
            }

            /**
             * Obtém o valor da propriedade cct.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCCT() {
                return cct;
            }

            /**
             * Define o valor da propriedade cct.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCCT(String value) {
                this.cct = value;
            }

            /**
             * Obtém o valor da propriedade cfop.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCFOP() {
                return cfop;
            }

            /**
             * Define o valor da propriedade cfop.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCFOP(String value) {
                this.cfop = value;
            }

            /**
             * Obtém o valor da propriedade natOp.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNatOp() {
                return natOp;
            }

            /**
             * Define o valor da propriedade natOp.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNatOp(String value) {
                this.natOp = value;
            }

            /**
             * Obtém o valor da propriedade mod.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMod() {
                return mod;
            }

            /**
             * Define o valor da propriedade mod.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMod(String value) {
                this.mod = value;
            }

            /**
             * Obtém o valor da propriedade serie.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSerie() {
                return serie;
            }

            /**
             * Define o valor da propriedade serie.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSerie(String value) {
                this.serie = value;
            }

            /**
             * Obtém o valor da propriedade nct.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNCT() {
                return nct;
            }

            /**
             * Define o valor da propriedade nct.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNCT(String value) {
                this.nct = value;
            }

            /**
             * Obtém o valor da propriedade dhEmi.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDhEmi() {
                return dhEmi;
            }

            /**
             * Define o valor da propriedade dhEmi.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDhEmi(String value) {
                this.dhEmi = value;
            }

            /**
             * Obtém o valor da propriedade tpImp.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTpImp() {
                return tpImp;
            }

            /**
             * Define o valor da propriedade tpImp.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTpImp(String value) {
                this.tpImp = value;
            }

            /**
             * Obtém o valor da propriedade tpEmis.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTpEmis() {
                return tpEmis;
            }

            /**
             * Define o valor da propriedade tpEmis.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTpEmis(String value) {
                this.tpEmis = value;
            }

            /**
             * Obtém o valor da propriedade cdv.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCDV() {
                return cdv;
            }

            /**
             * Define o valor da propriedade cdv.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCDV(String value) {
                this.cdv = value;
            }

            /**
             * Obtém o valor da propriedade tpAmb.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTpAmb() {
                return tpAmb;
            }

            /**
             * Define o valor da propriedade tpAmb.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTpAmb(String value) {
                this.tpAmb = value;
            }

            /**
             * Obtém o valor da propriedade tpCTe.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTpCTe() {
                return tpCTe;
            }

            /**
             * Define o valor da propriedade tpCTe.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTpCTe(String value) {
                this.tpCTe = value;
            }

            /**
             * Obtém o valor da propriedade procEmi.
             *
             * @return possible object is
             * {@link String }
             */
            public String getProcEmi() {
                return procEmi;
            }

            /**
             * Define o valor da propriedade procEmi.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setProcEmi(String value) {
                this.procEmi = value;
            }

            /**
             * Obtém o valor da propriedade verProc.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Define o valor da propriedade verProc.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVerProc(String value) {
                this.verProc = value;
            }

            /**
             * Obtém o valor da propriedade cMunEnv.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCMunEnv() {
                return cMunEnv;
            }

            /**
             * Define o valor da propriedade cMunEnv.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCMunEnv(String value) {
                this.cMunEnv = value;
            }

            /**
             * Obtém o valor da propriedade xMunEnv.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXMunEnv() {
                return xMunEnv;
            }

            /**
             * Define o valor da propriedade xMunEnv.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXMunEnv(String value) {
                this.xMunEnv = value;
            }

            /**
             * Obtém o valor da propriedade ufEnv.
             *
             * @return possible object is
             * {@link TUf }
             */
            public TUf getUFEnv() {
                return ufEnv;
            }

            /**
             * Define o valor da propriedade ufEnv.
             *
             * @param value allowed object is
             *              {@link TUf }
             */
            public void setUFEnv(TUf value) {
                this.ufEnv = value;
            }

            /**
             * Obtém o valor da propriedade modal.
             *
             * @return possible object is
             * {@link String }
             */
            public String getModal() {
                return modal;
            }

            /**
             * Define o valor da propriedade modal.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setModal(String value) {
                this.modal = value;
            }

            /**
             * Obtém o valor da propriedade tpServ.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTpServ() {
                return tpServ;
            }

            /**
             * Define o valor da propriedade tpServ.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTpServ(String value) {
                this.tpServ = value;
            }

            /**
             * Obtém o valor da propriedade indIEToma.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIndIEToma() {
                return indIEToma;
            }

            /**
             * Define o valor da propriedade indIEToma.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIndIEToma(String value) {
                this.indIEToma = value;
            }

            /**
             * Obtém o valor da propriedade cMunIni.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCMunIni() {
                return cMunIni;
            }

            /**
             * Define o valor da propriedade cMunIni.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCMunIni(String value) {
                this.cMunIni = value;
            }

            /**
             * Obtém o valor da propriedade xMunIni.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXMunIni() {
                return xMunIni;
            }

            /**
             * Define o valor da propriedade xMunIni.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXMunIni(String value) {
                this.xMunIni = value;
            }

            /**
             * Obtém o valor da propriedade ufIni.
             *
             * @return possible object is
             * {@link TUf }
             */
            public TUf getUFIni() {
                return ufIni;
            }

            /**
             * Define o valor da propriedade ufIni.
             *
             * @param value allowed object is
             *              {@link TUf }
             */
            public void setUFIni(TUf value) {
                this.ufIni = value;
            }

            /**
             * Obtém o valor da propriedade cMunFim.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCMunFim() {
                return cMunFim;
            }

            /**
             * Define o valor da propriedade cMunFim.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCMunFim(String value) {
                this.cMunFim = value;
            }

            /**
             * Obtém o valor da propriedade xMunFim.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXMunFim() {
                return xMunFim;
            }

            /**
             * Define o valor da propriedade xMunFim.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXMunFim(String value) {
                this.xMunFim = value;
            }

            /**
             * Obtém o valor da propriedade ufFim.
             *
             * @return possible object is
             * {@link TUf }
             */
            public TUf getUFFim() {
                return ufFim;
            }

            /**
             * Define o valor da propriedade ufFim.
             *
             * @param value allowed object is
             *              {@link TUf }
             */
            public void setUFFim(TUf value) {
                this.ufFim = value;
            }

            /**
             * Gets the value of the infPercurso property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infPercurso property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfPercurso().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InfPercurso }
             */
            public List<InfPercurso> getInfPercurso() {
                if (infPercurso == null) {
                    infPercurso = new ArrayList<InfPercurso>();
                }
                return this.infPercurso;
            }

            /**
             * Obtém o valor da propriedade dhCont.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDhCont() {
                return dhCont;
            }

            /**
             * Define o valor da propriedade dhCont.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDhCont(String value) {
                this.dhCont = value;
            }

            /**
             * Obtém o valor da propriedade xJust.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXJust() {
                return xJust;
            }

            /**
             * Define o valor da propriedade xJust.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXJust(String value) {
                this.xJust = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="UFPer" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "ufPer"
            })
            public static class InfPercurso {

                @XmlElement(name = "UFPer", required = true)
                protected TUf ufPer;

                /**
                 * Obtém o valor da propriedade ufPer.
                 *
                 * @return possible object is
                 * {@link TUf }
                 */
                public TUf getUFPer() {
                    return ufPer;
                }

                /**
                 * Define o valor da propriedade ufPer.
                 *
                 * @param value allowed object is
                 *              {@link TUf }
                 */
                public void setUFPer(TUf value) {
                    this.ufPer = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImpOS"/>
         *         &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
         *         &lt;element name="infAdFisco" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="2000"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ICMSUFFim" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vBCUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                   &lt;element name="pFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
         *                   &lt;element name="pICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
         *                   &lt;element name="pICMSInter" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
         *                   &lt;element name="pICMSInterPart" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
         *                   &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                   &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                   &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infTribFed" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
         *                   &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
         *                   &lt;element name="vIR" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
         *                   &lt;element name="vINSS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
         *                   &lt;element name="vCSLL" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "icms",
                "vTotTrib",
                "infAdFisco",
                "icmsufFim",
                "infTribFed"
        })
        public static class Imp {

            @XmlElement(name = "ICMS", required = true)
            protected TImpOS icms;
            protected String vTotTrib;
            protected String infAdFisco;
            @XmlElement(name = "ICMSUFFim")
            protected ICMSUFFim icmsufFim;
            protected InfTribFed infTribFed;

            /**
             * Obtém o valor da propriedade icms.
             *
             * @return possible object is
             * {@link TImpOS }
             */
            public TImpOS getICMS() {
                return icms;
            }

            /**
             * Define o valor da propriedade icms.
             *
             * @param value allowed object is
             *              {@link TImpOS }
             */
            public void setICMS(TImpOS value) {
                this.icms = value;
            }

            /**
             * Obtém o valor da propriedade vTotTrib.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVTotTrib() {
                return vTotTrib;
            }

            /**
             * Define o valor da propriedade vTotTrib.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVTotTrib(String value) {
                this.vTotTrib = value;
            }

            /**
             * Obtém o valor da propriedade infAdFisco.
             *
             * @return possible object is
             * {@link String }
             */
            public String getInfAdFisco() {
                return infAdFisco;
            }

            /**
             * Define o valor da propriedade infAdFisco.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInfAdFisco(String value) {
                this.infAdFisco = value;
            }

            /**
             * Obtém o valor da propriedade icmsufFim.
             *
             * @return possible object is
             * {@link ICMSUFFim }
             */
            public ICMSUFFim getICMSUFFim() {
                return icmsufFim;
            }

            /**
             * Define o valor da propriedade icmsufFim.
             *
             * @param value allowed object is
             *              {@link ICMSUFFim }
             */
            public void setICMSUFFim(ICMSUFFim value) {
                this.icmsufFim = value;
            }

            /**
             * Obtém o valor da propriedade infTribFed.
             *
             * @return possible object is
             * {@link InfTribFed }
             */
            public InfTribFed getInfTribFed() {
                return infTribFed;
            }

            /**
             * Define o valor da propriedade infTribFed.
             *
             * @param value allowed object is
             *              {@link InfTribFed }
             */
            public void setInfTribFed(InfTribFed value) {
                this.infTribFed = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="vBCUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="pFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
             *         &lt;element name="pICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
             *         &lt;element name="pICMSInter" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
             *         &lt;element name="pICMSInterPart" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
             *         &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "vbcufFim",
                    "pfcpufFim",
                    "picmsufFim",
                    "picmsInter",
                    "picmsInterPart",
                    "vfcpufFim",
                    "vicmsufFim",
                    "vicmsufIni"
            })
            public static class ICMSUFFim {

                @XmlElement(name = "vBCUFFim", required = true)
                protected String vbcufFim;
                @XmlElement(name = "pFCPUFFim", required = true)
                protected String pfcpufFim;
                @XmlElement(name = "pICMSUFFim", required = true)
                protected String picmsufFim;
                @XmlElement(name = "pICMSInter", required = true)
                protected String picmsInter;
                @XmlElement(name = "pICMSInterPart", required = true)
                protected String picmsInterPart;
                @XmlElement(name = "vFCPUFFim", required = true)
                protected String vfcpufFim;
                @XmlElement(name = "vICMSUFFim", required = true)
                protected String vicmsufFim;
                @XmlElement(name = "vICMSUFIni", required = true)
                protected String vicmsufIni;

                /**
                 * Obtém o valor da propriedade vbcufFim.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVBCUFFim() {
                    return vbcufFim;
                }

                /**
                 * Define o valor da propriedade vbcufFim.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVBCUFFim(String value) {
                    this.vbcufFim = value;
                }

                /**
                 * Obtém o valor da propriedade pfcpufFim.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPFCPUFFim() {
                    return pfcpufFim;
                }

                /**
                 * Define o valor da propriedade pfcpufFim.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPFCPUFFim(String value) {
                    this.pfcpufFim = value;
                }

                /**
                 * Obtém o valor da propriedade picmsufFim.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPICMSUFFim() {
                    return picmsufFim;
                }

                /**
                 * Define o valor da propriedade picmsufFim.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPICMSUFFim(String value) {
                    this.picmsufFim = value;
                }

                /**
                 * Obtém o valor da propriedade picmsInter.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPICMSInter() {
                    return picmsInter;
                }

                /**
                 * Define o valor da propriedade picmsInter.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPICMSInter(String value) {
                    this.picmsInter = value;
                }

                /**
                 * Obtém o valor da propriedade picmsInterPart.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPICMSInterPart() {
                    return picmsInterPart;
                }

                /**
                 * Define o valor da propriedade picmsInterPart.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPICMSInterPart(String value) {
                    this.picmsInterPart = value;
                }

                /**
                 * Obtém o valor da propriedade vfcpufFim.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVFCPUFFim() {
                    return vfcpufFim;
                }

                /**
                 * Define o valor da propriedade vfcpufFim.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVFCPUFFim(String value) {
                    this.vfcpufFim = value;
                }

                /**
                 * Obtém o valor da propriedade vicmsufFim.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVICMSUFFim() {
                    return vicmsufFim;
                }

                /**
                 * Define o valor da propriedade vicmsufFim.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVICMSUFFim(String value) {
                    this.vicmsufFim = value;
                }

                /**
                 * Obtém o valor da propriedade vicmsufIni.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVICMSUFIni() {
                    return vicmsufIni;
                }

                /**
                 * Define o valor da propriedade vicmsufIni.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVICMSUFIni(String value) {
                    this.vicmsufIni = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
             *         &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
             *         &lt;element name="vIR" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
             *         &lt;element name="vINSS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
             *         &lt;element name="vCSLL" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "vpis",
                    "vcofins",
                    "vir",
                    "vinss",
                    "vcsll"
            })
            public static class InfTribFed {

                @XmlElement(name = "vPIS")
                protected String vpis;
                @XmlElement(name = "vCOFINS")
                protected String vcofins;
                @XmlElement(name = "vIR")
                protected String vir;
                @XmlElement(name = "vINSS")
                protected String vinss;
                @XmlElement(name = "vCSLL")
                protected String vcsll;

                /**
                 * Obtém o valor da propriedade vpis.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVPIS() {
                    return vpis;
                }

                /**
                 * Define o valor da propriedade vpis.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVPIS(String value) {
                    this.vpis = value;
                }

                /**
                 * Obtém o valor da propriedade vcofins.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVCOFINS() {
                    return vcofins;
                }

                /**
                 * Define o valor da propriedade vcofins.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVCOFINS(String value) {
                    this.vcofins = value;
                }

                /**
                 * Obtém o valor da propriedade vir.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVIR() {
                    return vir;
                }

                /**
                 * Define o valor da propriedade vir.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVIR(String value) {
                    this.vir = value;
                }

                /**
                 * Obtém o valor da propriedade vinss.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVINSS() {
                    return vinss;
                }

                /**
                 * Define o valor da propriedade vinss.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVINSS(String value) {
                    this.vinss = value;
                }

                /**
                 * Obtém o valor da propriedade vcsll.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVCSLL() {
                    return vcsll;
                }

                /**
                 * Define o valor da propriedade vcsll.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVCSLL(String value) {
                    this.vcsll = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="infServico">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xDescServ">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="infQ" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infDocRef" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nDoc">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="20"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="serie" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="subserie" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                   &lt;element name="vDoc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="seg" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="respSeg">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="1"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xSeg" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nApol" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="20"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infModal" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;any processContents='skip'/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="versaoModal" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;whiteSpace value="preserve"/>
         *                       &lt;pattern value="3\.(0[0-9]|[1-9][0-9])"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infCteSub" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="chCte">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="[0-9]{44}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;choice>
         *                     &lt;element name="refCteAnu">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChNFe">
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="tomaICMS">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;choice>
         *                               &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
         *                               &lt;element name="refNF">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;sequence>
         *                                         &lt;choice>
         *                                           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
         *                                           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *                                         &lt;/choice>
         *                                         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
         *                                         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
         *                                         &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
         *                                         &lt;element name="nro">
         *                                           &lt;simpleType>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                               &lt;whiteSpace value="preserve"/>
         *                                               &lt;pattern value="[0-9]{1,6}"/>
         *                                             &lt;/restriction>
         *                                           &lt;/simpleType>
         *                                         &lt;/element>
         *                                         &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                                         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                                       &lt;/sequence>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="refCte" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
         *                             &lt;/choice>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "infServico",
                "infDocRef",
                "seg",
                "infModal",
                "infCteSub"
        })
        public static class InfCTeNorm {

            @XmlElement(required = true)
            protected InfServico infServico;
            protected List<InfDocRef> infDocRef;
            protected List<Seg> seg;
            protected InfModal infModal;
            protected InfCteSub infCteSub;

            /**
             * Obtém o valor da propriedade infServico.
             *
             * @return possible object is
             * {@link InfServico }
             */
            public InfServico getInfServico() {
                return infServico;
            }

            /**
             * Define o valor da propriedade infServico.
             *
             * @param value allowed object is
             *              {@link InfServico }
             */
            public void setInfServico(InfServico value) {
                this.infServico = value;
            }

            /**
             * Gets the value of the infDocRef property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infDocRef property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfDocRef().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InfDocRef }
             */
            public List<InfDocRef> getInfDocRef() {
                if (infDocRef == null) {
                    infDocRef = new ArrayList<InfDocRef>();
                }
                return this.infDocRef;
            }

            /**
             * Gets the value of the seg property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seg property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeg().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Seg }
             */
            public List<Seg> getSeg() {
                if (seg == null) {
                    seg = new ArrayList<Seg>();
                }
                return this.seg;
            }

            /**
             * Obtém o valor da propriedade infModal.
             *
             * @return possible object is
             * {@link InfModal }
             */
            public InfModal getInfModal() {
                return infModal;
            }

            /**
             * Define o valor da propriedade infModal.
             *
             * @param value allowed object is
             *              {@link InfModal }
             */
            public void setInfModal(InfModal value) {
                this.infModal = value;
            }

            /**
             * Obtém o valor da propriedade infCteSub.
             *
             * @return possible object is
             * {@link InfCteSub }
             */
            public InfCteSub getInfCteSub() {
                return infCteSub;
            }

            /**
             * Define o valor da propriedade infCteSub.
             *
             * @param value allowed object is
             *              {@link InfCteSub }
             */
            public void setInfCteSub(InfCteSub value) {
                this.infCteSub = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="chCte">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="[0-9]{44}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;choice>
             *           &lt;element name="refCteAnu">
             *             &lt;simpleType>
             *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChNFe">
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="tomaICMS">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;choice>
             *                     &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
             *                     &lt;element name="refNF">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;sequence>
             *                               &lt;choice>
             *                                 &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
             *                                 &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
             *                               &lt;/choice>
             *                               &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
             *                               &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
             *                               &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
             *                               &lt;element name="nro">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                     &lt;whiteSpace value="preserve"/>
             *                                     &lt;pattern value="[0-9]{1,6}"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                             &lt;/sequence>
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                     &lt;element name="refCte" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
             *                   &lt;/choice>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "chCte",
                    "refCteAnu",
                    "tomaICMS"
            })
            public static class InfCteSub {

                @XmlElement(required = true)
                protected String chCte;
                protected String refCteAnu;
                protected TomaICMS tomaICMS;

                /**
                 * Obtém o valor da propriedade chCte.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getChCte() {
                    return chCte;
                }

                /**
                 * Define o valor da propriedade chCte.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setChCte(String value) {
                    this.chCte = value;
                }

                /**
                 * Obtém o valor da propriedade refCteAnu.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getRefCteAnu() {
                    return refCteAnu;
                }

                /**
                 * Define o valor da propriedade refCteAnu.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setRefCteAnu(String value) {
                    this.refCteAnu = value;
                }

                /**
                 * Obtém o valor da propriedade tomaICMS.
                 *
                 * @return possible object is
                 * {@link TomaICMS }
                 */
                public TomaICMS getTomaICMS() {
                    return tomaICMS;
                }

                /**
                 * Define o valor da propriedade tomaICMS.
                 *
                 * @param value allowed object is
                 *              {@link TomaICMS }
                 */
                public void setTomaICMS(TomaICMS value) {
                    this.tomaICMS = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
                 *         &lt;element name="refNF">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;choice>
                 *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
                 *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
                 *                   &lt;/choice>
                 *                   &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
                 *                   &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
                 *                   &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
                 *                   &lt;element name="nro">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;pattern value="[0-9]{1,6}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
                 *                   &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="refCte" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
                 *       &lt;/choice>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "refNFe",
                        "refNF",
                        "refCte"
                })
                public static class TomaICMS {

                    protected String refNFe;
                    protected RefNF refNF;
                    protected String refCte;

                    /**
                     * Obtém o valor da propriedade refNFe.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getRefNFe() {
                        return refNFe;
                    }

                    /**
                     * Define o valor da propriedade refNFe.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setRefNFe(String value) {
                        this.refNFe = value;
                    }

                    /**
                     * Obtém o valor da propriedade refNF.
                     *
                     * @return possible object is
                     * {@link RefNF }
                     */
                    public RefNF getRefNF() {
                        return refNF;
                    }

                    /**
                     * Define o valor da propriedade refNF.
                     *
                     * @param value allowed object is
                     *              {@link RefNF }
                     */
                    public void setRefNF(RefNF value) {
                        this.refNF = value;
                    }

                    /**
                     * Obtém o valor da propriedade refCte.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getRefCte() {
                        return refCte;
                    }

                    /**
                     * Define o valor da propriedade refCte.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setRefCte(String value) {
                        this.refCte = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     *
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;choice>
                     *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
                     *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
                     *         &lt;/choice>
                     *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
                     *         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
                     *         &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
                     *         &lt;element name="nro">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;pattern value="[0-9]{1,6}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
                     *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "cnpj",
                            "cpf",
                            "mod",
                            "serie",
                            "subserie",
                            "nro",
                            "valor",
                            "dEmi"
                    })
                    public static class RefNF {

                        @XmlElement(name = "CNPJ")
                        protected String cnpj;
                        @XmlElement(name = "CPF")
                        protected String cpf;
                        @XmlElement(required = true)
                        protected String mod;
                        @XmlElement(required = true)
                        protected String serie;
                        protected String subserie;
                        @XmlElement(required = true)
                        protected String nro;
                        @XmlElement(required = true)
                        protected String valor;
                        @XmlElement(required = true)
                        protected String dEmi;

                        /**
                         * Obtém o valor da propriedade cnpj.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getCNPJ() {
                            return cnpj;
                        }

                        /**
                         * Define o valor da propriedade cnpj.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setCNPJ(String value) {
                            this.cnpj = value;
                        }

                        /**
                         * Obtém o valor da propriedade cpf.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getCPF() {
                            return cpf;
                        }

                        /**
                         * Define o valor da propriedade cpf.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setCPF(String value) {
                            this.cpf = value;
                        }

                        /**
                         * Obtém o valor da propriedade mod.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getMod() {
                            return mod;
                        }

                        /**
                         * Define o valor da propriedade mod.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setMod(String value) {
                            this.mod = value;
                        }

                        /**
                         * Obtém o valor da propriedade serie.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getSerie() {
                            return serie;
                        }

                        /**
                         * Define o valor da propriedade serie.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setSerie(String value) {
                            this.serie = value;
                        }

                        /**
                         * Obtém o valor da propriedade subserie.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getSubserie() {
                            return subserie;
                        }

                        /**
                         * Define o valor da propriedade subserie.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setSubserie(String value) {
                            this.subserie = value;
                        }

                        /**
                         * Obtém o valor da propriedade nro.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getNro() {
                            return nro;
                        }

                        /**
                         * Define o valor da propriedade nro.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setNro(String value) {
                            this.nro = value;
                        }

                        /**
                         * Obtém o valor da propriedade valor.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getValor() {
                            return valor;
                        }

                        /**
                         * Define o valor da propriedade valor.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setValor(String value) {
                            this.valor = value;
                        }

                        /**
                         * Obtém o valor da propriedade dEmi.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getDEmi() {
                            return dEmi;
                        }

                        /**
                         * Define o valor da propriedade dEmi.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setDEmi(String value) {
                            this.dEmi = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="nDoc">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="serie" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="subserie" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *         &lt;element name="vDoc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "nDoc",
                    "serie",
                    "subserie",
                    "dEmi",
                    "vDoc"
            })
            public static class InfDocRef {

                @XmlElement(required = true)
                protected String nDoc;
                protected String serie;
                protected String subserie;
                @XmlElement(required = true)
                protected String dEmi;
                protected String vDoc;

                /**
                 * Obtém o valor da propriedade nDoc.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getNDoc() {
                    return nDoc;
                }

                /**
                 * Define o valor da propriedade nDoc.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setNDoc(String value) {
                    this.nDoc = value;
                }

                /**
                 * Obtém o valor da propriedade serie.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getSerie() {
                    return serie;
                }

                /**
                 * Define o valor da propriedade serie.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setSerie(String value) {
                    this.serie = value;
                }

                /**
                 * Obtém o valor da propriedade subserie.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getSubserie() {
                    return subserie;
                }

                /**
                 * Define o valor da propriedade subserie.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setSubserie(String value) {
                    this.subserie = value;
                }

                /**
                 * Obtém o valor da propriedade dEmi.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getDEmi() {
                    return dEmi;
                }

                /**
                 * Define o valor da propriedade dEmi.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setDEmi(String value) {
                    this.dEmi = value;
                }

                /**
                 * Obtém o valor da propriedade vDoc.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVDoc() {
                    return vDoc;
                }

                /**
                 * Define o valor da propriedade vDoc.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVDoc(String value) {
                    this.vDoc = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;any processContents='skip'/>
             *       &lt;/sequence>
             *       &lt;attribute name="versaoModal" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="preserve"/>
             *             &lt;pattern value="3\.(0[0-9]|[1-9][0-9])"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "any"
            })
            public static class InfModal {

                @XmlAnyElement
                protected Element any;
                @XmlAttribute(name = "versaoModal", required = true)
                protected String versaoModal;

                /**
                 * Obtém o valor da propriedade any.
                 *
                 * @return possible object is
                 * {@link Element }
                 */
                public Element getAny() {
                    return any;
                }

                /**
                 * Define o valor da propriedade any.
                 *
                 * @param value allowed object is
                 *              {@link Element }
                 */
                public void setAny(Element value) {
                    this.any = value;
                }

                /**
                 * Obtém o valor da propriedade versaoModal.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVersaoModal() {
                    return versaoModal;
                }

                /**
                 * Define o valor da propriedade versaoModal.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVersaoModal(String value) {
                    this.versaoModal = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xDescServ">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="infQ" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "xDescServ",
                    "infQ"
            })
            public static class InfServico {

                @XmlElement(required = true)
                protected String xDescServ;
                protected InfQ infQ;

                /**
                 * Obtém o valor da propriedade xDescServ.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXDescServ() {
                    return xDescServ;
                }

                /**
                 * Define o valor da propriedade xDescServ.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXDescServ(String value) {
                    this.xDescServ = value;
                }

                /**
                 * Obtém o valor da propriedade infQ.
                 *
                 * @return possible object is
                 * {@link InfQ }
                 */
                public InfQ getInfQ() {
                    return infQ;
                }

                /**
                 * Define o valor da propriedade infQ.
                 *
                 * @param value allowed object is
                 *              {@link InfQ }
                 */
                public void setInfQ(InfQ value) {
                    this.infQ = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "qCarga"
                })
                public static class InfQ {

                    @XmlElement(required = true)
                    protected String qCarga;

                    /**
                     * Obtém o valor da propriedade qCarga.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getQCarga() {
                        return qCarga;
                    }

                    /**
                     * Define o valor da propriedade qCarga.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setQCarga(String value) {
                        this.qCarga = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="respSeg">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="1"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xSeg" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nApol" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "respSeg",
                    "xSeg",
                    "nApol"
            })
            public static class Seg {

                @XmlElement(required = true)
                protected String respSeg;
                protected String xSeg;
                protected String nApol;

                /**
                 * Obtém o valor da propriedade respSeg.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getRespSeg() {
                    return respSeg;
                }

                /**
                 * Define o valor da propriedade respSeg.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setRespSeg(String value) {
                    this.respSeg = value;
                }

                /**
                 * Obtém o valor da propriedade xSeg.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXSeg() {
                    return xSeg;
                }

                /**
                 * Define o valor da propriedade xSeg.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXSeg(String value) {
                    this.xSeg = value;
                }

                /**
                 * Obtém o valor da propriedade nApol.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getNApol() {
                    return nApol;
                }

                /**
                 * Define o valor da propriedade nApol.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setNApol(String value) {
                    this.nApol = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="chCte">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[0-9]{44}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "chCte",
                "dEmi"
        })
        public static class InfCteAnu {

            @XmlElement(required = true)
            protected String chCte;
            @XmlElement(required = true)
            protected String dEmi;

            /**
             * Obtém o valor da propriedade chCte.
             *
             * @return possible object is
             * {@link String }
             */
            public String getChCte() {
                return chCte;
            }

            /**
             * Define o valor da propriedade chCte.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setChCte(String value) {
                this.chCte = value;
            }

            /**
             * Obtém o valor da propriedade dEmi.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDEmi() {
                return dEmi;
            }

            /**
             * Define o valor da propriedade dEmi.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDEmi(String value) {
                this.dEmi = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "chCTe"
        })
        public static class InfCteComp {

            @XmlElement(required = true)
            protected String chCTe;

            /**
             * Obtém o valor da propriedade chCTe.
             *
             * @return possible object is
             * {@link String }
             */
            public String getChCTe() {
                return chCTe;
            }

            /**
             * Define o valor da propriedade chCTe.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setChCTe(String value) {
                this.chCTe = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *         &lt;/choice>
         *         &lt;element name="IE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xFant" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
         *         &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *         &lt;element name="email" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TEmail">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "cnpj",
                "cpf",
                "ie",
                "xNome",
                "xFant",
                "fone",
                "enderToma",
                "email"
        })
        public static class Toma {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            protected String xFant;
            protected String fone;
            @XmlElement(required = true)
            protected TEndereco enderToma;
            protected String email;

            /**
             * Obtém o valor da propriedade cnpj.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obtém o valor da propriedade cpf.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Define o valor da propriedade cpf.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

            /**
             * Obtém o valor da propriedade ie.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Obtém o valor da propriedade xNome.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Define o valor da propriedade xNome.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXNome(String value) {
                this.xNome = value;
            }

            /**
             * Obtém o valor da propriedade xFant.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXFant() {
                return xFant;
            }

            /**
             * Define o valor da propriedade xFant.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXFant(String value) {
                this.xFant = value;
            }

            /**
             * Obtém o valor da propriedade fone.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFone() {
                return fone;
            }

            /**
             * Define o valor da propriedade fone.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFone(String value) {
                this.fone = value;
            }

            /**
             * Obtém o valor da propriedade enderToma.
             *
             * @return possible object is
             * {@link TEndereco }
             */
            public TEndereco getEnderToma() {
                return enderToma;
            }

            /**
             * Define o valor da propriedade enderToma.
             *
             * @param value allowed object is
             *              {@link TEndereco }
             */
            public void setEnderToma(TEndereco value) {
                this.enderToma = value;
            }

            /**
             * Obtém o valor da propriedade email.
             *
             * @return possible object is
             * {@link String }
             */
            public String getEmail() {
                return email;
            }

            /**
             * Define o valor da propriedade email.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setEmail(String value) {
                this.email = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *         &lt;element name="vRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *         &lt;element name="Comp" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xNome">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;maxLength value="15"/>
         *                         &lt;minLength value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "vtPrest",
                "vRec",
                "comp"
        })
        public static class VPrest {

            @XmlElement(name = "vTPrest", required = true)
            protected String vtPrest;
            @XmlElement(required = true)
            protected String vRec;
            @XmlElement(name = "Comp")
            protected List<Comp> comp;

            /**
             * Obtém o valor da propriedade vtPrest.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVTPrest() {
                return vtPrest;
            }

            /**
             * Define o valor da propriedade vtPrest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVTPrest(String value) {
                this.vtPrest = value;
            }

            /**
             * Obtém o valor da propriedade vRec.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVRec() {
                return vRec;
            }

            /**
             * Define o valor da propriedade vRec.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVRec(String value) {
                this.vRec = value;
            }

            /**
             * Gets the value of the comp property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comp property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComp().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comp }
             */
            public List<Comp> getComp() {
                if (comp == null) {
                    comp = new ArrayList<Comp>();
                }
                return this.comp;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xNome">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;maxLength value="15"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "xNome",
                    "vComp"
            })
            public static class Comp {

                @XmlElement(required = true)
                protected String xNome;
                @XmlElement(required = true)
                protected String vComp;

                /**
                 * Obtém o valor da propriedade xNome.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXNome() {
                    return xNome;
                }

                /**
                 * Define o valor da propriedade xNome.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXNome(String value) {
                    this.xNome = value;
                }

                /**
                 * Obtém o valor da propriedade vComp.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVComp() {
                    return vComp;
                }

                /**
                 * Define o valor da propriedade vComp.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVComp(String value) {
                    this.vComp = value;
                }

            }

        }

    }

}
