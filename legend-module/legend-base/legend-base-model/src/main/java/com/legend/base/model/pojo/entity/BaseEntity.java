package com.legend.base.model.pojo.entity;

import com.legend.base.model.pojo.BasePojo;
import com.legend.base.model.pojo.vo.BaseVO;
import org.springframework.beans.BeanUtils;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/1/9
 */
public abstract class BaseEntity<T extends BaseEntity, TVO extends BaseVO> extends BasePojo<T> {

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
     * @param t Entity
     */
    protected abstract void parseProcess(T t);

    /**
     * 复制VO到Entity
     *
     * @param tvo              VO类
     * @param ignoreProperties 忽略的字段
     * @return T
     */
    protected T parse(TVO tvo, String... ignoreProperties) {
        T t = getT();
        BeanUtils.copyProperties(tvo, t, ignoreProperties);
        parseProcess(t);
        return t;
    }

    /**
     * 循环调用parse完成list的复制
     *
     * @param tvoList          vo的List集合
     * @param ignoreProperties 忽略的字段
     * @return List<T>
     */
    protected List<T> parseList(List<TVO> tvoList, String... ignoreProperties) {
        List<T> tList = new ArrayList<T>(tvoList.size());
        for (TVO tvo : tvoList) {
            T t = parse(tvo, ignoreProperties);
            tList.add(t);
        }
        return tList;
    }

    @Override
    public String toString() {
        return null;
    }

}
