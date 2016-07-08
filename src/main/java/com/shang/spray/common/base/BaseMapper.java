package com.shang.spray.common.base;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.base.BaseDeleteMapper;
import tk.mybatis.mapper.common.base.BaseInsertMapper;
import tk.mybatis.mapper.common.base.BaseUpdateMapper;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;

import java.util.List;

/**
 * info:
 * Created by shang on 16/7/6.
 */
public interface BaseMapper<T> extends BaseInsertMapper<T>, BaseUpdateMapper<T>, BaseDeleteMapper<T>,ExampleMapper {

    @SelectProvider(
            type = BaseSelectProvider.class,
            method = "dynamicSQL"
    )
    @ResultMap("BaseResultMap")
    T selectOne(T var1);

    @SelectProvider(
            type = BaseSelectProvider.class,
            method = "dynamicSQL"
    )
    @ResultMap("BaseResultMap")
    List<T> select(T var1);

    @SelectProvider(
            type = BaseSelectProvider.class,
            method = "dynamicSQL"
    )
    @ResultMap("BaseResultMap")
    List<T> selectAll();

    @SelectProvider(
            type = BaseSelectProvider.class,
            method = "dynamicSQL"
    )
    int selectCount(T var1);

    @SelectProvider(
            type = BaseSelectProvider.class,
            method = "dynamicSQL"
    )
    @ResultMap("BaseResultMap")
    T selectByPrimaryKey(Object var1);
}
