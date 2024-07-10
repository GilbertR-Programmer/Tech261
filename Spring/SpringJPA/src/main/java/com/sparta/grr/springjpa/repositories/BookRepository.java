package com.sparta.grr.springjpa.repositories;

import com.sparta.grr.springjpa.entities.AuthorEntity;
import com.sparta.grr.springjpa.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

    @Query(value = "select * from library.books where books.title like ?1",nativeQuery = true)
    List<BookEntity> SQLFindBooksByTitle(String title);

    List<BookEntity> findBookEntitiesByTitle(String title);

    @Query(value = "select books.* from library.books join library.authors authors on authors.author_id = books.author_id where authors.full_name like ?1",nativeQuery = true)
    List<BookEntity> SQLFindBooksByAuthorName(String authorName);

    List<BookEntity> findBookEntitiesByAuthor(AuthorEntity author);

    List<BookEntity> findByAuthorId(int id);
}