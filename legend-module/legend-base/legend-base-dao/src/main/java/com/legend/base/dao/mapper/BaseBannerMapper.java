package com.legend.base.dao.mapper;

import com.legend.base.dao.BaseMapper;
import com.legend.base.entity.BaseBanner;
import com.legend.base.entity.BaseBannerExample;

/**
 * @author Administrator
 */
public interface BaseBannerMapper extends BaseMapper<BaseBanner> {
    int countByExample(BaseBannerExample example);
}