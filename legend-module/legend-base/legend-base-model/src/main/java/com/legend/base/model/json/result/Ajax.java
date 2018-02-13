package com.legend.base.model.json.result;

import com.legend.base.model.contant.arribute.Key;
import com.legend.base.model.contant.code.result.BaseAjaxCode;
import com.legend.base.model.contant.message.result.BaseAjaxMessage;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;

/**
 * @author Administrator
 * @date 2018/2/2
 */
public class Ajax extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    private Ajax(boolean result) {
        put(Key.RESULT, result);
    }

    /**
     * 默认异步请求成功
     *
     * @return msg - 消息
     */
    public static Ajax success() {
        return success(BaseAjaxMessage.REQUEST_SUCCESS);
    }

    /**
     * 自定义异步请求成功消息
     *
     * @param msg 消息
     * @return msg - 消息
     */
    public static Ajax success(final String msg) {
        return new Ajax(true) {{
            put(Key.MSG, msg);
        }};
    }

    /**
     * 自定义异步请求成功数据
     *
     * @param data 数据
     * @return data - 数据
     */
    public static Ajax success(final Object data) {
        return new Ajax(true) {{
            put(Key.DATA, data);
        }};
    }

    /**
     * 自定义异步请求成功数据和消息
     *
     * @param data 数据
     * @param msg  消息
     * @return data - 数据；msg - 消息
     */
    public static Ajax success(final Object data, final String msg) {
        return new Ajax(true) {{
            put(Key.DATA, data);
            put(Key.MSG, msg);
        }};
    }

    /**
     * 自定义异步请求成功返回值
     *
     * @param map 键值对
     * @return map - 键值对
     */
    public static Ajax success(final HashMap<String, Object> map) {
        return new Ajax(true) {{
            putAll(map);
        }};
    }

    /**
     * 默认异步请求失败/异常
     *
     * @return msg
     */
    public static Ajax error() {
        return error(BaseAjaxMessage.UNKNOWN_EXCEPTION);
    }

    /**
     * 自定义异步请求失败/异常消息
     *
     * @param msg 消息
     * @return msg - 消息
     */
    public static Ajax error(String msg) {
        return error(msg, BaseAjaxCode.UNKNOWN_EXCEPTION);
    }

    /**
     * 自定义异步请求失败/异常消息和返回码
     *
     * @param msg  消息
     * @param code 返回码
     * @return msg - 消息；code - 返回码
     */
    public static Ajax error(final String msg, final int code) {
        return new Ajax(false) {{
            put(Key.MSG, msg);
            put(Key.CODE, code);
        }};
    }

    /**
     * 自定义异步请求失败/异常消息和返回码
     *
     * @param error 错误
     * @return msg - 消息；code - 返回码
     */
    public static Ajax error(final Error error) {
        return new Ajax(false) {{
            if (StringUtils.isNotBlank(error.getMsg())) {
                put(Key.MSG, error.getMsg());
            }
            if (error.getCode() == null) {
                put(Key.CODE, error.getCode());
            }
        }};
    }

    @Override
    public Ajax put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
