package com.sparta.grr.springjpa;

import com.sparta.grr.springjpa.entities.AuthorEntity;
import com.sparta.grr.springjpa.entities.BookEntity;
import com.sparta.grr.springjpa.repositories.AuthorRepository;
import com.sparta.grr.springjpa.repositories.BookRepository;
import com.sparta.grr.springjpa.service.LibraryService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class LibraryServiceTest {

    @Autowired
    LibraryService libraryService;

    @Test
    @Transactional
    void checkWeCanGetAllOneBookAuthors() {
        List<AuthorEntity> oneBookAuthors = libraryService.getAllAuthorsWithOneBook();
        System.out.println(oneBookAuthors);
    }
}
