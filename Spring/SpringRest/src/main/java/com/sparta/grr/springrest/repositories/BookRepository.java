package com.sparta.grr.springrest.repositories;

import com.sparta.grr.springrest.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}