package com.sparta.grr.springrest.controllers;

import com.sparta.grr.springrest.controllers.exceptions.ResourceNotFoundException;
import com.sparta.grr.springrest.entities.Book;
import com.sparta.grr.springrest.entities.Book;
import com.sparta.grr.springrest.repositories.AuthorRepository;
import com.sparta.grr.springrest.repositories.BookRepository;
import com.sparta.grr.springrest.repositories.BookRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BookRepository bookRepository;


    @Autowired
    public BooksController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;

    }

    @GetMapping
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        Optional<Book> foundBook = bookRepository.findById(id);
        return foundBook.map(book -> new ResponseEntity<>(book, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book, HttpServletRequest request){
        if (book.getAuthor() == null) {
            throw new ResourceNotFoundException("Books need an author");
        }
        bookRepository.save(book);
        URI location = URI.create(request.getRequestURL().toString()+"/"+book.getId());
        return ResponseEntity.created(location).body(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book book){
        // Check if id is the same as the id of the json we're putting int the body- if not, return bad request
        if(!id.equals(book.getId())){
            return ResponseEntity.badRequest().body(null);
        }
        // Find the book
        Optional<Book> foundBook = bookRepository.findById(id);
        // If the book is not found, return not found
        if(foundBook.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        // Replace existing book in the database with putted book
        bookRepository.save(book);

        // Return No Content
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Integer id){
        Optional<Book> foundBook = bookRepository.findById(id);
        if(foundBook.isEmpty()){
            return ResponseEntity.notFound().build();
        } else{
            bookRepository.deleteById(id);
            return ResponseEntity.ok(null);
        }
    }
}
