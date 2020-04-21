package com.kat.libraryapplication.mapper;

import com.kat.libraryapplication.dto.AuthorDto;
import com.kat.libraryapplication.entity.Author;

public class AuthorMapper {

    public static AuthorDto mapAuthorToAuthorDto (Author author) {

        AuthorDto authorDto = new AuthorDto();

        if (author.getId() != null) {
            authorDto.setName(author.getName());
            authorDto.setSurname(author.getSurname());
            authorDto.setBooks(author.getBooks());
        }

        return authorDto;
    }

    public static Author mapAuthorDtoToAuthor (Author author, AuthorDto authorDto){

        author.setName(authorDto.getName());
        author.setSurname(authorDto.getSurname());
        author.setBooks(authorDto.getBooks());

        return author;
    }
}