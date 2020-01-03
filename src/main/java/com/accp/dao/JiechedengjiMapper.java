package com.accp.dao;

import com.accp.pojo.Jiechedengji;

public interface JiechedengjiMapper {
    int deleteByPrimaryKey(String jiecvdnumber);

    int insert(Jiechedengji record);

    int insertSelective(Jiechedengji record);

    Jiechedengji selectByPrimaryKey(String jiecvdnumber);

    int updateByPrimaryKeySelective(Jiechedengji record);

    int updateByPrimaryKey(Jiechedengji record);
}