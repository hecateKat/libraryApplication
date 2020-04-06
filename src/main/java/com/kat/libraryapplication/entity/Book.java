package com.kat.libraryapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private int pageNumber;
    private String publisher;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Author> authors;


}
