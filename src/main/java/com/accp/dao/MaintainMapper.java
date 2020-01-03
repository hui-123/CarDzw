package com.accp.dao;

import com.accp.pojo.Maintain;

public interface MaintainMapper {
    int deleteByPrimaryKey(String ciecvdnumber);

    int insert(Maintain record);

    int insertSelective(Maintain record);

    Maintain selectByPrimaryKey(String ciecvdnumber);

    int updateByPrimaryKeySelective(Maintain record);

    int updateByPrimaryKey(Maintain record);
}