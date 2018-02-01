package com.legend.base.model.json;

import java.io.Serializable;

/**
 * @author Administrator
 * @date 2018/1/9
 * <p>
 * 所有ajax的请求必须返回该类型的两个子类之一（目前就AjaxSuccess和AjaxError两个子类）
 * <p>
 * 每次调用子类的数据之前都要记得判断
 */
public class AjaxResult implements Serializable {

    /**
     * 返回的结果，判断是成功还是失败
     */
    private Boolean result;
    /**
     * 请求成功或者失败
     */
    private String msg;

    public AjaxResult(Boolean result) {
        this.result = result;
    }

    public Boolean getResult() {
        return this.result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
