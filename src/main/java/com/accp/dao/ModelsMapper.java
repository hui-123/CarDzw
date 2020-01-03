package com.accp.dao;

import com.accp.pojo.Models;

public interface ModelsMapper {
    int deleteByPrimaryKey(String mobrano);

    int insert(Models record);

    int insertSelective(Models record);

    Models selectByPrimaryKey(String mobrano);

    int updateByPrimaryKeySelective(Models record);

    int updateByPrimaryKey(Models record);
}