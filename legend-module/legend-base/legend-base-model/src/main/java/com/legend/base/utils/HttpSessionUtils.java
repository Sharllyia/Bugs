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
     * 得到httpSession
     *
     * @return httpsession
     */
    public static Object getSession() {
        return httpSession;
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
     * 设置s（key）和o（value）键值对
     *
     * @param s 关键字
     * @param o 值
     */
    public static void setAttribute(String s, Object o) {
        httpSession.setAttribute(s, o);
    }

    /**
     * 通过关键字获得对应的值
     *
     * @param s 关键字
     * @return o
     */
    public static Object getAttribute(String s) {
        return httpSession.getAttribute(s);
    }

    /**
     * 使得该次访问的session彻底失效，在用户退出或者关闭浏览器时使用
     */
    public static void invalidateSession() {
        httpSession.invalidate();
    }

}
