package com.kat.libraryapplication.mapper;

import com.kat.libraryapplication.dto.BookDto;
import com.kat.libraryapplication.entity.Book;

public class BookMapper {

    public static BookDto mapBookYoBookDto (Book book){

        BookDto bookDto = new BookDto();

        if(book.getId() != null){
            bookDto.setTitle(book.getTitle());
            bookDto.setAuthors(book.getAuthors());
            bookDto.setPageNumber(book.getPageNumber());
            bookDto.setPublisher(book.getPublisher());
        }
        return bookDto;
    }

    public static Book mapBookDtoToBook(Book book, BookDto bookDto){

        book.setTitle(bookDto.getTitle());
        book.setAuthors(bookDto.getAuthors());
        book.setPageNumber(bookDto.getPageNumber());
        book.setPublisher(bookDto.getPublisher());

        return book;
    }
}
