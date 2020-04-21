package com.kat.libraryapplication.mapper;

import com.kat.libraryapplication.dto.UserDto;
import com.kat.libraryapplication.entity.User;

public class UserMapper {

    public static UserDto mapUserToUserDto (User user){

        UserDto userDto = new UserDto();

        if(user.getId() != null){
            userDto.setEmail(user.getEmail());
            userDto.setPassword(user.getPassword());
        }

        return userDto;
    }

    public static User mapUserDtoToUser (User user, UserDto userDto){
        user.setEmail(userDto.getEmail());
        user.setPassword(user.getPassword());

        return user;
    }
}