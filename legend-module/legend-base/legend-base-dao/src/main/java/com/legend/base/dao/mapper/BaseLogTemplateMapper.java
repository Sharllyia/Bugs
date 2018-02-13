package com.legend.base.dao.mapper;

import com.legend.base.entity.BaseLogTemplate;
import com.legend.base.entity.BaseLogTemplateExample;
import com.legend.dao.mappers.BaseMapper;

public interface BaseLogTemplateMapper extends BaseMapper<BaseLogTemplate> {
    int countByExample(BaseLogTemplateExample example);
}