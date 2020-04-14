package com.kat.libraryapplication.service;

import com.kat.libraryapplication.dto.BookDto;
import com.kat.libraryapplication.dto.RentDto;

import java.util.List;

public interface RentService {

    List<RentDto> findAll();

    BookDto findById(Long id) throws Exception;

    BookDto updateRent (Long id, RentDto rentDto);

    void delete (Long id);

    Long addRent (RentDto rentDto);

}
