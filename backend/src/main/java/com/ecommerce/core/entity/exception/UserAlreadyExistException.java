package com.ecommerce.core.entity.exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String massage) {
        super(massage);
    }
}
