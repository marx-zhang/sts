package com.limebike.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bvvy
 * @date 2019/10/15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Error {

    private String resource;
    private String field;
    private String code;
}