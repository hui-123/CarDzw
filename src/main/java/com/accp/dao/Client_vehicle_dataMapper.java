package com.accp.dao;

import java.util.List;

import com.accp.pojo.Client_vehicle_data;

public interface Client_vehicle_dataMapper {
    int deleteByPrimaryKey(String cvdnumber);

    int insert(Client_vehicle_data record);

    int insertSelective(Client_vehicle_data record);

    Client_vehicle_data selectByPrimaryKey(String cvdnumber);

    int updateByPrimaryKeySelective(Client_vehicle_data record);

    int updateByPrimaryKey(Client_vehicle_data record);
    
   
}