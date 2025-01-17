# Crud em Java com Spring Boot - FACULDADE UNYLEYA | PROVA PÓS GRADUAÇÃO

Este projeto é um crud desenvolvido em Java utilizando o framework **Spring Boot**. A aplicação utiliza um banco de dados em memória (**H2**) e conta com segurança implementada através do **Spring Security**. O **Hibernate** e o **JPA** são utilizados para gerenciar a persistência de dados.

## Funcionalidades

- Listar todos os cidadãos, listar um cidadão escolhido, cadastrar, deletar e alterar cidadãos.
- Segurança com autenticação por formulário (Spring Security).
- Banco de dados H2 acessível via console.
- Configuração para inicialização rápida e fácil.

## Tecnologias e Dependências Utilizadas

- **Java 17** (ou versão superior)
- **Spring Boot**
  - Spring Data JPA
  - Spring Security
- **H2 Database**
- **Hibernate**

## Como Executar o Projeto

1. Certifique-se de que você tenha o **Java** e o **Maven** instalados na sua máquina.
2. Clone o repositório:
   ```bash
   git clone https://github.com/SamuelRicardos/prova-java.git

3. Para acessar o banco de dados H2, abra o navegador e vá para:  
   [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

4. Faça login no H2 utilizando as credenciais configuradas no arquivo `application.properties`:  
   - **Usuário:** `samuel`  
   - **Senha:** `1234`  

5. No console H2:  
   - Selecione a tabela `CIDADAO`, que foi criada automaticamente pelo Hibernate, no menu à esquerda.  
   - O código SQL `SELECT * FROM CIDADAO` será exibido automaticamente no campo de consulta.

6. Clique no botão **RUN** para executar a consulta e visualizar os dados.  
   - Inicialmente, a tabela estará vazia.  
   - Utilize os endpoints da API no Postman para adicionar novos registros.  
   - Após inserir dados, clique novamente em **RUN** no console H2 para atualizar e visualizar as informações.


