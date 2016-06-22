package com.shang.spary.common.base;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {

    @Resource
    protected BaseMapper<T> baseMapper;

    @Override
    public T selectOne(T var1) {
        return null;
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
    public Page<T> selectPageAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return baseMapper.selectPageAll();
    }

    @Override
    public Page<T> selectPageByExample(T var1, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return baseMapper.selectPageByExample(var1);
    }
}
