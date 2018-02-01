package com.legend.dao.model.exception;

/**
 * @author Administrator
 * @date 2018/1/9
 */
public class BaseException extends Exception {

    /**
     * 异常码
     */
    private Integer code;

    public BaseException() {
        super();
    }

    public BaseException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public BaseException(String message, Integer code, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
