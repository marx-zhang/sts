package com.limebike.handler;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvvy
 * @date 2019/10/15
 */
@Data
public class Errors{

    public Errors(String message, List<Error> errors) {
        this.message = message;
        this.errors = errors;
    }

    public Errors(String message) {
        this.message = message;
        this.errors = new ArrayList<>();
    }

    private String message;
    private List<Error> errors;

}