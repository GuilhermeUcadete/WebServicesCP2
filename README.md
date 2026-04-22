# Integrantes

Guilherme Ulacco RM558418 <br>
Enzo Motta RM555372 <br>
Eduardo da Silva RM554804 <br>
Estevam Melo RM555124 <br>
Matheus Hostim RM556517 <br>

# Checkpoint2 – Web Service de Pedidos (Java + Spring Boot)

## Descrição do Projeto

O projeto **Checkpoint2** é um **Web Service desenvolvido em Java utilizando Spring Boot**, cujo objetivo é disponibilizar uma API REST para o gerenciamento de pedidos (*orders*). A aplicação permite criar, consultar, atualizar e remover pedidos, aplicando validações e organização em camadas.

O sistema segue boas práticas de desenvolvimento backend, utilizando **Spring Data JPA**, **validações com Jakarta Validation** e uma arquitetura bem definida.

---

## Objetivo

Os principais objetivos do projeto são:

- Desenvolver um Web Service REST em **Java**
- Aplicar conceitos de **Spring Boot**
- Implementar operações de **CRUD**
- Utilizar **JPA/Hibernate** para persistência
- Aplicar **validações** nos dados
- Organizar o código em camadas (Controller, Service, Repository, Model)

---

## Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Jakarta Validation**
- **Maven**
- **HTTP / REST**
- **JSON**

---

## Prints do Projeto

<img width="444" height="315" alt="image" src="https://github.com/user-attachments/assets/47b54420-3e22-4e47-864a-5c82508011f8" />

<img width="551" height="190" alt="image" src="https://github.com/user-attachments/assets/bb60a68a-6bde-4ace-9269-658fd1bcd615" />

---

## Descrição das Camadas

### Controller
Responsável por receber as requisições HTTP e expor os endpoints da API.  
A comunicação com o cliente ocorre por meio de requisições REST.

### Service
Contém a **lógica de negócio**, intermediando as operações entre o controller e o repository.  
É responsável por validar fluxos e tratar exceções.

### Repository
Responsável pela comunicação com o banco de dados, utilizando **Spring Data JPA** para realizar operações de persistência.

### Model
Representa a entidade **Pedido (Order)**, mapeada como tabela no banco de dados, incluindo validações e regras de persistência automática.

---
