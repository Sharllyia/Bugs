package com.legend.base.model.pojo.bo;

import com.legend.base.model.pojo.BasePojo;
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
public abstract class BaseBO<TBO extends BaseBO> extends BasePojo<TBO> {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 单次parse之后的操作，暴露给子类完成
     *
     * @param tbo Entity
     */
    protected abstract void parseProcess(TBO tbo);

    /**
     * 复制Entity或者VO到BO
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

    @Override
    public String toString() {
        return null;
    }
}
