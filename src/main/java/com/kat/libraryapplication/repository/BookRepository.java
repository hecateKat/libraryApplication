package com.kat.libraryapplication.repository;

import com.kat.libraryapplication.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
