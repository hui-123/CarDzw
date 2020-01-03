package com.accp.dao;

import com.accp.pojo.Brand;

public interface BrandMapper {
    int deleteByPrimaryKey(String brano);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(String brano);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}