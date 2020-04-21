package com.kat.libraryapplication.mapper;

import com.kat.libraryapplication.dto.RentDto;
import com.kat.libraryapplication.entity.Rent;

public class RentMapper {

    public static RentDto mapRentToRentDto (Rent rent){

        RentDto rentDto = new RentDto();

        if (rent.getId() != null){
            rentDto.setBook(rent.getBook());
            rentDto.setRentTime(rent.getRentTime());
            rentDto.setReturnTime(rent.getReturnTime());
            rentDto.setUser(rent.getUser());
        }

        return rentDto;
    }

    public static Rent mapRentDtoToRent ( Rent rent, RentDto rentDto){
        rent.setBook(rentDto.getBook());
        rent.setRentTime(rentDto.getRentTime());
        rent.setReturnTime(rentDto.getReturnTime());
        rent.setUser(rentDto.getUser());

        return rent;
    }
}
