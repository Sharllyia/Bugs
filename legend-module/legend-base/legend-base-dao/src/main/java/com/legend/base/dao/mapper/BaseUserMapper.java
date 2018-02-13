package com.legend.base.dao.mapper;

import com.legend.base.entity.BaseUser;
import com.legend.base.entity.BaseUserExample;
import com.legend.dao.mappers.BaseMapper;

public interface BaseUserMapper extends BaseMapper<BaseUser> {
    int countByExample(BaseUserExample example);
}