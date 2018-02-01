package com.legend.dao.model.pojo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Administrator
 * @date 2018/1/9
 */
public abstract class BasePojo<T> {

    /**
     * 继承BasePojo的子类都必须重写toString方法
     *
     * @return String
     */
    @Override
    public abstract String toString();

    /***
     * 获得Class<T>,若T为空则返回Object类型
     *
     * @return Class<T>
     */
    private Class<?> getTClass() {
        Type type = getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getActualTypeArguments()[0];
        } else {
            return Object.class;
        }
    }

    /**
     * 获得泛型实例
     *
     * @return T
     */
    @SuppressWarnings("unchecked")
    protected T getT() {
        try {
            return (T) getTClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
