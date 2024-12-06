


package br.com.swconsultoria.cte.schema_400.cteSimp;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * Tipo Conhecimento de Transporte Eletrônico (Modelo 57) - Modelo Simplificado
 *
 * <p>Java class for TCTeSimp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TCTeSimp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infCte"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ide"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/&gt;
 *                             &lt;element name="cCT"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;pattern value="[0-9]{8}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/&gt;
 *                             &lt;element name="natOp"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="60"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/&gt;
 *                             &lt;element name="serie"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TSerie"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="nCT" type="{http://www.portalfiscal.inf.br/cte}TNF"/&gt;
 *                             &lt;element name="dhEmi"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="tpImp"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="tpEmis"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                   &lt;enumeration value="7"/&gt;
 *                                   &lt;enumeration value="8"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="cDV"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;pattern value="[0-9]{1}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/&gt;
 *                             &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTeSimp"/&gt;
 *                             &lt;element name="procEmi" type="{http://www.portalfiscal.inf.br/cte}TProcEmi"/&gt;
 *                             &lt;element name="verProc"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="cMunEnv" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/&gt;
 *                             &lt;element name="xMunEnv"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="2"/&gt;
 *                                   &lt;maxLength value="60"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="UFEnv" type="{http://www.portalfiscal.inf.br/cte}TUf"/&gt;
 *                             &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTranspSimp"/&gt;
 *                             &lt;element name="tpServ"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/&gt;
 *                             &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/&gt;
 *                             &lt;element name="retira"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="xDetRetira" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="160"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;sequence minOccurs="0"&gt;
 *                               &lt;element name="dhCont" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/&gt;
 *                               &lt;element name="xJust"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                     &lt;minLength value="15"/&gt;
 *                                     &lt;maxLength value="256"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="compl" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="xCaracAd" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="xCaracSer" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="fluxo" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="xOrig" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="60"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="pass" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="xPass" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                                       &lt;minLength value="1"/&gt;
 *                                                       &lt;maxLength value="15"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="xDest" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="60"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="xRota" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="xObs" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="2000"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ObsCont" maxOccurs="10" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="xTexto"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="160"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="xCampo" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="20"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ObsFisco" maxOccurs="10" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="xTexto"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="60"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="xCampo" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="20"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="emit"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
 *                             &lt;/choice&gt;
 *                             &lt;element name="IE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="IEST" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="xNome"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;maxLength value="60"/&gt;
 *                                   &lt;minLength value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="xFant" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;maxLength value="60"/&gt;
 *                                   &lt;minLength value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="enderEmit" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi"/&gt;
 *                             &lt;element name="CRT" type="{http://www.portalfiscal.inf.br/cte}TCRT"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="toma"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="toma"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="indIEToma"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="9"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/&gt;
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
 *                             &lt;/choice&gt;
 *                             &lt;element name="IE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="xNome"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;maxLength value="60"/&gt;
 *                                   &lt;minLength value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ISUF" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;pattern value="[0-9]{8,9}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
 *                             &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
 *                             &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="infCarga"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                             &lt;element name="proPred"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="60"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="xOutCat" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="infQ" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="cUnid"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                             &lt;enumeration value="00"/&gt;
 *                                             &lt;enumeration value="01"/&gt;
 *                                             &lt;enumeration value="02"/&gt;
 *                                             &lt;enumeration value="03"/&gt;
 *                                             &lt;enumeration value="04"/&gt;
 *                                             &lt;enumeration value="05"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="tpMed"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;enumeration value="00"/&gt;
 *                                             &lt;enumeration value="01"/&gt;
 *                                             &lt;enumeration value="02"/&gt;
 *                                             &lt;enumeration value="03"/&gt;
 *                                             &lt;enumeration value="04"/&gt;
 *                                             &lt;enumeration value="05"/&gt;
 *                                             &lt;enumeration value="06"/&gt;
 *                                             &lt;enumeration value="07"/&gt;
 *                                             &lt;enumeration value="08"/&gt;
 *                                             &lt;enumeration value="09"/&gt;
 *                                             &lt;enumeration value="10"/&gt;
 *                                             &lt;enumeration value="11"/&gt;
 *                                             &lt;enumeration value="12"/&gt;
 *                                             &lt;enumeration value="13"/&gt;
 *                                             &lt;enumeration value="14"/&gt;
 *                                             &lt;enumeration value="15"/&gt;
 *                                             &lt;enumeration value="99"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="vCargaAverb" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="det" maxOccurs="999"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/&gt;
 *                               &lt;element name="xMunIni"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                     &lt;minLength value="2"/&gt;
 *                                     &lt;maxLength value="60"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/&gt;
 *                               &lt;element name="xMunFim"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                     &lt;minLength value="2"/&gt;
 *                                     &lt;maxLength value="60"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;element name="vPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                             &lt;element name="vRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                             &lt;element name="Comp" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="xNome"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                             &lt;maxLength value="15"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="infNFe" maxOccurs="unbounded"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
 *                                         &lt;element name="PIN" minOccurs="0"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                               &lt;whiteSpace value="preserve"/&gt;
 *                                               &lt;minLength value="2"/&gt;
 *                                               &lt;maxLength value="9"/&gt;
 *                                               &lt;pattern value="[1-9]{1}[0-9]{1,8}"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/&gt;
 *                                         &lt;choice&gt;
 *                                           &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                           &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                         &lt;/choice&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="infDocAnt" maxOccurs="unbounded"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
 *                                         &lt;element name="tpPrest"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                               &lt;whiteSpace value="preserve"/&gt;
 *                                               &lt;enumeration value="1"/&gt;
 *                                               &lt;enumeration value="2"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="infNFeTranspParcial" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;sequence&gt;
 *                                                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
 *                                                 &lt;/sequence&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="nItem" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;pattern value="[1-9]{1}[0-9]{0,1}|[1-8]{1}[0-9]{2}|[9]{1}[0-8]{1}[0-9]{1}|[9]{1}[9]{1}[0]{1}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="infModal"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;any processContents='skip'/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="versaoModal" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;pattern value="4\.(0[0-9]|[1-9][0-9])"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="cobr" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="fat" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="nFat" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="60"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
 *                                       &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
 *                                       &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="dup" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="nDup" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                             &lt;maxLength value="60"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/&gt;
 *                                       &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="infCteSub" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="chCte"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;pattern value="[0-9]{44}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="indAlteraToma" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="imp"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImp"/&gt;
 *                             &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/&gt;
 *                             &lt;element name="infAdFisco" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;maxLength value="2000"/&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ICMSUFFim" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="vBCUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                                       &lt;element name="pFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                                       &lt;element name="pICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                                       &lt;element name="pICMSInter" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                                       &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                                       &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                                       &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="total"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                             &lt;element name="vTRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="autXML" maxOccurs="10" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="infRespTec" type="{http://www.portalfiscal.inf.br/cte}TRespTec" minOccurs="0"/&gt;
 *                   &lt;element name="infSolicNFF" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="xSolic"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="2"/&gt;
 *                                   &lt;maxLength value="2000"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="infPAA" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CNPJPAA" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
 *                             &lt;element name="PAASignature"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                                       &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="versao" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TVerCTe"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Id" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID"&gt;
 *                       &lt;pattern value="CTe[0-9]{44}"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="infCTeSupl" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="qrCodCTe"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;minLength value="50"/&gt;
 *                         &lt;maxLength value="1000"/&gt;
 *                         &lt;pattern value="((HTTPS?|https?)://.*\?chCTe=[0-9]{44}&amp;tpAmb=[1-2](&amp;sign=[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1})?)"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCTeSimp", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
        "infCte",
        "infCTeSupl",
        "signature"
})
@XmlRootElement(name = "CTeSimp", namespace = "http://www.portalfiscal.inf.br/cte")
public class TCTeSimp {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected InfCte infCte;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected InfCTeSupl infCTeSupl;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the infCte property.
     *
     * @return possible object is
     * {@link InfCte }
     */
    public InfCte getInfCte() {
        return infCte;
    }

    /**
     * Sets the value of the infCte property.
     *
     * @param value allowed object is
     *              {@link InfCte }
     */
    public void setInfCte(InfCte value) {
        this.infCte = value;
    }

    /**
     * Gets the value of the infCTeSupl property.
     *
     * @return possible object is
     * {@link InfCTeSupl }
     */
    public InfCTeSupl getInfCTeSupl() {
        return infCTeSupl;
    }

    /**
     * Sets the value of the infCTeSupl property.
     *
     * @param value allowed object is
     *              {@link InfCTeSupl }
     */
    public void setInfCTeSupl(InfCTeSupl value) {
        this.infCTeSupl = value;
    }

    /**
     * Gets the value of the signature property.
     *
     * @return possible object is
     * {@link SignatureType }
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     *
     * @param value allowed object is
     *              {@link SignatureType }
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ide"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/&gt;
     *                   &lt;element name="cCT"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;pattern value="[0-9]{8}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/&gt;
     *                   &lt;element name="natOp"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="60"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/&gt;
     *                   &lt;element name="serie"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TSerie"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="nCT" type="{http://www.portalfiscal.inf.br/cte}TNF"/&gt;
     *                   &lt;element name="dhEmi"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="tpImp"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="tpEmis"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                         &lt;enumeration value="4"/&gt;
     *                         &lt;enumeration value="7"/&gt;
     *                         &lt;enumeration value="8"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="cDV"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;pattern value="[0-9]{1}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/&gt;
     *                   &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTeSimp"/&gt;
     *                   &lt;element name="procEmi" type="{http://www.portalfiscal.inf.br/cte}TProcEmi"/&gt;
     *                   &lt;element name="verProc"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="cMunEnv" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/&gt;
     *                   &lt;element name="xMunEnv"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="2"/&gt;
     *                         &lt;maxLength value="60"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="UFEnv" type="{http://www.portalfiscal.inf.br/cte}TUf"/&gt;
     *                   &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTranspSimp"/&gt;
     *                   &lt;element name="tpServ"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/&gt;
     *                   &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/&gt;
     *                   &lt;element name="retira"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="xDetRetira" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="160"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;sequence minOccurs="0"&gt;
     *                     &lt;element name="dhCont" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/&gt;
     *                     &lt;element name="xJust"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                           &lt;minLength value="15"/&gt;
     *                           &lt;maxLength value="256"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="compl" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="xCaracAd" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="xCaracSer" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="fluxo" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="xOrig" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="60"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="pass" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="xPass" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                             &lt;minLength value="1"/&gt;
     *                                             &lt;maxLength value="15"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="xDest" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="60"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="xRota" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="xObs" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="2000"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ObsCont" maxOccurs="10" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="xTexto"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="160"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="xCampo" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="20"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ObsFisco" maxOccurs="10" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="xTexto"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="60"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="xCampo" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="20"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="emit"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
     *                   &lt;/choice&gt;
     *                   &lt;element name="IE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="IEST" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="xNome"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;maxLength value="60"/&gt;
     *                         &lt;minLength value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="xFant" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;maxLength value="60"/&gt;
     *                         &lt;minLength value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="enderEmit" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi"/&gt;
     *                   &lt;element name="CRT" type="{http://www.portalfiscal.inf.br/cte}TCRT"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="toma"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="toma"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                         &lt;enumeration value="4"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="indIEToma"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="9"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/&gt;
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
     *                   &lt;/choice&gt;
     *                   &lt;element name="IE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="xNome"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;maxLength value="60"/&gt;
     *                         &lt;minLength value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ISUF" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;pattern value="[0-9]{8,9}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
     *                   &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
     *                   &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="infCarga"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                   &lt;element name="proPred"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="60"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="xOutCat" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="infQ" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="cUnid"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                   &lt;enumeration value="00"/&gt;
     *                                   &lt;enumeration value="01"/&gt;
     *                                   &lt;enumeration value="02"/&gt;
     *                                   &lt;enumeration value="03"/&gt;
     *                                   &lt;enumeration value="04"/&gt;
     *                                   &lt;enumeration value="05"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="tpMed"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;enumeration value="00"/&gt;
     *                                   &lt;enumeration value="01"/&gt;
     *                                   &lt;enumeration value="02"/&gt;
     *                                   &lt;enumeration value="03"/&gt;
     *                                   &lt;enumeration value="04"/&gt;
     *                                   &lt;enumeration value="05"/&gt;
     *                                   &lt;enumeration value="06"/&gt;
     *                                   &lt;enumeration value="07"/&gt;
     *                                   &lt;enumeration value="08"/&gt;
     *                                   &lt;enumeration value="09"/&gt;
     *                                   &lt;enumeration value="10"/&gt;
     *                                   &lt;enumeration value="11"/&gt;
     *                                   &lt;enumeration value="12"/&gt;
     *                                   &lt;enumeration value="13"/&gt;
     *                                   &lt;enumeration value="14"/&gt;
     *                                   &lt;enumeration value="15"/&gt;
     *                                   &lt;enumeration value="99"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="vCargaAverb" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="det" maxOccurs="999"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/&gt;
     *                     &lt;element name="xMunIni"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                           &lt;minLength value="2"/&gt;
     *                           &lt;maxLength value="60"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/&gt;
     *                     &lt;element name="xMunFim"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                           &lt;minLength value="2"/&gt;
     *                           &lt;maxLength value="60"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;element name="vPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                   &lt;element name="vRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                   &lt;element name="Comp" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="xNome"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                   &lt;maxLength value="15"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="infNFe" maxOccurs="unbounded"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
     *                               &lt;element name="PIN" minOccurs="0"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                     &lt;whiteSpace value="preserve"/&gt;
     *                                     &lt;minLength value="2"/&gt;
     *                                     &lt;maxLength value="9"/&gt;
     *                                     &lt;pattern value="[1-9]{1}[0-9]{1,8}"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/&gt;
     *                               &lt;choice&gt;
     *                                 &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                 &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                               &lt;/choice&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="infDocAnt" maxOccurs="unbounded"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
     *                               &lt;element name="tpPrest"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                     &lt;whiteSpace value="preserve"/&gt;
     *                                     &lt;enumeration value="1"/&gt;
     *                                     &lt;enumeration value="2"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="infNFeTranspParcial" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;sequence&gt;
     *                                         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
     *                                       &lt;/sequence&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="nItem" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;pattern value="[1-9]{1}[0-9]{0,1}|[1-8]{1}[0-9]{2}|[9]{1}[0-8]{1}[0-9]{1}|[9]{1}[9]{1}[0]{1}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="infModal"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;any processContents='skip'/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="versaoModal" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;pattern value="4\.(0[0-9]|[1-9][0-9])"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="cobr" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="fat" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="nFat" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="60"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
     *                             &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
     *                             &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="dup" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="nDup" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                   &lt;maxLength value="60"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/&gt;
     *                             &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="infCteSub" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="chCte"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;pattern value="[0-9]{44}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="indAlteraToma" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="imp"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImp"/&gt;
     *                   &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/&gt;
     *                   &lt;element name="infAdFisco" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;maxLength value="2000"/&gt;
     *                         &lt;minLength value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ICMSUFFim" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="vBCUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                             &lt;element name="pFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *                             &lt;element name="pICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *                             &lt;element name="pICMSInter" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *                             &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                             &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                             &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="total"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                   &lt;element name="vTRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="autXML" maxOccurs="10" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="infRespTec" type="{http://www.portalfiscal.inf.br/cte}TRespTec" minOccurs="0"/&gt;
     *         &lt;element name="infSolicNFF" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="xSolic"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="2"/&gt;
     *                         &lt;maxLength value="2000"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="infPAA" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CNPJPAA" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
     *                   &lt;element name="PAASignature"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
     *                             &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="versao" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TVerCTe"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Id" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID"&gt;
     *             &lt;pattern value="CTe[0-9]{44}"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
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

        @XmlElement(required = true, namespace = "http://www.portalfiscal.inf.br/cte")
        protected Ide ide;
        protected Compl compl;
        @XmlElement(required = true)
        protected Emit emit;
        @XmlElement(required = true)
        protected Toma toma;
        @XmlElement(required = true)
        protected InfCarga infCarga;
        @XmlElement(required = true)
        protected List<Det> det;
        @XmlElement(required = true)
        protected InfModal infModal;
        protected Cobr cobr;
        protected InfCteSub infCteSub;
        @XmlElement(required = true)
        protected Imp imp;
        @XmlElement(required = true)
        protected Total total;
        protected List<AutXML> autXML;
        protected TRespTec infRespTec;
        protected InfSolicNFF infSolicNFF;
        protected InfPAA infPAA;
        @XmlAttribute(name = "versao", required = true)
        protected String versao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ide property.
         *
         * @return possible object is
         * {@link Ide }
         */
        public Ide getIde() {
            return ide;
        }

        /**
         * Sets the value of the ide property.
         *
         * @param value allowed object is
         *              {@link Ide }
         */
        public void setIde(Ide value) {
            this.ide = value;
        }

        /**
         * Gets the value of the compl property.
         *
         * @return possible object is
         * {@link Compl }
         */
        public Compl getCompl() {
            return compl;
        }

        /**
         * Sets the value of the compl property.
         *
         * @param value allowed object is
         *              {@link Compl }
         */
        public void setCompl(Compl value) {
            this.compl = value;
        }

        /**
         * Gets the value of the emit property.
         *
         * @return possible object is
         * {@link Emit }
         */
        public Emit getEmit() {
            return emit;
        }

        /**
         * Sets the value of the emit property.
         *
         * @param value allowed object is
         *              {@link Emit }
         */
        public void setEmit(Emit value) {
            this.emit = value;
        }

        /**
         * Gets the value of the toma property.
         *
         * @return possible object is
         * {@link Toma }
         */
        public Toma getToma() {
            return toma;
        }

        /**
         * Sets the value of the toma property.
         *
         * @param value allowed object is
         *              {@link Toma }
         */
        public void setToma(Toma value) {
            this.toma = value;
        }

        /**
         * Gets the value of the infCarga property.
         *
         * @return possible object is
         * {@link InfCarga }
         */
        public InfCarga getInfCarga() {
            return infCarga;
        }

        /**
         * Sets the value of the infCarga property.
         *
         * @param value allowed object is
         *              {@link InfCarga }
         */
        public void setInfCarga(InfCarga value) {
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
         * {@link Det }
         */
        public List<Det> getDet() {
            if (det == null) {
                det = new ArrayList<Det>();
            }
            return this.det;
        }

        /**
         * Gets the value of the infModal property.
         *
         * @return possible object is
         * {@link InfModal }
         */
        public InfModal getInfModal() {
            return infModal;
        }

        /**
         * Sets the value of the infModal property.
         *
         * @param value allowed object is
         *              {@link InfModal }
         */
        public void setInfModal(InfModal value) {
            this.infModal = value;
        }

        /**
         * Gets the value of the cobr property.
         *
         * @return possible object is
         * {@link Cobr }
         */
        public Cobr getCobr() {
            return cobr;
        }

        /**
         * Sets the value of the cobr property.
         *
         * @param value allowed object is
         *              {@link Cobr }
         */
        public void setCobr(Cobr value) {
            this.cobr = value;
        }

        /**
         * Gets the value of the infCteSub property.
         *
         * @return possible object is
         * {@link InfCteSub }
         */
        public InfCteSub getInfCteSub() {
            return infCteSub;
        }

        /**
         * Sets the value of the infCteSub property.
         *
         * @param value allowed object is
         *              {@link InfCteSub }
         */
        public void setInfCteSub(InfCteSub value) {
            this.infCteSub = value;
        }

        /**
         * Gets the value of the imp property.
         *
         * @return possible object is
         * {@link Imp }
         */
        public Imp getImp() {
            return imp;
        }

        /**
         * Sets the value of the imp property.
         *
         * @param value allowed object is
         *              {@link Imp }
         */
        public void setImp(Imp value) {
            this.imp = value;
        }

        /**
         * Gets the value of the total property.
         *
         * @return possible object is
         * {@link Total }
         */
        public Total getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         *
         * @param value allowed object is
         *              {@link Total }
         */
        public void setTotal(Total value) {
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
         * {@link AutXML }
         */
        public List<AutXML> getAutXML() {
            if (autXML == null) {
                autXML = new ArrayList<AutXML>();
            }
            return this.autXML;
        }

        /**
         * Gets the value of the infRespTec property.
         *
         * @return possible object is
         * {@link TRespTec }
         */
        public TRespTec getInfRespTec() {
            return infRespTec;
        }

        /**
         * Sets the value of the infRespTec property.
         *
         * @param value allowed object is
         *              {@link TRespTec }
         */
        public void setInfRespTec(TRespTec value) {
            this.infRespTec = value;
        }

        /**
         * Gets the value of the infSolicNFF property.
         *
         * @return possible object is
         * {@link InfSolicNFF }
         */
        public InfSolicNFF getInfSolicNFF() {
            return infSolicNFF;
        }

        /**
         * Sets the value of the infSolicNFF property.
         *
         * @param value allowed object is
         *              {@link InfSolicNFF }
         */
        public void setInfSolicNFF(InfSolicNFF value) {
            this.infSolicNFF = value;
        }

        /**
         * Gets the value of the infPAA property.
         *
         * @return possible object is
         * {@link InfPAA }
         */
        public InfPAA getInfPAA() {
            return infPAA;
        }

        /**
         * Sets the value of the infPAA property.
         *
         * @param value allowed object is
         *              {@link InfPAA }
         */
        public void setInfPAA(InfPAA value) {
            this.infPAA = value;
        }

        /**
         * Gets the value of the versao property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVersao() {
            return versao;
        }

        /**
         * Sets the value of the versao property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVersao(String value) {
            this.versao = value;
        }

        /**
         * Gets the value of the id property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;choice&gt;
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
         *         &lt;/choice&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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
             * Gets the value of the cnpj property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Sets the value of the cnpj property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Gets the value of the cpf property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Sets the value of the cpf property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="fat" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="nFat" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="60"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
         *                   &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
         *                   &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="dup" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="nDup" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                         &lt;maxLength value="60"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/&gt;
         *                   &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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
             * Gets the value of the fat property.
             *
             * @return possible object is
             * {@link Fat }
             */
            public Fat getFat() {
                return fat;
            }

            /**
             * Sets the value of the fat property.
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
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="nDup" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;maxLength value="60"/&gt;
             *               &lt;minLength value="1"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/&gt;
             *         &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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
                 * Gets the value of the nDup property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getNDup() {
                    return nDup;
                }

                /**
                 * Sets the value of the nDup property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setNDup(String value) {
                    this.nDup = value;
                }

                /**
                 * Gets the value of the dVenc property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getDVenc() {
                    return dVenc;
                }

                /**
                 * Sets the value of the dVenc property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setDVenc(String value) {
                    this.dVenc = value;
                }

                /**
                 * Gets the value of the vDup property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVDup() {
                    return vDup;
                }

                /**
                 * Sets the value of the vDup property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVDup(String value) {
                    this.vDup = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="nFat" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="60"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
             *         &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
             *         &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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
                 * Gets the value of the nFat property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getNFat() {
                    return nFat;
                }

                /**
                 * Sets the value of the nFat property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setNFat(String value) {
                    this.nFat = value;
                }

                /**
                 * Gets the value of the vOrig property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVOrig() {
                    return vOrig;
                }

                /**
                 * Sets the value of the vOrig property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVOrig(String value) {
                    this.vOrig = value;
                }

                /**
                 * Gets the value of the vDesc property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVDesc() {
                    return vDesc;
                }

                /**
                 * Sets the value of the vDesc property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVDesc(String value) {
                    this.vDesc = value;
                }

                /**
                 * Gets the value of the vLiq property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVLiq() {
                    return vLiq;
                }

                /**
                 * Sets the value of the vLiq property.
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
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="xCaracAd" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="15"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="xCaracSer" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="30"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="fluxo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="xOrig" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="60"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="pass" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="xPass" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                                   &lt;minLength value="1"/&gt;
         *                                   &lt;maxLength value="15"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="xDest" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="60"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="xRota" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="xObs" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="2000"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ObsCont" maxOccurs="10" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="xTexto"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="160"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="xCampo" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="20"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ObsFisco" maxOccurs="10" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="xTexto"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="60"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="xCampo" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="20"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
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

            protected String xCaracAd;
            protected String xCaracSer;
            protected Fluxo fluxo;
            protected String xObs;
            @XmlElement(name = "ObsCont")
            protected List<ObsCont> obsCont;
            @XmlElement(name = "ObsFisco")
            protected List<ObsFisco> obsFisco;

            /**
             * Gets the value of the xCaracAd property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXCaracAd() {
                return xCaracAd;
            }

            /**
             * Sets the value of the xCaracAd property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXCaracAd(String value) {
                this.xCaracAd = value;
            }

            /**
             * Gets the value of the xCaracSer property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXCaracSer() {
                return xCaracSer;
            }

            /**
             * Sets the value of the xCaracSer property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXCaracSer(String value) {
                this.xCaracSer = value;
            }

            /**
             * Gets the value of the fluxo property.
             *
             * @return possible object is
             * {@link Fluxo }
             */
            public Fluxo getFluxo() {
                return fluxo;
            }

            /**
             * Sets the value of the fluxo property.
             *
             * @param value allowed object is
             *              {@link Fluxo }
             */
            public void setFluxo(Fluxo value) {
                this.fluxo = value;
            }

            /**
             * Gets the value of the xObs property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXObs() {
                return xObs;
            }

            /**
             * Sets the value of the xObs property.
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
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="xOrig" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="60"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="pass" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="xPass" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *                         &lt;minLength value="1"/&gt;
             *                         &lt;maxLength value="15"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="xDest" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="60"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="xRota" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="10"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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
                 * Gets the value of the xOrig property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXOrig() {
                    return xOrig;
                }

                /**
                 * Sets the value of the xOrig property.
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
                 * Gets the value of the xDest property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXDest() {
                    return xDest;
                }

                /**
                 * Sets the value of the xDest property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXDest(String value) {
                    this.xDest = value;
                }

                /**
                 * Gets the value of the xRota property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXRota() {
                    return xRota;
                }

                /**
                 * Sets the value of the xRota property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXRota(String value) {
                    this.xRota = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="xPass" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
                 *               &lt;minLength value="1"/&gt;
                 *               &lt;maxLength value="15"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "xPass"
                })
                public static class Pass {

                    protected String xPass;

                    /**
                     * Gets the value of the xPass property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getXPass() {
                        return xPass;
                    }

                    /**
                     * Sets the value of the xPass property.
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
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="xTexto"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="160"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="xCampo" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="20"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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
                 * Gets the value of the xTexto property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Sets the value of the xTexto property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Gets the value of the xCampo property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Sets the value of the xCampo property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXCampo(String value) {
                    this.xCampo = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="xTexto"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="60"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="xCampo" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="20"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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
                 * Gets the value of the xTexto property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Sets the value of the xTexto property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Gets the value of the xCampo property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Sets the value of the xCampo property.
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
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/&gt;
         *           &lt;element name="xMunIni"&gt;
         *             &lt;simpleType&gt;
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                 &lt;minLength value="2"/&gt;
         *                 &lt;maxLength value="60"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/simpleType&gt;
         *           &lt;/element&gt;
         *         &lt;/sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/&gt;
         *           &lt;element name="xMunFim"&gt;
         *             &lt;simpleType&gt;
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                 &lt;minLength value="2"/&gt;
         *                 &lt;maxLength value="60"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/simpleType&gt;
         *           &lt;/element&gt;
         *         &lt;/sequence&gt;
         *         &lt;element name="vPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *         &lt;element name="vRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *         &lt;element name="Comp" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="xNome"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                         &lt;maxLength value="15"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;choice&gt;
         *           &lt;element name="infNFe" maxOccurs="unbounded"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
         *                     &lt;element name="PIN" minOccurs="0"&gt;
         *                       &lt;simpleType&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                           &lt;whiteSpace value="preserve"/&gt;
         *                           &lt;minLength value="2"/&gt;
         *                           &lt;maxLength value="9"/&gt;
         *                           &lt;pattern value="[1-9]{1}[0-9]{1,8}"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/simpleType&gt;
         *                     &lt;/element&gt;
         *                     &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/&gt;
         *                     &lt;choice&gt;
         *                       &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                       &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                     &lt;/choice&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="infDocAnt" maxOccurs="unbounded"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
         *                     &lt;element name="tpPrest"&gt;
         *                       &lt;simpleType&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                           &lt;whiteSpace value="preserve"/&gt;
         *                           &lt;enumeration value="1"/&gt;
         *                           &lt;enumeration value="2"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/simpleType&gt;
         *                     &lt;/element&gt;
         *                     &lt;element name="infNFeTranspParcial" maxOccurs="unbounded" minOccurs="0"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;sequence&gt;
         *                               &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
         *                             &lt;/sequence&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *         &lt;/choice&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="nItem" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="preserve"/&gt;
         *             &lt;pattern value="[1-9]{1}[0-9]{0,1}|[1-8]{1}[0-9]{2}|[9]{1}[0-8]{1}[0-9]{1}|[9]{1}[9]{1}[0]{1}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
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

            @XmlElement(required = true)
            protected String cMunIni;
            @XmlElement(required = true)
            protected String xMunIni;
            @XmlElement(required = true)
            protected String cMunFim;
            @XmlElement(required = true)
            protected String xMunFim;
            @XmlElement(required = true)
            protected String vPrest;
            @XmlElement(required = true)
            protected String vRec;
            @XmlElement(name = "Comp")
            protected List<Comp> comp;
            protected List<InfNFe> infNFe;
            protected List<InfDocAnt> infDocAnt;
            @XmlAttribute(name = "nItem", required = true)
            protected String nItem;

            /**
             * Gets the value of the cMunIni property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCMunIni() {
                return cMunIni;
            }

            /**
             * Sets the value of the cMunIni property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCMunIni(String value) {
                this.cMunIni = value;
            }

            /**
             * Gets the value of the xMunIni property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXMunIni() {
                return xMunIni;
            }

            /**
             * Sets the value of the xMunIni property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXMunIni(String value) {
                this.xMunIni = value;
            }

            /**
             * Gets the value of the cMunFim property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCMunFim() {
                return cMunFim;
            }

            /**
             * Sets the value of the cMunFim property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCMunFim(String value) {
                this.cMunFim = value;
            }

            /**
             * Gets the value of the xMunFim property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXMunFim() {
                return xMunFim;
            }

            /**
             * Sets the value of the xMunFim property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXMunFim(String value) {
                this.xMunFim = value;
            }

            /**
             * Gets the value of the vPrest property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVPrest() {
                return vPrest;
            }

            /**
             * Sets the value of the vPrest property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVPrest(String value) {
                this.vPrest = value;
            }

            /**
             * Gets the value of the vRec property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVRec() {
                return vRec;
            }

            /**
             * Sets the value of the vRec property.
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
             * {@link InfDocAnt }
             */
            public List<InfDocAnt> getInfDocAnt() {
                if (infDocAnt == null) {
                    infDocAnt = new ArrayList<InfDocAnt>();
                }
                return this.infDocAnt;
            }

            /**
             * Gets the value of the nItem property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNItem() {
                return nItem;
            }

            /**
             * Sets the value of the nItem property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNItem(String value) {
                this.nItem = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="xNome"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;maxLength value="15"/&gt;
             *               &lt;minLength value="1"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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
                 * Gets the value of the xNome property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getXNome() {
                    return xNome;
                }

                /**
                 * Sets the value of the xNome property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setXNome(String value) {
                    this.xNome = value;
                }

                /**
                 * Gets the value of the vComp property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVComp() {
                    return vComp;
                }

                /**
                 * Sets the value of the vComp property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVComp(String value) {
                    this.vComp = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
             *         &lt;element name="tpPrest"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *               &lt;enumeration value="1"/&gt;
             *               &lt;enumeration value="2"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="infNFeTranspParcial" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "chCTe",
                    "tpPrest",
                    "infNFeTranspParcial"
            })
            public static class InfDocAnt {

                @XmlElement(required = true)
                protected String chCTe;
                @XmlElement(required = true)
                protected String tpPrest;
                protected List<InfNFeTranspParcial> infNFeTranspParcial;

                /**
                 * Gets the value of the chCTe property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getChCTe() {
                    return chCTe;
                }

                /**
                 * Sets the value of the chCTe property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setChCTe(String value) {
                    this.chCTe = value;
                }

                /**
                 * Gets the value of the tpPrest property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getTpPrest() {
                    return tpPrest;
                }

                /**
                 * Sets the value of the tpPrest property.
                 *
                 * @param value allowed object is
                 *              {@link String }
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
                 * {@link InfNFeTranspParcial }
                 */
                public List<InfNFeTranspParcial> getInfNFeTranspParcial() {
                    if (infNFeTranspParcial == null) {
                        infNFeTranspParcial = new ArrayList<InfNFeTranspParcial>();
                    }
                    return this.infNFeTranspParcial;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "chNFe"
                })
                public static class InfNFeTranspParcial {

                    @XmlElement(required = true)
                    protected String chNFe;

                    /**
                     * Gets the value of the chNFe property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getChNFe() {
                        return chNFe;
                    }

                    /**
                     * Sets the value of the chNFe property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setChNFe(String value) {
                        this.chNFe = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
             *         &lt;element name="PIN" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *               &lt;minLength value="2"/&gt;
             *               &lt;maxLength value="9"/&gt;
             *               &lt;pattern value="[1-9]{1}[0-9]{1,8}"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/&gt;
             *         &lt;choice&gt;
             *           &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/&gt;
             *           &lt;element name="infUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TUnidadeTransp" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;/choice&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
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

                @XmlElement(required = true)
                protected String chNFe;
                @XmlElement(name = "PIN")
                protected String pin;
                protected String dPrev;
                protected List<TUnidCarga> infUnidCarga;
                protected List<TUnidadeTransp> infUnidTransp;

                /**
                 * Gets the value of the chNFe property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getChNFe() {
                    return chNFe;
                }

                /**
                 * Sets the value of the chNFe property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setChNFe(String value) {
                    this.chNFe = value;
                }

                /**
                 * Gets the value of the pin property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPIN() {
                    return pin;
                }

                /**
                 * Sets the value of the pin property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPIN(String value) {
                    this.pin = value;
                }

                /**
                 * Gets the value of the dPrev property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getDPrev() {
                    return dPrev;
                }

                /**
                 * Sets the value of the dPrev property.
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
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;choice&gt;
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
         *         &lt;/choice&gt;
         *         &lt;element name="IE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="IEST" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="xNome"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;maxLength value="60"/&gt;
         *               &lt;minLength value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="xFant" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;maxLength value="60"/&gt;
         *               &lt;minLength value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="enderEmit" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi"/&gt;
         *         &lt;element name="CRT" type="{http://www.portalfiscal.inf.br/cte}TCRT"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
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

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(name = "IEST")
            protected String iest;
            @XmlElement(required = true)
            protected String xNome;
            protected String xFant;
            @XmlElement(required = true)
            protected TEndeEmi enderEmit;
            @XmlElement(name = "CRT", required = true)
            protected String crt;

            /**
             * Gets the value of the cnpj property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Sets the value of the cnpj property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Gets the value of the cpf property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Sets the value of the cpf property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

            /**
             * Gets the value of the ie property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIE() {
                return ie;
            }

            /**
             * Sets the value of the ie property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Gets the value of the iest property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIEST() {
                return iest;
            }

            /**
             * Sets the value of the iest property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIEST(String value) {
                this.iest = value;
            }

            /**
             * Gets the value of the xNome property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Sets the value of the xNome property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXNome(String value) {
                this.xNome = value;
            }

            /**
             * Gets the value of the xFant property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXFant() {
                return xFant;
            }

            /**
             * Sets the value of the xFant property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXFant(String value) {
                this.xFant = value;
            }

            /**
             * Gets the value of the enderEmit property.
             *
             * @return possible object is
             * {@link TEndeEmi }
             */
            public TEndeEmi getEnderEmit() {
                return enderEmit;
            }

            /**
             * Sets the value of the enderEmit property.
             *
             * @param value allowed object is
             *              {@link TEndeEmi }
             */
            public void setEnderEmit(TEndeEmi value) {
                this.enderEmit = value;
            }

            /**
             * Gets the value of the crt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCRT() {
                return crt;
            }

            /**
             * Sets the value of the crt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCRT(String value) {
                this.crt = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/&gt;
         *         &lt;element name="cCT"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;pattern value="[0-9]{8}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/&gt;
         *         &lt;element name="natOp"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="60"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/&gt;
         *         &lt;element name="serie"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TSerie"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="nCT" type="{http://www.portalfiscal.inf.br/cte}TNF"/&gt;
         *         &lt;element name="dhEmi"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="tpImp"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="tpEmis"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="3"/&gt;
         *               &lt;enumeration value="4"/&gt;
         *               &lt;enumeration value="7"/&gt;
         *               &lt;enumeration value="8"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="cDV"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;pattern value="[0-9]{1}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/&gt;
         *         &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTeSimp"/&gt;
         *         &lt;element name="procEmi" type="{http://www.portalfiscal.inf.br/cte}TProcEmi"/&gt;
         *         &lt;element name="verProc"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="20"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="cMunEnv" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/&gt;
         *         &lt;element name="xMunEnv"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="2"/&gt;
         *               &lt;maxLength value="60"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="UFEnv" type="{http://www.portalfiscal.inf.br/cte}TUf"/&gt;
         *         &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTranspSimp"/&gt;
         *         &lt;element name="tpServ"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/&gt;
         *         &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/&gt;
         *         &lt;element name="retira"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="xDetRetira" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="160"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;sequence minOccurs="0"&gt;
         *           &lt;element name="dhCont" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/&gt;
         *           &lt;element name="xJust"&gt;
         *             &lt;simpleType&gt;
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                 &lt;minLength value="15"/&gt;
         *                 &lt;maxLength value="256"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/simpleType&gt;
         *           &lt;/element&gt;
         *         &lt;/sequence&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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
                "ufIni",
                "ufFim",
                "retira",
                "xDetRetira",
                "dhCont",
                "xJust"
        })
        public static class Ide {

            @XmlElement(name = "cUF", required = true, namespace = "http://www.portalfiscal.inf.br/cte")
            protected String cuf;
            @XmlElement(name = "cCT", required = true, namespace = "http://www.portalfiscal.inf.br/cte")
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
            @XmlSchemaType(name = "string")
            protected TUf ufEnv;
            @XmlElement(required = true)
            protected String modal;
            @XmlElement(required = true)
            protected String tpServ;
            @XmlElement(name = "UFIni", required = true)
            @XmlSchemaType(name = "string")
            protected TUf ufIni;
            @XmlElement(name = "UFFim", required = true)
            @XmlSchemaType(name = "string")
            protected TUf ufFim;
            @XmlElement(required = true)
            protected String retira;
            protected String xDetRetira;
            protected String dhCont;
            protected String xJust;

            /**
             * Gets the value of the cuf property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCUF() {
                return cuf;
            }

            /**
             * Sets the value of the cuf property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCUF(String value) {
                this.cuf = value;
            }

            /**
             * Gets the value of the cct property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCCT() {
                return cct;
            }

            /**
             * Sets the value of the cct property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCCT(String value) {
                this.cct = value;
            }

            /**
             * Gets the value of the cfop property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCFOP() {
                return cfop;
            }

            /**
             * Sets the value of the cfop property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCFOP(String value) {
                this.cfop = value;
            }

            /**
             * Gets the value of the natOp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNatOp() {
                return natOp;
            }

            /**
             * Sets the value of the natOp property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNatOp(String value) {
                this.natOp = value;
            }

            /**
             * Gets the value of the mod property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMod() {
                return mod;
            }

            /**
             * Sets the value of the mod property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMod(String value) {
                this.mod = value;
            }

            /**
             * Gets the value of the serie property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSerie() {
                return serie;
            }

            /**
             * Sets the value of the serie property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSerie(String value) {
                this.serie = value;
            }

            /**
             * Gets the value of the nct property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNCT() {
                return nct;
            }

            /**
             * Sets the value of the nct property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNCT(String value) {
                this.nct = value;
            }

            /**
             * Gets the value of the dhEmi property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDhEmi() {
                return dhEmi;
            }

            /**
             * Sets the value of the dhEmi property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDhEmi(String value) {
                this.dhEmi = value;
            }

            /**
             * Gets the value of the tpImp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTpImp() {
                return tpImp;
            }

            /**
             * Sets the value of the tpImp property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTpImp(String value) {
                this.tpImp = value;
            }

            /**
             * Gets the value of the tpEmis property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTpEmis() {
                return tpEmis;
            }

            /**
             * Sets the value of the tpEmis property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTpEmis(String value) {
                this.tpEmis = value;
            }

            /**
             * Gets the value of the cdv property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCDV() {
                return cdv;
            }

            /**
             * Sets the value of the cdv property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCDV(String value) {
                this.cdv = value;
            }

            /**
             * Gets the value of the tpAmb property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTpAmb() {
                return tpAmb;
            }

            /**
             * Sets the value of the tpAmb property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTpAmb(String value) {
                this.tpAmb = value;
            }

            /**
             * Gets the value of the tpCTe property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTpCTe() {
                return tpCTe;
            }

            /**
             * Sets the value of the tpCTe property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTpCTe(String value) {
                this.tpCTe = value;
            }

            /**
             * Gets the value of the procEmi property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getProcEmi() {
                return procEmi;
            }

            /**
             * Sets the value of the procEmi property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setProcEmi(String value) {
                this.procEmi = value;
            }

            /**
             * Gets the value of the verProc property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Sets the value of the verProc property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVerProc(String value) {
                this.verProc = value;
            }

            /**
             * Gets the value of the cMunEnv property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCMunEnv() {
                return cMunEnv;
            }

            /**
             * Sets the value of the cMunEnv property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCMunEnv(String value) {
                this.cMunEnv = value;
            }

            /**
             * Gets the value of the xMunEnv property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXMunEnv() {
                return xMunEnv;
            }

            /**
             * Sets the value of the xMunEnv property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXMunEnv(String value) {
                this.xMunEnv = value;
            }

            /**
             * Gets the value of the ufEnv property.
             *
             * @return possible object is
             * {@link TUf }
             */
            public TUf getUFEnv() {
                return ufEnv;
            }

            /**
             * Sets the value of the ufEnv property.
             *
             * @param value allowed object is
             *              {@link TUf }
             */
            public void setUFEnv(TUf value) {
                this.ufEnv = value;
            }

            /**
             * Gets the value of the modal property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getModal() {
                return modal;
            }

            /**
             * Sets the value of the modal property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setModal(String value) {
                this.modal = value;
            }

            /**
             * Gets the value of the tpServ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTpServ() {
                return tpServ;
            }

            /**
             * Sets the value of the tpServ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTpServ(String value) {
                this.tpServ = value;
            }

            /**
             * Gets the value of the ufIni property.
             *
             * @return possible object is
             * {@link TUf }
             */
            public TUf getUFIni() {
                return ufIni;
            }

            /**
             * Sets the value of the ufIni property.
             *
             * @param value allowed object is
             *              {@link TUf }
             */
            public void setUFIni(TUf value) {
                this.ufIni = value;
            }

            /**
             * Gets the value of the ufFim property.
             *
             * @return possible object is
             * {@link TUf }
             */
            public TUf getUFFim() {
                return ufFim;
            }

            /**
             * Sets the value of the ufFim property.
             *
             * @param value allowed object is
             *              {@link TUf }
             */
            public void setUFFim(TUf value) {
                this.ufFim = value;
            }

            /**
             * Gets the value of the retira property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRetira() {
                return retira;
            }

            /**
             * Sets the value of the retira property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRetira(String value) {
                this.retira = value;
            }

            /**
             * Gets the value of the xDetRetira property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXDetRetira() {
                return xDetRetira;
            }

            /**
             * Sets the value of the xDetRetira property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXDetRetira(String value) {
                this.xDetRetira = value;
            }

            /**
             * Gets the value of the dhCont property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDhCont() {
                return dhCont;
            }

            /**
             * Sets the value of the dhCont property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDhCont(String value) {
                this.dhCont = value;
            }

            /**
             * Gets the value of the xJust property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXJust() {
                return xJust;
            }

            /**
             * Sets the value of the xJust property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXJust(String value) {
                this.xJust = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImp"/&gt;
         *         &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/&gt;
         *         &lt;element name="infAdFisco" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;maxLength value="2000"/&gt;
         *               &lt;minLength value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ICMSUFFim" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="vBCUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *                   &lt;element name="pFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
         *                   &lt;element name="pICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
         *                   &lt;element name="pICMSInter" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
         *                   &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *                   &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *                   &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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
             * Gets the value of the icms property.
             *
             * @return possible object is
             * {@link TImp }
             */
            public TImp getICMS() {
                return icms;
            }

            /**
             * Sets the value of the icms property.
             *
             * @param value allowed object is
             *              {@link TImp }
             */
            public void setICMS(TImp value) {
                this.icms = value;
            }

            /**
             * Gets the value of the vTotTrib property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVTotTrib() {
                return vTotTrib;
            }

            /**
             * Sets the value of the vTotTrib property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVTotTrib(String value) {
                this.vTotTrib = value;
            }

            /**
             * Gets the value of the infAdFisco property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getInfAdFisco() {
                return infAdFisco;
            }

            /**
             * Sets the value of the infAdFisco property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInfAdFisco(String value) {
                this.infAdFisco = value;
            }

            /**
             * Gets the value of the icmsufFim property.
             *
             * @return possible object is
             * {@link ICMSUFFim }
             */
            public ICMSUFFim getICMSUFFim() {
                return icmsufFim;
            }

            /**
             * Sets the value of the icmsufFim property.
             *
             * @param value allowed object is
             *              {@link ICMSUFFim }
             */
            public void setICMSUFFim(ICMSUFFim value) {
                this.icmsufFim = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="vBCUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
             *         &lt;element name="pFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
             *         &lt;element name="pICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
             *         &lt;element name="pICMSInter" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
             *         &lt;element name="vFCPUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
             *         &lt;element name="vICMSUFFim" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
             *         &lt;element name="vICMSUFIni" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
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

                @XmlElement(name = "vBCUFFim", required = true)
                protected String vbcufFim;
                @XmlElement(name = "pFCPUFFim", required = true)
                protected String pfcpufFim;
                @XmlElement(name = "pICMSUFFim", required = true)
                protected String picmsufFim;
                @XmlElement(name = "pICMSInter", required = true)
                protected String picmsInter;
                @XmlElement(name = "vFCPUFFim", required = true)
                protected String vfcpufFim;
                @XmlElement(name = "vICMSUFFim", required = true)
                protected String vicmsufFim;
                @XmlElement(name = "vICMSUFIni", required = true)
                protected String vicmsufIni;

                /**
                 * Gets the value of the vbcufFim property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVBCUFFim() {
                    return vbcufFim;
                }

                /**
                 * Sets the value of the vbcufFim property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVBCUFFim(String value) {
                    this.vbcufFim = value;
                }

                /**
                 * Gets the value of the pfcpufFim property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPFCPUFFim() {
                    return pfcpufFim;
                }

                /**
                 * Sets the value of the pfcpufFim property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPFCPUFFim(String value) {
                    this.pfcpufFim = value;
                }

                /**
                 * Gets the value of the picmsufFim property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPICMSUFFim() {
                    return picmsufFim;
                }

                /**
                 * Sets the value of the picmsufFim property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPICMSUFFim(String value) {
                    this.picmsufFim = value;
                }

                /**
                 * Gets the value of the picmsInter property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPICMSInter() {
                    return picmsInter;
                }

                /**
                 * Sets the value of the picmsInter property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPICMSInter(String value) {
                    this.picmsInter = value;
                }

                /**
                 * Gets the value of the vfcpufFim property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVFCPUFFim() {
                    return vfcpufFim;
                }

                /**
                 * Sets the value of the vfcpufFim property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVFCPUFFim(String value) {
                    this.vfcpufFim = value;
                }

                /**
                 * Gets the value of the vicmsufFim property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVICMSUFFim() {
                    return vicmsufFim;
                }

                /**
                 * Sets the value of the vicmsufFim property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVICMSUFFim(String value) {
                    this.vicmsufFim = value;
                }

                /**
                 * Gets the value of the vicmsufIni property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVICMSUFIni() {
                    return vicmsufIni;
                }

                /**
                 * Sets the value of the vicmsufIni property.
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
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *         &lt;element name="proPred"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="60"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="xOutCat" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="30"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="infQ" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="cUnid"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                         &lt;enumeration value="00"/&gt;
         *                         &lt;enumeration value="01"/&gt;
         *                         &lt;enumeration value="02"/&gt;
         *                         &lt;enumeration value="03"/&gt;
         *                         &lt;enumeration value="04"/&gt;
         *                         &lt;enumeration value="05"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="tpMed"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;enumeration value="00"/&gt;
         *                         &lt;enumeration value="01"/&gt;
         *                         &lt;enumeration value="02"/&gt;
         *                         &lt;enumeration value="03"/&gt;
         *                         &lt;enumeration value="04"/&gt;
         *                         &lt;enumeration value="05"/&gt;
         *                         &lt;enumeration value="06"/&gt;
         *                         &lt;enumeration value="07"/&gt;
         *                         &lt;enumeration value="08"/&gt;
         *                         &lt;enumeration value="09"/&gt;
         *                         &lt;enumeration value="10"/&gt;
         *                         &lt;enumeration value="11"/&gt;
         *                         &lt;enumeration value="12"/&gt;
         *                         &lt;enumeration value="13"/&gt;
         *                         &lt;enumeration value="14"/&gt;
         *                         &lt;enumeration value="15"/&gt;
         *                         &lt;enumeration value="99"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="vCargaAverb" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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

            @XmlElement(required = true)
            protected String vCarga;
            @XmlElement(required = true)
            protected String proPred;
            protected String xOutCat;
            @XmlElement(required = true)
            protected List<InfQ> infQ;
            protected String vCargaAverb;

            /**
             * Gets the value of the vCarga property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVCarga() {
                return vCarga;
            }

            /**
             * Sets the value of the vCarga property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVCarga(String value) {
                this.vCarga = value;
            }

            /**
             * Gets the value of the proPred property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getProPred() {
                return proPred;
            }

            /**
             * Sets the value of the proPred property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setProPred(String value) {
                this.proPred = value;
            }

            /**
             * Gets the value of the xOutCat property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXOutCat() {
                return xOutCat;
            }

            /**
             * Sets the value of the xOutCat property.
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
             * Gets the value of the vCargaAverb property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVCargaAverb() {
                return vCargaAverb;
            }

            /**
             * Sets the value of the vCargaAverb property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVCargaAverb(String value) {
                this.vCargaAverb = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="cUnid"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *               &lt;enumeration value="00"/&gt;
             *               &lt;enumeration value="01"/&gt;
             *               &lt;enumeration value="02"/&gt;
             *               &lt;enumeration value="03"/&gt;
             *               &lt;enumeration value="04"/&gt;
             *               &lt;enumeration value="05"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="tpMed"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;enumeration value="00"/&gt;
             *               &lt;enumeration value="01"/&gt;
             *               &lt;enumeration value="02"/&gt;
             *               &lt;enumeration value="03"/&gt;
             *               &lt;enumeration value="04"/&gt;
             *               &lt;enumeration value="05"/&gt;
             *               &lt;enumeration value="06"/&gt;
             *               &lt;enumeration value="07"/&gt;
             *               &lt;enumeration value="08"/&gt;
             *               &lt;enumeration value="09"/&gt;
             *               &lt;enumeration value="10"/&gt;
             *               &lt;enumeration value="11"/&gt;
             *               &lt;enumeration value="12"/&gt;
             *               &lt;enumeration value="13"/&gt;
             *               &lt;enumeration value="14"/&gt;
             *               &lt;enumeration value="15"/&gt;
             *               &lt;enumeration value="99"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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
                 * Gets the value of the cUnid property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCUnid() {
                    return cUnid;
                }

                /**
                 * Sets the value of the cUnid property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCUnid(String value) {
                    this.cUnid = value;
                }

                /**
                 * Gets the value of the tpMed property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getTpMed() {
                    return tpMed;
                }

                /**
                 * Sets the value of the tpMed property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setTpMed(String value) {
                    this.tpMed = value;
                }

                /**
                 * Gets the value of the qCarga property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getQCarga() {
                    return qCarga;
                }

                /**
                 * Sets the value of the qCarga property.
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
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="chCte"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;pattern value="[0-9]{44}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="indAlteraToma" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "chCte",
                "indAlteraToma"
        })
        public static class InfCteSub {

            @XmlElement(required = true)
            protected String chCte;
            protected String indAlteraToma;

            /**
             * Gets the value of the chCte property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getChCte() {
                return chCte;
            }

            /**
             * Sets the value of the chCte property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setChCte(String value) {
                this.chCte = value;
            }

            /**
             * Gets the value of the indAlteraToma property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIndAlteraToma() {
                return indAlteraToma;
            }

            /**
             * Sets the value of the indAlteraToma property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIndAlteraToma(String value) {
                this.indAlteraToma = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;any processContents='skip'/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="versaoModal" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="preserve"/&gt;
         *             &lt;pattern value="4\.(0[0-9]|[1-9][0-9])"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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
             * Gets the value of the any property.
             *
             * @return possible object is
             * {@link Element }
             */
            public Element getAny() {
                return any;
            }

            /**
             * Sets the value of the any property.
             *
             * @param value allowed object is
             *              {@link Element }
             */
            public void setAny(Element value) {
                this.any = value;
            }

            /**
             * Gets the value of the versaoModal property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVersaoModal() {
                return versaoModal;
            }

            /**
             * Sets the value of the versaoModal property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVersaoModal(String value) {
                this.versaoModal = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CNPJPAA" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
         *         &lt;element name="PAASignature"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
         *                   &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "cnpjpaa",
                "paaSignature"
        })
        public static class InfPAA {

            @XmlElement(name = "CNPJPAA", required = true)
            protected String cnpjpaa;
            @XmlElement(name = "PAASignature", required = true)
            protected PAASignature paaSignature;

            /**
             * Gets the value of the cnpjpaa property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCNPJPAA() {
                return cnpjpaa;
            }

            /**
             * Sets the value of the cnpjpaa property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCNPJPAA(String value) {
                this.cnpjpaa = value;
            }

            /**
             * Gets the value of the paaSignature property.
             *
             * @return possible object is
             * {@link PAASignature }
             */
            public PAASignature getPAASignature() {
                return paaSignature;
            }

            /**
             * Sets the value of the paaSignature property.
             *
             * @param value allowed object is
             *              {@link PAASignature }
             */
            public void setPAASignature(PAASignature value) {
                this.paaSignature = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
             *         &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "signatureValue",
                    "rsaKeyValue"
            })
            public static class PAASignature {

                @XmlElement(name = "SignatureValue", required = true)
                protected byte[] signatureValue;
                @XmlElement(name = "RSAKeyValue", required = true)
                protected TRSAKeyValueType rsaKeyValue;

                /**
                 * Gets the value of the signatureValue property.
                 *
                 * @return possible object is
                 * byte[]
                 */
                public byte[] getSignatureValue() {
                    return signatureValue;
                }

                /**
                 * Sets the value of the signatureValue property.
                 *
                 * @param value allowed object is
                 *              byte[]
                 */
                public void setSignatureValue(byte[] value) {
                    this.signatureValue = value;
                }

                /**
                 * Gets the value of the rsaKeyValue property.
                 *
                 * @return possible object is
                 * {@link TRSAKeyValueType }
                 */
                public TRSAKeyValueType getRSAKeyValue() {
                    return rsaKeyValue;
                }

                /**
                 * Sets the value of the rsaKeyValue property.
                 *
                 * @param value allowed object is
                 *              {@link TRSAKeyValueType }
                 */
                public void setRSAKeyValue(TRSAKeyValueType value) {
                    this.rsaKeyValue = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="xSolic"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="2"/&gt;
         *               &lt;maxLength value="2000"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "xSolic"
        })
        public static class InfSolicNFF {

            @XmlElement(required = true)
            protected String xSolic;

            /**
             * Gets the value of the xSolic property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXSolic() {
                return xSolic;
            }

            /**
             * Sets the value of the xSolic property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXSolic(String value) {
                this.xSolic = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="toma"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="3"/&gt;
         *               &lt;enumeration value="4"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="indIEToma"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="9"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;choice&gt;
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/&gt;
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
         *         &lt;/choice&gt;
         *         &lt;element name="IE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="xNome"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;maxLength value="60"/&gt;
         *               &lt;minLength value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ISUF" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;pattern value="[0-9]{8,9}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
         *         &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
         *         &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
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

            @XmlElement(required = true)
            protected String toma;
            @XmlElement(required = true)
            protected String indIEToma;
            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            @XmlElement(name = "ISUF")
            protected String isuf;
            protected String fone;
            @XmlElement(required = true)
            protected TEndereco enderToma;
            protected String email;

            /**
             * Gets the value of the toma property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getToma() {
                return toma;
            }

            /**
             * Sets the value of the toma property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setToma(String value) {
                this.toma = value;
            }

            /**
             * Gets the value of the indIEToma property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIndIEToma() {
                return indIEToma;
            }

            /**
             * Sets the value of the indIEToma property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIndIEToma(String value) {
                this.indIEToma = value;
            }

            /**
             * Gets the value of the cnpj property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Sets the value of the cnpj property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Gets the value of the cpf property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Sets the value of the cpf property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

            /**
             * Gets the value of the ie property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIE() {
                return ie;
            }

            /**
             * Sets the value of the ie property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Gets the value of the xNome property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Sets the value of the xNome property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXNome(String value) {
                this.xNome = value;
            }

            /**
             * Gets the value of the isuf property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getISUF() {
                return isuf;
            }

            /**
             * Sets the value of the isuf property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setISUF(String value) {
                this.isuf = value;
            }

            /**
             * Gets the value of the fone property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFone() {
                return fone;
            }

            /**
             * Sets the value of the fone property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFone(String value) {
                this.fone = value;
            }

            /**
             * Gets the value of the enderToma property.
             *
             * @return possible object is
             * {@link TEndereco }
             */
            public TEndereco getEnderToma() {
                return enderToma;
            }

            /**
             * Sets the value of the enderToma property.
             *
             * @param value allowed object is
             *              {@link TEndereco }
             */
            public void setEnderToma(TEndereco value) {
                this.enderToma = value;
            }

            /**
             * Gets the value of the email property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setEmail(String value) {
                this.email = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *         &lt;element name="vTRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "vtPrest",
                "vtRec"
        })
        public static class Total {

            @XmlElement(name = "vTPrest", required = true)
            protected String vtPrest;
            @XmlElement(name = "vTRec", required = true)
            protected String vtRec;

            /**
             * Gets the value of the vtPrest property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVTPrest() {
                return vtPrest;
            }

            /**
             * Sets the value of the vtPrest property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVTPrest(String value) {
                this.vtPrest = value;
            }

            /**
             * Gets the value of the vtRec property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVTRec() {
                return vtRec;
            }

            /**
             * Sets the value of the vtRec property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVTRec(String value) {
                this.vtRec = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="qrCodCTe"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;minLength value="50"/&gt;
     *               &lt;maxLength value="1000"/&gt;
     *               &lt;pattern value="((HTTPS?|https?)://.*\?chCTe=[0-9]{44}&amp;tpAmb=[1-2](&amp;sign=[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1})?)"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "qrCodCTe"
    })
    public static class InfCTeSupl {

        @XmlElement(required = true)
        protected String qrCodCTe;

        /**
         * Gets the value of the qrCodCTe property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getQrCodCTe() {
            return qrCodCTe;
        }

        /**
         * Sets the value of the qrCodCTe property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setQrCodCTe(String value) {
            this.qrCodCTe = value;
        }

    }

}
