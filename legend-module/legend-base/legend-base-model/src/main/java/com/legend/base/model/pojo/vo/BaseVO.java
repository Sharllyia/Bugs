package com.legend.base.model.pojo.vo;

import com.legend.base.model.pojo.BasePojo;
import com.legend.base.model.pojo.bo.BaseBO;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/1/9
 */
public abstract class BaseVO<TVO extends BaseVO, TBO extends BaseBO> extends BasePojo<TVO> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @NotNull
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除
     */
    @NotNull
    @Column(name = "is_deleted")
    private Boolean isDeleted;

    /**
     * 获取主键id
     *
     * @return 主键id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除
     *
     * @return is_deleted - 是否删除
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除
     *
     * @param isDeleted 是否删除
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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
