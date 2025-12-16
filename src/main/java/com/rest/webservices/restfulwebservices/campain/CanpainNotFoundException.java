package com.rest.webservices.restfulwebservices.campain;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CanpainNotFoundException extends RuntimeException {

    public CanpainNotFoundException(String message) {
        super(message);
    }

}

