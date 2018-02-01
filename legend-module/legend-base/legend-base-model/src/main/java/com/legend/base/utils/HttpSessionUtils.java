package com.legend.base.utils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 * @date 2018/1/9
 */
public class HttpSessionUtils {

    /**
     * 自动注入session
     */
    @Resource
    private static HttpSession httpSession;

    /**
     * 设置session
     *
     * @param s session的key值
     * @param o session的value值
     */
    public static void setSession(String s, Object o) {
        httpSession.setAttribute(s, o);
    }

    /**
     * 通过s（key）获得session的o（value）
     *
     * @param s key值
     * @return value值
     */
    public static Object getSession(String s) {
        return httpSession.getAttribute(s);
    }

    /**
     * 移除对应s（key）的o（value）属性，但此时，session没有失效
     *
     * @param s key值
     */
    public static void removeSession(String s) {
        httpSession.removeAttribute(s);
    }

    /**
     * 使得该次访问的session彻底失效，在用户退出或者关闭浏览器时使用
     */
    public static void invalidateSession() {
        httpSession.invalidate();
    }

}
