package com.legend.base.dao.mapper;

import com.legend.base.entity.BaseThirdParty;
import com.legend.base.entity.BaseThirdPartyExample;
import com.legend.dao.mappers.BaseMapper;

public interface BaseThirdPartyMapper extends BaseMapper<BaseThirdParty> {
    int countByExample(BaseThirdPartyExample example);
}