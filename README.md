# Projeto Questionarion

Esse projeto usa Quarkus -https://quarkus.io/ .

Projeto que serve com API de exemplo para publicar no AWS

## Rodoando o aplicativo no modo de desenvolvimento (_dev mode_)

Para permitir que a aplicação aplique as alterações durante a codificação,
você pode rodar o projeto executando o comando abaixo:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTA:_**  Para a interface de usuaário, por enquanto está disponível o modo de desenvolvimento apenas em http://localhost:8080/q/dev/.

## Empacotando e rodando a aplicação

O pacote do aplicativo pode ser gerado usando o comando:

```shell script
./mvnw package
```

Isso irá gerar o arquivo `quarkus-run.jar` dentro do diretório `target`.

> **NOTA**: Lembre que todas as dependências serão copiadas para o diretório `target/quarkus-app/lib/`

O aplicativo é executável usando o comando `java -jar target/quarkus-app/quarkus-run.jar`

Se você precisar gerar um _über-jar_ (jar com todas as dependências necessárias), execute o seguinte comando:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

O aplicativo empacotado como um _über-jar_ é executável pelo comando `java -jar target/*-runner.jar`.

## Criando um executável navivo

Vocẽ pode criar um executável nativo usando:

```shell script
./mvnw package -Pnative
```

Ou caso você não tenha o GraalVM instalado, você pode rodar o executável nativo construindo um conteiner usando:

```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

E você pode rodar a aplicação nativa usando: `./target/questionario-api-1.0.0-runner`

Para saber mais sobre como construir aplicações nativas, consulte https://quarkus.io/guides/maven-tooling.

## Guias relacionados ao uso das bibliotecas usadas aqui

- RESTEasy JAX-RS ([guide](https://quarkus.io/guides/rest-json)): REST endpoint framework implementing JAX-RS and more

## Codigo gerado

### RESTEasy JAX-RS

Inicie seu serviço RESTful Web Services facilmente nessa 

[guia sobre o assunto (em inglês)](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
