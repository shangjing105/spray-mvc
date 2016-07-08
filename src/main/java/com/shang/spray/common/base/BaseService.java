package com.shang.spray.common.base;

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

    List<T> selectPageAll(Integer pageNum, Integer pageSize);

    List<T> selectPageByExample(T var1,Integer pageNum, Integer pageSize);


}
