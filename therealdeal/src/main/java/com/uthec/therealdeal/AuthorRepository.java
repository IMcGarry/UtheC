package com.uthec.therealdeal;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Authors, Integer> {
    List<Authors> findByName(String name);
    List<Authors> findByID(int id);
    List<Authors> findByAlias(String alias);
}
