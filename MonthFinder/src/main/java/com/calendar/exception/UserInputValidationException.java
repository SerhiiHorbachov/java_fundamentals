package com.calendar.exception;

public class UserInputValidationException extends RuntimeException {

    public UserInputValidationException() {
        super();
    }

    public UserInputValidationException(String message) {
        super(message);
    }

}
