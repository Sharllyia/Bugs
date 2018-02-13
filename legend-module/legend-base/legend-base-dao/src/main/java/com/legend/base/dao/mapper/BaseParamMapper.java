package com.legend.base.dao.mapper;

import com.legend.base.entity.BaseParam;
import com.legend.base.entity.BaseParamExample;
import com.legend.dao.mappers.BaseMapper;

public interface BaseParamMapper extends BaseMapper<BaseParam> {
    int countByExample(BaseParamExample example);
}