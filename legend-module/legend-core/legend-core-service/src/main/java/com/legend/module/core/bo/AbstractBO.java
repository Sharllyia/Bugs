package com.legend.module.core.bo;


import com.legend.module.core.model.pojo.AbstractPojo;
import org.springframework.beans.BeanUtils;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/1/29
 */
public abstract class AbstractBO<TBO extends AbstractBO> extends AbstractPojo<TBO> {
    private static final long serialVersionUID = 1L;

    /**
     * 单次parse之后的操作，暴露给子类完成
     *
     * @param tbo Entity
     */
    protected abstract void parseProcess(TBO tbo);

    /**
     * 将Entity或者VO复制到BO
     *
     * @param object           Entity或者VO类
     * @param ignoreProperties 忽略的字段
     * @return TBO
     */
    protected TBO parse(Object object, String... ignoreProperties) {
        TBO tbo = getT();
        BeanUtils.copyProperties(object, tbo, ignoreProperties);
        parseProcess(tbo);
        return tbo;
    }

    /**
     * 循环调用parse完成list的复制
     *
     * @param list             Entity或者BO的List集合
     * @param ignoreProperties 忽略的字段
     * @return List<TBO>
     */
    protected List<TBO> parseList(List<?> list, String... ignoreProperties) {
        List<TBO> tList = new ArrayList<TBO>(list.size());
        for (Object object : list) {
            tList.add(parse(object, ignoreProperties));
        }
        return tList;
    }
}
