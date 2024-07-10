package com.sparta.grr.springjpa;

import com.sparta.grr.springjpa.entities.AuthorEntity;
import com.sparta.grr.springjpa.entities.BookEntity;
import com.sparta.grr.springjpa.repositories.AuthorRepository;
import com.sparta.grr.springjpa.repositories.BookRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    @Test
    @Transactional
    void checkSQLWeCanGetAllBooksByTitle() {
        List<BookEntity> books = bookRepository.SQLFindBooksByTitle("Bobbingtons journey");
        System.out.println(books);
    }

    @Test
    @Transactional
    void checkWeCanGetAllBooksByTitle() {
        List<BookEntity> books = bookRepository.findBookEntitiesByTitle("Bobbingtons journey");
        System.out.println(books);
    }

    @Test
    @Transactional
    void checkSQLWeCanGetAllBooksByAuthorName() {
        List<BookEntity> books = bookRepository.SQLFindBooksByAuthorName("Tony");
        System.out.println(books);
    }

    @Test
    @Transactional
    void checkWeCanGetAllBooksByAuthor() {
        Optional<AuthorEntity> tony = authorRepository.findById(6);
        List<BookEntity> books = bookRepository.findBookEntitiesByAuthor(tony.get());
        System.out.println(books);
    }

    @Test
    @Transactional
    void checkWeCanInsertANewBook() {

    }


}
