package com.sparta.grr.springjpa;

import com.sparta.grr.springjpa.entities.AuthorEntity;
import com.sparta.grr.springjpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication //Meta Annotation
public class SpringJpaApplication {

    private static final Logger logger = Logger.getLogger(SpringJpaApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }
    //bean -> AuthorRepository -> Class / Command Line Runner -> Class / AuthorRepository -> objects of each -> runs runner
    @Bean //Bean is basically an object spring will create of one method
    public CommandLineRunner runner(AuthorRepository authors){
        return args -> {
            logger.info("Hello From command line runner");
            logger.info(authors.findById(2).orElseThrow().toString());
            logger.info(authors.findById(3).orElseThrow().toString());

            AuthorEntity author = new AuthorEntity();
            author.setFullName("Tony");
            authors.save(author);
            logger.info("Added" + author);
            authors.deleteById(1);
            AuthorEntity dom = authors.findById(2).orElseThrow();
            dom.setFullName("Dominique");
            authors.save(dom);
        };
    }
}
