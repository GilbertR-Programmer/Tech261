package com.sparta.grr.springjpa.repositories;

import com.sparta.grr.springjpa.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

    //native query, dependent on the sql used
    @Query(value = "select * from library.authors where authors.full_name like ?1",nativeQuery = true)
    Optional<AuthorEntity> findAuthorEntityByName(String name);

    //JPQL
//    @Query(value = "select author from AuthorEntity where author.f", nativeQuery = false)
//    Optional<AuthorEntity> findAuthorEntityByFullName(String name);

    //Spring's expression Language SPEL
    //if you name properly it writes jpql for you
    List<AuthorEntity> findAuthorEntitiesByFullNameContainsIgnoreCase(String partialName);

}
