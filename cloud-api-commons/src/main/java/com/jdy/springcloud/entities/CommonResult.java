package com.jdy.springcloud.entities;

import lombok.Data;

/**
 * @author Mr.jdy
 * @create 2020-05-27 22:43
 */
@Data
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResult() {
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
