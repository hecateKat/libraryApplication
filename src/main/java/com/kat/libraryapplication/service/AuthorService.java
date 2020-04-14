package com.kat.libraryapplication.service;

import com.kat.libraryapplication.dto.AuthorDto;

import java.util.List;

public interface AuthorService {

    List<AuthorDto> findAll();

    AuthorDto findById(Long id) throws Exception;

    AuthorDto updateAuthor(Long id, AuthorDto authorDto);

    void delete(Long id);

    Long addAuthor(AuthorDto authorDto);

}