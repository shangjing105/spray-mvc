package com.shang.spary.common.base;


import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.Marker;
/**
 * info:
 * Created by shang on 16/5/30.
 */
public interface BaseMapper<T> extends tk.mybatis.mapper.common.BaseMapper<T>, ExampleMapper<T>, Marker {

    /**
     * 重写的分页查询所有
     */
    @SelectProvider(type = SpecialProvider.class,method = "dynamicSQL")
    Page<T> selectPageAll();

    /**
     * 重写的分页查询:可以带查询条件
     */
    @SelectProvider(type = SpecialProvider.class,method = "dynamicSQL")
    Page<T> selectPageByExample(T var1);


}
