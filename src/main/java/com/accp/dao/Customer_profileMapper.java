package com.accp.dao;

import com.accp.pojo.Customer_profile;

public interface Customer_profileMapper {
    int deleteByPrimaryKey(String cpno);

    int insert(Customer_profile record);

    int insertSelective(Customer_profile record);

    Customer_profile selectByPrimaryKey(String cpno);

    int updateByPrimaryKeySelective(Customer_profile record);

    int updateByPrimaryKey(Customer_profile record);
}