package com.legend.base.dao.mapper;

import com.legend.base.entity.BaseType;
import com.legend.base.entity.BaseTypeExample;
import com.legend.dao.mappers.BaseMapper;

public interface BaseTypeMapper extends BaseMapper<BaseType> {
    int countByExample(BaseTypeExample example);
}