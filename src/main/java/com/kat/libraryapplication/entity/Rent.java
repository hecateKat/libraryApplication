package com.kat.libraryapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Book book;

    @OneToOne
    private User user;
    private LocalDate rentTime;
    private LocalDate returnTime;

}
