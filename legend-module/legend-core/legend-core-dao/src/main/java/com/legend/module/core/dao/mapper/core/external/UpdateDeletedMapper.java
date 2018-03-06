package com.legend.module.core.dao.mapper.core.external;

import com.legend.module.core.dao.provider.UpdateDeletedProvider;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * @author Administrator
 * @date 2018/2/15
 */
public interface UpdateDeletedMapper<T> {
    /**
     * 根据id逻辑删除记录
     *
     * @param var1 id
     * @return 操作结果
     */
    @UpdateProvider(
            type = UpdateDeletedProvider.class,
            method = "dynamicSQL"
    )
    int updateDeletedById(Object var1);
}
