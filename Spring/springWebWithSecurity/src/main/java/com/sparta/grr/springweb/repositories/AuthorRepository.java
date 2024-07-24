package com.sparta.grr.springweb.repositories;

import com.sparta.grr.springweb.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}