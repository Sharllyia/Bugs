package com.legend.service.impl;

import com.github.pagehelper.PageHelper;
import com.legend.dao.mapper.LegendMapper;
import com.legend.service.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 实现baseService接口的类，可以基础该类，减少代码量
 *
 * @author Administrator
 * @date 2018/2/15
 */
public abstract class AbstractService<T> implements Service<T> {
    private Mapper<T> mapper;

    /**
     * 实现该接口，返回实现对应的mapper类
     *
     * @return mapper类，由子类实现
     */
    public abstract Mapper<T> getMapper();

    /**
     * 用于在该类中获得对应的子类的mapper类
     *
     * @return mapper
     */
    private LegendMapper<T> getLegendMapper() {
        return (LegendMapper<T>) getMapper();
    }

    /**
     * 得到由子类实现的example
     *
     * @param t     t
     * @param order 排序字段
     * @param sort  排序方式
     * @return example
     */
    protected abstract Object getExample(T t, String order, String sort);

    @Override
    public int save(T t) {
        return getMapper().insertSelective(t);
    }

    @Override
    public int saveList(List<T> tList) {
        return getLegendMapper().insertList(tList);
    }

    @Override
    public int update(T t) {
        return getMapper().updateByPrimaryKeySelective(t);
    }

    @Override
    public int updateByExample(T t, Object example) {
        return getLegendMapper().updateByExampleSelective(t, example);
    }

    @Override
    public int delete(int id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int updateDeleted(int id) {
        return getLegendMapper().updateDeletedById(id);
    }

    @Override
    public int deleteByExample(Object example) {
        return getMapper().deleteByExample(example);
    }

    @Override
    public T getById(int id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public T get(T t) {
        return getMapper().selectOne(t);
    }

    @Override
    public T getByExample(Object example) {
        PageHelper.startPage(1, 1);
        List<T> ts = getMapper().selectByExample(example);
        return ts != null && !ts.isEmpty() ? ts.get(0) : null;
    }

    @Override
    public List<T> getList() {
        return getMapper().selectAll();
    }

    @Override
    public List<T> getList(T t) {
        return getMapper().select(t);
    }

    @Override
    public List<T> getList(Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return getList();
    }

    @Override
    public List<T> getList(T t, Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return getList(t);
    }

    @Override
    public List<T> getList(T t, String order, String sort) {
        Object example = getExample(t, order, sort);
        return getListByExample(example);
    }

    @Override
    public List<T> getList(T t, Integer currentPage, Integer pageSize, String order, String sort) {
        PageHelper.startPage(currentPage, pageSize);
        return getList(t, order, sort);
    }

    @Override
    public List<T> getListByExample(Object example) {
        return getMapper().selectByExample(example);
    }

    @Override
    public List<T> getListByExample(Object example, Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return getListByExample(example);
    }

    @Override
    public int getCount(T t) {
        return getMapper().selectCount(t);
    }

    @Override
    public int getCountByExample(Object example) {
        return getMapper().selectCountByExample(example);
    }

    @Override
    public List<? extends T> getGroupList(String name, T t) {
        Object example = getExample(t, null, null);
        return getGroupListByExample(name, example);
    }

    @Override
    public List<? extends T> getGroupList(String name, T t, Integer currentPage, Integer pageSize) {
        return getGroupList(name, t, currentPage, pageSize, null, null);
    }

    @Override
    public List<? extends T> getGroupList(String name, T t, Integer currentPage, Integer pageSize, String order, String sort) {
        Object example = getExample(t, order, sort);
        return getGroupListByExample(name, example, currentPage, pageSize);
    }

    @Override
    public List<? extends T> getGroupListByExample(String name, Object example) {
        return getLegendMapper().selectGroupByName(name, example);
    }

    @Override
    public List<? extends T> getGroupListByExample(String name, Object example, Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return getGroupListByExample(name, example);
    }
}
