package com.kat.libraryapplication.dto;

import com.kat.libraryapplication.entity.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AuthorDto {

    private String name;
    private String surname;
    private List<Book> books;

}
