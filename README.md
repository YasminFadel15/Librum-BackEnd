# Librum Backend

Este é o **backend em Java Spring Boot** da aplicação **Librum**, um app mobile para gerenciamento de livros favoritos.  
O frontend mobile está disponível neste repositório: [Librum Mobile](https://github.com/phdguigui/Librum)

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL (Neon)
- Maven

## Configuração do arquivo `.env`

Para rodar a aplicação é necessario criar um arquivo `.env` na raiz do projeto.

### Passos para criar o `.env`:

1. Na raiz do seu projeto (onde está o `pom.xml`), crie um arquivo chamado `.env`

2. Insira as variáveis de ambiente para o banco de dados:

   ```env
   DB_URL=jdbc:postgresql://ep-xxxxx.neon.tech/seubanco
   DB_USERNAME=seu_usuario
   DB_PASSWORD=sua_senha

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