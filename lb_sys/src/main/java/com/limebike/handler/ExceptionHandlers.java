package com.limebike.handler;

import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bvvy
 * @date 2019/10/15
 */
@RestControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Errors> notReadable() {
        val errors = new Errors("Body should be a JSON object");
        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Errors> notValid(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        List<Error> errorList =  bindingResult.getAllErrors().stream()
                .map(error -> {
                    if (error instanceof FieldError) {
                       return new Error(error.getObjectName(), ((FieldError) error).getField(), error.getCode());
                    } else {
                        return new Error(error.getObjectName(), "none", error.getCode());
                    }
                }).collect(Collectors.toList());
        val errors = new Errors("Validation Failed", errorList);
        return ResponseEntity.unprocessableEntity().body(errors);
    }





}

