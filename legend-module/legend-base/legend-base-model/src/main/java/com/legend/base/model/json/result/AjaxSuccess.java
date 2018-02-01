package com.legend.base.model.json.result;


import com.legend.base.model.json.AjaxResult;

/**
 * @author Administrator
 * @date 2018/1/9
 * <p>
 * 所有成功的请求均不需要返回错误码
 */
public class AjaxSuccess extends AjaxResult {

    /**
     * 数据
     */
    private Object data;
    /**
     * 成功信息
     */
    private String msg;

    public AjaxSuccess() {
        super(true);
    }

    public AjaxSuccess(String msg) {
        super(true);
        this.msg = msg;
    }

    public AjaxSuccess(Object data, String msg) {
        super(true);
        this.data = data;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
