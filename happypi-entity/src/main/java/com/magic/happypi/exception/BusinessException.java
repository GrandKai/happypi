package com.magic.happypi.exception;

/**
 * Created by zhangyn on 17-7-12.
 */
public class BusinessException extends RuntimeException {

    private int code;
    private String message;


    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);

        this.message = message;
        this.code = -1;
    }


    public BusinessException(int code, String message) {
        super(message);
        this.message = message;
        this.code = code;
    }

    public BusinessException(String message, Exception e) {
        super(message, e);
        this.code = -1;
    }

    public int getCode() {
        return code;
    }
}
