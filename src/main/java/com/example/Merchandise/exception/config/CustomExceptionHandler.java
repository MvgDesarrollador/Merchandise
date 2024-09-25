package com.example.Merchandise.exception.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ClientException.class)
    public ResponseEntity<CustomMessage> handleCustomerException(ClientException customerException) {
        CustomMessage customMessage = new CustomMessage();
        customMessage.setCode(customerException.getCode());
        customMessage.setMessage(customerException.getMessage());
        return new ResponseEntity<>(customMessage, HttpStatus.BAD_REQUEST);
    }

}