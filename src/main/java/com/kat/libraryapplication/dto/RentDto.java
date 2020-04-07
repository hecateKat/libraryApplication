package com.kat.libraryapplication.dto;

import com.kat.libraryapplication.entity.Book;
import com.kat.libraryapplication.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class RentDto {

    private Book book;
    private User user;
    private LocalDate rentTime;
    private LocalDate returnTime;
}
