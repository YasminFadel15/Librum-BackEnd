package com.example.librumbackend.controller;

import com.example.librumbackend.entity.BookEntity;
import com.example.librumbackend.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "*")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<BookEntity> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/favorites")
    public List<BookEntity> getFavoriteBooks() {
        return service.getFavoriteBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookEntity> getBookById(@PathVariable Integer id) {
        return service.getBookById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}/toggle-favorite")
    public ResponseEntity<Void> toggleFavoriteStatus(@PathVariable Integer id) {
        return service.toggleFavoriteStatus(id)
                ? ResponseEntity.ok().build()
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Integer id) {
        return service.deleteBook(id)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<BookEntity> addBook(@RequestBody BookEntity book) {
        BookEntity saved = service.addBook(book);
        return ResponseEntity.ok(saved);
    }

    @PutMapping
    public ResponseEntity<BookEntity> updateBook(@RequestBody BookEntity book) {
        return service.updateBook(book)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
