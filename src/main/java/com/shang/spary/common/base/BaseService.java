package com.shang.spary.common.base;

import com.github.pagehelper.Page;

import java.util.List;

public interface BaseService<T> {

    T selectOne(T var1);

    List<T> select(T var1);

    List<T> selectAll();

    int selectCount(T var1);

    T selectByPrimaryKey(Object var1);

    int insert(T var1);

    int insertSelective(T var1);

    int updateByPrimaryKey(T var1);

    int updateByPrimaryKeySelective(T var1);

    int delete(T var1);

    int deleteByPrimaryKey(Object var1);

    Page<T> selectPageAll(Integer pageNum, Integer pageSize);

    Page<T> selectPageByExample(T var1,Integer pageNum, Integer pageSize);


}
