package com.accp.dao;

import java.util.List;

import com.accp.pojo.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer depno);

    int insert(Department record);

    int insertSelective(Department record);
    
    List<Department> selectAll();

    Department selectByPrimaryKey(Integer depno);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}