# Java_CTe

Biblioteca Java para consumo dos web services do CT-e (SEFAZ), com tipos JAXB gerados a partir de `schemas/`, assinatura, validação e envio.

## Ambiente

- Java 8 (`java.version` 1.8 no `pom.xml`). Mantenha o código compatível com Java 8.
- Maven, sem wrapper. Biblioteca publicada como jar (`java-cte`).
- `README.md`: uso, dependência Maven, impressão do DACTE e histórico. `CHANGELOG.md`: versões. `wsdl/`: contratos dos serviços.
- Impressão do DACTE no pacote `impressao` (Thymeleaf, HTML e PDF pelo openhtmltopdf, zxing), com templates em `src/main/resources/dacte/` e logo em `img/cte.png`. Veio do DACTE Jasper do Java_Danfe (descontinuado) e segue o padrão do `impressao.v2` do Java_NFe. As dependências de impressão são `compile` (transitivas), nunca `provided`.

## Build e testes

```
mvn -q test-compile --no-transfer-progress
mvn test --no-transfer-progress
mvn test --no-transfer-progress "-Dtest=IbsCbsUtilTest"
```

- A CI roda `mvn clean compile test -B` (`release-maven.yml`) e `mvn -B package -Passembly` (`release.yml`).
- `mvn test` roda `util/IbsCbsUtilTest`, `util/WebServiceCteUtilTest`, `impressao/ImpressaoDacteUtilTest` e `impressao/FormatadorDacteTest` (JUnit 5, surefire sem exclusão). O `WebServiceCteUtilTest` usa `AmbienteEnum.PRODUCAO` só para montar a configuração, sem chamar serviço. Os de impressão geram o DACTE dos CT-e fictícios de `src/test/resources/dacte/`, sem rede nem certificado.
- O `.gitignore` ignora `*.xml`; só os XMLs de `src/test/resources/dacte/` têm exceção. Um XML de teste em outra pasta precisa de exceção própria (ou de `git add -f`).
- Os `Teste*.java` da raiz de `src/test/.../cte/` são programas com `main`, sem `@Test`. Exceto `TesteValida` (validação local de schema), falam com a SEFAZ (GO) usando certificado real. O padrão `Test*` do surefire casa com eles, mas sem `@Test` o JUnit não os executa. `TesteConfig` é apenas apoio, com certificado e senha de exemplo.

## Segurança dos programas com `main`

- Nunca execute uma classe `Teste*` (`main`) sem pedido explícito, e confira o `AmbienteEnum` antes.
- Aponta para PRODUCAO: `TesteDistDfeCte`.
- Os demais (`TesteEnvioCte`, `TesteEnvioCteIbsCbs`, `TesteEnvioCteSimplifiado`, `TesteCancelaCte`, `TesteConsultaCte`, `TesteStatusCte`, `TestePrestacaoDesacordoCte`, `TesteValida`) usam HOMOLOGACAO.

## Branches

- Integração: `develop`. Produção: `master`.
- Releases em git-flow (`release/4.00.NN` para `master`), além de PRs de colaboradores. Trabalho novo nasce de `develop`; confira o padrão de nome nos merges recentes (`git log --oneline --merges -30 origin/develop`).
