package com.sparta.grr.mongodemo;

import com.sparta.grr.mongodemo.entities.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.sparta.grr.mongodemo.repositories.MoviesRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@EnableMongoRepositories
class MongoDemoApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void assertMongoDbConnection() {
        // Perform a simple query to check connection
        List<String> collectionNames = mongoTemplate.getDb().listCollectionNames().into(new ArrayList<>());

        // Assert that collection names are retrieved, indicating a successful connection
        assertFalse(collectionNames.isEmpty(), "The MongoDB connection should not return an empty list of collection names.");
    }
}
