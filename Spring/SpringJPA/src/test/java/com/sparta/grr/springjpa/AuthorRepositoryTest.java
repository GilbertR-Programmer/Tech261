package com.sparta.grr.springjpa;

import com.sparta.grr.springjpa.entities.AuthorEntity;
import com.sparta.grr.springjpa.repositories.AuthorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuthorRepositoryTest {

    @Autowired
    AuthorRepository repository;

    @Test
    @DisplayName("check that I get Authors")
    void checkThatICanSeeAllAuthors() {
        int authorsFound = repository.findAll().size();
        Assertions.assertNotEquals(0,authorsFound);
    }

    @Test
    @DisplayName("check that I can add an Author")
    void checkThatICanAddAuthor() {
        AuthorEntity author = new AuthorEntity();
        author.setFullName("Brian");
        repository.save(author);
        AuthorEntity newestAuthor = repository.findAll().getLast();
        Assertions.assertEquals(newestAuthor,author);
    }


}
