package com.accp.dao;

import com.accp.pojo.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer depno);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer depno);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}