package com.sparta.grr.springjpa.service;

import com.sparta.grr.springjpa.entities.AuthorEntity;
import com.sparta.grr.springjpa.entities.BookEntity;
import com.sparta.grr.springjpa.repositories.AuthorRepository;
import com.sparta.grr.springjpa.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public LibraryService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    //return all authors with only one book
    public List<AuthorEntity> getAllAuthorsWithOneBook() {
        List<AuthorEntity> authors = authorRepository.findAll();
        List<BookEntity> books = bookRepository.findAll();
        return authors.stream()
                .filter(author -> 1 == books.stream()
                        .filter(book -> book.getAuthor().equals(author))
                        .count())
                .toList();
    }

}
