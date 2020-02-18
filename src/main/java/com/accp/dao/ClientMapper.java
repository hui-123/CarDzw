package com.accp.dao;

import java.util.List;


/*
 * 客户表
 * */
import com.accp.pojo.Client;


public interface ClientMapper {
    int deleteByPrimaryKey(String clino);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(String clino);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
    
    public List<Client> findListKehu();
    
    public List<Client> findNameShouJi(Client Client);
}