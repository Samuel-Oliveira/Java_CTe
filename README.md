# Java-CTe [![MIT License](https://img.shields.io/github/license/Samuel-Oliveira/Java_CTe.svg) ](https://github.com/Samuel-Oliveira/Java_CTe/blob/master/LICENSE) [![Maven Central](https://img.shields.io/maven-central/v/br.com.swconsultoria/java-cte.svg?label=Maven%20Central)](https://search.maven.org/artifact/br.com.swconsultoria/java-cte/4.00.15/jar)
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
    <version>4.00.15</version>
</dependency>
```

- Gradle :
```groovy
dependencies {
    implementation "br.com.swconsultoria:java-cte:4.00.15"
}
```

Veja a [Wiki](https://Samuel-Oliveira.github.io/Java_CTe/), para ter um Tutorial Completo.

## Impressão do DACTE

A impressão do DACTE (Documento Auxiliar do Conhecimento de Transporte Eletrônico) fica no pacote `br.com.swconsultoria.cte.impressao`: template Thymeleaf, HTML e PDF pelo openhtmltopdf, com o código de barras (Code-128C) e o QR Code gerados pelo zxing. Ela substitui o DACTE Jasper da biblioteca [Java_Danfe](https://github.com/Samuel-Oliveira/Java_Danfe), descontinuada, e imprime tudo o que aquele leiaute imprimia, em arranjo equivalente.

```java
import br.com.swconsultoria.cte.impressao.ImpressaoDacteDTO;
import br.com.swconsultoria.cte.impressao.ImpressaoDacteUtil;

String xml = XmlCteUtil.leXml("caminho/cte-autorizado.xml");               // cteProc, ou CTe sem protocolo

ImpressaoDacteDTO impressao = ImpressaoDacteUtil.impressaoPadraoCTe(xml);  // logo padrão do CT-e e canhoto

byte[] pdf = ImpressaoDacteUtil.impressaoPdfByte(impressao);               // PDF em memória
ImpressaoDacteUtil.impressaoPdfArquivo(impressao, "dacte.pdf");            // PDF em arquivo
ImpressaoDacteUtil.impressaoHtml(impressao, "dacte.html");                 // HTML em arquivo
String html = ImpressaoDacteUtil.gerarHtml(impressao);                     // HTML em String
ImpressaoDacteUtil.impressaoDireta(impressao);                             // impressora padrão
ImpressaoDacteUtil.impressaoDireta(impressao, printService);               // javax.print.PrintService
```

Todos os erros (XML vazio ou malformado, XML que não é de CT-e modelo 57, template inexistente ou inválido, falha ao gravar o arquivo, impressora não encontrada) saem como `br.com.swconsultoria.cte.exception.DacteException`, que é unchecked e traz a causa original. O XML deve vir como String já decodificada; o BOM de arquivos UTF-8 é descartado. Sem o `protCTe`, a chave vem do `infCte/@Id` e o protocolo sai em branco.

**Personalização**

```java
impressao.setLogo(inputStream);                     // lê e FECHA o stream; também setLogo(bytes) e setLogoArquivo("c:/logo.png")
impressao.removerLogo();                            // sem logo
impressao.setExibirCanhoto(false);                  // sem o canhoto no topo da primeira folha
impressao.getParametros().put("nome", valor);       // disponível no template como ${parametros.nome}
impressao.setTemplate("c:/templates/meu-dacte.html");
```

Os caminhos de `setTemplate` e `setLogoArquivo` são configuração do servidor, nunca entrada do usuário final: o arquivo informado é aberto onde estiver.

**Template próprio.** Parta de uma cópia de `dacte/dacte.html`, que está no jar (no código-fonte, em `src/main/resources/dacte/`). O caminho precisa terminar em `.html`, `.htm` ou `.xhtml`: só esses nomes são procurados no disco. Um nome sem extensão é procurado apenas no jar, e é assim que `setTemplate(ImpressaoDacteUtil.TEMPLATE_PADRAO)` força o leiaute padrão; uma pasta ou arquivo chamado `dacte` no diretório de trabalho não toma o lugar dele.

- Variáveis: `dacte` (`DacteDTO`: Maps com os nomes das tags do XML, como `${dacte.ide.nCT}` e `${dacte.rem.xNome}`; as exceções estão no Javadoc do `LeitorDacte`), `fmt` (`FormatadorDacte`: `valor`, `aliquota`, `quantidade`, `documento`, `cep`, `fone`, `chave`, `dataHora`, `endereco`, os códigos por extenso e outros), `xml` (`XmlDacte`, qualquer campo via XPath sem namespace: `${xml.valor('//infCte/ide/tpEmis')}`), `logo`, `codigoBarras` e `qrCode` (data URI), `exibirCanhoto` e `parametros`.
- Fragmentos do jar que um template próprio pode usar: `~{fragmentos :: campo('RÓTULO', ${valor}, '25%')}`, `~{fragmentos :: participante('REMETENTE', ${dacte.rem})}`, `~{fragmentos :: cabecalho}` e `~{fragmentos :: canhoto}`.
- O HTML precisa ser XHTML bem formado (`<br />`, `<img ... />`, sem `&nbsp;`), com CSS 2.1 e tabelas (`table-layout: fixed`): o openhtmltopdf não tem flexbox nem grid. A fonte é a Helvetica do PDF.
- Não junte códigos numéricos com `+`: o Thymeleaf soma strings que parecem números (`'0' + '00'` dá `0`). Use `fmt.juntar(a, ' / ', b)` ou um texto no meio. Valores do XML concatenados com `+` precisam passar por `fmt.primeiro(valor, '')`, senão uma tag ausente imprime `null`.
- `th:if` e `th:replace` no mesmo elemento não funcionam juntos (o `th:replace` roda antes): envolva com `<th:block th:if="...">`.
- Para repetir o cabeçalho de uma lista em cada folha, a tabela precisa de `-fs-table-paginate: paginate` e `border-collapse: separate`, sem `overflow: hidden` nas células; com uma linha de título (colspan) no `thead`, as larguras vão num `<colgroup>`.
- O bloco do rodapé (modal, uso do emissor e fisco) encosta no pé da última folha quando o template tem um `<div id="espaco-rodape"></div>` vazio logo antes do bloco com `id="rodape"`. O total de folhas do "FL" vai nos elementos de classe `folha-total` (o `counter(pages)` do CSS é diagramado com largura zero e seria cortado pelo `overflow: hidden` da célula); a folha atual sai com `counter(page)`. Os dois ajustes são feitos no PDF; o HTML sai com o total em branco.

**O que o leiaute padrão cobre**

- CT-e modelo 57 (leiaute 4.00) em A4 retrato: normal, substituto e complemento de valores (com as chaves dos CT-e complementados).
- Canhoto, emitente com logo, identificação (modal, modelo, série, número, folha, emissão), código de barras e chave, QR Code do `infCTeSupl`, protocolo, CFOP e natureza da operação, tipo do CT-e e do serviço, tomador, CT-e globalizado, Suframa do destinatário, início e término da prestação.
- Remetente, destinatário, expedidor e recebedor (os dois últimos quando houver um deles), tomador do serviço (`toma3` ou `toma4`), carga com todas as quantidades (`infQ`), componentes do valor da prestação, ICMS (todos os grupos), IBS e CBS (quando o XML traz o grupo `IBSCBS`), documentos originários (NF-e, NF em papel, outros documentos e DC-e) e veículos novos, em duas colunas e com o cabeçalho repetido quando passam para outra folha.
- Modal rodoviário (RNTRC), observações (`xObs` e `ObsCont`) e reservado ao fisco (`ObsFisco` e `infAdFisco`).
- Marca d'água: CT-e cancelado (`cStat` 101), homologação, contingência FS-DA e "SEM VALOR FISCAL" para o XML de produção sem protocolo (exceto FS-DA e EPEC).

Não cobre: CT-e OS (modelo 67), CT-e Simplificado e GTV-e, que só saem com template próprio; o quadro específico dos modais aéreo, aquaviário, ferroviário, dutoviário e multimodal (sai só o nome do modal); o DACTE em paisagem (`tpImp=2` sai em retrato); documentos anteriores (`docAnt`), cobrança (`cobr`), ordens de coleta, previsão de entrega e os dados da entrada em contingência. O quadro do IBS e da CBS segue o arranjo dos demais quadros; a disposição dele não foi conferida com uma Nota Técnica do DACTE.

**Dependências.** As bibliotecas de impressão vêm por transitividade com o `java-cte` (escopo `compile`): `org.thymeleaf:thymeleaf` 3.1.2.RELEASE, `com.openhtmltopdf:openhtmltopdf-pdfbox` 1.0.10 (com o PDFBox 2.0.24) e `com.google.zxing:core`/`javase` 3.2.1 (sem o `jcommander`, que só a linha de comando do zxing usa). Quem só transmite e não quer o peso delas pode excluí-las:

```xml
<dependency>
    <groupId>br.com.swconsultoria</groupId>
    <artifactId>java-cte</artifactId>
    <version>...</version>
    <exclusions>
        <exclusion><groupId>org.thymeleaf</groupId><artifactId>*</artifactId></exclusion>
        <exclusion><groupId>com.openhtmltopdf</groupId><artifactId>*</artifactId></exclusion>
        <exclusion><groupId>com.google.zxing</groupId><artifactId>*</artifactId></exclusion>
    </exclusions>
</dependency>
```

- Spring Boot 2.x traz o Thymeleaf 3.0.x: force o 3.1.2 no `dependencyManagement`. PDFBox 3.x no projeto é incompatível com o openhtmltopdf 1.0.10.
- O Thymeleaf traz o `slf4j-api` 2.0.7. Sem implementação de SLF4J aparece o aviso `SLF4J: No SLF4J providers were found`, inofensivo. Com um binding SLF4J 1.7 (logback 1.2.x, `slf4j-log4j12`), fixe o `slf4j-api` 1.7.36 no `dependencyManagement` ou migre o binding para a 2.x, senão o log da aplicação some.
- O openhtmltopdf registra linhas INFO (`java.util.logging`) a cada PDF; a biblioteca não muda isso. Para silenciar: `XRLog.listRegisteredLoggers().forEach(l -> XRLog.setLevel(l, Level.WARNING))` ou `XRLog.setLoggingEnabled(false)`.
- `ImpressaoDacteUtil` não guarda estado e pode ser chamado em paralelo; crie um `ImpressaoDacteDTO` por impressão.

## ⚠️ Breaking Change — Reorganização dos packages de schemas JAXB

Os packages de schemas gerados via JAXB foram completamente reorganizados. Se você usa esta biblioteca como dependência, **é necessário atualizar os imports** nos seus projetos.

#### Packages anteriores (removidos)

```
br.com.swconsultoria.cte.schema_100.*          (e todos os sub-packages)
br.com.swconsultoria.cte.schema_400.cte.*
br.com.swconsultoria.cte.schema_400.cteOS.*
br.com.swconsultoria.cte.schema_400.evento.*
br.com.swconsultoria.cte.schema_400.retCte.*
br.com.swconsultoria.cte.schema_400.*.<demais sub-packages>
```

#### Novos packages (flat, sem sub-pastas)

| Package novo | Conteúdo |
|---|---|
| `br.com.swconsultoria.cte.schema_400` | Classes do CT-e, CT-eOS e tipos básicos (83 classes) |
| `br.com.swconsultoria.cte.schema_400_eventos` | Classes dos eventos de CT-e (59 classes) |

#### Como migrar

Substitua todos os imports antigos pelos novos packages. Exemplos:

```java
// ANTES
import br.com.swconsultoria.cte.schema_400.cte.TCTe;
import br.com.swconsultoria.cte.schema_400.cteOS.TCTeOS;
import br.com.swconsultoria.cte.schema_400.evento.evCancCTe.TEvento;
import br.com.swconsultoria.cte.schema_100.cte.TCTe;

// DEPOIS
import br.com.swconsultoria.cte.schema_400.TCTe;
import br.com.swconsultoria.cte.schema_400.TCTeOS;
import br.com.swconsultoria.cte.schema_400_eventos.TEvento;
```

> **Regra geral:** qualquer classe relacionada a **eventos** vai para `schema_400_eventos`; todo o restante vai para `schema_400`.

________________________________________________________________________________________________

# Historico de Versões

## v4.00.15 - 21/03/2026 - Schemas PL. RTC 2026.002 v1.01 (24/08/2026)
- Atualização dos schemas XSD
- Atualizado Cacert

## v4.00.14 - 21/03/2026 - Schemas PL. RTC 2026.001 (02/03/2026)
- Atualização dos schemas XSD para versão 4.00 (novos schemas SEFAZ)
- Suporte à **Reforma Tributária — IBS/CBS**: novo utilitário `IbsCbsUtil` para cálculo e preenchimento automático do grupo `IBSCBS` no CT-e e CT-eOS
- Novos DTOs: `CstDTO`, `ClassificacaoTributariaDTO`, `DocumentoCteEnum`
- Atualizado Cacert e certificados Java

## v4.00.13 - 13/09/2025 - Schemas PL. RTC 1.07
- Atualizado Schema Reforma Tributaria
- Remoçao de classes duplicadas
- Reforacao JAXB

## v4.00.12 - 06/07/2025
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
