package com.ecommerce.core.entity.exception;

public class UserAlreadyExistException extends Exception {
    public UserAlreadyExistException(String massage) {
        super(massage);
    }
}
