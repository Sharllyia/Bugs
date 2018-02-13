package com.legend.base.model.json.result;

/**
 * @author Administrator
 * @date 2018/2/12
 */
public class Error {

    private String field;

    private String msg;

    private Integer code;

    public Error(String field, String msg, int code) {
        this.field = field;
        this.msg = msg;
        this.code = code;
    }

    public Error(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public Error(String msg) {
        this.msg = msg;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
