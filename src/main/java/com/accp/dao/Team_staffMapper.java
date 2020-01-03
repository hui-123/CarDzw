package com.accp.dao;

import com.accp.pojo.Team_staff;

public interface Team_staffMapper {
    int deleteByPrimaryKey(String artisanno);

    int insert(Team_staff record);

    int insertSelective(Team_staff record);

    Team_staff selectByPrimaryKey(String artisanno);

    int updateByPrimaryKeySelective(Team_staff record);

    int updateByPrimaryKey(Team_staff record);
}