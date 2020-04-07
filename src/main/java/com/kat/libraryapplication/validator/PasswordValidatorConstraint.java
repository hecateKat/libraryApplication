package com.kat.libraryapplication.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidatorConstraint implements ConstraintValidator<PasswordValidator, String> {


    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {

        if (password == null) {
            return false;
        }
        return password.length() > 8 && password.length() < 20 && password.matches(".*\\d.*");
    }
}