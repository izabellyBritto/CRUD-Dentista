# Sistema de Cadastro de Dentistas

Este é um sistema de cadastro de dentistas e especialidades desenvolvido em Spring Boot.

## Pré-requisitos

- Java 17 ou superior
- Maven
- PostgreSQL

## Configuração do Banco de Dados

1. Crie um banco de dados vazio no PostgreSQL com o nome `dentista`:
   ```sql
   CREATE DATABASE dentista;
   ```

2. Configure as credenciais do banco de dados no arquivo `application.properties`:
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/dentista?useTimezone=true&serverTimezone=America/Fortaleza&user=postgres&password=postdba
   ```

## Executando o Projeto

1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
   cd dentista
   ```

2. Execute o projeto usando Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

O sistema estará disponível em `http://localhost:8080/dentista`

## Funcionalidades

- Cadastro, edição e exclusão de dentistas
- Cadastro, edição e exclusão de especialidades
- Relacionamento entre dentistas e especialidades

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- Thymeleaf
- PostgreSQL
- Lombok
- CSS moderno e responsivo 