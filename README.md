# Java-CTe[![Build Status](https://travis-ci.org/Samuel-Oliveira/Java_CTe.svg?branch=master)](https://travis-ci.org/Samuel-Oliveira/Java_CTe)
Projeto Para implementação do Java-CTe Utilizando JAXB.

## Gostou do Projeto? Dê sua colaboração: [![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=TX9K693QQYA6W)

Para Iniciar : 
- Baixe o java-cte-3.00.2.jar (https://github.com/Samuel-Oliveira/Java_CTe/raw/master/java-cte-3.00.2.jar) e o adicione às bibliotecas de Seu Projeto.
- Baixe o Schemas.rar (https://github.com/Samuel-Oliveira/Java_CTe/raw/master/Schemas.rar) e extraia na sua Máquina.

- Maven :
```
	    <repository>
			<name>Repositorio Autocom</name>
			<id>Release</id>
			<url>http://www.autocomsistemas.com.br:8081/nexus/content/repositories/autocom/</url>
		</repository>
		<dependency>
			<groupId>br.com.samuelweb</groupId>
			<artifactId>java-cte</artifactId>
			<version>3.00.2</version>
		</dependency>
```

Veja a Wiki https://github.com/Samuel-Oliveira/Java_CTe/wiki, para ter um Tutorial Completo.

________________________________________________________________________________________________

# Historico de Versões

## v3.00.2 - 07-12-2017
- Atualizado Cacert
- Corrigido Erro Namespace PR

## v3.00.1 - 07-11-2017
- Atualizado Cacert
- Corrigido conflito com Nfe
- Atualizado para rodar somente com Versão 3.00
- Removido MDFe Para Outro Projeto
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

Outras Duvidas Entrar em Contato samuk.exe@hotmail.com
