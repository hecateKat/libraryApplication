package com.kat.libraryapplication.dto;

import com.kat.libraryapplication.entity.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StorageDto {

    private Book book;
    private int baseAmount;
    private int currentAmount;

}
