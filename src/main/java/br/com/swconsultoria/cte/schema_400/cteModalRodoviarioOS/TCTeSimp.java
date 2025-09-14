
package br.com.swconsultoria.cte.schema_400.cteModalRodoviarioOS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * Tipo Conhecimento de Transporte Eletrônico (Modelo 57) - Modelo Simplificado
 * 
 * <p>Classe Java de TCTeSimp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCTeSimp">
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
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
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
 *                             &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTeSimp"/>
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
 *                             &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTranspSimp"/>
 *                             &lt;element name="tpServ">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
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
 *                             &lt;element name="gCompraGov" type="{http://www.portalfiscal.inf.br/cte}TCompraGovReduzido" minOccurs="0"/>
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
 *                             &lt;choice>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                             &lt;/choice>
 *                             &lt;element name="IE" minOccurs="0">
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
 *                             &lt;element name="CRT" type="{http://www.portalfiscal.inf.br/cte}TCRT"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="toma">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="toma">
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
 *                             &lt;element name="ISUF" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{8,9}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
 *                             &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                             &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infCarga">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                             &lt;element name="proPred">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xOutCat" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="infQ" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cUnid">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;enumeration value="00"/>
 *                                             &lt;enumeration value="01"/>
 *                                             &lt;enumeration value="02"/>
 *                                             &lt;enumeration value="03"/>
 *                                             &lt;enumeration value="04"/>
 *                                             &lt;enumeration value="05"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="tpMed">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="2"/>
 *                                             &lt;enumeration value="00"/>
 *                                             &lt;enumeration value="01"/>
 *                                             &lt;enumeration value="02"/>
 *                                             &lt;enumeration value="03"/>
 *                                             &lt;enumeration value="04"/>
 *                                             &lt;enumeration value="05"/>
 *                                             &lt;enumeration value="06"/>
 *                                             &lt;enumeration value="07"/>
 *                                             &lt;enumeration value="08"/>
 *                                             &lt;enumeration value="09"/>
 *                                             &lt;enumeration value="10"/>
 *                                             &lt;enumeration value="11"/>
 *                                             &lt;enumeration value="12"/>
 *                                             &lt;enumeration value="13"/>
 *                                             &lt;enumeration value="14"/>
 *                                             &lt;enumeration value="15"/>
 *                                             &lt;enumeration value="99"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="vCargaAverb" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="det" maxOccurs="999">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;sequence>
 *                               &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
 *                               &lt;element name="xMunIni">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                     &lt;minLength value="2"/>
 *                                     &lt;maxLength value="60"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;sequence>
 *                               &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
 *                               &lt;element name="xMunFim">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                     &lt;minLength value="2"/>
 *                                     &lt;maxLength value="60"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;element name="vPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
 *                             &lt;choice>
 *                               &lt;element name="infNFe" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="chNFe">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChDFe">
 *                                               &lt;pattern value="[0-9]{6}[A-Z0-9]{12}[0-9]{26}"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="PIN" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;minLength value="2"/>
 *                                               &lt;maxLength value="9"/>
 *                                               &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
 *                                         &lt;choice>
 *                                           &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
 *                                           &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/>
 *                                         &lt;/choice>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infDocAnt" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
 *                                         &lt;element name="tpPrest">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;enumeration value="1"/>
 *                                               &lt;enumeration value="2"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="infNFeTranspParcial" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
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
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                           &lt;attribute name="nItem" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;whiteSpace value="preserve"/>
 *                                 &lt;pattern value="[1-9]{1}[0-9]{0,1}|[1-8]{1}[0-9]{2}|[9]{1}[0-8]{1}[0-9]{1}|[9]{1}[9]{1}[0]{1}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infModal">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='skip'/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="versaoModal" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;whiteSpace value="preserve"/>
 *                                 &lt;pattern value="4\.(0[0-9]|[1-9][0-9])"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="cobr" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fat" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nFat" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="60"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                       &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                       &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dup" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nDup" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;maxLength value="60"/>
 *                                             &lt;minLength value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
 *                                       &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
 *                   &lt;element name="infCteSub" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="chCte">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[0-9]{44}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indAlteraToma" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
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
 *                                       &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                       &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                       &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="IBSCBS" type="{http://www.portalfiscal.inf.br/cte}TTribCTe" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="total">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                             &lt;element name="vTRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                             &lt;element name="vTotDFe" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *                   &lt;element name="infRespTec" type="{http://www.portalfiscal.inf.br/cte}TRespTec" minOccurs="0"/>
 *                   &lt;element name="infSolicNFF" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="xSolic">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="8000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infPAA" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CNPJPAA" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                             &lt;element name="PAASignature">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                                       &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/>
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
 *                       &lt;pattern value="CTe[0-9]{6}[A-Z0-9]{12}[0-9]{26}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infCTeSupl" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="qrCodCTe">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="50"/>
 *                         &lt;maxLength value="1000"/>
 *                         &lt;pattern value="((HTTPS?|https?)://.*\?chCTe=[0-9]{6}[A-Z0-9]{12}[0-9]{26}&amp;tpAmb=[1-2](&amp;sign=[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1})?)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCTeSimp", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
    "infCte",
    "infCTeSupl",
    "signature"
})
public class TCTeSimp {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected TCTeSimp.InfCte infCte;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected TCTeSimp.InfCTeSupl infCTeSupl;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade infCte.
     * 
     * @return
     *     possible object is
     *     {@link TCTeSimp.InfCte }
     *     
     */
    public TCTeSimp.InfCte getInfCte() {
        return infCte;
    }

    /**
     * Define o valor da propriedade infCte.
     * 
     * @param value
     *     allowed object is
     *     {@link TCTeSimp.InfCte }
     *     
     */
    public void setInfCte(TCTeSimp.InfCte value) {
        this.infCte = value;
    }

    /**
     * Obtém o valor da propriedade infCTeSupl.
     * 
     * @return
     *     possible object is
     *     {@link TCTeSimp.InfCTeSupl }
     *     
     */
    public TCTeSimp.InfCTeSupl getInfCTeSupl() {
        return infCTeSupl;
    }

    /**
     * Define o valor da propriedade infCTeSupl.
     * 
     * @param value
     *     allowed object is
     *     {@link TCTeSimp.InfCTeSupl }
     *     
     */
    public void setInfCTeSupl(TCTeSimp.InfCTeSupl value) {
        this.infCTeSupl = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
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
     *         &lt;element name="qrCodCTe">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="50"/>
     *               &lt;maxLength value="1000"/>
     *               &lt;pattern value="((HTTPS?|https?)://.*\?chCTe=[0-9]{6}[A-Z0-9]{12}[0-9]{26}&amp;tpAmb=[1-2](&amp;sign=[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1})?)"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "qrCodCTe"
    })
    public static class InfCTeSupl {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String qrCodCTe;

        /**
         * Obtém o valor da propriedade qrCodCTe.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQrCodCTe() {
            return qrCodCTe;
        }

        /**
         * Define o valor da propriedade qrCodCTe.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQrCodCTe(String value) {
            this.qrCodCTe = value;
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
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="4"/>
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
     *                   &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTeSimp"/>
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
     *                   &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTranspSimp"/>
     *                   &lt;element name="tpServ">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
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
     *                   &lt;element name="gCompraGov" type="{http://www.portalfiscal.inf.br/cte}TCompraGovReduzido" minOccurs="0"/>
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
     *                   &lt;choice>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                   &lt;/choice>
     *                   &lt;element name="IE" minOccurs="0">
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
     *                   &lt;element name="CRT" type="{http://www.portalfiscal.inf.br/cte}TCRT"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="toma">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="toma">
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
     *                   &lt;element name="ISUF" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{8,9}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
     *                   &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                   &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infCarga">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
     *                                   &lt;maxLength value="2"/>
     *                                   &lt;enumeration value="00"/>
     *                                   &lt;enumeration value="01"/>
     *                                   &lt;enumeration value="02"/>
     *                                   &lt;enumeration value="03"/>
     *                                   &lt;enumeration value="04"/>
     *                                   &lt;enumeration value="05"/>
     *                                   &lt;enumeration value="06"/>
     *                                   &lt;enumeration value="07"/>
     *                                   &lt;enumeration value="08"/>
     *                                   &lt;enumeration value="09"/>
     *                                   &lt;enumeration value="10"/>
     *                                   &lt;enumeration value="11"/>
     *                                   &lt;enumeration value="12"/>
     *                                   &lt;enumeration value="13"/>
     *                                   &lt;enumeration value="14"/>
     *                                   &lt;enumeration value="15"/>
     *                                   &lt;enumeration value="99"/>
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
     *         &lt;element name="det" maxOccurs="999">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;sequence>
     *                     &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
     *                     &lt;element name="xMunIni">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                           &lt;minLength value="2"/>
     *                           &lt;maxLength value="60"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                   &lt;sequence>
     *                     &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
     *                     &lt;element name="xMunFim">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                           &lt;minLength value="2"/>
     *                           &lt;maxLength value="60"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                   &lt;element name="vPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
     *                   &lt;choice>
     *                     &lt;element name="infNFe" maxOccurs="unbounded">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="chNFe">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChDFe">
     *                                     &lt;pattern value="[0-9]{6}[A-Z0-9]{12}[0-9]{26}"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
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
     *                     &lt;element name="infDocAnt" maxOccurs="unbounded">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
     *                               &lt;element name="tpPrest">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;enumeration value="1"/>
     *                                     &lt;enumeration value="2"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="infNFeTranspParcial" maxOccurs="unbounded" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
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
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="nItem" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;whiteSpace value="preserve"/>
     *                       &lt;pattern value="[1-9]{1}[0-9]{0,1}|[1-8]{1}[0-9]{2}|[9]{1}[0-8]{1}[0-9]{1}|[9]{1}[9]{1}[0]{1}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
     *                       &lt;pattern value="4\.(0[0-9]|[1-9][0-9])"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
     *                             &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                             &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                             &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="IBSCBS" type="{http://www.portalfiscal.inf.br/cte}TTribCTe" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="total">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                   &lt;element name="vTRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                   &lt;element name="vTotDFe" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
     *         &lt;element name="infRespTec" type="{http://www.portalfiscal.inf.br/cte}TRespTec" minOccurs="0"/>
     *         &lt;element name="infSolicNFF" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="xSolic">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="8000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infPAA" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CNPJPAA" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *                   &lt;element name="PAASignature">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *                             &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/>
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
     *       &lt;attribute name="versao" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TVerCTe">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
     *             &lt;pattern value="CTe[0-9]{6}[A-Z0-9]{12}[0-9]{26}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ide",
        "compl",
        "emit",
        "toma",
        "infCarga",
        "det",
        "infModal",
        "cobr",
        "infCteSub",
        "imp",
        "total",
        "autXML",
        "infRespTec",
        "infSolicNFF",
        "infPAA"
    })
    public static class InfCte {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected TCTeSimp.InfCte.Ide ide;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected TCTeSimp.InfCte.Compl compl;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected TCTeSimp.InfCte.Emit emit;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected TCTeSimp.InfCte.Toma toma;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected TCTeSimp.InfCte.InfCarga infCarga;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected List<TCTeSimp.InfCte.Det> det;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected TCTeSimp.InfCte.InfModal infModal;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected TCTeSimp.InfCte.Cobr cobr;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected TCTeSimp.InfCte.InfCteSub infCteSub;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected TCTeSimp.InfCte.Imp imp;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected TCTeSimp.InfCte.Total total;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected List<TCTeSimp.InfCte.AutXML> autXML;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected TRespTec infRespTec;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected TCTeSimp.InfCte.InfSolicNFF infSolicNFF;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected TCTeSimp.InfCte.InfPAA infPAA;
        @XmlAttribute(name = "versao", required = true)
        protected String versao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ide.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.Ide }
         *     
         */
        public TCTeSimp.InfCte.Ide getIde() {
            return ide;
        }

        /**
         * Define o valor da propriedade ide.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.Ide }
         *     
         */
        public void setIde(TCTeSimp.InfCte.Ide value) {
            this.ide = value;
        }

        /**
         * Obtém o valor da propriedade compl.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.Compl }
         *     
         */
        public TCTeSimp.InfCte.Compl getCompl() {
            return compl;
        }

        /**
         * Define o valor da propriedade compl.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.Compl }
         *     
         */
        public void setCompl(TCTeSimp.InfCte.Compl value) {
            this.compl = value;
        }

        /**
         * Obtém o valor da propriedade emit.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.Emit }
         *     
         */
        public TCTeSimp.InfCte.Emit getEmit() {
            return emit;
        }

        /**
         * Define o valor da propriedade emit.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.Emit }
         *     
         */
        public void setEmit(TCTeSimp.InfCte.Emit value) {
            this.emit = value;
        }

        /**
         * Obtém o valor da propriedade toma.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.Toma }
         *     
         */
        public TCTeSimp.InfCte.Toma getToma() {
            return toma;
        }

        /**
         * Define o valor da propriedade toma.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.Toma }
         *     
         */
        public void setToma(TCTeSimp.InfCte.Toma value) {
            this.toma = value;
        }

        /**
         * Obtém o valor da propriedade infCarga.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.InfCarga }
         *     
         */
        public TCTeSimp.InfCte.InfCarga getInfCarga() {
            return infCarga;
        }

        /**
         * Define o valor da propriedade infCarga.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.InfCarga }
         *     
         */
        public void setInfCarga(TCTeSimp.InfCte.InfCarga value) {
            this.infCarga = value;
        }

        /**
         * Gets the value of the det property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the det property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TCTeSimp.InfCte.Det }
         * 
         * 
         */
        public List<TCTeSimp.InfCte.Det> getDet() {
            if (det == null) {
                det = new ArrayList<TCTeSimp.InfCte.Det>();
            }
            return this.det;
        }

        /**
         * Obtém o valor da propriedade infModal.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.InfModal }
         *     
         */
        public TCTeSimp.InfCte.InfModal getInfModal() {
            return infModal;
        }

        /**
         * Define o valor da propriedade infModal.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.InfModal }
         *     
         */
        public void setInfModal(TCTeSimp.InfCte.InfModal value) {
            this.infModal = value;
        }

        /**
         * Obtém o valor da propriedade cobr.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.Cobr }
         *     
         */
        public TCTeSimp.InfCte.Cobr getCobr() {
            return cobr;
        }

        /**
         * Define o valor da propriedade cobr.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.Cobr }
         *     
         */
        public void setCobr(TCTeSimp.InfCte.Cobr value) {
            this.cobr = value;
        }

        /**
         * Obtém o valor da propriedade infCteSub.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.InfCteSub }
         *     
         */
        public TCTeSimp.InfCte.InfCteSub getInfCteSub() {
            return infCteSub;
        }

        /**
         * Define o valor da propriedade infCteSub.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.InfCteSub }
         *     
         */
        public void setInfCteSub(TCTeSimp.InfCte.InfCteSub value) {
            this.infCteSub = value;
        }

        /**
         * Obtém o valor da propriedade imp.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.Imp }
         *     
         */
        public TCTeSimp.InfCte.Imp getImp() {
            return imp;
        }

        /**
         * Define o valor da propriedade imp.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.Imp }
         *     
         */
        public void setImp(TCTeSimp.InfCte.Imp value) {
            this.imp = value;
        }

        /**
         * Obtém o valor da propriedade total.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.Total }
         *     
         */
        public TCTeSimp.InfCte.Total getTotal() {
            return total;
        }

        /**
         * Define o valor da propriedade total.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.Total }
         *     
         */
        public void setTotal(TCTeSimp.InfCte.Total value) {
            this.total = value;
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
         * {@link TCTeSimp.InfCte.AutXML }
         * 
         * 
         */
        public List<TCTeSimp.InfCte.AutXML> getAutXML() {
            if (autXML == null) {
                autXML = new ArrayList<TCTeSimp.InfCte.AutXML>();
            }
            return this.autXML;
        }

        /**
         * Obtém o valor da propriedade infRespTec.
         * 
         * @return
         *     possible object is
         *     {@link TRespTec }
         *     
         */
        public TRespTec getInfRespTec() {
            return infRespTec;
        }

        /**
         * Define o valor da propriedade infRespTec.
         * 
         * @param value
         *     allowed object is
         *     {@link TRespTec }
         *     
         */
        public void setInfRespTec(TRespTec value) {
            this.infRespTec = value;
        }

        /**
         * Obtém o valor da propriedade infSolicNFF.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.InfSolicNFF }
         *     
         */
        public TCTeSimp.InfCte.InfSolicNFF getInfSolicNFF() {
            return infSolicNFF;
        }

        /**
         * Define o valor da propriedade infSolicNFF.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.InfSolicNFF }
         *     
         */
        public void setInfSolicNFF(TCTeSimp.InfCte.InfSolicNFF value) {
            this.infSolicNFF = value;
        }

        /**
         * Obtém o valor da propriedade infPAA.
         * 
         * @return
         *     possible object is
         *     {@link TCTeSimp.InfCte.InfPAA }
         *     
         */
        public TCTeSimp.InfCte.InfPAA getInfPAA() {
            return infPAA;
        }

        /**
         * Define o valor da propriedade infPAA.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTeSimp.InfCte.InfPAA }
         *     
         */
        public void setInfPAA(TCTeSimp.InfCte.InfPAA value) {
            this.infPAA = value;
        }

        /**
         * Obtém o valor da propriedade versao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersao() {
            return versao;
        }

        /**
         * Define o valor da propriedade versao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersao(String value) {
            this.versao = value;
        }

        /**
         * Obtém o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
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
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cnpj",
            "cpf"
        })
        public static class AutXML {

            @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/cte")
            protected String cnpj;
            @XmlElement(name = "CPF", namespace = "http://www.portalfiscal.inf.br/cte")
            protected String cpf;

            /**
             * Obtém o valor da propriedade cnpj.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obtém o valor da propriedade cpf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Define o valor da propriedade cpf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
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
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fat",
            "dup"
        })
        public static class Cobr {

            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected TCTeSimp.InfCte.Cobr.Fat fat;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected List<TCTeSimp.InfCte.Cobr.Dup> dup;

            /**
             * Obtém o valor da propriedade fat.
             * 
             * @return
             *     possible object is
             *     {@link TCTeSimp.InfCte.Cobr.Fat }
             *     
             */
            public TCTeSimp.InfCte.Cobr.Fat getFat() {
                return fat;
            }

            /**
             * Define o valor da propriedade fat.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTeSimp.InfCte.Cobr.Fat }
             *     
             */
            public void setFat(TCTeSimp.InfCte.Cobr.Fat value) {
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
             * {@link TCTeSimp.InfCte.Cobr.Dup }
             * 
             * 
             */
            public List<TCTeSimp.InfCte.Cobr.Dup> getDup() {
                if (dup == null) {
                    dup = new ArrayList<TCTeSimp.InfCte.Cobr.Dup>();
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
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nDup",
                "dVenc",
                "vDup"
            })
            public static class Dup {

                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String nDup;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String dVenc;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String vDup;

                /**
                 * Obtém o valor da propriedade nDup.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNDup() {
                    return nDup;
                }

                /**
                 * Define o valor da propriedade nDup.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNDup(String value) {
                    this.nDup = value;
                }

                /**
                 * Obtém o valor da propriedade dVenc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDVenc() {
                    return dVenc;
                }

                /**
                 * Define o valor da propriedade dVenc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDVenc(String value) {
                    this.dVenc = value;
                }

                /**
                 * Obtém o valor da propriedade vDup.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDup() {
                    return vDup;
                }

                /**
                 * Define o valor da propriedade vDup.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
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
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nFat",
                "vOrig",
                "vDesc",
                "vLiq"
            })
            public static class Fat {

                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String nFat;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String vOrig;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String vDesc;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String vLiq;

                /**
                 * Obtém o valor da propriedade nFat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNFat() {
                    return nFat;
                }

                /**
                 * Define o valor da propriedade nFat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNFat(String value) {
                    this.nFat = value;
                }

                /**
                 * Obtém o valor da propriedade vOrig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVOrig() {
                    return vOrig;
                }

                /**
                 * Define o valor da propriedade vOrig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVOrig(String value) {
                    this.vOrig = value;
                }

                /**
                 * Obtém o valor da propriedade vDesc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDesc() {
                    return vDesc;
                }

                /**
                 * Define o valor da propriedade vDesc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVDesc(String value) {
                    this.vDesc = value;
                }

                /**
                 * Obtém o valor da propriedade vLiq.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVLiq() {
                    return vLiq;
                }

                /**
                 * Define o valor da propriedade vLiq.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
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
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "xCaracAd",
            "xCaracSer",
            "fluxo",
            "xObs",
            "obsCont",
            "obsFisco"
        })
        public static class Compl {

            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String xCaracAd;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String xCaracSer;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected TCTeSimp.InfCte.Compl.Fluxo fluxo;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String xObs;
            @XmlElement(name = "ObsCont", namespace = "http://www.portalfiscal.inf.br/cte")
            protected List<TCTeSimp.InfCte.Compl.ObsCont> obsCont;
            @XmlElement(name = "ObsFisco", namespace = "http://www.portalfiscal.inf.br/cte")
            protected List<TCTeSimp.InfCte.Compl.ObsFisco> obsFisco;

            /**
             * Obtém o valor da propriedade xCaracAd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCaracAd() {
                return xCaracAd;
            }

            /**
             * Define o valor da propriedade xCaracAd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCaracAd(String value) {
                this.xCaracAd = value;
            }

            /**
             * Obtém o valor da propriedade xCaracSer.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCaracSer() {
                return xCaracSer;
            }

            /**
             * Define o valor da propriedade xCaracSer.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCaracSer(String value) {
                this.xCaracSer = value;
            }

            /**
             * Obtém o valor da propriedade fluxo.
             * 
             * @return
             *     possible object is
             *     {@link TCTeSimp.InfCte.Compl.Fluxo }
             *     
             */
            public TCTeSimp.InfCte.Compl.Fluxo getFluxo() {
                return fluxo;
            }

            /**
             * Define o valor da propriedade fluxo.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTeSimp.InfCte.Compl.Fluxo }
             *     
             */
            public void setFluxo(TCTeSimp.InfCte.Compl.Fluxo value) {
                this.fluxo = value;
            }

            /**
             * Obtém o valor da propriedade xObs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXObs() {
                return xObs;
            }

            /**
             * Define o valor da propriedade xObs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
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
             * {@link TCTeSimp.InfCte.Compl.ObsCont }
             * 
             * 
             */
            public List<TCTeSimp.InfCte.Compl.ObsCont> getObsCont() {
                if (obsCont == null) {
                    obsCont = new ArrayList<TCTeSimp.InfCte.Compl.ObsCont>();
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
             * {@link TCTeSimp.InfCte.Compl.ObsFisco }
             * 
             * 
             */
            public List<TCTeSimp.InfCte.Compl.ObsFisco> getObsFisco() {
                if (obsFisco == null) {
                    obsFisco = new ArrayList<TCTeSimp.InfCte.Compl.ObsFisco>();
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
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "xOrig",
                "pass",
                "xDest",
                "xRota"
            })
            public static class Fluxo {

                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String xOrig;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected List<TCTeSimp.InfCte.Compl.Fluxo.Pass> pass;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String xDest;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String xRota;

                /**
                 * Obtém o valor da propriedade xOrig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXOrig() {
                    return xOrig;
                }

                /**
                 * Define o valor da propriedade xOrig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
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
                 * {@link TCTeSimp.InfCte.Compl.Fluxo.Pass }
                 * 
                 * 
                 */
                public List<TCTeSimp.InfCte.Compl.Fluxo.Pass> getPass() {
                    if (pass == null) {
                        pass = new ArrayList<TCTeSimp.InfCte.Compl.Fluxo.Pass>();
                    }
                    return this.pass;
                }

                /**
                 * Obtém o valor da propriedade xDest.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXDest() {
                    return xDest;
                }

                /**
                 * Define o valor da propriedade xDest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXDest(String value) {
                    this.xDest = value;
                }

                /**
                 * Obtém o valor da propriedade xRota.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXRota() {
                    return xRota;
                }

                /**
                 * Define o valor da propriedade xRota.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
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
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "xPass"
                })
                public static class Pass {

                    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                    protected String xPass;

                    /**
                     * Obtém o valor da propriedade xPass.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXPass() {
                        return xPass;
                    }

                    /**
                     * Define o valor da propriedade xPass.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "xTexto"
            })
            public static class ObsCont {

                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String xTexto;
                @XmlAttribute(name = "xCampo", required = true)
                protected String xCampo;

                /**
                 * Obtém o valor da propriedade xTexto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Define o valor da propriedade xTexto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Obtém o valor da propriedade xCampo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Define o valor da propriedade xCampo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
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
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "xTexto"
            })
            public static class ObsFisco {

                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String xTexto;
                @XmlAttribute(name = "xCampo", required = true)
                protected String xCampo;

                /**
                 * Obtém o valor da propriedade xTexto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Define o valor da propriedade xTexto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Obtém o valor da propriedade xCampo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Define o valor da propriedade xCampo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
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
         *         &lt;sequence>
         *           &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
         *           &lt;element name="xMunIni">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                 &lt;minLength value="2"/>
         *                 &lt;maxLength value="60"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *         &lt;/sequence>
         *         &lt;sequence>
         *           &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
         *           &lt;element name="xMunFim">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                 &lt;minLength value="2"/>
         *                 &lt;maxLength value="60"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *         &lt;/sequence>
         *         &lt;element name="vPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
         *         &lt;choice>
         *           &lt;element name="infNFe" maxOccurs="unbounded">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="chNFe">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChDFe">
         *                           &lt;pattern value="[0-9]{6}[A-Z0-9]{12}[0-9]{26}"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
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
         *           &lt;element name="infDocAnt" maxOccurs="unbounded">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
         *                     &lt;element name="tpPrest">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;whiteSpace value="preserve"/>
         *                           &lt;enumeration value="1"/>
         *                           &lt;enumeration value="2"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="infNFeTranspParcial" maxOccurs="unbounded" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
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
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="nItem" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;whiteSpace value="preserve"/>
         *             &lt;pattern value="[1-9]{1}[0-9]{0,1}|[1-8]{1}[0-9]{2}|[9]{1}[0-8]{1}[0-9]{1}|[9]{1}[9]{1}[0]{1}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cMunIni",
            "xMunIni",
            "cMunFim",
            "xMunFim",
            "vPrest",
            "vRec",
            "comp",
            "infNFe",
            "infDocAnt"
        })
        public static class Det {

            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String cMunIni;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String xMunIni;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String cMunFim;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String xMunFim;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String vPrest;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String vRec;
            @XmlElement(name = "Comp", namespace = "http://www.portalfiscal.inf.br/cte")
            protected List<TCTeSimp.InfCte.Det.Comp> comp;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected List<TCTeSimp.InfCte.Det.InfNFe> infNFe;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected List<TCTeSimp.InfCte.Det.InfDocAnt> infDocAnt;
            @XmlAttribute(name = "nItem", required = true)
            protected String nItem;

            /**
             * Obtém o valor da propriedade cMunIni.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCMunIni() {
                return cMunIni;
            }

            /**
             * Define o valor da propriedade cMunIni.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCMunIni(String value) {
                this.cMunIni = value;
            }

            /**
             * Obtém o valor da propriedade xMunIni.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXMunIni() {
                return xMunIni;
            }

            /**
             * Define o valor da propriedade xMunIni.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXMunIni(String value) {
                this.xMunIni = value;
            }

            /**
             * Obtém o valor da propriedade cMunFim.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCMunFim() {
                return cMunFim;
            }

            /**
             * Define o valor da propriedade cMunFim.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCMunFim(String value) {
                this.cMunFim = value;
            }

            /**
             * Obtém o valor da propriedade xMunFim.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXMunFim() {
                return xMunFim;
            }

            /**
             * Define o valor da propriedade xMunFim.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXMunFim(String value) {
                this.xMunFim = value;
            }

            /**
             * Obtém o valor da propriedade vPrest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVPrest() {
                return vPrest;
            }

            /**
             * Define o valor da propriedade vPrest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVPrest(String value) {
                this.vPrest = value;
            }

            /**
             * Obtém o valor da propriedade vRec.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVRec() {
                return vRec;
            }

            /**
             * Define o valor da propriedade vRec.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
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
             * {@link TCTeSimp.InfCte.Det.Comp }
             * 
             * 
             */
            public List<TCTeSimp.InfCte.Det.Comp> getComp() {
                if (comp == null) {
                    comp = new ArrayList<TCTeSimp.InfCte.Det.Comp>();
                }
                return this.comp;
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
             * {@link TCTeSimp.InfCte.Det.InfNFe }
             * 
             * 
             */
            public List<TCTeSimp.InfCte.Det.InfNFe> getInfNFe() {
                if (infNFe == null) {
                    infNFe = new ArrayList<TCTeSimp.InfCte.Det.InfNFe>();
                }
                return this.infNFe;
            }

            /**
             * Gets the value of the infDocAnt property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infDocAnt property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfDocAnt().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTeSimp.InfCte.Det.InfDocAnt }
             * 
             * 
             */
            public List<TCTeSimp.InfCte.Det.InfDocAnt> getInfDocAnt() {
                if (infDocAnt == null) {
                    infDocAnt = new ArrayList<TCTeSimp.InfCte.Det.InfDocAnt>();
                }
                return this.infDocAnt;
            }

            /**
             * Obtém o valor da propriedade nItem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNItem() {
                return nItem;
            }

            /**
             * Define o valor da propriedade nItem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNItem(String value) {
                this.nItem = value;
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
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "xNome",
                "vComp"
            })
            public static class Comp {

                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String xNome;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String vComp;

                /**
                 * Obtém o valor da propriedade xNome.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXNome() {
                    return xNome;
                }

                /**
                 * Define o valor da propriedade xNome.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXNome(String value) {
                    this.xNome = value;
                }

                /**
                 * Obtém o valor da propriedade vComp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVComp() {
                    return vComp;
                }

                /**
                 * Define o valor da propriedade vComp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVComp(String value) {
                    this.vComp = value;
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
             *         &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
             *         &lt;element name="tpPrest">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="infNFeTranspParcial" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
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
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "chCTe",
                "tpPrest",
                "infNFeTranspParcial"
            })
            public static class InfDocAnt {

                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String chCTe;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String tpPrest;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected List<TCTeSimp.InfCte.Det.InfDocAnt.InfNFeTranspParcial> infNFeTranspParcial;

                /**
                 * Obtém o valor da propriedade chCTe.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChCTe() {
                    return chCTe;
                }

                /**
                 * Define o valor da propriedade chCTe.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChCTe(String value) {
                    this.chCTe = value;
                }

                /**
                 * Obtém o valor da propriedade tpPrest.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTpPrest() {
                    return tpPrest;
                }

                /**
                 * Define o valor da propriedade tpPrest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTpPrest(String value) {
                    this.tpPrest = value;
                }

                /**
                 * Gets the value of the infNFeTranspParcial property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infNFeTranspParcial property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfNFeTranspParcial().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TCTeSimp.InfCte.Det.InfDocAnt.InfNFeTranspParcial }
                 * 
                 * 
                 */
                public List<TCTeSimp.InfCte.Det.InfDocAnt.InfNFeTranspParcial> getInfNFeTranspParcial() {
                    if (infNFeTranspParcial == null) {
                        infNFeTranspParcial = new ArrayList<TCTeSimp.InfCte.Det.InfDocAnt.InfNFeTranspParcial>();
                    }
                    return this.infNFeTranspParcial;
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
                 *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "chNFe"
                })
                public static class InfNFeTranspParcial {

                    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                    protected String chNFe;

                    /**
                     * Obtém o valor da propriedade chNFe.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChNFe() {
                        return chNFe;
                    }

                    /**
                     * Define o valor da propriedade chNFe.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChNFe(String value) {
                        this.chNFe = value;
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
             *         &lt;element name="chNFe">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChDFe">
             *               &lt;pattern value="[0-9]{6}[A-Z0-9]{12}[0-9]{26}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
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
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "chNFe",
                "pin",
                "dPrev",
                "infUnidCarga",
                "infUnidTransp"
            })
            public static class InfNFe {

                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String chNFe;
                @XmlElement(name = "PIN", namespace = "http://www.portalfiscal.inf.br/cte")
                protected String pin;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected String dPrev;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected List<TUnidCarga> infUnidCarga;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
                protected List<TUnidadeTransp> infUnidTransp;

                /**
                 * Obtém o valor da propriedade chNFe.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChNFe() {
                    return chNFe;
                }

                /**
                 * Define o valor da propriedade chNFe.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChNFe(String value) {
                    this.chNFe = value;
                }

                /**
                 * Obtém o valor da propriedade pin.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPIN() {
                    return pin;
                }

                /**
                 * Define o valor da propriedade pin.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPIN(String value) {
                    this.pin = value;
                }

                /**
                 * Obtém o valor da propriedade dPrev.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDPrev() {
                    return dPrev;
                }

                /**
                 * Define o valor da propriedade dPrev.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
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
                 * 
                 * 
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
                 * 
                 * 
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
         *         &lt;choice>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *         &lt;/choice>
         *         &lt;element name="IE" minOccurs="0">
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
         *         &lt;element name="CRT" type="{http://www.portalfiscal.inf.br/cte}TCRT"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cnpj",
            "cpf",
            "ie",
            "iest",
            "xNome",
            "xFant",
            "enderEmit",
            "crt"
        })
        public static class Emit {

            @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/cte")
            protected String cnpj;
            @XmlElement(name = "CPF", namespace = "http://www.portalfiscal.inf.br/cte")
            protected String cpf;
            @XmlElement(name = "IE", namespace = "http://www.portalfiscal.inf.br/cte")
            protected String ie;
            @XmlElement(name = "IEST", namespace = "http://www.portalfiscal.inf.br/cte")
            protected String iest;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String xNome;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String xFant;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected TEndeEmi enderEmit;
            @XmlElement(name = "CRT", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String crt;

            /**
             * Obtém o valor da propriedade cnpj.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obtém o valor da propriedade cpf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Define o valor da propriedade cpf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

            /**
             * Obtém o valor da propriedade ie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Obtém o valor da propriedade iest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIEST() {
                return iest;
            }

            /**
             * Define o valor da propriedade iest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIEST(String value) {
                this.iest = value;
            }

            /**
             * Obtém o valor da propriedade xNome.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Define o valor da propriedade xNome.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNome(String value) {
                this.xNome = value;
            }

            /**
             * Obtém o valor da propriedade xFant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXFant() {
                return xFant;
            }

            /**
             * Define o valor da propriedade xFant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXFant(String value) {
                this.xFant = value;
            }

            /**
             * Obtém o valor da propriedade enderEmit.
             * 
             * @return
             *     possible object is
             *     {@link TEndeEmi }
             *     
             */
            public TEndeEmi getEnderEmit() {
                return enderEmit;
            }

            /**
             * Define o valor da propriedade enderEmit.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndeEmi }
             *     
             */
            public void setEnderEmit(TEndeEmi value) {
                this.enderEmit = value;
            }

            /**
             * Obtém o valor da propriedade crt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRT() {
                return crt;
            }

            /**
             * Define o valor da propriedade crt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRT(String value) {
                this.crt = value;
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
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
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
         *         &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTeSimp"/>
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
         *         &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTranspSimp"/>
         *         &lt;element name="tpServ">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
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
         *         &lt;element name="gCompraGov" type="{http://www.portalfiscal.inf.br/cte}TCompraGovReduzido" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
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
            "ufIni",
            "ufFim",
            "retira",
            "xDetRetira",
            "dhCont",
            "xJust",
            "gCompraGov"
        })
        public static class Ide {

            @XmlElement(name = "cUF", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String cuf;
            @XmlElement(name = "cCT", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String cct;
            @XmlElement(name = "CFOP", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String cfop;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String natOp;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String mod;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String serie;
            @XmlElement(name = "nCT", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String nct;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String dhEmi;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String tpImp;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String tpEmis;
            @XmlElement(name = "cDV", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String cdv;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String tpAmb;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String tpCTe;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String procEmi;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String verProc;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String cMunEnv;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String xMunEnv;
            @XmlElement(name = "UFEnv", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            @XmlSchemaType(name = "string")
            protected TUf ufEnv;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String modal;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String tpServ;
            @XmlElement(name = "UFIni", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            @XmlSchemaType(name = "string")
            protected TUf ufIni;
            @XmlElement(name = "UFFim", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            @XmlSchemaType(name = "string")
            protected TUf ufFim;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String retira;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String xDetRetira;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String dhCont;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String xJust;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected TCompraGovReduzido gCompraGov;

            /**
             * Obtém o valor da propriedade cuf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUF() {
                return cuf;
            }

            /**
             * Define o valor da propriedade cuf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUF(String value) {
                this.cuf = value;
            }

            /**
             * Obtém o valor da propriedade cct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCCT() {
                return cct;
            }

            /**
             * Define o valor da propriedade cct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCCT(String value) {
                this.cct = value;
            }

            /**
             * Obtém o valor da propriedade cfop.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCFOP() {
                return cfop;
            }

            /**
             * Define o valor da propriedade cfop.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCFOP(String value) {
                this.cfop = value;
            }

            /**
             * Obtém o valor da propriedade natOp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNatOp() {
                return natOp;
            }

            /**
             * Define o valor da propriedade natOp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNatOp(String value) {
                this.natOp = value;
            }

            /**
             * Obtém o valor da propriedade mod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMod() {
                return mod;
            }

            /**
             * Define o valor da propriedade mod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMod(String value) {
                this.mod = value;
            }

            /**
             * Obtém o valor da propriedade serie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSerie() {
                return serie;
            }

            /**
             * Define o valor da propriedade serie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSerie(String value) {
                this.serie = value;
            }

            /**
             * Obtém o valor da propriedade nct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNCT() {
                return nct;
            }

            /**
             * Define o valor da propriedade nct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNCT(String value) {
                this.nct = value;
            }

            /**
             * Obtém o valor da propriedade dhEmi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDhEmi() {
                return dhEmi;
            }

            /**
             * Define o valor da propriedade dhEmi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDhEmi(String value) {
                this.dhEmi = value;
            }

            /**
             * Obtém o valor da propriedade tpImp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpImp() {
                return tpImp;
            }

            /**
             * Define o valor da propriedade tpImp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpImp(String value) {
                this.tpImp = value;
            }

            /**
             * Obtém o valor da propriedade tpEmis.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpEmis() {
                return tpEmis;
            }

            /**
             * Define o valor da propriedade tpEmis.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpEmis(String value) {
                this.tpEmis = value;
            }

            /**
             * Obtém o valor da propriedade cdv.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCDV() {
                return cdv;
            }

            /**
             * Define o valor da propriedade cdv.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCDV(String value) {
                this.cdv = value;
            }

            /**
             * Obtém o valor da propriedade tpAmb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpAmb() {
                return tpAmb;
            }

            /**
             * Define o valor da propriedade tpAmb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpAmb(String value) {
                this.tpAmb = value;
            }

            /**
             * Obtém o valor da propriedade tpCTe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpCTe() {
                return tpCTe;
            }

            /**
             * Define o valor da propriedade tpCTe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpCTe(String value) {
                this.tpCTe = value;
            }

            /**
             * Obtém o valor da propriedade procEmi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcEmi() {
                return procEmi;
            }

            /**
             * Define o valor da propriedade procEmi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcEmi(String value) {
                this.procEmi = value;
            }

            /**
             * Obtém o valor da propriedade verProc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Define o valor da propriedade verProc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVerProc(String value) {
                this.verProc = value;
            }

            /**
             * Obtém o valor da propriedade cMunEnv.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCMunEnv() {
                return cMunEnv;
            }

            /**
             * Define o valor da propriedade cMunEnv.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCMunEnv(String value) {
                this.cMunEnv = value;
            }

            /**
             * Obtém o valor da propriedade xMunEnv.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXMunEnv() {
                return xMunEnv;
            }

            /**
             * Define o valor da propriedade xMunEnv.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXMunEnv(String value) {
                this.xMunEnv = value;
            }

            /**
             * Obtém o valor da propriedade ufEnv.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getUFEnv() {
                return ufEnv;
            }

            /**
             * Define o valor da propriedade ufEnv.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setUFEnv(TUf value) {
                this.ufEnv = value;
            }

            /**
             * Obtém o valor da propriedade modal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModal() {
                return modal;
            }

            /**
             * Define o valor da propriedade modal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModal(String value) {
                this.modal = value;
            }

            /**
             * Obtém o valor da propriedade tpServ.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpServ() {
                return tpServ;
            }

            /**
             * Define o valor da propriedade tpServ.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpServ(String value) {
                this.tpServ = value;
            }

            /**
             * Obtém o valor da propriedade ufIni.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getUFIni() {
                return ufIni;
            }

            /**
             * Define o valor da propriedade ufIni.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setUFIni(TUf value) {
                this.ufIni = value;
            }

            /**
             * Obtém o valor da propriedade ufFim.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getUFFim() {
                return ufFim;
            }

            /**
             * Define o valor da propriedade ufFim.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setUFFim(TUf value) {
                this.ufFim = value;
            }

            /**
             * Obtém o valor da propriedade retira.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRetira() {
                return retira;
            }

            /**
             * Define o valor da propriedade retira.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRetira(String value) {
                this.retira = value;
            }

            /**
             * Obtém o valor da propriedade xDetRetira.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXDetRetira() {
                return xDetRetira;
            }

            /**
             * Define o valor da propriedade xDetRetira.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXDetRetira(String value) {
                this.xDetRetira = value;
            }

            /**
             * Obtém o valor da propriedade dhCont.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDhCont() {
                return dhCont;
            }

            /**
             * Define o valor da propriedade dhCont.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDhCont(String value) {
                this.dhCont = value;
            }

            /**
             * Obtém o valor da propriedade xJust.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXJust() {
                return xJust;
            }

            /**
             * Define o valor da propriedade xJust.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXJust(String value) {
                this.xJust = value;
            }

            /**
             * Obtém o valor da propriedade gCompraGov.
             * 
             * @return
             *     possible object is
             *     {@link TCompraGovReduzido }
             *     
             */
            public TCompraGovReduzido getGCompraGov() {
                return gCompraGov;
            }

            /**
             * Define o valor da propriedade gCompraGov.
             * 
             * @param value
             *     allowed object is
             *     {@link TCompraGovReduzido }
             *     
             */
            public void setGCompraGov(TCompraGovReduzido value) {
                this.gCompraGov = value;
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
         *                   &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                   &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                   &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="IBSCBS" type="{http://www.portalfiscal.inf.br/cte}TTribCTe" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "icms",
            "vTotTrib",
            "infAdFisco",
            "icmsufFim",
            "ibscbs"
        })
        public static class Imp {

            @XmlElement(name = "ICMS", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected TImp icms;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String vTotTrib;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String infAdFisco;
            @XmlElement(name = "ICMSUFFim", namespace = "http://www.portalfiscal.inf.br/cte")
            protected TCTeSimp.InfCte.Imp.ICMSUFFim icmsufFim;
            @XmlElement(name = "IBSCBS", namespace = "http://www.portalfiscal.inf.br/cte")
            protected TTribCTe ibscbs;

            /**
             * Obtém o valor da propriedade icms.
             * 
             * @return
             *     possible object is
             *     {@link TImp }
             *     
             */
            public TImp getICMS() {
                return icms;
            }

            /**
             * Define o valor da propriedade icms.
             * 
             * @param value
             *     allowed object is
             *     {@link TImp }
             *     
             */
            public void setICMS(TImp value) {
                this.icms = value;
            }

            /**
             * Obtém o valor da propriedade vTotTrib.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVTotTrib() {
                return vTotTrib;
            }

            /**
             * Define o valor da propriedade vTotTrib.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVTotTrib(String value) {
                this.vTotTrib = value;
            }

            /**
             * Obtém o valor da propriedade infAdFisco.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfAdFisco() {
                return infAdFisco;
            }

            /**
             * Define o valor da propriedade infAdFisco.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfAdFisco(String value) {
                this.infAdFisco = value;
            }

            /**
             * Obtém o valor da propriedade icmsufFim.
             * 
             * @return
             *     possible object is
             *     {@link TCTeSimp.InfCte.Imp.ICMSUFFim }
             *     
             */
            public TCTeSimp.InfCte.Imp.ICMSUFFim getICMSUFFim() {
                return icmsufFim;
            }

            /**
             * Define o valor da propriedade icmsufFim.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTeSimp.InfCte.Imp.ICMSUFFim }
             *     
             */
            public void setICMSUFFim(TCTeSimp.InfCte.Imp.ICMSUFFim value) {
                this.icmsufFim = value;
            }

            /**
             * Obtém o valor da propriedade ibscbs.
             * 
             * @return
             *     possible object is
             *     {@link TTribCTe }
             *     
             */
            public TTribCTe getIBSCBS() {
                return ibscbs;
            }

            /**
             * Define o valor da propriedade ibscbs.
             * 
             * @param value
             *     allowed object is
             *     {@link TTribCTe }
             *     
             */
            public void setIBSCBS(TTribCTe value) {
                this.ibscbs = value;
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
             *         &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "vbcufFim",
                "pfcpufFim",
                "picmsufFim",
                "picmsInter",
                "vfcpufFim",
                "vicmsufFim",
                "vicmsufIni"
            })
            public static class ICMSUFFim {

                @XmlElement(name = "vBCUFFim", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String vbcufFim;
                @XmlElement(name = "pFCPUFFim", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String pfcpufFim;
                @XmlElement(name = "pICMSUFFim", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String picmsufFim;
                @XmlElement(name = "pICMSInter", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String picmsInter;
                @XmlElement(name = "vFCPUFFim", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String vfcpufFim;
                @XmlElement(name = "vICMSUFFim", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String vicmsufFim;
                @XmlElement(name = "vICMSUFIni", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String vicmsufIni;

                /**
                 * Obtém o valor da propriedade vbcufFim.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVBCUFFim() {
                    return vbcufFim;
                }

                /**
                 * Define o valor da propriedade vbcufFim.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVBCUFFim(String value) {
                    this.vbcufFim = value;
                }

                /**
                 * Obtém o valor da propriedade pfcpufFim.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPFCPUFFim() {
                    return pfcpufFim;
                }

                /**
                 * Define o valor da propriedade pfcpufFim.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPFCPUFFim(String value) {
                    this.pfcpufFim = value;
                }

                /**
                 * Obtém o valor da propriedade picmsufFim.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPICMSUFFim() {
                    return picmsufFim;
                }

                /**
                 * Define o valor da propriedade picmsufFim.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPICMSUFFim(String value) {
                    this.picmsufFim = value;
                }

                /**
                 * Obtém o valor da propriedade picmsInter.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPICMSInter() {
                    return picmsInter;
                }

                /**
                 * Define o valor da propriedade picmsInter.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPICMSInter(String value) {
                    this.picmsInter = value;
                }

                /**
                 * Obtém o valor da propriedade vfcpufFim.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVFCPUFFim() {
                    return vfcpufFim;
                }

                /**
                 * Define o valor da propriedade vfcpufFim.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVFCPUFFim(String value) {
                    this.vfcpufFim = value;
                }

                /**
                 * Obtém o valor da propriedade vicmsufFim.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVICMSUFFim() {
                    return vicmsufFim;
                }

                /**
                 * Define o valor da propriedade vicmsufFim.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVICMSUFFim(String value) {
                    this.vicmsufFim = value;
                }

                /**
                 * Obtém o valor da propriedade vicmsufIni.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVICMSUFIni() {
                    return vicmsufIni;
                }

                /**
                 * Define o valor da propriedade vicmsufIni.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
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
         *         &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
         *                         &lt;maxLength value="2"/>
         *                         &lt;enumeration value="00"/>
         *                         &lt;enumeration value="01"/>
         *                         &lt;enumeration value="02"/>
         *                         &lt;enumeration value="03"/>
         *                         &lt;enumeration value="04"/>
         *                         &lt;enumeration value="05"/>
         *                         &lt;enumeration value="06"/>
         *                         &lt;enumeration value="07"/>
         *                         &lt;enumeration value="08"/>
         *                         &lt;enumeration value="09"/>
         *                         &lt;enumeration value="10"/>
         *                         &lt;enumeration value="11"/>
         *                         &lt;enumeration value="12"/>
         *                         &lt;enumeration value="13"/>
         *                         &lt;enumeration value="14"/>
         *                         &lt;enumeration value="15"/>
         *                         &lt;enumeration value="99"/>
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
         * 
         * 
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

            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String vCarga;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String proPred;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String xOutCat;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected List<TCTeSimp.InfCte.InfCarga.InfQ> infQ;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String vCargaAverb;

            /**
             * Obtém o valor da propriedade vCarga.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVCarga() {
                return vCarga;
            }

            /**
             * Define o valor da propriedade vCarga.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVCarga(String value) {
                this.vCarga = value;
            }

            /**
             * Obtém o valor da propriedade proPred.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProPred() {
                return proPred;
            }

            /**
             * Define o valor da propriedade proPred.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProPred(String value) {
                this.proPred = value;
            }

            /**
             * Obtém o valor da propriedade xOutCat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXOutCat() {
                return xOutCat;
            }

            /**
             * Define o valor da propriedade xOutCat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
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
             * {@link TCTeSimp.InfCte.InfCarga.InfQ }
             * 
             * 
             */
            public List<TCTeSimp.InfCte.InfCarga.InfQ> getInfQ() {
                if (infQ == null) {
                    infQ = new ArrayList<TCTeSimp.InfCte.InfCarga.InfQ>();
                }
                return this.infQ;
            }

            /**
             * Obtém o valor da propriedade vCargaAverb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVCargaAverb() {
                return vCargaAverb;
            }

            /**
             * Define o valor da propriedade vCargaAverb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
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
             *               &lt;maxLength value="2"/>
             *               &lt;enumeration value="00"/>
             *               &lt;enumeration value="01"/>
             *               &lt;enumeration value="02"/>
             *               &lt;enumeration value="03"/>
             *               &lt;enumeration value="04"/>
             *               &lt;enumeration value="05"/>
             *               &lt;enumeration value="06"/>
             *               &lt;enumeration value="07"/>
             *               &lt;enumeration value="08"/>
             *               &lt;enumeration value="09"/>
             *               &lt;enumeration value="10"/>
             *               &lt;enumeration value="11"/>
             *               &lt;enumeration value="12"/>
             *               &lt;enumeration value="13"/>
             *               &lt;enumeration value="14"/>
             *               &lt;enumeration value="15"/>
             *               &lt;enumeration value="99"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cUnid",
                "tpMed",
                "qCarga"
            })
            public static class InfQ {

                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String cUnid;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String tpMed;
                @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected String qCarga;

                /**
                 * Obtém o valor da propriedade cUnid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCUnid() {
                    return cUnid;
                }

                /**
                 * Define o valor da propriedade cUnid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCUnid(String value) {
                    this.cUnid = value;
                }

                /**
                 * Obtém o valor da propriedade tpMed.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTpMed() {
                    return tpMed;
                }

                /**
                 * Define o valor da propriedade tpMed.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTpMed(String value) {
                    this.tpMed = value;
                }

                /**
                 * Obtém o valor da propriedade qCarga.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQCarga() {
                    return qCarga;
                }

                /**
                 * Define o valor da propriedade qCarga.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
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
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "chCte",
            "indAlteraToma"
        })
        public static class InfCteSub {

            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String chCte;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String indAlteraToma;

            /**
             * Obtém o valor da propriedade chCte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChCte() {
                return chCte;
            }

            /**
             * Define o valor da propriedade chCte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChCte(String value) {
                this.chCte = value;
            }

            /**
             * Obtém o valor da propriedade indAlteraToma.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndAlteraToma() {
                return indAlteraToma;
            }

            /**
             * Define o valor da propriedade indAlteraToma.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndAlteraToma(String value) {
                this.indAlteraToma = value;
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
         *             &lt;pattern value="4\.(0[0-9]|[1-9][0-9])"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
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
             * @return
             *     possible object is
             *     {@link Element }
             *     
             */
            public Element getAny() {
                return any;
            }

            /**
             * Define o valor da propriedade any.
             * 
             * @param value
             *     allowed object is
             *     {@link Element }
             *     
             */
            public void setAny(Element value) {
                this.any = value;
            }

            /**
             * Obtém o valor da propriedade versaoModal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVersaoModal() {
                return versaoModal;
            }

            /**
             * Define o valor da propriedade versaoModal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
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
         *         &lt;element name="CNPJPAA" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
         *         &lt;element name="PAASignature">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
         *                   &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/>
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
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cnpjpaa",
            "paaSignature"
        })
        public static class InfPAA {

            @XmlElement(name = "CNPJPAA", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String cnpjpaa;
            @XmlElement(name = "PAASignature", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected TCTeSimp.InfCte.InfPAA.PAASignature paaSignature;

            /**
             * Obtém o valor da propriedade cnpjpaa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJPAA() {
                return cnpjpaa;
            }

            /**
             * Define o valor da propriedade cnpjpaa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJPAA(String value) {
                this.cnpjpaa = value;
            }

            /**
             * Obtém o valor da propriedade paaSignature.
             * 
             * @return
             *     possible object is
             *     {@link TCTeSimp.InfCte.InfPAA.PAASignature }
             *     
             */
            public TCTeSimp.InfCte.InfPAA.PAASignature getPAASignature() {
                return paaSignature;
            }

            /**
             * Define o valor da propriedade paaSignature.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTeSimp.InfCte.InfPAA.PAASignature }
             *     
             */
            public void setPAASignature(TCTeSimp.InfCte.InfPAA.PAASignature value) {
                this.paaSignature = value;
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
             *         &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
             *         &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "signatureValue",
                "rsaKeyValue"
            })
            public static class PAASignature {

                @XmlElement(name = "SignatureValue", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected byte[] signatureValue;
                @XmlElement(name = "RSAKeyValue", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected TRSAKeyValueType rsaKeyValue;

                /**
                 * Obtém o valor da propriedade signatureValue.
                 * 
                 * @return
                 *     possible object is
                 *     byte[]
                 */
                public byte[] getSignatureValue() {
                    return signatureValue;
                }

                /**
                 * Define o valor da propriedade signatureValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     byte[]
                 */
                public void setSignatureValue(byte[] value) {
                    this.signatureValue = value;
                }

                /**
                 * Obtém o valor da propriedade rsaKeyValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRSAKeyValueType }
                 *     
                 */
                public TRSAKeyValueType getRSAKeyValue() {
                    return rsaKeyValue;
                }

                /**
                 * Define o valor da propriedade rsaKeyValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRSAKeyValueType }
                 *     
                 */
                public void setRSAKeyValue(TRSAKeyValueType value) {
                    this.rsaKeyValue = value;
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
         *         &lt;element name="xSolic">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="8000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "xSolic"
        })
        public static class InfSolicNFF {

            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String xSolic;

            /**
             * Obtém o valor da propriedade xSolic.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXSolic() {
                return xSolic;
            }

            /**
             * Define o valor da propriedade xSolic.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXSolic(String value) {
                this.xSolic = value;
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
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
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
         *         &lt;element name="ISUF" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{8,9}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/>
         *         &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *         &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "toma",
            "indIEToma",
            "cnpj",
            "cpf",
            "ie",
            "xNome",
            "isuf",
            "fone",
            "enderToma",
            "email"
        })
        public static class Toma {

            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String toma;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String indIEToma;
            @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/cte")
            protected String cnpj;
            @XmlElement(name = "CPF", namespace = "http://www.portalfiscal.inf.br/cte")
            protected String cpf;
            @XmlElement(name = "IE", namespace = "http://www.portalfiscal.inf.br/cte")
            protected String ie;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String xNome;
            @XmlElement(name = "ISUF", namespace = "http://www.portalfiscal.inf.br/cte")
            protected String isuf;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String fone;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected TEndereco enderToma;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String email;

            /**
             * Obtém o valor da propriedade toma.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getToma() {
                return toma;
            }

            /**
             * Define o valor da propriedade toma.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setToma(String value) {
                this.toma = value;
            }

            /**
             * Obtém o valor da propriedade indIEToma.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndIEToma() {
                return indIEToma;
            }

            /**
             * Define o valor da propriedade indIEToma.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndIEToma(String value) {
                this.indIEToma = value;
            }

            /**
             * Obtém o valor da propriedade cnpj.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obtém o valor da propriedade cpf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Define o valor da propriedade cpf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

            /**
             * Obtém o valor da propriedade ie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Obtém o valor da propriedade xNome.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Define o valor da propriedade xNome.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNome(String value) {
                this.xNome = value;
            }

            /**
             * Obtém o valor da propriedade isuf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getISUF() {
                return isuf;
            }

            /**
             * Define o valor da propriedade isuf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setISUF(String value) {
                this.isuf = value;
            }

            /**
             * Obtém o valor da propriedade fone.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFone() {
                return fone;
            }

            /**
             * Define o valor da propriedade fone.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFone(String value) {
                this.fone = value;
            }

            /**
             * Obtém o valor da propriedade enderToma.
             * 
             * @return
             *     possible object is
             *     {@link TEndereco }
             *     
             */
            public TEndereco getEnderToma() {
                return enderToma;
            }

            /**
             * Define o valor da propriedade enderToma.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndereco }
             *     
             */
            public void setEnderToma(TEndereco value) {
                this.enderToma = value;
            }

            /**
             * Obtém o valor da propriedade email.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Define o valor da propriedade email.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
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
         *         &lt;element name="vTRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *         &lt;element name="vTotDFe" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vtPrest",
            "vtRec",
            "vTotDFe"
        })
        public static class Total {

            @XmlElement(name = "vTPrest", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String vtPrest;
            @XmlElement(name = "vTRec", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String vtRec;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
            protected String vTotDFe;

            /**
             * Obtém o valor da propriedade vtPrest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVTPrest() {
                return vtPrest;
            }

            /**
             * Define o valor da propriedade vtPrest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVTPrest(String value) {
                this.vtPrest = value;
            }

            /**
             * Obtém o valor da propriedade vtRec.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVTRec() {
                return vtRec;
            }

            /**
             * Define o valor da propriedade vtRec.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVTRec(String value) {
                this.vtRec = value;
            }

            /**
             * Obtém o valor da propriedade vTotDFe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVTotDFe() {
                return vTotDFe;
            }

            /**
             * Define o valor da propriedade vTotDFe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVTotDFe(String value) {
                this.vTotDFe = value;
            }

        }

    }

}
