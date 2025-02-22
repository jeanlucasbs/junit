package com.jeanlucasbs.api_rest.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request){
        StandardError standardError = new StandardError(LocalDateTime.now(),
                                                        HttpStatus.NOT_FOUND.value(),
                                                        ex.getMessage(),
                                                        request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);

    }

    @ExceptionHandler(DataIntegratyViolationException.class)
    public ResponseEntity<StandardError> dataIntegrityViolation(DataIntegratyViolationException ex, HttpServletRequest request){
        StandardError standardError = new StandardError(LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);

    }
}
