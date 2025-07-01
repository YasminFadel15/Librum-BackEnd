package com.example.librumbackend.repository;

import com.example.librumbackend.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {}
