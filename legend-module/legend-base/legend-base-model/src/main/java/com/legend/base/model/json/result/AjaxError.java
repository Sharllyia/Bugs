package com.legend.base.model.json.result;


import com.legend.base.model.json.AjaxResult;

/**
 * @author Administrator
 * @date 2018/1/9
 * <p>
 * 错误信息和错误码必须同时出现
 */
public class AjaxError extends AjaxResult {

    /**
     * 数据
     */
    private Object data;
    /**
     * 错误信息
     */
    private String errMsg;
    /**
     * 错误码
     */
    private Integer errCode;

    public AjaxError() {
        super(false);
    }

    public AjaxError(String errMsg, Integer errCode) {
        super(false);
        this.errMsg = errMsg;
        this.errCode = errCode;
    }

    public AjaxError(Object data, String errMsg, Integer errCode) {
        super(false);
        this.data = data;
        this.errMsg = errMsg;
        this.errCode = errCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }
}
