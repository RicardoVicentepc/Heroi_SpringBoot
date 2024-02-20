# Projeto CRUD em Spring Boot utilizando apenas GetMapping

Este projeto é uma aplicação simples de CRUD (Create, Read, Update, Delete) desenvolvida em Spring Boot, demonstrando a funcionalidade básica de consulta (Read) por meio de operações `GetMapping` apenas. Foi construído com propósitos didáticos para entender os princípios fundamentais do Spring Boot e suas capacidades de mapeamento de URLs.

## Funcionalidades

O projeto possui as seguintes funcionalidades básicas:

- **Listagem de Entidades**: Os recursos podem ser consultados através dos endpoints `GetMapping`.
- **Consulta de uma Entidade específica**: É possível consultar uma entidade específica com base em um identificador único.
- **Não utiliza outros métodos HTTP**: Por questões didáticas e de simplicidade, apenas operações de leitura (GET) são utilizadas.

## Tecnologias Utilizadas

- Spring Boot
- Java
- Maven

## Estrutura do Projeto

O projeto segue uma estrutura básica de aplicativos Spring Boot:

- **`src/`**: Contém todo o código fonte da aplicação.
  - **`src/main/java/`**: Contém os pacotes Java da aplicação.
  - **`src/main/resources/`**: Contém os arquivos de configuração e recursos estáticos.
- **`src/test/`**: Contém os testes unitários e de integração.

## Endpoints Disponíveis

- **`GET /entidades`**: Retorna todas as entidades cadastradas.
- **`GET /entidades/{id}`**: Retorna os detalhes de uma entidade específica com base no ID fornecido.

## Como Executar

Para executar este projeto localmente, siga as etapas abaixo:

1. Certifique-se de ter o Java JDK e o Maven instalados em sua máquina.
2. Clone este repositório em seu ambiente local.
3. Navegue até o diretório raiz do projeto.
4. Execute o seguinte comando no terminal:

```bash
mvn spring-boot:run
