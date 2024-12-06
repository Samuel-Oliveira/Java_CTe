


package br.com.swconsultoria.cte.schema_400.procCTeSimp;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Tipo Guia de Transporte de Valores Eletrônica (Modelo 64)
 * 
 * <p>Java class for TGTVe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TGTVe"&gt;
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
 *                             &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModGTVe"/&gt;
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
 *                                   &lt;enumeration value="2"/&gt;
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
 *                             &lt;element name="tpCTe"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TFinGTVe"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
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
 *                             &lt;element name="modal"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TModTranspGTVe"&gt;
 *                                   &lt;enumeration value="01"/&gt;
 *                                   &lt;enumeration value="06"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="tpServ"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;enumeration value="9"/&gt;
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
 *                             &lt;element name="dhSaidaOrig"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="dhChegadaDest"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="toma"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="toma"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                               &lt;whiteSpace value="preserve"/&gt;
 *                                               &lt;enumeration value="0"/&gt;
 *                                               &lt;enumeration value="1"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="tomaTerceiro"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="toma"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                               &lt;whiteSpace value="preserve"/&gt;
 *                                               &lt;enumeration value="4"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;choice&gt;
 *                                           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/&gt;
 *                                           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
 *                                         &lt;/choice&gt;
 *                                         &lt;element name="IE" minOccurs="0"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest"&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="xNome"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                               &lt;maxLength value="60"/&gt;
 *                                               &lt;minLength value="2"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="xFant" minOccurs="0"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                               &lt;maxLength value="60"/&gt;
 *                                               &lt;minLength value="2"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
 *                                         &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
 *                                         &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/choice&gt;
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
 *                             &lt;element name="xEmi" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
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
 *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
 *                             &lt;element name="IE"&gt;
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
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="rem"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
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
 *                             &lt;element name="xFant" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                   &lt;maxLength value="60"/&gt;
 *                                   &lt;minLength value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
 *                             &lt;element name="enderReme" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
 *                             &lt;element name="email" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TEmail"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="dest"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
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
 *                             &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
 *                             &lt;element name="ISUF" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;pattern value="[0-9]{8,9}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="enderDest" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
 *                             &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="origem" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi" minOccurs="0"/&gt;
 *                   &lt;element name="destino" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi" minOccurs="0"/&gt;
 *                   &lt;element name="detGTV"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="infEspecie" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="tpEspecie"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                             &lt;enumeration value="1"/&gt;
 *                                             &lt;enumeration value="2"/&gt;
 *                                             &lt;enumeration value="3"/&gt;
 *                                             &lt;enumeration value="4"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="vEspecie" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                                       &lt;element name="tpNumerario"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                             &lt;enumeration value="1"/&gt;
 *                                             &lt;enumeration value="2"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="xMoedaEstr" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                                             &lt;maxLength value="60"/&gt;
 *                                             &lt;minLength value="2"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/&gt;
 *                             &lt;element name="infVeiculo" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="placa" type="{http://www.portalfiscal.inf.br/cte}TPlaca"/&gt;
 *                                       &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf" minOccurs="0"/&gt;
 *                                       &lt;element name="RNTRC" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                             &lt;pattern value="[0-9]{8}|ISENTO"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
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
 *       &lt;attribute name="versao" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TVerCTe"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGTVe", propOrder = {
    "infCte",
    "infCTeSupl",
    "signature"
})
public class TGTVe {

    @XmlElement(required = true)
    protected TGTVe.InfCte infCte;
    protected InfCTeSupl infCTeSupl;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the infCte property.
     * 
     * @return
     *     possible object is
     *     {@link InfCte }
     *     
     */
    public InfCte getInfCte() {
        return infCte;
    }

    /**
     * Sets the value of the infCte property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfCte }
     *     
     */
    public void setInfCte(InfCte value) {
        this.infCte = value;
    }

    /**
     * Gets the value of the infCTeSupl property.
     * 
     * @return
     *     possible object is
     *     {@link InfCTeSupl }
     *     
     */
    public InfCTeSupl getInfCTeSupl() {
        return infCTeSupl;
    }

    /**
     * Sets the value of the infCTeSupl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfCTeSupl }
     *     
     */
    public void setInfCTeSupl(InfCTeSupl value) {
        this.infCTeSupl = value;
    }

    /**
     * Gets the value of the signature property.
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
     * Sets the value of the signature property.
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
     * Gets the value of the versao property.
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
     * Sets the value of the versao property.
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
     *                   &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModGTVe"/&gt;
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
     *                         &lt;enumeration value="2"/&gt;
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
     *                   &lt;element name="tpCTe"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TFinGTVe"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
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
     *                   &lt;element name="modal"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TModTranspGTVe"&gt;
     *                         &lt;enumeration value="01"/&gt;
     *                         &lt;enumeration value="06"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="tpServ"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;enumeration value="9"/&gt;
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
     *                   &lt;element name="dhSaidaOrig"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="dhChegadaDest"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="toma"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="toma"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                     &lt;whiteSpace value="preserve"/&gt;
     *                                     &lt;enumeration value="0"/&gt;
     *                                     &lt;enumeration value="1"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="tomaTerceiro"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="toma"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                     &lt;whiteSpace value="preserve"/&gt;
     *                                     &lt;enumeration value="4"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;choice&gt;
     *                                 &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/&gt;
     *                                 &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
     *                               &lt;/choice&gt;
     *                               &lt;element name="IE" minOccurs="0"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest"&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="xNome"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                     &lt;maxLength value="60"/&gt;
     *                                     &lt;minLength value="2"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="xFant" minOccurs="0"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                     &lt;maxLength value="60"/&gt;
     *                                     &lt;minLength value="2"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
     *                               &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
     *                               &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/choice&gt;
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
     *                   &lt;element name="xEmi" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
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
     *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
     *                   &lt;element name="IE"&gt;
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
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="rem"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
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
     *                   &lt;element name="xFant" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                         &lt;maxLength value="60"/&gt;
     *                         &lt;minLength value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
     *                   &lt;element name="enderReme" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
     *                   &lt;element name="email" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TEmail"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="dest"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
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
     *                   &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
     *                   &lt;element name="ISUF" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                         &lt;pattern value="[0-9]{8,9}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="enderDest" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
     *                   &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="origem" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi" minOccurs="0"/&gt;
     *         &lt;element name="destino" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi" minOccurs="0"/&gt;
     *         &lt;element name="detGTV"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="infEspecie" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="tpEspecie"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                   &lt;enumeration value="1"/&gt;
     *                                   &lt;enumeration value="2"/&gt;
     *                                   &lt;enumeration value="3"/&gt;
     *                                   &lt;enumeration value="4"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="vEspecie" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *                             &lt;element name="tpNumerario"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                   &lt;enumeration value="1"/&gt;
     *                                   &lt;enumeration value="2"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="xMoedaEstr" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                                   &lt;maxLength value="60"/&gt;
     *                                   &lt;minLength value="2"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/&gt;
     *                   &lt;element name="infVeiculo" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="placa" type="{http://www.portalfiscal.inf.br/cte}TPlaca"/&gt;
     *                             &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf" minOccurs="0"/&gt;
     *                             &lt;element name="RNTRC" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                   &lt;pattern value="[0-9]{8}|ISENTO"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
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
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ide",
        "compl",
        "emit",
        "rem",
        "dest",
        "origem",
        "destino",
        "detGTV",
        "autXML",
        "infRespTec"
    })
    public static class InfCte {

        @XmlElement(required = true)
        protected TGTVe.InfCte.Ide ide;
        protected Compl compl;
        @XmlElement(required = true)
        protected TGTVe.InfCte.Emit emit;
        @XmlElement(required = true)
        protected TGTVe.InfCte.Rem rem;
        @XmlElement(required = true)
        protected TGTVe.InfCte.Dest dest;
        protected TEndeEmi origem;
        protected TEndeEmi destino;
        @XmlElement(required = true)
        protected TGTVe.InfCte.DetGTV detGTV;
        protected List<AutXML> autXML;
        protected TRespTec infRespTec;
        @XmlAttribute(name = "versao", required = true)
        protected String versao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ide property.
         * 
         * @return
         *     possible object is
         *     {@link Ide }
         *     
         */
        public Ide getIde() {
            return ide;
        }

        /**
         * Sets the value of the ide property.
         * 
         * @param value
         *     allowed object is
         *     {@link Ide }
         *     
         */
        public void setIde(Ide value) {
            this.ide = value;
        }

        /**
         * Gets the value of the compl property.
         * 
         * @return
         *     possible object is
         *     {@link Compl }
         *     
         */
        public Compl getCompl() {
            return compl;
        }

        /**
         * Sets the value of the compl property.
         * 
         * @param value
         *     allowed object is
         *     {@link Compl }
         *     
         */
        public void setCompl(Compl value) {
            this.compl = value;
        }

        /**
         * Gets the value of the emit property.
         * 
         * @return
         *     possible object is
         *     {@link Emit }
         *     
         */
        public Emit getEmit() {
            return emit;
        }

        /**
         * Sets the value of the emit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Emit }
         *     
         */
        public void setEmit(Emit value) {
            this.emit = value;
        }

        /**
         * Gets the value of the rem property.
         * 
         * @return
         *     possible object is
         *     {@link Rem }
         *     
         */
        public Rem getRem() {
            return rem;
        }

        /**
         * Sets the value of the rem property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rem }
         *     
         */
        public void setRem(Rem value) {
            this.rem = value;
        }

        /**
         * Gets the value of the dest property.
         * 
         * @return
         *     possible object is
         *     {@link Dest }
         *     
         */
        public Dest getDest() {
            return dest;
        }

        /**
         * Sets the value of the dest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Dest }
         *     
         */
        public void setDest(Dest value) {
            this.dest = value;
        }

        /**
         * Gets the value of the origem property.
         * 
         * @return
         *     possible object is
         *     {@link TEndeEmi }
         *     
         */
        public TEndeEmi getOrigem() {
            return origem;
        }

        /**
         * Sets the value of the origem property.
         * 
         * @param value
         *     allowed object is
         *     {@link TEndeEmi }
         *     
         */
        public void setOrigem(TEndeEmi value) {
            this.origem = value;
        }

        /**
         * Gets the value of the destino property.
         * 
         * @return
         *     possible object is
         *     {@link TEndeEmi }
         *     
         */
        public TEndeEmi getDestino() {
            return destino;
        }

        /**
         * Sets the value of the destino property.
         * 
         * @param value
         *     allowed object is
         *     {@link TEndeEmi }
         *     
         */
        public void setDestino(TEndeEmi value) {
            this.destino = value;
        }

        /**
         * Gets the value of the detGTV property.
         * 
         * @return
         *     possible object is
         *     {@link DetGTV }
         *     
         */
        public DetGTV getDetGTV() {
            return detGTV;
        }

        /**
         * Sets the value of the detGTV property.
         * 
         * @param value
         *     allowed object is
         *     {@link DetGTV }
         *     
         */
        public void setDetGTV(DetGTV value) {
            this.detGTV = value;
        }

        /**
         * Gets the value of the autXML property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
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
         * 
         * 
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
         * @return
         *     possible object is
         *     {@link TRespTec }
         *     
         */
        public TRespTec getInfRespTec() {
            return infRespTec;
        }

        /**
         * Sets the value of the infRespTec property.
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
         * Gets the value of the versao property.
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
         * Sets the value of the versao property.
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
         * Gets the value of the id property.
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
         * Sets the value of the id property.
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
         * 
         * 
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
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Sets the value of the cnpj property.
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
             * Gets the value of the cpf property.
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
             * Sets the value of the cpf property.
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
         *         &lt;element name="xEmi" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="20"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
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
         * 
         * 
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
             * Gets the value of the xCaracAd property.
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
             * Sets the value of the xCaracAd property.
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
             * Gets the value of the xCaracSer property.
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
             * Sets the value of the xCaracSer property.
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
             * Gets the value of the xEmi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXEmi() {
                return xEmi;
            }

            /**
             * Sets the value of the xEmi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXEmi(String value) {
                this.xEmi = value;
            }

            /**
             * Gets the value of the xObs property.
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
             * Sets the value of the xObs property.
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
             * returned list will be present inside the Jakarta XML Binding object.
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
             * 
             * 
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
             * returned list will be present inside the Jakarta XML Binding object.
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
             * 
             * 
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
             * 
             * 
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
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Sets the value of the xTexto property.
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
                 * Gets the value of the xCampo property.
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
                 * Sets the value of the xCampo property.
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
             * 
             * 
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
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Sets the value of the xTexto property.
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
                 * Gets the value of the xCampo property.
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
                 * Sets the value of the xCampo property.
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
         *         &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
         *         &lt;element name="ISUF" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;pattern value="[0-9]{8,9}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="enderDest" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
         *         &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * Gets the value of the cnpj property.
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
             * Sets the value of the cnpj property.
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
             * Gets the value of the cpf property.
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
             * Sets the value of the cpf property.
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
             * Gets the value of the ie property.
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
             * Sets the value of the ie property.
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
             * Gets the value of the xNome property.
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
             * Sets the value of the xNome property.
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
             * Gets the value of the fone property.
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
             * Sets the value of the fone property.
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
             * Gets the value of the isuf property.
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
             * Sets the value of the isuf property.
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
             * Gets the value of the enderDest property.
             * 
             * @return
             *     possible object is
             *     {@link TEndereco }
             *     
             */
            public TEndereco getEnderDest() {
                return enderDest;
            }

            /**
             * Sets the value of the enderDest property.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndereco }
             *     
             */
            public void setEnderDest(TEndereco value) {
                this.enderDest = value;
            }

            /**
             * Gets the value of the email property.
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
             * Sets the value of the email property.
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="infEspecie" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="tpEspecie"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                         &lt;enumeration value="1"/&gt;
         *                         &lt;enumeration value="2"/&gt;
         *                         &lt;enumeration value="3"/&gt;
         *                         &lt;enumeration value="4"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="vEspecie" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
         *                   &lt;element name="tpNumerario"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                         &lt;enumeration value="1"/&gt;
         *                         &lt;enumeration value="2"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="xMoedaEstr" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                         &lt;maxLength value="60"/&gt;
         *                         &lt;minLength value="2"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/&gt;
         *         &lt;element name="infVeiculo" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="placa" type="{http://www.portalfiscal.inf.br/cte}TPlaca"/&gt;
         *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf" minOccurs="0"/&gt;
         *                   &lt;element name="RNTRC" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                         &lt;pattern value="[0-9]{8}|ISENTO"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
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
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "infEspecie",
            "qCarga",
            "infVeiculo"
        })
        public static class DetGTV {

            @XmlElement(required = true)
            protected List<InfEspecie> infEspecie;
            @XmlElement(required = true)
            protected String qCarga;
            @XmlElement(required = true)
            protected List<InfVeiculo> infVeiculo;

            /**
             * Gets the value of the infEspecie property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the infEspecie property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfEspecie().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InfEspecie }
             * 
             * 
             */
            public List<InfEspecie> getInfEspecie() {
                if (infEspecie == null) {
                    infEspecie = new ArrayList<InfEspecie>();
                }
                return this.infEspecie;
            }

            /**
             * Gets the value of the qCarga property.
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
             * Sets the value of the qCarga property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQCarga(String value) {
                this.qCarga = value;
            }

            /**
             * Gets the value of the infVeiculo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the infVeiculo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfVeiculo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InfVeiculo }
             * 
             * 
             */
            public List<InfVeiculo> getInfVeiculo() {
                if (infVeiculo == null) {
                    infVeiculo = new ArrayList<InfVeiculo>();
                }
                return this.infVeiculo;
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
             *         &lt;element name="tpEspecie"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *               &lt;enumeration value="1"/&gt;
             *               &lt;enumeration value="2"/&gt;
             *               &lt;enumeration value="3"/&gt;
             *               &lt;enumeration value="4"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="vEspecie" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
             *         &lt;element name="tpNumerario"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *               &lt;enumeration value="1"/&gt;
             *               &lt;enumeration value="2"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="xMoedaEstr" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;maxLength value="60"/&gt;
             *               &lt;minLength value="2"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tpEspecie",
                "vEspecie",
                "tpNumerario",
                "xMoedaEstr"
            })
            public static class InfEspecie {

                @XmlElement(required = true)
                protected String tpEspecie;
                @XmlElement(required = true)
                protected String vEspecie;
                @XmlElement(required = true)
                protected String tpNumerario;
                protected String xMoedaEstr;

                /**
                 * Gets the value of the tpEspecie property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTpEspecie() {
                    return tpEspecie;
                }

                /**
                 * Sets the value of the tpEspecie property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTpEspecie(String value) {
                    this.tpEspecie = value;
                }

                /**
                 * Gets the value of the vEspecie property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVEspecie() {
                    return vEspecie;
                }

                /**
                 * Sets the value of the vEspecie property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVEspecie(String value) {
                    this.vEspecie = value;
                }

                /**
                 * Gets the value of the tpNumerario property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTpNumerario() {
                    return tpNumerario;
                }

                /**
                 * Sets the value of the tpNumerario property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTpNumerario(String value) {
                    this.tpNumerario = value;
                }

                /**
                 * Gets the value of the xMoedaEstr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXMoedaEstr() {
                    return xMoedaEstr;
                }

                /**
                 * Sets the value of the xMoedaEstr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXMoedaEstr(String value) {
                    this.xMoedaEstr = value;
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
             *         &lt;element name="placa" type="{http://www.portalfiscal.inf.br/cte}TPlaca"/&gt;
             *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf" minOccurs="0"/&gt;
             *         &lt;element name="RNTRC" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *               &lt;pattern value="[0-9]{8}|ISENTO"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "placa",
                "uf",
                "rntrc"
            })
            public static class InfVeiculo {

                @XmlElement(required = true)
                protected String placa;
                @XmlElement(name = "UF")
                @XmlSchemaType(name = "string")
                protected TUf uf;
                @XmlElement(name = "RNTRC")
                protected String rntrc;

                /**
                 * Gets the value of the placa property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlaca() {
                    return placa;
                }

                /**
                 * Sets the value of the placa property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlaca(String value) {
                    this.placa = value;
                }

                /**
                 * Gets the value of the uf property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TUf }
                 *     
                 */
                public TUf getUF() {
                    return uf;
                }

                /**
                 * Sets the value of the uf property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TUf }
                 *     
                 */
                public void setUF(TUf value) {
                    this.uf = value;
                }

                /**
                 * Gets the value of the rntrc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRNTRC() {
                    return rntrc;
                }

                /**
                 * Sets the value of the rntrc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRNTRC(String value) {
                    this.rntrc = value;
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
         *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/&gt;
         *         &lt;element name="IE"&gt;
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
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * Gets the value of the cnpj property.
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
             * Sets the value of the cnpj property.
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
             * Gets the value of the ie property.
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
             * Sets the value of the ie property.
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
             * Gets the value of the iest property.
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
             * Sets the value of the iest property.
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
             * Gets the value of the xNome property.
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
             * Sets the value of the xNome property.
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
             * Gets the value of the xFant property.
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
             * Sets the value of the xFant property.
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
             * Gets the value of the enderEmit property.
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
             * Sets the value of the enderEmit property.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndeEmi }
             *     
             */
            public void setEnderEmit(TEndeEmi value) {
                this.enderEmit = value;
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
         *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModGTVe"/&gt;
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
         *               &lt;enumeration value="2"/&gt;
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
         *         &lt;element name="tpCTe"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TFinGTVe"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
         *         &lt;element name="modal"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TModTranspGTVe"&gt;
         *               &lt;enumeration value="01"/&gt;
         *               &lt;enumeration value="06"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="tpServ"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *               &lt;enumeration value="9"/&gt;
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
         *         &lt;element name="dhSaidaOrig"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="dhChegadaDest"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;choice&gt;
         *           &lt;element name="toma"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="toma"&gt;
         *                       &lt;simpleType&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                           &lt;whiteSpace value="preserve"/&gt;
         *                           &lt;enumeration value="0"/&gt;
         *                           &lt;enumeration value="1"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/simpleType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="tomaTerceiro"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="toma"&gt;
         *                       &lt;simpleType&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                           &lt;whiteSpace value="preserve"/&gt;
         *                           &lt;enumeration value="4"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/simpleType&gt;
         *                     &lt;/element&gt;
         *                     &lt;choice&gt;
         *                       &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/&gt;
         *                       &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/&gt;
         *                     &lt;/choice&gt;
         *                     &lt;element name="IE" minOccurs="0"&gt;
         *                       &lt;simpleType&gt;
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest"&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/simpleType&gt;
         *                     &lt;/element&gt;
         *                     &lt;element name="xNome"&gt;
         *                       &lt;simpleType&gt;
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                           &lt;maxLength value="60"/&gt;
         *                           &lt;minLength value="2"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/simpleType&gt;
         *                     &lt;/element&gt;
         *                     &lt;element name="xFant" minOccurs="0"&gt;
         *                       &lt;simpleType&gt;
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *                           &lt;maxLength value="60"/&gt;
         *                           &lt;minLength value="2"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/simpleType&gt;
         *                     &lt;/element&gt;
         *                     &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
         *                     &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
         *                     &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *         &lt;/choice&gt;
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
            "verProc",
            "cMunEnv",
            "xMunEnv",
            "ufEnv",
            "modal",
            "tpServ",
            "indIEToma",
            "dhSaidaOrig",
            "dhChegadaDest",
            "toma",
            "tomaTerceiro",
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
            @XmlElement(required = true)
            protected String indIEToma;
            @XmlElement(required = true)
            protected String dhSaidaOrig;
            @XmlElement(required = true)
            protected String dhChegadaDest;
            protected Toma toma;
            protected TomaTerceiro tomaTerceiro;
            protected String dhCont;
            protected String xJust;

            /**
             * Gets the value of the cuf property.
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
             * Sets the value of the cuf property.
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
             * Gets the value of the cct property.
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
             * Sets the value of the cct property.
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
             * Gets the value of the cfop property.
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
             * Sets the value of the cfop property.
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
             * Gets the value of the natOp property.
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
             * Sets the value of the natOp property.
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
             * Gets the value of the mod property.
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
             * Sets the value of the mod property.
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
             * Gets the value of the serie property.
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
             * Sets the value of the serie property.
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
             * Gets the value of the nct property.
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
             * Sets the value of the nct property.
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
             * Gets the value of the dhEmi property.
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
             * Sets the value of the dhEmi property.
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
             * Gets the value of the tpImp property.
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
             * Sets the value of the tpImp property.
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
             * Gets the value of the tpEmis property.
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
             * Sets the value of the tpEmis property.
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
             * Gets the value of the cdv property.
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
             * Sets the value of the cdv property.
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
             * Gets the value of the tpAmb property.
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
             * Sets the value of the tpAmb property.
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
             * Gets the value of the tpCTe property.
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
             * Sets the value of the tpCTe property.
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
             * Gets the value of the verProc property.
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
             * Sets the value of the verProc property.
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
             * Gets the value of the cMunEnv property.
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
             * Sets the value of the cMunEnv property.
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
             * Gets the value of the xMunEnv property.
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
             * Sets the value of the xMunEnv property.
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
             * Gets the value of the ufEnv property.
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
             * Sets the value of the ufEnv property.
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
             * Gets the value of the modal property.
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
             * Sets the value of the modal property.
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
             * Gets the value of the tpServ property.
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
             * Sets the value of the tpServ property.
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
             * Gets the value of the indIEToma property.
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
             * Sets the value of the indIEToma property.
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
             * Gets the value of the dhSaidaOrig property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDhSaidaOrig() {
                return dhSaidaOrig;
            }

            /**
             * Sets the value of the dhSaidaOrig property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDhSaidaOrig(String value) {
                this.dhSaidaOrig = value;
            }

            /**
             * Gets the value of the dhChegadaDest property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDhChegadaDest() {
                return dhChegadaDest;
            }

            /**
             * Sets the value of the dhChegadaDest property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDhChegadaDest(String value) {
                this.dhChegadaDest = value;
            }

            /**
             * Gets the value of the toma property.
             * 
             * @return
             *     possible object is
             *     {@link Toma }
             *     
             */
            public Toma getToma() {
                return toma;
            }

            /**
             * Sets the value of the toma property.
             * 
             * @param value
             *     allowed object is
             *     {@link Toma }
             *     
             */
            public void setToma(Toma value) {
                this.toma = value;
            }

            /**
             * Gets the value of the tomaTerceiro property.
             * 
             * @return
             *     possible object is
             *     {@link TomaTerceiro }
             *     
             */
            public TomaTerceiro getTomaTerceiro() {
                return tomaTerceiro;
            }

            /**
             * Sets the value of the tomaTerceiro property.
             * 
             * @param value
             *     allowed object is
             *     {@link TomaTerceiro }
             *     
             */
            public void setTomaTerceiro(TomaTerceiro value) {
                this.tomaTerceiro = value;
            }

            /**
             * Gets the value of the dhCont property.
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
             * Sets the value of the dhCont property.
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
             * Gets the value of the xJust property.
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
             * Sets the value of the xJust property.
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
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "toma"
            })
            public static class Toma {

                @XmlElement(required = true)
                protected String toma;

                /**
                 * Gets the value of the toma property.
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
                 * Sets the value of the toma property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setToma(String value) {
                    this.toma = value;
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
             *               &lt;enumeration value="4"/&gt;
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
             *         &lt;element name="xFant" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
             *               &lt;maxLength value="60"/&gt;
             *               &lt;minLength value="2"/&gt;
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
             * 
             * 
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
            public static class TomaTerceiro {

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
                 * Gets the value of the toma property.
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
                 * Sets the value of the toma property.
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
                 * Gets the value of the cnpj property.
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
                 * Sets the value of the cnpj property.
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
                 * Gets the value of the cpf property.
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
                 * Sets the value of the cpf property.
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
                 * Gets the value of the ie property.
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
                 * Sets the value of the ie property.
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
                 * Gets the value of the xNome property.
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
                 * Sets the value of the xNome property.
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
                 * Gets the value of the xFant property.
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
                 * Sets the value of the xFant property.
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
                 * Gets the value of the fone property.
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
                 * Sets the value of the fone property.
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
                 * Gets the value of the enderToma property.
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
                 * Sets the value of the enderToma property.
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
                 * Gets the value of the email property.
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
                 * Sets the value of the email property.
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
         *         &lt;element name="xFant" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
         *               &lt;maxLength value="60"/&gt;
         *               &lt;minLength value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="fone" type="{http://www.portalfiscal.inf.br/cte}TFone" minOccurs="0"/&gt;
         *         &lt;element name="enderReme" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/&gt;
         *         &lt;element name="email" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TEmail"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * Gets the value of the cnpj property.
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
             * Sets the value of the cnpj property.
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
             * Gets the value of the cpf property.
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
             * Sets the value of the cpf property.
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
             * Gets the value of the ie property.
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
             * Sets the value of the ie property.
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
             * Gets the value of the xNome property.
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
             * Sets the value of the xNome property.
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
             * Gets the value of the xFant property.
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
             * Sets the value of the xFant property.
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
             * Gets the value of the fone property.
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
             * Sets the value of the fone property.
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
             * Gets the value of the enderReme property.
             * 
             * @return
             *     possible object is
             *     {@link TEndereco }
             *     
             */
            public TEndereco getEnderReme() {
                return enderReme;
            }

            /**
             * Sets the value of the enderReme property.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndereco }
             *     
             */
            public void setEnderReme(TEndereco value) {
                this.enderReme = value;
            }

            /**
             * Gets the value of the email property.
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
             * Sets the value of the email property.
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
     * 
     * 
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
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQrCodCTe() {
            return qrCodCTe;
        }

        /**
         * Sets the value of the qrCodCTe property.
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

}
