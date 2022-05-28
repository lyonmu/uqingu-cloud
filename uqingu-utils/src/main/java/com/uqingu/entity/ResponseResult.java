package com.uqingu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseResult<T> {
    private Integer code;
    private String message;
    private String port;
    private T data;
}
