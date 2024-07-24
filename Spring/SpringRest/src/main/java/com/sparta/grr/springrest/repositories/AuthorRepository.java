package com.sparta.grr.springrest.repositories;

import com.sparta.grr.springrest.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}