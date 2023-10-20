package com.uthec.therealdeal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface BooksRepository extends JpaRepository {
    List<Books> findByTitle(String title);
    List<Books> findByID(int id);
    List<Books> findByGenre(int genreId);
    List<Books> findByAuthor(int id);

}
