package com.accp.dao;

import com.accp.pojo.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(String clino);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(String clino);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}