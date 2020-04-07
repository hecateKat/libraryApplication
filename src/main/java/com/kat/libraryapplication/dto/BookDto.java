package com.kat.libraryapplication.dto;

import com.kat.libraryapplication.entity.Author;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class BookDto {

    private String title;
    private int pageNumber;
    private String publisher;
    private List<Author> authors;

}
