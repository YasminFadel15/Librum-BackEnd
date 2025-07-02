# Librum Backend

Este é o **backend em Java Spring Boot** da aplicação **Librum**, um app mobile para gerenciamento de livros favoritos.  
O frontend mobile está disponível neste repositório: [Librum Mobile](https://github.com/phdguigui/Librum)

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL (Neon)
- Maven

## Endpoints disponíveis

Todos os endpoints aceitam **requisições CORS** do app mobile.

### Livros

| Método | Endpoint                         | Descrição                                 |
|--------|----------------------------------|-------------------------------------------|
| GET    | `/books`                         | Retorna todos os livros                   |
| GET    | `/books/favorites`               | Retorna apenas os livros favoritos        |
| GET    | `/books/{id}`                    | Retorna um livro pelo ID                  |
| POST   | `/books`                         | Adiciona um novo livro                    |
| PUT    | `/books`                         | Atualiza os dados de um livro existente   |
| PUT    | `/books/{id}/toggle-favorite`    | Alterna o status de favorito do livro     |
| DELETE | `/books/{id}`                    | Deleta um livro pelo ID                   |

## Executando localmente

1. Clone o repositório
2. Configure o banco PostgreSQL (já usando Neon, com SSL).
3. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
4. A API estará disponível em http://localhost:8080