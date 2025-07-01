package com.example.librumbackend.service;

import com.example.librumbackend.entity.BookEntity;
import com.example.librumbackend.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<BookEntity> getAllBooks() {
        return repo.findAll();
    }

    public List<BookEntity> getFavoriteBooks() {
        return repo.findAll().stream()
                .filter(BookEntity::getFavorite)
                .toList();
    }

    public Optional<BookEntity> getBookById(Integer id) {
        return repo.findById(id);
    }

    public boolean toggleFavoriteStatus(Integer id) {
        Optional<BookEntity> bookOpt = repo.findById(id);
        if (bookOpt.isPresent()) {
            BookEntity book = bookOpt.get();
            book.setFavorite(!book.getFavorite());
            repo.save(book);
            return true;
        }
        return false;
    }

    public boolean deleteBook(Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    public BookEntity addBook(BookEntity book) {
        book.setId(null); // garante autoincremento
        return repo.save(book);
    }

    public Optional<BookEntity> updateBook(BookEntity book) {
        if (repo.existsById(book.getId())) {
            return Optional.of(repo.save(book));
        }
        return Optional.empty();
    }
}
