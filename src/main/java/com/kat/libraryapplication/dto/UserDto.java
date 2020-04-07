package com.kat.libraryapplication.dto;

import com.kat.libraryapplication.validator.PasswordValidator;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private String email;

    @PasswordValidator
    private String password;

}
