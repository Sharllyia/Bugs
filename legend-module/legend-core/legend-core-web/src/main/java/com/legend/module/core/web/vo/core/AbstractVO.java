package com.legend.module.core.web.vo.core;

import com.legend.module.core.model.pojo.AbstractPojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Administrator
 * @date 2018/3/5
 */
public abstract class AbstractVO<TVO extends AbstractVO> extends AbstractPojo<TVO> {
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
    @NotNull
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

}
