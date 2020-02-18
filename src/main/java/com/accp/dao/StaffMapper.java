package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.accp.pojo.Staff;
@Mapper
public interface StaffMapper {
    int deleteByPrimaryKey(String stano);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByPrimaryKey(String stano);
    
    List<Staff> selectAll();
    
    Staff selectOne(String stano);
    
    int selectCount();
    
    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}