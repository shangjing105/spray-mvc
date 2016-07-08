package com.shang.spray.common.base;

import com.github.pagehelper.PageHelper;
import com.shang.spray.modules.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    protected BaseMapper<T> baseMapper;
    @Autowired
    protected NewsMapper newsMapper;


    @Override
    public T selectOne(T var1) {
        return baseMapper.selectOne(var1);
    }

    @Override
    public List<T> select(T var1) {
        return baseMapper.select(var1);
    }

    @Override
    public List<T> selectAll() {
        return baseMapper.selectAll();
    }

    @Override
    public int selectCount(T var1) {
        return baseMapper.selectCount(var1);
    }

    @Override
    public T selectByPrimaryKey(Object var1) {
        return baseMapper.selectByPrimaryKey(var1);
    }

    @Override
    public int insert(T var1) {
        return baseMapper.insert(var1);
    }

    @Override
    public int insertSelective(T var1) {
        return baseMapper.insertSelective(var1);
    }

    @Override
    public int updateByPrimaryKey(T var1) {
        return baseMapper.updateByPrimaryKey(var1);
    }

    @Override
    public int updateByPrimaryKeySelective(T var1) {
        return baseMapper.updateByPrimaryKeySelective(var1);
    }

    @Override
    public int delete(T var1) {
        return baseMapper.delete(var1);
    }

    @Override
    public int deleteByPrimaryKey(Object var1) {
        return baseMapper.deleteByPrimaryKey(var1);
    }

    @Override
    public List<T> selectPageAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return baseMapper.selectAll();
    }

    @Override
    public List<T> selectPageByExample(T var1, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return baseMapper.select(var1);
    }
}
