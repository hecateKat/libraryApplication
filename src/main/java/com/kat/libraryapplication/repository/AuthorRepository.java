package com.kat.libraryapplication.repository;

import com.kat.libraryapplication.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
