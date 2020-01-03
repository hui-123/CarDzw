package com.accp.dao;

import com.accp.pojo.Supplier;

public interface SupplierMapper {
    int deleteByPrimaryKey(String supno);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(String supno);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}