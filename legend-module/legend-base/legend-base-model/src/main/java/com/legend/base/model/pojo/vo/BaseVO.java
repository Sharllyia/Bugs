package com.legend.base.model.pojo.vo;

import com.legend.base.model.pojo.BasePojo;
import com.legend.base.model.pojo.bo.BaseBO;
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
public abstract class BaseVO<TVO extends BaseVO, TBO extends BaseBO> extends BasePojo<TVO> {

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
     * 单次parse之后的操作，暴露给子类完成，有需求就写，没就不写，空着就好
     *
     * @param tvo Entity
     */
    protected abstract void parseProcess(TVO tvo);

    /**
     * 复制BO到VO
     *
     * @param tbo              BO类
     * @param ignoreProperties 忽略的字段
     * @return TVO
     */
    protected TVO parse(TBO tbo, String... ignoreProperties) {
        TVO tvo = getT();
        BeanUtils.copyProperties(tbo, tvo, ignoreProperties);
        return tvo;
    }

    /**
     * 循环调用parse完成list的复制
     *
     * @param tboList          BO的List集合
     * @param ignoreProperties 忽略的字段
     * @return List<TVO>
     */
    protected List<TVO> parseList(List<TBO> tboList, String... ignoreProperties) {
        List<TVO> tList = new ArrayList<TVO>(tboList.size());
        for (TBO tbo : tboList) {
            tList.add(parse(tbo, ignoreProperties));
        }
        return tList;
    }

    @Override
    public String toString() {
        return null;
    }
}
