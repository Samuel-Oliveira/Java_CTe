
package br.com.swconsultoria.cte.schema_300.cteModalFerroviario;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * Tipo Conhecimento de Transporte Eletrônico (Modelo 57)
 *
 * <p>Classe Java de TCTe complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TCTe">
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
 *                             &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/>
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
 *                                   &lt;enumeration value="4"/>
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
 *                             &lt;element name="indGlobalizado" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="1"/>
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
 *                             &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTransp"/>
 *                             &lt;element name="tpServ">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
 *                             &lt;element name="xMunIni">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                             &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
 *                             &lt;element name="xMunFim">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                             &lt;element name="retira">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xDetRetira" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="160"/>
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
 *                             &lt;choice>
 *                               &lt;element name="toma3">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="toma">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;enumeration value="0"/>
 *                                               &lt;enumeration value="1"/>
 *                                               &lt;enumeration value="2"/>
 *                                               &lt;enumeration value="3"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="toma4">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="toma">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;enumeration value="4"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;choice>
 *                                           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                                           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                                         &lt;/choice>
 *                                         &lt;element name="IE" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;sequence>
 *                                           &lt;element name="xNome">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                 &lt;maxLength value="60"/>
 *                                                 &lt;minLength value="2"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="xFant" minOccurs="0">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                 &lt;maxLength value="60"/>
 *                                                 &lt;minLength value="2"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
 *                                           &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                                           &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
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
 *                             &lt;element name="fluxo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="xOrig" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="60"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="pass" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="xPass" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="xDest" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="60"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="xRota" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Entrega" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="semData">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpPer">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="0"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="comData">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpPer">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="1"/>
 *                                                         &lt;enumeration value="2"/>
 *                                                         &lt;enumeration value="3"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dProg" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="noPeriodo">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpPer">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="4"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                   &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="semHora">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpHor">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="0"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="comHora">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpHor">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="1"/>
 *                                                         &lt;enumeration value="2"/>
 *                                                         &lt;enumeration value="3"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="hProg" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="noInter">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpHor">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="4"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="hIni" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
 *                                                   &lt;element name="hFim" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="origCalc" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="destCalc" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="40"/>
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
 *                   &lt;element name="rem" minOccurs="0">
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
 *                             &lt;element name="enderReme" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
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
 *                   &lt;element name="exped" minOccurs="0">
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
 *                             &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
 *                             &lt;element name="enderExped" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                             &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="receb" minOccurs="0">
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
 *                             &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
 *                             &lt;element name="enderReceb" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                             &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dest" minOccurs="0">
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
 *                             &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
 *                             &lt;element name="ISUF" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{8,9}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="enderDest" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                             &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
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
 *                             &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImp"/>
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
 *                               &lt;element name="infCarga">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                                         &lt;element name="proPred">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="60"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="xOutCat" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="30"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="infQ" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="cUnid">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="00"/>
 *                                                         &lt;enumeration value="01"/>
 *                                                         &lt;enumeration value="02"/>
 *                                                         &lt;enumeration value="03"/>
 *                                                         &lt;enumeration value="04"/>
 *                                                         &lt;enumeration value="05"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="tpMed">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                         &lt;minLength value="1"/>
 *                                                         &lt;maxLength value="20"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="vCargaAverb" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infDoc" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;choice>
 *                                           &lt;element name="infNF" maxOccurs="unbounded">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element name="nRoma" minOccurs="0">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                           &lt;minLength value="1"/>
 *                                                           &lt;maxLength value="20"/>
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="nPed" minOccurs="0">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                           &lt;minLength value="1"/>
 *                                                           &lt;maxLength value="20"/>
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModNF"/>
 *                                                     &lt;element name="serie">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                           &lt;minLength value="1"/>
 *                                                           &lt;maxLength value="3"/>
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="nDoc">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                           &lt;minLength value="1"/>
 *                                                           &lt;maxLength value="20"/>
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                     &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                                     &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                                     &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                                     &lt;element name="vST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                                     &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                                     &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                                     &lt;element name="nCFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
 *                                                     &lt;element name="nPeso" type="{http://www.portalfiscal.inf.br/cte}TDec_1203Opc" minOccurs="0"/>
 *                                                     &lt;element name="PIN" minOccurs="0">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                           &lt;whiteSpace value="preserve"/>
 *                                                           &lt;minLength value="2"/>
 *                                                           &lt;maxLength value="9"/>
 *                                                           &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
 *                                                     &lt;choice>
 *                                                       &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
 *                                                       &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
 *                                                     &lt;/choice>
 *                                                   &lt;/sequence>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element name="infNFe" maxOccurs="unbounded">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                                                     &lt;element name="PIN" minOccurs="0">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                           &lt;whiteSpace value="preserve"/>
 *                                                           &lt;minLength value="2"/>
 *                                                           &lt;maxLength value="9"/>
 *                                                           &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
 *                                                     &lt;choice>
 *                                                       &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
 *                                                       &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
 *                                                     &lt;/choice>
 *                                                   &lt;/sequence>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element name="infOutros" maxOccurs="unbounded">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element name="tpDoc">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                           &lt;whiteSpace value="preserve"/>
 *                                                           &lt;enumeration value="00"/>
 *                                                           &lt;enumeration value="10"/>
 *                                                           &lt;enumeration value="59"/>
 *                                                           &lt;enumeration value="65"/>
 *                                                           &lt;enumeration value="99"/>
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="descOutros" minOccurs="0">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                           &lt;minLength value="1"/>
 *                                                           &lt;maxLength value="100"/>
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="nDoc" minOccurs="0">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                           &lt;minLength value="1"/>
 *                                                           &lt;maxLength value="20"/>
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
 *                                                     &lt;element name="vDocFisc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                                     &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
 *                                                     &lt;choice>
 *                                                       &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
 *                                                       &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
 *                                                     &lt;/choice>
 *                                                   &lt;/sequence>
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
 *                               &lt;element name="docAnt" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="emiDocAnt" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;choice>
 *                                                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                                                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                                                   &lt;/choice>
 *                                                   &lt;sequence minOccurs="0">
 *                                                     &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
 *                                                     &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                                                   &lt;/sequence>
 *                                                   &lt;element name="xNome">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                         &lt;maxLength value="60"/>
 *                                                         &lt;minLength value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="idDocAnt" maxOccurs="2">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;choice>
 *                                                             &lt;element name="idDocAntPap" maxOccurs="unbounded">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="tpDoc">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDocAssoc">
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="serie">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                                             &lt;minLength value="1"/>
 *                                                                             &lt;maxLength value="3"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="subser" minOccurs="0">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                                             &lt;minLength value="1"/>
 *                                                                             &lt;maxLength value="2"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="nDoc">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                                             &lt;minLength value="1"/>
 *                                                                             &lt;maxLength value="30"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="idDocAntEle" maxOccurs="unbounded">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/choice>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
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
 *                               &lt;element name="infModal">
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
 *                               &lt;element name="veicNovos" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="chassi">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;length value="17"/>
 *                                               &lt;pattern value="[A-Z0-9]+"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="cCor">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="4"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="xCor">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="40"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="cMod">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="6"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="vUnit" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                         &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="cobr" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="fat" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="nFat" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                         &lt;minLength value="1"/>
 *                                                         &lt;maxLength value="60"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                                   &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                                   &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="dup" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="nDup" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                         &lt;maxLength value="60"/>
 *                                                         &lt;minLength value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
 *                                                   &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
 *                                         &lt;element name="indAlteraToma" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infGlobalizado" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="xObs">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="15"/>
 *                                               &lt;maxLength value="256"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infServVinc" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="infCTeMultimodal" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="chCTeMultimodal" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCTe", propOrder = {
        "infCte",
        "signature"
})
public class TCTe {

    @XmlElement(required = true)
    protected InfCte infCte;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

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
     *                   &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/>
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
     *                         &lt;enumeration value="4"/>
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
     *                   &lt;element name="indGlobalizado" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="1"/>
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
     *                   &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTransp"/>
     *                   &lt;element name="tpServ">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
     *                   &lt;element name="xMunIni">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                   &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
     *                   &lt;element name="xMunFim">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                   &lt;element name="retira">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xDetRetira" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="160"/>
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
     *                   &lt;choice>
     *                     &lt;element name="toma3">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="toma">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;enumeration value="0"/>
     *                                     &lt;enumeration value="1"/>
     *                                     &lt;enumeration value="2"/>
     *                                     &lt;enumeration value="3"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="toma4">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="toma">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;enumeration value="4"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;choice>
     *                                 &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                                 &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                               &lt;/choice>
     *                               &lt;element name="IE" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;sequence>
     *                                 &lt;element name="xNome">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                       &lt;maxLength value="60"/>
     *                                       &lt;minLength value="2"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="xFant" minOccurs="0">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                       &lt;maxLength value="60"/>
     *                                       &lt;minLength value="2"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
     *                                 &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                                 &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
     *                               &lt;/sequence>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
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
     *                   &lt;element name="fluxo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="xOrig" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="60"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="pass" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="xPass" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="15"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="xDest" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="60"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="xRota" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Entrega" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="semData">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpPer">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="0"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="comData">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpPer">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="1"/>
     *                                               &lt;enumeration value="2"/>
     *                                               &lt;enumeration value="3"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dProg" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="noPeriodo">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpPer">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="4"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                         &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="semHora">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpHor">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="0"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="comHora">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpHor">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="1"/>
     *                                               &lt;enumeration value="2"/>
     *                                               &lt;enumeration value="3"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="hProg" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="noInter">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpHor">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="4"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="hIni" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
     *                                         &lt;element name="hFim" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="origCalc" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="destCalc" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="40"/>
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
     *         &lt;element name="rem" minOccurs="0">
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
     *                   &lt;element name="enderReme" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
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
     *         &lt;element name="exped" minOccurs="0">
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
     *                   &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
     *                   &lt;element name="enderExped" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                   &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="receb" minOccurs="0">
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
     *                   &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
     *                   &lt;element name="enderReceb" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                   &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dest" minOccurs="0">
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
     *                   &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
     *                   &lt;element name="ISUF" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{8,9}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="enderDest" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                   &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
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
     *                   &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImp"/>
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
     *                     &lt;element name="infCarga">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *                               &lt;element name="proPred">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="60"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="xOutCat" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="30"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="infQ" maxOccurs="unbounded">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="cUnid">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="00"/>
     *                                               &lt;enumeration value="01"/>
     *                                               &lt;enumeration value="02"/>
     *                                               &lt;enumeration value="03"/>
     *                                               &lt;enumeration value="04"/>
     *                                               &lt;enumeration value="05"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="tpMed">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                               &lt;minLength value="1"/>
     *                                               &lt;maxLength value="20"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="vCargaAverb" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="infDoc" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;choice>
     *                                 &lt;element name="infNF" maxOccurs="unbounded">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         &lt;sequence>
     *                                           &lt;element name="nRoma" minOccurs="0">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                 &lt;minLength value="1"/>
     *                                                 &lt;maxLength value="20"/>
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                           &lt;element name="nPed" minOccurs="0">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                 &lt;minLength value="1"/>
     *                                                 &lt;maxLength value="20"/>
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                           &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModNF"/>
     *                                           &lt;element name="serie">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                 &lt;minLength value="1"/>
     *                                                 &lt;maxLength value="3"/>
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                           &lt;element name="nDoc">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                 &lt;minLength value="1"/>
     *                                                 &lt;maxLength value="20"/>
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                           &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                                           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                                           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                                           &lt;element name="vST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                                           &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                                           &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                                           &lt;element name="nCFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
     *                                           &lt;element name="nPeso" type="{http://www.portalfiscal.inf.br/cte}TDec_1203Opc" minOccurs="0"/>
     *                                           &lt;element name="PIN" minOccurs="0">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                 &lt;whiteSpace value="preserve"/>
     *                                                 &lt;minLength value="2"/>
     *                                                 &lt;maxLength value="9"/>
     *                                                 &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                           &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
     *                                           &lt;choice>
     *                                             &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
     *                                             &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
     *                                           &lt;/choice>
     *                                         &lt;/sequence>
     *                                       &lt;/restriction>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                                 &lt;element name="infNFe" maxOccurs="unbounded">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         &lt;sequence>
     *                                           &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
     *                                           &lt;element name="PIN" minOccurs="0">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                 &lt;whiteSpace value="preserve"/>
     *                                                 &lt;minLength value="2"/>
     *                                                 &lt;maxLength value="9"/>
     *                                                 &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                           &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
     *                                           &lt;choice>
     *                                             &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
     *                                             &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
     *                                           &lt;/choice>
     *                                         &lt;/sequence>
     *                                       &lt;/restriction>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                                 &lt;element name="infOutros" maxOccurs="unbounded">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         &lt;sequence>
     *                                           &lt;element name="tpDoc">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                 &lt;whiteSpace value="preserve"/>
     *                                                 &lt;enumeration value="00"/>
     *                                                 &lt;enumeration value="10"/>
     *                                                 &lt;enumeration value="59"/>
     *                                                 &lt;enumeration value="65"/>
     *                                                 &lt;enumeration value="99"/>
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                           &lt;element name="descOutros" minOccurs="0">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                 &lt;minLength value="1"/>
     *                                                 &lt;maxLength value="100"/>
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                           &lt;element name="nDoc" minOccurs="0">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                 &lt;minLength value="1"/>
     *                                                 &lt;maxLength value="20"/>
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                           &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
     *                                           &lt;element name="vDocFisc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                                           &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
     *                                           &lt;choice>
     *                                             &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
     *                                             &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
     *                                           &lt;/choice>
     *                                         &lt;/sequence>
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
     *                     &lt;element name="docAnt" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="emiDocAnt" maxOccurs="unbounded">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;choice>
     *                                           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                                           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                                         &lt;/choice>
     *                                         &lt;sequence minOccurs="0">
     *                                           &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
     *                                           &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                                         &lt;/sequence>
     *                                         &lt;element name="xNome">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                               &lt;maxLength value="60"/>
     *                                               &lt;minLength value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="idDocAnt" maxOccurs="2">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;choice>
     *                                                   &lt;element name="idDocAntPap" maxOccurs="unbounded">
     *                                                     &lt;complexType>
     *                                                       &lt;complexContent>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                           &lt;sequence>
     *                                                             &lt;element name="tpDoc">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDocAssoc">
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="serie">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                                   &lt;minLength value="1"/>
     *                                                                   &lt;maxLength value="3"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="subser" minOccurs="0">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                                   &lt;minLength value="1"/>
     *                                                                   &lt;maxLength value="2"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="nDoc">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                                   &lt;minLength value="1"/>
     *                                                                   &lt;maxLength value="30"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                                           &lt;/sequence>
     *                                                         &lt;/restriction>
     *                                                       &lt;/complexContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="idDocAntEle" maxOccurs="unbounded">
     *                                                     &lt;complexType>
     *                                                       &lt;complexContent>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                           &lt;sequence>
     *                                                             &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
     *                                                           &lt;/sequence>
     *                                                         &lt;/restriction>
     *                                                       &lt;/complexContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                 &lt;/choice>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
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
     *                     &lt;element name="infModal">
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
     *                     &lt;element name="veicNovos" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="chassi">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;length value="17"/>
     *                                     &lt;pattern value="[A-Z0-9]+"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="cCor">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="4"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="xCor">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="40"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="cMod">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="6"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="vUnit" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                               &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="cobr" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="fat" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="nFat" minOccurs="0">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                               &lt;minLength value="1"/>
     *                                               &lt;maxLength value="60"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                                         &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                                         &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="dup" maxOccurs="unbounded" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="nDup" minOccurs="0">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                               &lt;maxLength value="60"/>
     *                                               &lt;minLength value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
     *                                         &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
     *                               &lt;element name="indAlteraToma" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="infGlobalizado" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="xObs">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="15"/>
     *                                     &lt;maxLength value="256"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="infServVinc" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="infCTeMultimodal" maxOccurs="unbounded">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="chCTeMultimodal" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
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
            "rem",
            "exped",
            "receb",
            "dest",
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
        protected Rem rem;
        protected Exped exped;
        protected Receb receb;
        protected Dest dest;
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
         * Obtém o valor da propriedade rem.
         *
         * @return possible object is
         * {@link Rem }
         */
        public Rem getRem() {
            return rem;
        }

        /**
         * Define o valor da propriedade rem.
         *
         * @param value allowed object is
         *              {@link Rem }
         */
        public void setRem(Rem value) {
            this.rem = value;
        }

        /**
         * Obtém o valor da propriedade exped.
         *
         * @return possible object is
         * {@link Exped }
         */
        public Exped getExped() {
            return exped;
        }

        /**
         * Define o valor da propriedade exped.
         *
         * @param value allowed object is
         *              {@link Exped }
         */
        public void setExped(Exped value) {
            this.exped = value;
        }

        /**
         * Obtém o valor da propriedade receb.
         *
         * @return possible object is
         * {@link Receb }
         */
        public Receb getReceb() {
            return receb;
        }

        /**
         * Define o valor da propriedade receb.
         *
         * @param value allowed object is
         *              {@link Receb }
         */
        public void setReceb(Receb value) {
            this.receb = value;
        }

        /**
         * Obtém o valor da propriedade dest.
         *
         * @return possible object is
         * {@link Dest }
         */
        public Dest getDest() {
            return dest;
        }

        /**
         * Define o valor da propriedade dest.
         *
         * @param value allowed object is
         *              {@link Dest }
         */
        public void setDest(Dest value) {
            this.dest = value;
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
         *         &lt;element name="fluxo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xOrig" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="pass" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="xPass" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="15"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="xDest" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xRota" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Entrega" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="semData">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpPer">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="0"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="comData">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpPer">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="1"/>
         *                                     &lt;enumeration value="2"/>
         *                                     &lt;enumeration value="3"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dProg" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="noPeriodo">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpPer">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="4"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                               &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="semHora">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpHor">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="0"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="comHora">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpHor">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="1"/>
         *                                     &lt;enumeration value="2"/>
         *                                     &lt;enumeration value="3"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="hProg" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="noInter">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpHor">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="4"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="hIni" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
         *                               &lt;element name="hFim" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
         *                             &lt;/sequence>
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
         *         &lt;element name="origCalc" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="destCalc" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="40"/>
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
                "fluxo",
                "entrega",
                "origCalc",
                "destCalc",
                "xObs",
                "obsCont",
                "obsFisco"
        })
        public static class Compl {

            protected String xCaracAd;
            protected String xCaracSer;
            protected String xEmi;
            protected Fluxo fluxo;
            @XmlElement(name = "Entrega")
            protected Entrega entrega;
            protected String origCalc;
            protected String destCalc;
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
             * Obtém o valor da propriedade fluxo.
             *
             * @return possible object is
             * {@link Fluxo }
             */
            public Fluxo getFluxo() {
                return fluxo;
            }

            /**
             * Define o valor da propriedade fluxo.
             *
             * @param value allowed object is
             *              {@link Fluxo }
             */
            public void setFluxo(Fluxo value) {
                this.fluxo = value;
            }

            /**
             * Obtém o valor da propriedade entrega.
             *
             * @return possible object is
             * {@link Entrega }
             */
            public Entrega getEntrega() {
                return entrega;
            }

            /**
             * Define o valor da propriedade entrega.
             *
             * @param value allowed object is
             *              {@link Entrega }
             */
            public void setEntrega(Entrega value) {
                this.entrega = value;
            }

            /**
             * Obtém o valor da propriedade origCalc.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOrigCalc() {
                return origCalc;
            }

            /**
             * Define o valor da propriedade origCalc.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOrigCalc(String value) {
                this.origCalc = value;
            }

            /**
             * Obtém o valor da propriedade destCalc.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDestCalc() {
                return destCalc;
            }

            /**
             * Define o valor da propriedade destCalc.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDestCalc(String value) {
                this.destCalc = value;
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
             *         &lt;choice>
             *           &lt;element name="semData">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpPer">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="0"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="comData">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpPer">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dProg" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="noPeriodo">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpPer">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="4"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                     &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="semHora">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpHor">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="0"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="comHora">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpHor">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="hProg" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="noInter">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpHor">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="4"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="hIni" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
             *                     &lt;element name="hFim" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
             *                   &lt;/sequence>
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
                    "semData",
                    "comData",
                    "noPeriodo",
                    "semHora",
                    "comHora",
                    "noInter"
            })
            public static class Entrega {

                protected SemData semData;
                protected ComData comData;
                protected NoPeriodo noPeriodo;
                protected SemHora semHora;
                protected ComHora comHora;
                protected NoInter noInter;

                /**
                 * Obtém o valor da propriedade semData.
                 *
                 * @return possible object is
                 * {@link SemData }
                 */
                public SemData getSemData() {
                    return semData;
                }

                /**
                 * Define o valor da propriedade semData.
                 *
                 * @param value allowed object is
                 *              {@link SemData }
                 */
                public void setSemData(SemData value) {
                    this.semData = value;
                }

                /**
                 * Obtém o valor da propriedade comData.
                 *
                 * @return possible object is
                 * {@link ComData }
                 */
                public ComData getComData() {
                    return comData;
                }

                /**
                 * Define o valor da propriedade comData.
                 *
                 * @param value allowed object is
                 *              {@link ComData }
                 */
                public void setComData(ComData value) {
                    this.comData = value;
                }

                /**
                 * Obtém o valor da propriedade noPeriodo.
                 *
                 * @return possible object is
                 * {@link NoPeriodo }
                 */
                public NoPeriodo getNoPeriodo() {
                    return noPeriodo;
                }

                /**
                 * Define o valor da propriedade noPeriodo.
                 *
                 * @param value allowed object is
                 *              {@link NoPeriodo }
                 */
                public void setNoPeriodo(NoPeriodo value) {
                    this.noPeriodo = value;
                }

                /**
                 * Obtém o valor da propriedade semHora.
                 *
                 * @return possible object is
                 * {@link SemHora }
                 */
                public SemHora getSemHora() {
                    return semHora;
                }

                /**
                 * Define o valor da propriedade semHora.
                 *
                 * @param value allowed object is
                 *              {@link SemHora }
                 */
                public void setSemHora(SemHora value) {
                    this.semHora = value;
                }

                /**
                 * Obtém o valor da propriedade comHora.
                 *
                 * @return possible object is
                 * {@link ComHora }
                 */
                public ComHora getComHora() {
                    return comHora;
                }

                /**
                 * Define o valor da propriedade comHora.
                 *
                 * @param value allowed object is
                 *              {@link ComHora }
                 */
                public void setComHora(ComHora value) {
                    this.comHora = value;
                }

                /**
                 * Obtém o valor da propriedade noInter.
                 *
                 * @return possible object is
                 * {@link NoInter }
                 */
                public NoInter getNoInter() {
                    return noInter;
                }

                /**
                 * Define o valor da propriedade noInter.
                 *
                 * @param value allowed object is
                 *              {@link NoInter }
                 */
                public void setNoInter(NoInter value) {
                    this.noInter = value;
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
                 *         &lt;element name="tpPer">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dProg" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "tpPer",
                        "dProg"
                })
                public static class ComData {

                    @XmlElement(required = true)
                    protected String tpPer;
                    @XmlElement(required = true)
                    protected String dProg;

                    /**
                     * Obtém o valor da propriedade tpPer.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getTpPer() {
                        return tpPer;
                    }

                    /**
                     * Define o valor da propriedade tpPer.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setTpPer(String value) {
                        this.tpPer = value;
                    }

                    /**
                     * Obtém o valor da propriedade dProg.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getDProg() {
                        return dProg;
                    }

                    /**
                     * Define o valor da propriedade dProg.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setDProg(String value) {
                        this.dProg = value;
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
                 *         &lt;element name="tpHor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="hProg" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "tpHor",
                        "hProg"
                })
                public static class ComHora {

                    @XmlElement(required = true)
                    protected String tpHor;
                    @XmlElement(required = true)
                    protected String hProg;

                    /**
                     * Obtém o valor da propriedade tpHor.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getTpHor() {
                        return tpHor;
                    }

                    /**
                     * Define o valor da propriedade tpHor.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setTpHor(String value) {
                        this.tpHor = value;
                    }

                    /**
                     * Obtém o valor da propriedade hProg.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getHProg() {
                        return hProg;
                    }

                    /**
                     * Define o valor da propriedade hProg.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setHProg(String value) {
                        this.hProg = value;
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
                 *         &lt;element name="tpHor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="hIni" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
                 *         &lt;element name="hFim" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "tpHor",
                        "hIni",
                        "hFim"
                })
                public static class NoInter {

                    @XmlElement(required = true)
                    protected String tpHor;
                    @XmlElement(required = true)
                    protected String hIni;
                    @XmlElement(required = true)
                    protected String hFim;

                    /**
                     * Obtém o valor da propriedade tpHor.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getTpHor() {
                        return tpHor;
                    }

                    /**
                     * Define o valor da propriedade tpHor.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setTpHor(String value) {
                        this.tpHor = value;
                    }

                    /**
                     * Obtém o valor da propriedade hIni.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getHIni() {
                        return hIni;
                    }

                    /**
                     * Define o valor da propriedade hIni.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setHIni(String value) {
                        this.hIni = value;
                    }

                    /**
                     * Obtém o valor da propriedade hFim.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getHFim() {
                        return hFim;
                    }

                    /**
                     * Define o valor da propriedade hFim.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setHFim(String value) {
                        this.hFim = value;
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
                 *         &lt;element name="tpPer">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                 *         &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "tpPer",
                        "dIni",
                        "dFim"
                })
                public static class NoPeriodo {

                    @XmlElement(required = true)
                    protected String tpPer;
                    @XmlElement(required = true)
                    protected String dIni;
                    @XmlElement(required = true)
                    protected String dFim;

                    /**
                     * Obtém o valor da propriedade tpPer.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getTpPer() {
                        return tpPer;
                    }

                    /**
                     * Define o valor da propriedade tpPer.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setTpPer(String value) {
                        this.tpPer = value;
                    }

                    /**
                     * Obtém o valor da propriedade dIni.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getDIni() {
                        return dIni;
                    }

                    /**
                     * Define o valor da propriedade dIni.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setDIni(String value) {
                        this.dIni = value;
                    }

                    /**
                     * Obtém o valor da propriedade dFim.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getDFim() {
                        return dFim;
                    }

                    /**
                     * Define o valor da propriedade dFim.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setDFim(String value) {
                        this.dFim = value;
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
                 *         &lt;element name="tpPer">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="0"/>
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
                        "tpPer"
                })
                public static class SemData {

                    @XmlElement(required = true)
                    protected String tpPer;

                    /**
                     * Obtém o valor da propriedade tpPer.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getTpPer() {
                        return tpPer;
                    }

                    /**
                     * Define o valor da propriedade tpPer.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setTpPer(String value) {
                        this.tpPer = value;
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
                 *         &lt;element name="tpHor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="0"/>
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
                        "tpHor"
                })
                public static class SemHora {

                    @XmlElement(required = true)
                    protected String tpHor;

                    /**
                     * Obtém o valor da propriedade tpHor.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getTpHor() {
                        return tpHor;
                    }

                    /**
                     * Define o valor da propriedade tpHor.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setTpHor(String value) {
                        this.tpHor = value;
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
             *         &lt;element name="xOrig" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="pass" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="xPass" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="15"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="xDest" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xRota" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="10"/>
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
                    "xOrig",
                    "pass",
                    "xDest",
                    "xRota"
            })
            public static class Fluxo {

                protected String xOrig;
                protected List<Pass> pass;
                protected String xDest;
                protected String xRota;

                /**
                 * Obtém o valor da propriedade xOrig.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXOrig() {
                    return xOrig;
                }

                /**
                 * Define o valor da propriedade xOrig.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXOrig(String value) {
                    this.xOrig = value;
                }

                /**
                 * Gets the value of the pass property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pass property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPass().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Pass }
                 */
                public List<Pass> getPass() {
                    if (pass == null) {
                        pass = new ArrayList<Pass>();
                    }
                    return this.pass;
                }

                /**
                 * Obtém o valor da propriedade xDest.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXDest() {
                    return xDest;
                }

                /**
                 * Define o valor da propriedade xDest.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXDest(String value) {
                    this.xDest = value;
                }

                /**
                 * Obtém o valor da propriedade xRota.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXRota() {
                    return xRota;
                }

                /**
                 * Define o valor da propriedade xRota.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXRota(String value) {
                    this.xRota = value;
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
                 *         &lt;element name="xPass" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="15"/>
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
                        "xPass"
                })
                public static class Pass {

                    protected String xPass;

                    /**
                     * Obtém o valor da propriedade xPass.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getXPass() {
                        return xPass;
                    }

                    /**
                     * Define o valor da propriedade xPass.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setXPass(String value) {
                        this.xPass = value;
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
         *         &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
         *         &lt;element name="ISUF" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{8,9}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="enderDest" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *         &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
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
                "fone",
                "isuf",
                "enderDest",
                "email"
        })
        public static class Dest {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            protected String fone;
            @XmlElement(name = "ISUF")
            protected String isuf;
            @XmlElement(required = true)
            protected TEndereco enderDest;
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
             * Obtém o valor da propriedade isuf.
             *
             * @return possible object is
             * {@link String }
             */
            public String getISUF() {
                return isuf;
            }

            /**
             * Define o valor da propriedade isuf.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setISUF(String value) {
                this.isuf = value;
            }

            /**
             * Obtém o valor da propriedade enderDest.
             *
             * @return possible object is
             * {@link TEndereco }
             */
            public TEndereco getEnderDest() {
                return enderDest;
            }

            /**
             * Define o valor da propriedade enderDest.
             *
             * @param value allowed object is
             *              {@link TEndereco }
             */
            public void setEnderDest(TEndereco value) {
                this.enderDest = value;
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
         *         &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
         *         &lt;element name="enderExped" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *         &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
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
                "fone",
                "enderExped",
                "email"
        })
        public static class Exped {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            protected String fone;
            @XmlElement(required = true)
            protected TEndereco enderExped;
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
             * Obtém o valor da propriedade enderExped.
             *
             * @return possible object is
             * {@link TEndereco }
             */
            public TEndereco getEnderExped() {
                return enderExped;
            }

            /**
             * Define o valor da propriedade enderExped.
             *
             * @param value allowed object is
             *              {@link TEndereco }
             */
            public void setEnderExped(TEndereco value) {
                this.enderExped = value;
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
         *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/>
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
         *               &lt;enumeration value="4"/>
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
         *         &lt;element name="indGlobalizado" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="1"/>
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
         *         &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTransp"/>
         *         &lt;element name="tpServ">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
         *         &lt;element name="xMunIni">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *         &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
         *         &lt;element name="xMunFim">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *         &lt;element name="retira">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xDetRetira" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="160"/>
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
         *         &lt;choice>
         *           &lt;element name="toma3">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="toma">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;whiteSpace value="preserve"/>
         *                           &lt;enumeration value="0"/>
         *                           &lt;enumeration value="1"/>
         *                           &lt;enumeration value="2"/>
         *                           &lt;enumeration value="3"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="toma4">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="toma">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;whiteSpace value="preserve"/>
         *                           &lt;enumeration value="4"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;choice>
         *                       &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *                       &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *                     &lt;/choice>
         *                     &lt;element name="IE" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;sequence>
         *                       &lt;element name="xNome">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                             &lt;maxLength value="60"/>
         *                             &lt;minLength value="2"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="xFant" minOccurs="0">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                             &lt;maxLength value="60"/>
         *                             &lt;minLength value="2"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
         *                       &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *                       &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
         *                     &lt;/sequence>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
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
                "indGlobalizado",
                "cMunEnv",
                "xMunEnv",
                "ufEnv",
                "modal",
                "tpServ",
                "cMunIni",
                "xMunIni",
                "ufIni",
                "cMunFim",
                "xMunFim",
                "ufFim",
                "retira",
                "xDetRetira",
                "indIEToma",
                "toma3",
                "toma4",
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
            protected String indGlobalizado;
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
            protected String cMunIni;
            @XmlElement(required = true)
            protected String xMunIni;
            @XmlElement(name = "UFIni", required = true)
            protected TUf ufIni;
            @XmlElement(required = true)
            protected String cMunFim;
            @XmlElement(required = true)
            protected String xMunFim;
            @XmlElement(name = "UFFim", required = true)
            protected TUf ufFim;
            @XmlElement(required = true)
            protected String retira;
            protected String xDetRetira;
            @XmlElement(required = true)
            protected String indIEToma;
            protected Toma3 toma3;
            protected Toma4 toma4;
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
             * Obtém o valor da propriedade indGlobalizado.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIndGlobalizado() {
                return indGlobalizado;
            }

            /**
             * Define o valor da propriedade indGlobalizado.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIndGlobalizado(String value) {
                this.indGlobalizado = value;
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
             * Obtém o valor da propriedade retira.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRetira() {
                return retira;
            }

            /**
             * Define o valor da propriedade retira.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRetira(String value) {
                this.retira = value;
            }

            /**
             * Obtém o valor da propriedade xDetRetira.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXDetRetira() {
                return xDetRetira;
            }

            /**
             * Define o valor da propriedade xDetRetira.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXDetRetira(String value) {
                this.xDetRetira = value;
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
             * Obtém o valor da propriedade toma3.
             *
             * @return possible object is
             * {@link Toma3 }
             */
            public Toma3 getToma3() {
                return toma3;
            }

            /**
             * Define o valor da propriedade toma3.
             *
             * @param value allowed object is
             *              {@link Toma3 }
             */
            public void setToma3(Toma3 value) {
                this.toma3 = value;
            }

            /**
             * Obtém o valor da propriedade toma4.
             *
             * @return possible object is
             * {@link Toma4 }
             */
            public Toma4 getToma4() {
                return toma4;
            }

            /**
             * Define o valor da propriedade toma4.
             *
             * @param value allowed object is
             *              {@link Toma4 }
             */
            public void setToma4(Toma4 value) {
                this.toma4 = value;
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
             *         &lt;element name="toma">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
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
                    "toma"
            })
            public static class Toma3 {

                @XmlElement(required = true)
                protected String toma;

                /**
                 * Obtém o valor da propriedade toma.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getToma() {
                    return toma;
                }

                /**
                 * Define o valor da propriedade toma.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setToma(String value) {
                    this.toma = value;
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
             *         &lt;element name="toma">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
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
             *         &lt;sequence>
             *           &lt;element name="xNome">
             *             &lt;simpleType>
             *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                 &lt;maxLength value="60"/>
             *                 &lt;minLength value="2"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="xFant" minOccurs="0">
             *             &lt;simpleType>
             *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                 &lt;maxLength value="60"/>
             *                 &lt;minLength value="2"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
             *           &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
             *           &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
             *         &lt;/sequence>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "toma",
                    "cnpj",
                    "cpf",
                    "ie",
                    "xNome",
                    "xFant",
                    "fone",
                    "enderToma",
                    "email"
            })
            public static class Toma4 {

                @XmlElement(required = true)
                protected String toma;
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
                 * Obtém o valor da propriedade toma.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getToma() {
                    return toma;
                }

                /**
                 * Define o valor da propriedade toma.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setToma(String value) {
                    this.toma = value;
                }

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
         *         &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImp"/>
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
                "icmsufFim"
        })
        public static class Imp {

            @XmlElement(name = "ICMS", required = true)
            protected TImp icms;
            protected String vTotTrib;
            protected String infAdFisco;
            @XmlElement(name = "ICMSUFFim")
            protected ICMSUFFim icmsufFim;

            /**
             * Obtém o valor da propriedade icms.
             *
             * @return possible object is
             * {@link TImp }
             */
            public TImp getICMS() {
                return icms;
            }

            /**
             * Define o valor da propriedade icms.
             *
             * @param value allowed object is
             *              {@link TImp }
             */
            public void setICMS(TImp value) {
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
         *         &lt;element name="infCarga">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
         *                   &lt;element name="proPred">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xOutCat" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="infQ" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cUnid">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;enumeration value="00"/>
         *                                   &lt;enumeration value="01"/>
         *                                   &lt;enumeration value="02"/>
         *                                   &lt;enumeration value="03"/>
         *                                   &lt;enumeration value="04"/>
         *                                   &lt;enumeration value="05"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="tpMed">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="20"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="vCargaAverb" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infDoc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="infNF" maxOccurs="unbounded">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="nRoma" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="20"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="nPed" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="20"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModNF"/>
         *                               &lt;element name="serie">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="3"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="nDoc">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="20"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                               &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                               &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                               &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                               &lt;element name="vST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                               &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                               &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                               &lt;element name="nCFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
         *                               &lt;element name="nPeso" type="{http://www.portalfiscal.inf.br/cte}TDec_1203Opc" minOccurs="0"/>
         *                               &lt;element name="PIN" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;minLength value="2"/>
         *                                     &lt;maxLength value="9"/>
         *                                     &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
         *                               &lt;choice>
         *                                 &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
         *                                 &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
         *                               &lt;/choice>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="infNFe" maxOccurs="unbounded">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
         *                               &lt;element name="PIN" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;minLength value="2"/>
         *                                     &lt;maxLength value="9"/>
         *                                     &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
         *                               &lt;choice>
         *                                 &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
         *                                 &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
         *                               &lt;/choice>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="infOutros" maxOccurs="unbounded">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpDoc">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="00"/>
         *                                     &lt;enumeration value="10"/>
         *                                     &lt;enumeration value="59"/>
         *                                     &lt;enumeration value="65"/>
         *                                     &lt;enumeration value="99"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="descOutros" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="100"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="nDoc" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="20"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
         *                               &lt;element name="vDocFisc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
         *                               &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
         *                               &lt;choice>
         *                                 &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
         *                                 &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
         *                               &lt;/choice>
         *                             &lt;/sequence>
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
         *         &lt;element name="docAnt" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="emiDocAnt" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *                             &lt;/choice>
         *                             &lt;sequence minOccurs="0">
         *                               &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
         *                               &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *                             &lt;/sequence>
         *                             &lt;element name="xNome">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;maxLength value="60"/>
         *                                   &lt;minLength value="1"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="idDocAnt" maxOccurs="2">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;choice>
         *                                       &lt;element name="idDocAntPap" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="tpDoc">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDocAssoc">
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="serie">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                                       &lt;minLength value="1"/>
         *                                                       &lt;maxLength value="3"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="subser" minOccurs="0">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                                       &lt;minLength value="1"/>
         *                                                       &lt;maxLength value="2"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="nDoc">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                                       &lt;minLength value="1"/>
         *                                                       &lt;maxLength value="30"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="idDocAntEle" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/choice>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
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
         *         &lt;element name="infModal">
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
         *         &lt;element name="veicNovos" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="chassi">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;length value="17"/>
         *                         &lt;pattern value="[A-Z0-9]+"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="cCor">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xCor">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="40"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="cMod">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="6"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="vUnit" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                   &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="cobr" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="fat" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nFat" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
         *                             &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
         *                             &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="dup" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nDup" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;maxLength value="60"/>
         *                                   &lt;minLength value="1"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
         *                             &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
         *                   &lt;element name="indAlteraToma" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infGlobalizado" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xObs">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="15"/>
         *                         &lt;maxLength value="256"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infServVinc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="infCTeMultimodal" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="chCTeMultimodal" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
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
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "infCarga",
                "infDoc",
                "docAnt",
                "infModal",
                "veicNovos",
                "cobr",
                "infCteSub",
                "infGlobalizado",
                "infServVinc"
        })
        public static class InfCTeNorm {

            @XmlElement(required = true)
            protected InfCarga infCarga;
            protected InfDoc infDoc;
            protected DocAnt docAnt;
            @XmlElement(required = true)
            protected InfModal infModal;
            protected List<VeicNovos> veicNovos;
            protected Cobr cobr;
            protected InfCteSub infCteSub;
            protected InfGlobalizado infGlobalizado;
            protected InfServVinc infServVinc;

            /**
             * Obtém o valor da propriedade infCarga.
             *
             * @return possible object is
             * {@link InfCarga }
             */
            public InfCarga getInfCarga() {
                return infCarga;
            }

            /**
             * Define o valor da propriedade infCarga.
             *
             * @param value allowed object is
             *              {@link InfCarga }
             */
            public void setInfCarga(InfCarga value) {
                this.infCarga = value;
            }

            /**
             * Obtém o valor da propriedade infDoc.
             *
             * @return possible object is
             * {@link InfDoc }
             */
            public InfDoc getInfDoc() {
                return infDoc;
            }

            /**
             * Define o valor da propriedade infDoc.
             *
             * @param value allowed object is
             *              {@link InfDoc }
             */
            public void setInfDoc(InfDoc value) {
                this.infDoc = value;
            }

            /**
             * Obtém o valor da propriedade docAnt.
             *
             * @return possible object is
             * {@link DocAnt }
             */
            public DocAnt getDocAnt() {
                return docAnt;
            }

            /**
             * Define o valor da propriedade docAnt.
             *
             * @param value allowed object is
             *              {@link DocAnt }
             */
            public void setDocAnt(DocAnt value) {
                this.docAnt = value;
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
             * Gets the value of the veicNovos property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the veicNovos property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVeicNovos().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VeicNovos }
             */
            public List<VeicNovos> getVeicNovos() {
                if (veicNovos == null) {
                    veicNovos = new ArrayList<VeicNovos>();
                }
                return this.veicNovos;
            }

            /**
             * Obtém o valor da propriedade cobr.
             *
             * @return possible object is
             * {@link Cobr }
             */
            public Cobr getCobr() {
                return cobr;
            }

            /**
             * Define o valor da propriedade cobr.
             *
             * @param value allowed object is
             *              {@link Cobr }
             */
            public void setCobr(Cobr value) {
                this.cobr = value;
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
             * Obtém o valor da propriedade infGlobalizado.
             *
             * @return possible object is
             * {@link InfGlobalizado }
             */
            public InfGlobalizado getInfGlobalizado() {
                return infGlobalizado;
            }

            /**
             * Define o valor da propriedade infGlobalizado.
             *
             * @param value allowed object is
             *              {@link InfGlobalizado }
             */
            public void setInfGlobalizado(InfGlobalizado value) {
                this.infGlobalizado = value;
            }

            /**
             * Obtém o valor da propriedade infServVinc.
             *
             * @return possible object is
             * {@link InfServVinc }
             */
            public InfServVinc getInfServVinc() {
                return infServVinc;
            }

            /**
             * Define o valor da propriedade infServVinc.
             *
             * @param value allowed object is
             *              {@link InfServVinc }
             */
            public void setInfServVinc(InfServVinc value) {
                this.infServVinc = value;
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
             *         &lt;element name="fat" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nFat" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
             *                   &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
             *                   &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="dup" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nDup" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                         &lt;maxLength value="60"/>
             *                         &lt;minLength value="1"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
             *                   &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
                    "fat",
                    "dup"
            })
            public static class Cobr {

                protected Fat fat;
                protected List<Dup> dup;

                /**
                 * Obtém o valor da propriedade fat.
                 *
                 * @return possible object is
                 * {@link Fat }
                 */
                public Fat getFat() {
                    return fat;
                }

                /**
                 * Define o valor da propriedade fat.
                 *
                 * @param value allowed object is
                 *              {@link Fat }
                 */
                public void setFat(Fat value) {
                    this.fat = value;
                }

                /**
                 * Gets the value of the dup property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dup property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDup().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Dup }
                 */
                public List<Dup> getDup() {
                    if (dup == null) {
                        dup = new ArrayList<Dup>();
                    }
                    return this.dup;
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
                 *         &lt;element name="nDup" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;maxLength value="60"/>
                 *               &lt;minLength value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
                 *         &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "nDup",
                        "dVenc",
                        "vDup"
                })
                public static class Dup {

                    protected String nDup;
                    protected String dVenc;
                    protected String vDup;

                    /**
                     * Obtém o valor da propriedade nDup.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getNDup() {
                        return nDup;
                    }

                    /**
                     * Define o valor da propriedade nDup.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setNDup(String value) {
                        this.nDup = value;
                    }

                    /**
                     * Obtém o valor da propriedade dVenc.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getDVenc() {
                        return dVenc;
                    }

                    /**
                     * Define o valor da propriedade dVenc.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setDVenc(String value) {
                        this.dVenc = value;
                    }

                    /**
                     * Obtém o valor da propriedade vDup.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVDup() {
                        return vDup;
                    }

                    /**
                     * Define o valor da propriedade vDup.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVDup(String value) {
                        this.vDup = value;
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
                 *         &lt;element name="nFat" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
                 *         &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
                 *         &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "nFat",
                        "vOrig",
                        "vDesc",
                        "vLiq"
                })
                public static class Fat {

                    protected String nFat;
                    protected String vOrig;
                    protected String vDesc;
                    protected String vLiq;

                    /**
                     * Obtém o valor da propriedade nFat.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getNFat() {
                        return nFat;
                    }

                    /**
                     * Define o valor da propriedade nFat.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setNFat(String value) {
                        this.nFat = value;
                    }

                    /**
                     * Obtém o valor da propriedade vOrig.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVOrig() {
                        return vOrig;
                    }

                    /**
                     * Define o valor da propriedade vOrig.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVOrig(String value) {
                        this.vOrig = value;
                    }

                    /**
                     * Obtém o valor da propriedade vDesc.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVDesc() {
                        return vDesc;
                    }

                    /**
                     * Define o valor da propriedade vDesc.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVDesc(String value) {
                        this.vDesc = value;
                    }

                    /**
                     * Obtém o valor da propriedade vLiq.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVLiq() {
                        return vLiq;
                    }

                    /**
                     * Define o valor da propriedade vLiq.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVLiq(String value) {
                        this.vLiq = value;
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
             *         &lt;element name="emiDocAnt" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
             *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
             *                   &lt;/choice>
             *                   &lt;sequence minOccurs="0">
             *                     &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
             *                     &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
             *                   &lt;/sequence>
             *                   &lt;element name="xNome">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                         &lt;maxLength value="60"/>
             *                         &lt;minLength value="1"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="idDocAnt" maxOccurs="2">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;choice>
             *                             &lt;element name="idDocAntPap" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="tpDoc">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDocAssoc">
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="serie">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                                             &lt;minLength value="1"/>
             *                                             &lt;maxLength value="3"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="subser" minOccurs="0">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                                             &lt;minLength value="1"/>
             *                                             &lt;maxLength value="2"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="nDoc">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                                             &lt;minLength value="1"/>
             *                                             &lt;maxLength value="30"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="idDocAntEle" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/choice>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
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
                    "emiDocAnt"
            })
            public static class DocAnt {

                @XmlElement(required = true)
                protected List<EmiDocAnt> emiDocAnt;

                /**
                 * Gets the value of the emiDocAnt property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the emiDocAnt property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEmiDocAnt().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EmiDocAnt }
                 */
                public List<EmiDocAnt> getEmiDocAnt() {
                    if (emiDocAnt == null) {
                        emiDocAnt = new ArrayList<EmiDocAnt>();
                    }
                    return this.emiDocAnt;
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
                 *         &lt;sequence minOccurs="0">
                 *           &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
                 *           &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
                 *         &lt;/sequence>
                 *         &lt;element name="xNome">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;maxLength value="60"/>
                 *               &lt;minLength value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="idDocAnt" maxOccurs="2">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;choice>
                 *                   &lt;element name="idDocAntPap" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="tpDoc">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDocAssoc">
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="serie">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *                                   &lt;minLength value="1"/>
                 *                                   &lt;maxLength value="3"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="subser" minOccurs="0">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *                                   &lt;minLength value="1"/>
                 *                                   &lt;maxLength value="2"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="nDoc">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *                                   &lt;minLength value="1"/>
                 *                                   &lt;maxLength value="30"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="idDocAntEle" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/choice>
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
                        "cnpj",
                        "cpf",
                        "ie",
                        "uf",
                        "xNome",
                        "idDocAnt"
                })
                public static class EmiDocAnt {

                    @XmlElement(name = "CNPJ")
                    protected String cnpj;
                    @XmlElement(name = "CPF")
                    protected String cpf;
                    @XmlElement(name = "IE")
                    protected String ie;
                    @XmlElement(name = "UF")
                    protected TUf uf;
                    @XmlElement(required = true)
                    protected String xNome;
                    @XmlElement(required = true)
                    protected List<IdDocAnt> idDocAnt;

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
                     * Obtém o valor da propriedade uf.
                     *
                     * @return possible object is
                     * {@link TUf }
                     */
                    public TUf getUF() {
                        return uf;
                    }

                    /**
                     * Define o valor da propriedade uf.
                     *
                     * @param value allowed object is
                     *              {@link TUf }
                     */
                    public void setUF(TUf value) {
                        this.uf = value;
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
                     * Gets the value of the idDocAnt property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the idDocAnt property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getIdDocAnt().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link IdDocAnt }
                     */
                    public List<IdDocAnt> getIdDocAnt() {
                        if (idDocAnt == null) {
                            idDocAnt = new ArrayList<IdDocAnt>();
                        }
                        return this.idDocAnt;
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
                     *         &lt;element name="idDocAntPap" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="tpDoc">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDocAssoc">
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="serie">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                     *                         &lt;minLength value="1"/>
                     *                         &lt;maxLength value="3"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="subser" minOccurs="0">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                     *                         &lt;minLength value="1"/>
                     *                         &lt;maxLength value="2"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="nDoc">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                     *                         &lt;minLength value="1"/>
                     *                         &lt;maxLength value="30"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="idDocAntEle" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/choice>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "idDocAntPap",
                            "idDocAntEle"
                    })
                    public static class IdDocAnt {

                        protected List<IdDocAntPap> idDocAntPap;
                        protected List<IdDocAntEle> idDocAntEle;

                        /**
                         * Gets the value of the idDocAntPap property.
                         *
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the idDocAntPap property.
                         *
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdDocAntPap().add(newItem);
                         * </pre>
                         *
                         *
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IdDocAntPap }
                         */
                        public List<IdDocAntPap> getIdDocAntPap() {
                            if (idDocAntPap == null) {
                                idDocAntPap = new ArrayList<IdDocAntPap>();
                            }
                            return this.idDocAntPap;
                        }

                        /**
                         * Gets the value of the idDocAntEle property.
                         *
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the idDocAntEle property.
                         *
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdDocAntEle().add(newItem);
                         * </pre>
                         *
                         *
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IdDocAntEle }
                         */
                        public List<IdDocAntEle> getIdDocAntEle() {
                            if (idDocAntEle == null) {
                                idDocAntEle = new ArrayList<IdDocAntEle>();
                            }
                            return this.idDocAntEle;
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
                        public static class IdDocAntEle {

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
                         *         &lt;element name="tpDoc">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDocAssoc">
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="serie">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                         *               &lt;minLength value="1"/>
                         *               &lt;maxLength value="3"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="subser" minOccurs="0">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                         *               &lt;minLength value="1"/>
                         *               &lt;maxLength value="2"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="nDoc">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                         *               &lt;minLength value="1"/>
                         *               &lt;maxLength value="30"/>
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
                                "tpDoc",
                                "serie",
                                "subser",
                                "nDoc",
                                "dEmi"
                        })
                        public static class IdDocAntPap {

                            @XmlElement(required = true)
                            protected String tpDoc;
                            @XmlElement(required = true)
                            protected String serie;
                            protected String subser;
                            @XmlElement(required = true)
                            protected String nDoc;
                            @XmlElement(required = true)
                            protected String dEmi;

                            /**
                             * Obtém o valor da propriedade tpDoc.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getTpDoc() {
                                return tpDoc;
                            }

                            /**
                             * Define o valor da propriedade tpDoc.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setTpDoc(String value) {
                                this.tpDoc = value;
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
                             * Obtém o valor da propriedade subser.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getSubser() {
                                return subser;
                            }

                            /**
                             * Define o valor da propriedade subser.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setSubser(String value) {
                                this.subser = value;
                            }

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
             *         &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
             *         &lt;element name="proPred">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xOutCat" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="infQ" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cUnid">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;enumeration value="00"/>
             *                         &lt;enumeration value="01"/>
             *                         &lt;enumeration value="02"/>
             *                         &lt;enumeration value="03"/>
             *                         &lt;enumeration value="04"/>
             *                         &lt;enumeration value="05"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="tpMed">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="20"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="vCargaAverb" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "vCarga",
                    "proPred",
                    "xOutCat",
                    "infQ",
                    "vCargaAverb"
            })
            public static class InfCarga {

                protected String vCarga;
                @XmlElement(required = true)
                protected String proPred;
                protected String xOutCat;
                @XmlElement(required = true)
                protected List<InfQ> infQ;
                protected String vCargaAverb;

                /**
                 * Obtém o valor da propriedade vCarga.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVCarga() {
                    return vCarga;
                }

                /**
                 * Define o valor da propriedade vCarga.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVCarga(String value) {
                    this.vCarga = value;
                }

                /**
                 * Obtém o valor da propriedade proPred.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getProPred() {
                    return proPred;
                }

                /**
                 * Define o valor da propriedade proPred.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setProPred(String value) {
                    this.proPred = value;
                }

                /**
                 * Obtém o valor da propriedade xOutCat.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXOutCat() {
                    return xOutCat;
                }

                /**
                 * Define o valor da propriedade xOutCat.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXOutCat(String value) {
                    this.xOutCat = value;
                }

                /**
                 * Gets the value of the infQ property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infQ property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfQ().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InfQ }
                 */
                public List<InfQ> getInfQ() {
                    if (infQ == null) {
                        infQ = new ArrayList<InfQ>();
                    }
                    return this.infQ;
                }

                /**
                 * Obtém o valor da propriedade vCargaAverb.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVCargaAverb() {
                    return vCargaAverb;
                }

                /**
                 * Define o valor da propriedade vCargaAverb.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVCargaAverb(String value) {
                    this.vCargaAverb = value;
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
                 *         &lt;element name="cUnid">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="00"/>
                 *               &lt;enumeration value="01"/>
                 *               &lt;enumeration value="02"/>
                 *               &lt;enumeration value="03"/>
                 *               &lt;enumeration value="04"/>
                 *               &lt;enumeration value="05"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpMed">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "cUnid",
                        "tpMed",
                        "qCarga"
                })
                public static class InfQ {

                    @XmlElement(required = true)
                    protected String cUnid;
                    @XmlElement(required = true)
                    protected String tpMed;
                    @XmlElement(required = true)
                    protected String qCarga;

                    /**
                     * Obtém o valor da propriedade cUnid.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getCUnid() {
                        return cUnid;
                    }

                    /**
                     * Define o valor da propriedade cUnid.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setCUnid(String value) {
                        this.cUnid = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpMed.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getTpMed() {
                        return tpMed;
                    }

                    /**
                     * Define o valor da propriedade tpMed.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setTpMed(String value) {
                        this.tpMed = value;
                    }

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
             *         &lt;element name="indAlteraToma" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="1"/>
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
                    "chCte",
                    "refCteAnu",
                    "tomaICMS",
                    "indAlteraToma"
            })
            public static class InfCteSub {

                @XmlElement(required = true)
                protected String chCte;
                protected String refCteAnu;
                protected TomaICMS tomaICMS;
                protected String indAlteraToma;

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
                 * Obtém o valor da propriedade indAlteraToma.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getIndAlteraToma() {
                    return indAlteraToma;
                }

                /**
                 * Define o valor da propriedade indAlteraToma.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setIndAlteraToma(String value) {
                    this.indAlteraToma = value;
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
             *         &lt;choice>
             *           &lt;element name="infNF" maxOccurs="unbounded">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="nRoma" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="20"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="nPed" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="20"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModNF"/>
             *                     &lt;element name="serie">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="3"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="nDoc">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="20"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                     &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *                     &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *                     &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *                     &lt;element name="vST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *                     &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *                     &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *                     &lt;element name="nCFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
             *                     &lt;element name="nPeso" type="{http://www.portalfiscal.inf.br/cte}TDec_1203Opc" minOccurs="0"/>
             *                     &lt;element name="PIN" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;minLength value="2"/>
             *                           &lt;maxLength value="9"/>
             *                           &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
             *                     &lt;choice>
             *                       &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
             *                       &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
             *                     &lt;/choice>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="infNFe" maxOccurs="unbounded">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
             *                     &lt;element name="PIN" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;minLength value="2"/>
             *                           &lt;maxLength value="9"/>
             *                           &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
             *                     &lt;choice>
             *                       &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
             *                       &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
             *                     &lt;/choice>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="infOutros" maxOccurs="unbounded">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpDoc">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="00"/>
             *                           &lt;enumeration value="10"/>
             *                           &lt;enumeration value="59"/>
             *                           &lt;enumeration value="65"/>
             *                           &lt;enumeration value="99"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="descOutros" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="100"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="nDoc" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="20"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
             *                     &lt;element name="vDocFisc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
             *                     &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
             *                     &lt;choice>
             *                       &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
             *                       &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
             *                     &lt;/choice>
             *                   &lt;/sequence>
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
                    "infNF",
                    "infNFe",
                    "infOutros"
            })
            public static class InfDoc {

                protected List<InfNF> infNF;
                protected List<InfNFe> infNFe;
                protected List<InfOutros> infOutros;

                /**
                 * Gets the value of the infNF property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infNF property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfNF().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InfNF }
                 */
                public List<InfNF> getInfNF() {
                    if (infNF == null) {
                        infNF = new ArrayList<InfNF>();
                    }
                    return this.infNF;
                }

                /**
                 * Gets the value of the infNFe property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infNFe property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfNFe().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InfNFe }
                 */
                public List<InfNFe> getInfNFe() {
                    if (infNFe == null) {
                        infNFe = new ArrayList<InfNFe>();
                    }
                    return this.infNFe;
                }

                /**
                 * Gets the value of the infOutros property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infOutros property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfOutros().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InfOutros }
                 */
                public List<InfOutros> getInfOutros() {
                    if (infOutros == null) {
                        infOutros = new ArrayList<InfOutros>();
                    }
                    return this.infOutros;
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
                 *         &lt;element name="nRoma" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nPed" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModNF"/>
                 *         &lt;element name="serie">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nDoc">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
                 *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
                 *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
                 *         &lt;element name="vST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
                 *         &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
                 *         &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
                 *         &lt;element name="nCFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
                 *         &lt;element name="nPeso" type="{http://www.portalfiscal.inf.br/cte}TDec_1203Opc" minOccurs="0"/>
                 *         &lt;element name="PIN" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;minLength value="2"/>
                 *               &lt;maxLength value="9"/>
                 *               &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
                 *         &lt;choice>
                 *           &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
                 *           &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;/choice>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "nRoma",
                        "nPed",
                        "mod",
                        "serie",
                        "nDoc",
                        "dEmi",
                        "vbc",
                        "vicms",
                        "vbcst",
                        "vst",
                        "vProd",
                        "vnf",
                        "ncfop",
                        "nPeso",
                        "pin",
                        "dPrev",
                        "infUnidCarga",
                        "infUnidTransp"
                })
                public static class InfNF {

                    protected String nRoma;
                    protected String nPed;
                    @XmlElement(required = true)
                    protected String mod;
                    @XmlElement(required = true)
                    protected String serie;
                    @XmlElement(required = true)
                    protected String nDoc;
                    @XmlElement(required = true)
                    protected String dEmi;
                    @XmlElement(name = "vBC", required = true)
                    protected String vbc;
                    @XmlElement(name = "vICMS", required = true)
                    protected String vicms;
                    @XmlElement(name = "vBCST", required = true)
                    protected String vbcst;
                    @XmlElement(name = "vST", required = true)
                    protected String vst;
                    @XmlElement(required = true)
                    protected String vProd;
                    @XmlElement(name = "vNF", required = true)
                    protected String vnf;
                    @XmlElement(name = "nCFOP", required = true)
                    protected String ncfop;
                    protected String nPeso;
                    @XmlElement(name = "PIN")
                    protected String pin;
                    protected String dPrev;
                    protected List<TUnidCarga> infUnidCarga;
                    protected List<TUnidadeTransp> infUnidTransp;

                    /**
                     * Obtém o valor da propriedade nRoma.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getNRoma() {
                        return nRoma;
                    }

                    /**
                     * Define o valor da propriedade nRoma.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setNRoma(String value) {
                        this.nRoma = value;
                    }

                    /**
                     * Obtém o valor da propriedade nPed.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getNPed() {
                        return nPed;
                    }

                    /**
                     * Define o valor da propriedade nPed.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setNPed(String value) {
                        this.nPed = value;
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
                     * Obtém o valor da propriedade vbc.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVBC() {
                        return vbc;
                    }

                    /**
                     * Define o valor da propriedade vbc.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVBC(String value) {
                        this.vbc = value;
                    }

                    /**
                     * Obtém o valor da propriedade vicms.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVICMS() {
                        return vicms;
                    }

                    /**
                     * Define o valor da propriedade vicms.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVICMS(String value) {
                        this.vicms = value;
                    }

                    /**
                     * Obtém o valor da propriedade vbcst.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVBCST() {
                        return vbcst;
                    }

                    /**
                     * Define o valor da propriedade vbcst.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVBCST(String value) {
                        this.vbcst = value;
                    }

                    /**
                     * Obtém o valor da propriedade vst.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVST() {
                        return vst;
                    }

                    /**
                     * Define o valor da propriedade vst.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVST(String value) {
                        this.vst = value;
                    }

                    /**
                     * Obtém o valor da propriedade vProd.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVProd() {
                        return vProd;
                    }

                    /**
                     * Define o valor da propriedade vProd.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVProd(String value) {
                        this.vProd = value;
                    }

                    /**
                     * Obtém o valor da propriedade vnf.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVNF() {
                        return vnf;
                    }

                    /**
                     * Define o valor da propriedade vnf.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVNF(String value) {
                        this.vnf = value;
                    }

                    /**
                     * Obtém o valor da propriedade ncfop.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getNCFOP() {
                        return ncfop;
                    }

                    /**
                     * Define o valor da propriedade ncfop.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setNCFOP(String value) {
                        this.ncfop = value;
                    }

                    /**
                     * Obtém o valor da propriedade nPeso.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getNPeso() {
                        return nPeso;
                    }

                    /**
                     * Define o valor da propriedade nPeso.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setNPeso(String value) {
                        this.nPeso = value;
                    }

                    /**
                     * Obtém o valor da propriedade pin.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getPIN() {
                        return pin;
                    }

                    /**
                     * Define o valor da propriedade pin.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setPIN(String value) {
                        this.pin = value;
                    }

                    /**
                     * Obtém o valor da propriedade dPrev.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getDPrev() {
                        return dPrev;
                    }

                    /**
                     * Define o valor da propriedade dPrev.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setDPrev(String value) {
                        this.dPrev = value;
                    }

                    /**
                     * Gets the value of the infUnidCarga property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infUnidCarga property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfUnidCarga().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TUnidCarga }
                     */
                    public List<TUnidCarga> getInfUnidCarga() {
                        if (infUnidCarga == null) {
                            infUnidCarga = new ArrayList<TUnidCarga>();
                        }
                        return this.infUnidCarga;
                    }

                    /**
                     * Gets the value of the infUnidTransp property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infUnidTransp property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfUnidTransp().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TUnidadeTransp }
                     */
                    public List<TUnidadeTransp> getInfUnidTransp() {
                        if (infUnidTransp == null) {
                            infUnidTransp = new ArrayList<TUnidadeTransp>();
                        }
                        return this.infUnidTransp;
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
                 *         &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
                 *         &lt;element name="PIN" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;minLength value="2"/>
                 *               &lt;maxLength value="9"/>
                 *               &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
                 *         &lt;choice>
                 *           &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
                 *           &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;/choice>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "chave",
                        "pin",
                        "dPrev",
                        "infUnidCarga",
                        "infUnidTransp"
                })
                public static class InfNFe {

                    @XmlElement(required = true)
                    protected String chave;
                    @XmlElement(name = "PIN")
                    protected String pin;
                    protected String dPrev;
                    protected List<TUnidCarga> infUnidCarga;
                    protected List<TUnidadeTransp> infUnidTransp;

                    /**
                     * Obtém o valor da propriedade chave.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getChave() {
                        return chave;
                    }

                    /**
                     * Define o valor da propriedade chave.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setChave(String value) {
                        this.chave = value;
                    }

                    /**
                     * Obtém o valor da propriedade pin.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getPIN() {
                        return pin;
                    }

                    /**
                     * Define o valor da propriedade pin.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setPIN(String value) {
                        this.pin = value;
                    }

                    /**
                     * Obtém o valor da propriedade dPrev.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getDPrev() {
                        return dPrev;
                    }

                    /**
                     * Define o valor da propriedade dPrev.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setDPrev(String value) {
                        this.dPrev = value;
                    }

                    /**
                     * Gets the value of the infUnidCarga property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infUnidCarga property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfUnidCarga().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TUnidCarga }
                     */
                    public List<TUnidCarga> getInfUnidCarga() {
                        if (infUnidCarga == null) {
                            infUnidCarga = new ArrayList<TUnidCarga>();
                        }
                        return this.infUnidCarga;
                    }

                    /**
                     * Gets the value of the infUnidTransp property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infUnidTransp property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfUnidTransp().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TUnidadeTransp }
                     */
                    public List<TUnidadeTransp> getInfUnidTransp() {
                        if (infUnidTransp == null) {
                            infUnidTransp = new ArrayList<TUnidadeTransp>();
                        }
                        return this.infUnidTransp;
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
                 *         &lt;element name="tpDoc">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="00"/>
                 *               &lt;enumeration value="10"/>
                 *               &lt;enumeration value="59"/>
                 *               &lt;enumeration value="65"/>
                 *               &lt;enumeration value="99"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="descOutros" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="100"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nDoc" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
                 *         &lt;element name="vDocFisc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
                 *         &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
                 *         &lt;choice>
                 *           &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
                 *           &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;/choice>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "tpDoc",
                        "descOutros",
                        "nDoc",
                        "dEmi",
                        "vDocFisc",
                        "dPrev",
                        "infUnidCarga",
                        "infUnidTransp"
                })
                public static class InfOutros {

                    @XmlElement(required = true)
                    protected String tpDoc;
                    protected String descOutros;
                    protected String nDoc;
                    protected String dEmi;
                    protected String vDocFisc;
                    protected String dPrev;
                    protected List<TUnidCarga> infUnidCarga;
                    protected List<TUnidadeTransp> infUnidTransp;

                    /**
                     * Obtém o valor da propriedade tpDoc.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getTpDoc() {
                        return tpDoc;
                    }

                    /**
                     * Define o valor da propriedade tpDoc.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setTpDoc(String value) {
                        this.tpDoc = value;
                    }

                    /**
                     * Obtém o valor da propriedade descOutros.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getDescOutros() {
                        return descOutros;
                    }

                    /**
                     * Define o valor da propriedade descOutros.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setDescOutros(String value) {
                        this.descOutros = value;
                    }

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
                     * Obtém o valor da propriedade vDocFisc.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVDocFisc() {
                        return vDocFisc;
                    }

                    /**
                     * Define o valor da propriedade vDocFisc.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVDocFisc(String value) {
                        this.vDocFisc = value;
                    }

                    /**
                     * Obtém o valor da propriedade dPrev.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getDPrev() {
                        return dPrev;
                    }

                    /**
                     * Define o valor da propriedade dPrev.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setDPrev(String value) {
                        this.dPrev = value;
                    }

                    /**
                     * Gets the value of the infUnidCarga property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infUnidCarga property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfUnidCarga().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TUnidCarga }
                     */
                    public List<TUnidCarga> getInfUnidCarga() {
                        if (infUnidCarga == null) {
                            infUnidCarga = new ArrayList<TUnidCarga>();
                        }
                        return this.infUnidCarga;
                    }

                    /**
                     * Gets the value of the infUnidTransp property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infUnidTransp property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfUnidTransp().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TUnidadeTransp }
                     */
                    public List<TUnidadeTransp> getInfUnidTransp() {
                        if (infUnidTransp == null) {
                            infUnidTransp = new ArrayList<TUnidadeTransp>();
                        }
                        return this.infUnidTransp;
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
             *         &lt;element name="xObs">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="15"/>
             *               &lt;maxLength value="256"/>
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
                    "xObs"
            })
            public static class InfGlobalizado {

                @XmlElement(required = true)
                protected String xObs;

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
             *         &lt;element name="infCTeMultimodal" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="chCTeMultimodal" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
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
                    "infCTeMultimodal"
            })
            public static class InfServVinc {

                @XmlElement(required = true)
                protected List<InfCTeMultimodal> infCTeMultimodal;

                /**
                 * Gets the value of the infCTeMultimodal property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infCTeMultimodal property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfCTeMultimodal().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InfCTeMultimodal }
                 */
                public List<InfCTeMultimodal> getInfCTeMultimodal() {
                    if (infCTeMultimodal == null) {
                        infCTeMultimodal = new ArrayList<InfCTeMultimodal>();
                    }
                    return this.infCTeMultimodal;
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
                 *         &lt;element name="chCTeMultimodal" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "chCTeMultimodal"
                })
                public static class InfCTeMultimodal {

                    @XmlElement(required = true)
                    protected String chCTeMultimodal;

                    /**
                     * Obtém o valor da propriedade chCTeMultimodal.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getChCTeMultimodal() {
                        return chCTeMultimodal;
                    }

                    /**
                     * Define o valor da propriedade chCTeMultimodal.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setChCTeMultimodal(String value) {
                        this.chCTeMultimodal = value;
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
             *         &lt;element name="chassi">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;length value="17"/>
             *               &lt;pattern value="[A-Z0-9]+"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="cCor">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xCor">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="40"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="cMod">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="6"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="vUnit" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "chassi",
                    "cCor",
                    "xCor",
                    "cMod",
                    "vUnit",
                    "vFrete"
            })
            public static class VeicNovos {

                @XmlElement(required = true)
                protected String chassi;
                @XmlElement(required = true)
                protected String cCor;
                @XmlElement(required = true)
                protected String xCor;
                @XmlElement(required = true)
                protected String cMod;
                @XmlElement(required = true)
                protected String vUnit;
                @XmlElement(required = true)
                protected String vFrete;

                /**
                 * Obtém o valor da propriedade chassi.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getChassi() {
                    return chassi;
                }

                /**
                 * Define o valor da propriedade chassi.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setChassi(String value) {
                    this.chassi = value;
                }

                /**
                 * Obtém o valor da propriedade cCor.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCCor() {
                    return cCor;
                }

                /**
                 * Define o valor da propriedade cCor.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCCor(String value) {
                    this.cCor = value;
                }

                /**
                 * Obtém o valor da propriedade xCor.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXCor() {
                    return xCor;
                }

                /**
                 * Define o valor da propriedade xCor.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXCor(String value) {
                    this.xCor = value;
                }

                /**
                 * Obtém o valor da propriedade cMod.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCMod() {
                    return cMod;
                }

                /**
                 * Define o valor da propriedade cMod.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCMod(String value) {
                    this.cMod = value;
                }

                /**
                 * Obtém o valor da propriedade vUnit.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVUnit() {
                    return vUnit;
                }

                /**
                 * Define o valor da propriedade vUnit.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVUnit(String value) {
                    this.vUnit = value;
                }

                /**
                 * Obtém o valor da propriedade vFrete.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVFrete() {
                    return vFrete;
                }

                /**
                 * Define o valor da propriedade vFrete.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVFrete(String value) {
                    this.vFrete = value;
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
         *         &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
         *         &lt;element name="enderReceb" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *         &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
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
                "fone",
                "enderReceb",
                "email"
        })
        public static class Receb {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            protected String fone;
            @XmlElement(required = true)
            protected TEndereco enderReceb;
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
             * Obtém o valor da propriedade enderReceb.
             *
             * @return possible object is
             * {@link TEndereco }
             */
            public TEndereco getEnderReceb() {
                return enderReceb;
            }

            /**
             * Define o valor da propriedade enderReceb.
             *
             * @param value allowed object is
             *              {@link TEndereco }
             */
            public void setEnderReceb(TEndereco value) {
                this.enderReceb = value;
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
         *         &lt;element name="enderReme" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
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
                "enderReme",
                "email"
        })
        public static class Rem {

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
            protected TEndereco enderReme;
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
             * Obtém o valor da propriedade enderReme.
             *
             * @return possible object is
             * {@link TEndereco }
             */
            public TEndereco getEnderReme() {
                return enderReme;
            }

            /**
             * Define o valor da propriedade enderReme.
             *
             * @param value allowed object is
             *              {@link TEndereco }
             */
            public void setEnderReme(TEndereco value) {
                this.enderReme = value;
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
