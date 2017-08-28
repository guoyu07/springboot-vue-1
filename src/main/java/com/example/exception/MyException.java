package com.example.exception;

/**
 * 自定义异常类
 *
 * @author jiangchong
 * @since 2017/8/24 19:52
 */
public class MyException extends RuntimeException {
    private Integer code;

    public MyException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
