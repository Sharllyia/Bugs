package com.legend.base.dao.mapper;

import com.legend.base.entity.BaseGeography;
import com.legend.base.entity.BaseGeographyExample;
import com.legend.dao.mappers.BaseMapper;

public interface BaseGeographyMapper extends BaseMapper<BaseGeography> {
    int countByExample(BaseGeographyExample example);
}