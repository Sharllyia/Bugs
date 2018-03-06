package com.legend.module.core.entity;

import com.legend.module.core.model.pojo.AbstractPojo;

/**
 * @author Administrator
 * @date 2018/1/9
 */
public abstract class AbstractEntity<T extends AbstractEntity> extends AbstractPojo<T> {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return null;
    }
}
