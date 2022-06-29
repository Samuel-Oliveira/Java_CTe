[![Build Status](https://travis-ci.org/Samuel-Oliveira/Java_CTe.svg?branch=master)](https://travis-ci.org/Samuel-Oliveira/Java_CTe) [![MIT License](https://img.shields.io/github/license/Samuel-Oliveira/Java_CTe.svg) ](https://github.com/Samuel-Oliveira/Java_CTe/blob/master/LICENSE) [![Maven Central](https://img.shields.io/maven-central/v/br.com.swconsultoria/java-cte.svg?label=Maven%20Central)](https://search.maven.org/artifact/br.com.swconsultoria/java-cte/3.00.8/jar) [![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/Samuel-Oliveira/Java_CTe.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/Samuel-Oliveira/Java_CTe/context:java) [![Total alerts](https://img.shields.io/lgtm/alerts/g/Samuel-Oliveira/Java_CTe.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/Samuel-Oliveira/Java_CTe/alerts/)

***API Java para consumo do WebService de CTe***

## Dúvidas, Sugestões ou Consultoria 
#### Entre no Discord do Projeto: [https://discord.gg/ZXpqnaV](https://discord.gg/ZXpqnaV)

## Gostou do Projeto? Dê sua colaboração pelo Pix: 01713390108 
<p align="center">
<img src="https://swconsultoria.com.br/pix.png" width="220">
</p>


Para Iniciar : 
- Caso use Libs baixe o [java-cte-3.00.8.jar](https://github.com/Samuel-Oliveira/Java_CTe/raw/master/java-cte-3.00.7.jar) e o adicione às bibliotecas de Seu Projeto.

- Baixe o [Schemas.rar](https://github.com/Samuel-Oliveira/Java_CTe/raw/master/Schemas.rar) e extraia na sua Máquina.

- Maven :
```xml
<dependency>
    <groupId>br.com.swconsultoria</groupId>
    <artifactId>java-cte</artifactId>
    <version>3.00.8</version>
</dependency>
```

- Gradle :
```groovy
repositories {
    maven { 
        url = "https://oss.sonatype.org/content/repositories/snapshots" 
    }
}
dependencies {
    implementation "br.com.swconsultoria:java-cte:3.00.8"
}
```

Veja a Wiki https://github.com/Samuel-Oliveira/Java_CTe/wiki, para ter um Tutorial Completo.

________________________________________________________________________________________________

# Historico de Versões

[//]: # ()
[//]: # (## v3.00.8 - SNAPSHOT - 11/04/2021)

[//]: # (- Atualizado Dependencia Java-Certificado)

[//]: # (- Corrigido erro NS1 para MT )

[//]: # (- Corrigido erro NS1 para MS)

[//]: # (- Corrigido erro de assinatura para Certificados com Repositorio)

[//]: # ()
[//]: # (Snapshot é a versão que se encontra em teste, só use em caso de extrema necessidade.)

[//]: # (Para usar, adicione o repositorio de Snapshot ao Maven:)

[//]: # (```)
[//]: # (<repositories>)
[//]: # (    <repository>)
[//]: # (        <id>sonatype-nexus-snapshots</id>)
[//]: # (        <url>https://oss.sonatype.org/content/repositories/snapshots</url>)
[//]: # (    </repository>)
[//]: # (</repositories>)
[//]: # (<dependency>)
[//]: # (    <groupId>br.com.swconsultoria</groupId>)
[//]: # (    <artifactId>java-cte</artifactId>)
[//]: # (    <version>3.00.8-SNAPSHOT</version>)
[//]: # (</dependency>)
[//]: # (```)

[//]: # (Ou baixe o Jar aqui: https://github.com/Samuel-Oliveira/Java_CTe/raw/master/java-cte-3.00.8-SNAPSHOT.jar)

## v3.00.8 - SNAPSHOT - 15/01/2022
- Atualizado Dependencia Java-Certificado
- Corrigido erro NS1 para MT
- Corrigido erro NS1 para MS
- Corrigido erro de assinatura para Certificados com Repositorio

## v3.00.7 - 01-04-2021
- Removido Cacert do Projeto, agora o projeto Java Certificados irá gerenciar os Cacerts.
- Adicionado Retorno de Cte OS
- Melhoria nos Logs
- Atualizado Dependencia Java-Certificado

## v3.00.6 - 27-04-2020
- Refatoração de Classes
- Adicionado QRCode
- Atualizado para versão 3.00a
- Correção de Inutilização
- Corrigido Erros WSDL MS

## v3.00.5 - 17-07-2019
- Removido Endereços versão 2.00
- Limpeza de Classes
- Adicionado WSDL CTe-OS
- Corrigido Chamadas para CTe-OS
- Adiciona Url WebServices Cte-OS

## v3.00.4 - 22-01-2019
- Adicionado Mais conversões Object->String
- Atualizado Cacert
- Atualizado biblioteca de certificados
- Melhoria no Nome de Classes.
- Corrigido erros Nas COnfigurações Web
- Adicionado Todos os Schemas e WSDL
- Adicionado ao Maven Central

## v3.00.3 - 27-08-2018
- Implementado Padrão Web

## v3.00.2 - 07-12-2017
- Atualizado Cacert
- Corrigido Erro Namespace PR

## v3.00.1 - 07-11-2017
- Atualizado Cacert
- Corrigido conflito com Nfe
- Atualizado para rodar somente com Versão 3.00
- Removido CTe Para Outro Projeto
- Atualizado Layout e Melhorias de velocidade.

## v2.00.1 - 25-09-2017
- Adicionado Cacert Atual
- Adicionado Validação Para Modal Rodoviario
- Adicionado DistDfe
- Atualizado Metodo De verificação do Certificado
- Adicionado JavaDocs
- Removido a Parte de Certificado Digitais para outro Projeto.
- Adicionado MDfe ao Projeto
- Alterações:
- 'ConfiguracoesIniciaisCte' para 'ConfiguracoesIniciais'
- 'ConstantesUtil' para 'ConstantesCte'
- 'CteException' para 'EmissorException'
- 'VersaoCte' para 'Versao'
- 'ObjectToXml' para 'ObjectCteToXml'
- **Atenção: Alterado o caminho do Objeto Certificado, refaça os Imports.** 

## v2.00.0 - 17-02-2017
- Versão Inicial Do Sistema