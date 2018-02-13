package com.legend.base.dao.mapper;

import com.legend.base.entity.BaseOrder;
import com.legend.base.entity.BaseOrderExample;
import com.legend.dao.mappers.BaseMapper;

public interface BaseOrderMapper extends BaseMapper<BaseOrder> {
    int countByExample(BaseOrderExample example);
}