package com.sparta.grr.springweb.controllers;

import com.sparta.grr.springweb.entities.Author;
import com.sparta.grr.springweb.repositories.AuthorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/authors")
public class AuthorsController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorsController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public String authors(@RequestParam(required = false, defaultValue = "World") String message, Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        model.addAttribute("message", message);
        return "authors/list";
    }

    @GetMapping("/create")
    public String createAuthorForm(Model model) {
        model.addAttribute("author", new Author());
        return "authors/create";
    }

    @PostMapping("/create")
    public String createAuthor(@Valid @ModelAttribute("author") Author author, Errors errors) {
        if(errors.hasErrors()) {
            return "authors/create";
        }
        authorRepository.save(author);
        return "redirect:/authors";
    }

    @GetMapping("/{id}")
    public String author(Model model, @PathVariable Integer id) {
        model.addAttribute("author", authorRepository.findById(id).orElseThrow());
        return "authors/author";
    }

    @PutMapping("/{id}")
    public String updateAuthor(@PathVariable Integer id, @RequestBody Author author) {
        Author updatedAuthor = authorRepository.findById(id)
                .map(existingAuthor -> {
                    existingAuthor.setFullName(author.getFullName());
                    return authorRepository.save(existingAuthor);
                })
                .orElseGet(() -> {
                    author.setId(id);
                    return authorRepository.save(author);
                });

        return "redirect:/authors/" + updatedAuthor.getId();
    }


}
