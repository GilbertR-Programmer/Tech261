package com.sparta.grr.springjpa.repositories;

import com.sparta.grr.springjpa.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {
}