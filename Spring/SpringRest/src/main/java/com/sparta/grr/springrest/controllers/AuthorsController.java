package com.sparta.grr.springrest.controllers;


import com.sparta.grr.springrest.controllers.exceptions.ResourceNotFoundException;
import com.sparta.grr.springrest.entities.Author;
import com.sparta.grr.springrest.repositories.AuthorRepository;
import com.sparta.grr.springrest.repositories.BookRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/authors")
public class AuthorsController {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public AuthorsController(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }

    @GetMapping("/hateoas/authors")
    public CollectionModel<EntityModel<Author>> getAuthorsHateoas() {
        List<EntityModel<Author>> authors = authorRepository.findAll()
                .stream()
                .map(
                        author ->
                        {
                            List<Link> bookLinks =
                                    author.getBooks()
                                            .stream()
                                            .map(
                                                    book -> WebMvcLinkBuilder.linkTo(
                                                            methodOn(BooksController.class).getBookById(book.getId())).withRel(book.getTitle()))
                                            .collect( Collectors.toList());
                            Link selfLink = WebMvcLinkBuilder.linkTo(
                                    methodOn(AuthorsController.class).getAuthorById(author.getId())).withSelfRel();
                            Link relLink = WebMvcLinkBuilder.linkTo(methodOn(AuthorsController.class).getAuthors()).withRel("author");
                            return EntityModel.of(author, selfLink, relLink).add(bookLinks);
                        })
                .collect(Collectors.toList());
        return CollectionModel.of(
                authors,
                WebMvcLinkBuilder.linkTo(methodOn(AuthorsController.class).getAuthorsHateoas()).withSelfRel());
    }

    @GetMapping("/hateoas/authors/{id}")
    public ResponseEntity<EntityModel<Author>> getAuthorHateoas(@PathVariable Integer id) {
        Optional<Author> optionalAuthor = authorRepository.findById(id);
        if (optionalAuthor.isEmpty()) {
            throw new ResourceNotFoundException("no author with id " + id);
        }
        Author author = optionalAuthor.get();
        List<Link> bookLinks = author.getBooks()
                .stream()
                .map(
                        book -> WebMvcLinkBuilder.linkTo(
                            methodOn(BooksController.class).getBookById(book.getId())).withRel(book.getTitle()
                        )
                )
                .collect( Collectors.toList());
        Link selfLink = WebMvcLinkBuilder.linkTo(
                methodOn(AuthorsController.class).getAuthorById(author.getId())
            ).withSelfRel();
        Link relLink = WebMvcLinkBuilder.linkTo(methodOn(AuthorsController.class).getAuthors()).withRel("authors");

        return new ResponseEntity<>(EntityModel.of(author, selfLink, relLink).add(bookLinks), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable int id){
        Optional<Author> foundAuthor = authorRepository.findById(id);
        return foundAuthor.map(author -> new ResponseEntity<>(author, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Author> addAuthor(@RequestBody @Valid Author author, HttpServletRequest request){
        authorRepository.save(author);
        URI location = URI.create(request.getRequestURL().toString()+"/"+author.getId());
        return ResponseEntity.created(location).body(author);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable Integer id, @RequestBody Author author){
        // Check if id is the same as the id of the json we're putting int the body- if not, return bad request
        if(!id.equals(author.getId())){
            return ResponseEntity.badRequest().body(null);
        }
        // Find the author
        Optional<Author> foundAuthor = authorRepository.findById(id);
        // If the author is not found, return not found
        if(foundAuthor.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        // Replace existing author in the database with putted author
        authorRepository.save(author);

        // Return No Content
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Author> deleteAuthor(@PathVariable Integer id){
        Optional<Author> foundAuthor = authorRepository.findById(id);
        if(foundAuthor.isEmpty()){
            return ResponseEntity.notFound().build();
        } else if(bookRepository.findAll().stream().anyMatch(book ->  id.equals(book.getAuthor().getId()))){
            return ResponseEntity.badRequest().body(null);
        } else{
            authorRepository.deleteById(id);
            return ResponseEntity.ok(null);
        }
    }
}
