# API de Agenda

Este é um projeto de API RESTful desenvolvido com o framework Spring Boot, utilizando H2 como banco de dados em memória (ou persistente) e Spring Data JPA para operações de persistência de dados.

## Funcionalidades

- **Cadastro de usuários e clientes**
- **Gestão de agendas e tarefas**
- **Operações CRUD (Create, Read, Update, Delete)**
- **Banco de dados H2 (em memória ou persistente)**

## Tecnologias Utilizadas

- **Spring Boot**: Framework para criação de APIs RESTful.
- **Spring Data JPA**: Para interação com o banco de dados.
- **H2 Database**: Banco de dados em memória ou persistente.
- **Spring Web**: Para construção da API REST.
- **Spring Boot DevTools**: Para facilitar o desenvolvimento com recarregamento automático.

## Pré-requisitos

Antes de executar este projeto, você precisa ter instalado o seguinte:

- [Java 17]
- [Maven](caso não tenha o Maven configurado, você pode configurar diretamente o Maven no IntelliJ)
- [IDE de sua preferência](https://www.jetbrains.com/idea/) (Recomendamos o IntelliJ IDEA)

- ### Executando a API

Siga os passos abaixo para executar a API localmente:

1. **Clone o repositório**:
2. **Acesse o diretório do projeto**:
3. **Construir o Projeto**:
   Use Maven para compilar o projeto:
4. **Executar a API: Para rodar a aplicação
- ENDPOINTS:
 Abaixo estão os principais endpoints da API:

- GET /clientes
Retorna todos os clientes cadastrados.

- POST /clientes
Cria um novo cliente. Exemplo de body:

- GET /clientes/{id}
Retorna um cliente pelo ID.

- PUT /clientes/{id}
Atualiza as informações de um cliente.

- DELETE /clientes/{id}
Deleta um cliente.





