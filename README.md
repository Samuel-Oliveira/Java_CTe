# Java-CTe [![MIT License](https://img.shields.io/github/license/Samuel-Oliveira/Java_CTe.svg) ](https://github.com/Samuel-Oliveira/Java_CTe/blob/master/LICENSE) [![Maven Central](https://img.shields.io/maven-central/v/br.com.swconsultoria/java-cte.svg?label=Maven%20Central)](https://search.maven.org/artifact/br.com.swconsultoria/java-cte/4.00.12/jar)
API Java para consumo do WebService de CTe

## Dúvidas, Sugestões ou Consultoria
[![Java Brasil](https://discordapp.com/api/guilds/519583346066587676/widget.png?style=banner2)](https://discord.gg/ZXpqnaV)

## Gostou do Projeto? Dê sua colaboração pelo Pix: 01713390108
<img src="https://swconsultoria.com.br/pix.png" width="200">

Para Iniciar : 
- External Jar: Baixe e adicione às bibliotecas de seu Projeto.
  - https://github.com/Samuel-Oliveira/Java_CTe/releases

- Baixe o [Schemas.zip](https://github.com/Samuel-Oliveira/Java_CTe/raw/master/schemas.zip) e extraia na sua Máquina.

- Maven :
```
<dependency>
    <groupId>br.com.swconsultoria</groupId>
    <artifactId>java-cte</artifactId>
    <version>4.00.12</version>
</dependency>
```

- Gradle :
```groovy
dependencies {
    implementation "br.com.swconsultoria:java-cte:4.00.12"
}
```

Veja a [Wiki](https://Samuel-Oliveira.github.io/Java_CTe/), para ter um Tutorial Completo.

________________________________________________________________________________________________

# Historico de Versões

## v4.00.12 - 01/07/2025
- Atualizado Cacert

## v4.00.11 - 22/04/2025
- Atualizado URL QRCode MG
- Atualizado Cacert

## v4.00.10 - 11/12/2024
- Atualizado Cacert
- Adicionado CTe Simplificado

## v4.00.9 - 08/06/2024
- Atualizado Cacert
- Corrigido erro conversao TRetConsSitCTe

## v4.00.8 - 19/04/2024
- Atualizado nova versao Java Certificado

## v4.00.7 - 04/04/2024
- Correcao Eventos MS - Uso de prefixo de namespace nao permitido - status 404
- Atualizado nova versao Java Certificado

## v4.00.6 - 01/03/2024
- Adicionado Evento Insucesso Entrega
- Adicionado Evento Cancelamento Insucesso Entrega
- Atualizado nova versao Java Certificado

## v4.00.5 - 29/01/2024
- Corrigido Conversao TProtCTeOS

## v4.00.4 - 27/01/2024
- Corrigido Conversao TRetConsSitCTe

## v4.00.3 - 03/01/2024
- Corrigido Criacao de id da CCE
- Atualizado Java Certificado

## v4.00.2 - 05/09/2023
- Adicionado todos os Eventos

## v4.00.1 - 29/08/2023
- Atualizado Layout para versao 4.00
  - Envio CTe
  - Cancelamento Cte
  - Consulta Cte
  - Distribuicao CTe
  - Status Servico

## v3.00.11 - 16/08/2023
- Correcao de Uso de ContingenciaSVC
- Atualizado Cacert (Sefaz Minas)
 
## v3.00.10 - 09/05/2023
- Atualizado Java Certificado (Ver https://github.com/Samuel-Oliveira/Java_Certificado)
- Atualizado Cacert (Sefaz Minas)

## v3.00.9 - 21/02/2023
- Atualizado Dependencia Java-Certificado
- Melhorias JAxB
- Adicionado compatibilidade Java 14+
- Modificado Logs

## v3.00.8 - 15/01/2022
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
