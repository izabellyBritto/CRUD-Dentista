# 🦷 Sistema Odontológico

Sistema web para gerenciamento de dentistas e especialidades, desenvolvido em Java com Spring Boot, Thymeleaf e PostgreSQL.

## Funcionalidades

- Cadastro, edição e exclusão de dentistas
- Cadastro, edição e exclusão de especialidades
- Listagem de dentistas e especialidades
- Validação de integridade referencial (não permite excluir especialidade vinculada)
- Interface moderna e responsiva

---

## Telas do Sistema

### 1. Tela Inicial

![Tela Inicial](https://github.com/user-attachments/assets/b39de727-dca6-4d9a-a3c0-96f49d0dc7c5)

---
### 2. Listagem de Dentistas

![Lista de Dentistas](https://github.com/user-attachments/assets/80545b95-e366-46f7-bbdb-4187b11331c9)

---

### 3. Cadastro de Dentista

![Cadastro de Dentista](https://github.com/user-attachments/assets/9384bf9f-5778-41da-916c-d95087bec789)


---

### 4. Editar Dentista

![Editar Dentista](https://github.com/user-attachments/assets/706ea622-0386-435c-b70e-3379eeffa25e)

---

### 5. Listagem de Especialidades

![Lista de Especialidades](https://github.com/user-attachments/assets/20ad8253-bbf2-4e2c-8e66-d871d067e515)

---

### 6. Cadastroo de Especialidade

![Cadastro de Especialidade](https://github.com/user-attachments/assets/758dae3a-e469-4b59-9446-7d836a6083f1)

---

### 7. Editar Listagem

![Editar Listagem](https://github.com/user-attachments/assets/c32df35e-96ed-4fd0-9778-6e535d74c7e4)

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Thymeleaf
- PostgreSQL
- HTML5, CSS3

---

## Como rodar o projeto

1. Clone o repositório
2. Configure o banco de dados PostgreSQL conforme o arquivo `application.properties`
3. Execute o projeto com `mvn spring-boot:run` ou pela sua IDE

---

## Observações

- O sistema impede a exclusão de especialidades que estejam vinculadas a dentistas, exibindo uma mensagem.
- O layout é responsivo e adaptado para diferentes tamanhos de tela.
