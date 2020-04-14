package com.kat.libraryapplication.service;

import com.kat.libraryapplication.dto.RentDto;
import com.kat.libraryapplication.dto.StorageDto;

import java.util.List;

public interface StorageService {

    List<StorageDto> findAll();

    RentDto findById(Long id) throws Exception;

    RentDto updateRent(Long id, RentDto rentDto);

    void delete (Long id);

    Long addRent (RentDto rentDto);

}
