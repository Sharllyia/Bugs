package com.legend.base.model.exception.validate;

/**
 * @author Administrator
 * @date 2018/2/14
 */
public class ValidateException extends Exception {

    public ValidateException() {
    }

    public ValidateException(String message) {
        super(message);
    }

    public ValidateException(String message, Throwable cause) {
        super(message, cause);
    }
}
