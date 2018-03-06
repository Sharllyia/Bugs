package com.legend.model.json.result;


import com.legend.model.contant.code.result.AjaxCode;
import com.legend.model.contant.message.result.AjaxMessage;

/**
 * @author Administrator
 * @date 2018/2/12
 */
public class Error {

    private String field;

    private String msg;

    private Integer code;

    public Error() {
        this.msg = AjaxMessage.UNKNOWN_EXCEPTION;
        this.code = AjaxCode.UNKNOWN_EXCEPTION;
    }

    public Error(String field, String msg, Integer code) {
        this.field = field;
        this.msg = msg;
        this.code = code;
    }

    public Error(String msg, Integer code) {
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
