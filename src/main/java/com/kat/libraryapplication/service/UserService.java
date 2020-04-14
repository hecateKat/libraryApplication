package com.kat.libraryapplication.service;

import com.kat.libraryapplication.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAll();

    UserDto findById(Long id) throws Exception;

    UserDto updateUser (Long id, UserDto userDto);

    void delete (Long id);

    Long addUser(UserDto userDto);

}
