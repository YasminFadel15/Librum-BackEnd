package com.example.librumbackend.config;

import com.example.librumbackend.entity.BookEntity;
import com.example.librumbackend.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseInitializer {

    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.saveAll(List.of(
                        new BookEntity(null, "To Kill a Mockingbird", "Harper Lee", true, "Ficção"),
                        new BookEntity(null, "Dom Casmurro", "Machado de Assis", false, "Romance"),
                        new BookEntity(null, "O Hobbit", "J.R.R. Tolkien", true, "Fantasia"),
                        new BookEntity(null, "Cem Anos de Solidão", "Gabriel García Márquez", false, "Romance"),
                        new BookEntity(null, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", false, "Fantasia"),
                        new BookEntity(null, "Crime e Castigo", "Fiódor Dostoiévski", false, "Ficção policial"),
                        new BookEntity(null, "Frankenstein", "Mary Shelley", false, "Terror"),
                        new BookEntity(null, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", false, "Fantasia"),
                        new BookEntity(null, "Neuromancer", "William Gibson", false, "Cyberpunk"),
                        new BookEntity(null, "Senhor dos Anéis", "J.R.R. Tolkien", false, "Fantasia"),
                        new BookEntity(null, "Drácula", "Bram Stoker", false, "Terror"),
                        new BookEntity(null, "Orgulho e Preconceito", "Jane Austen", false, "Romance"),
                        new BookEntity(null, "Harry Potter e a Câmara Secreta", "J.K. Rowling", false, "Fantasia"),
                        new BookEntity(null, "As Crônicas de Nárnia", "C.S. Lewis", false, "Fantasia"),
                        new BookEntity(null, "O Código Da Vinci", "Dan Brown", false, "Mistério"),
                        new BookEntity(null, "It: A Coisa", "Stephen King", false, "Terror"),
                        new BookEntity(null, "Moby Dick", "Herman Melville", true, "Aventura"),
                        new BookEntity(null, "O Nome do Vento", "Patrick Rothfuss", true, "Fantasia"),
                        new BookEntity(null, "O Conde de Monte Cristo", "Alexandre Dumas", true, "Aventura"),
                        new BookEntity(null, "Os Miseráveis", "Victor Hugo", false, "Romance")
                ));
            }
        };
    }
}

