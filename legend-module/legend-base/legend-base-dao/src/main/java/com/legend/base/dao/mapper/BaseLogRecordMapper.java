package com.legend.base.dao.mapper;

import com.legend.base.entity.BaseLogRecord;
import com.legend.base.entity.BaseLogRecordExample;
import com.legend.dao.mappers.BaseMapper;

public interface BaseLogRecordMapper extends BaseMapper<BaseLogRecord> {
    int countByExample(BaseLogRecordExample example);
}