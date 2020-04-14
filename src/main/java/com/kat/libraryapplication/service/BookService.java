package com.kat.libraryapplication.service;

import com.kat.libraryapplication.dto.BookDto;

import java.util.List;

public interface BookService {

    List<BookDto> findAll();

    BookDto findById(Long id) throws Exception;

    BookDto updateBook (Long id, BookDto bookDto);

    void delete (Long id);

    Long addBook (BookDto bookDto);

}
