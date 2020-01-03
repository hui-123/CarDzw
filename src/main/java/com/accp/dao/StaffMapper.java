package com.accp.dao;

import com.accp.pojo.Staff;

public interface StaffMapper {
    int deleteByPrimaryKey(String stano);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(String stano);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}