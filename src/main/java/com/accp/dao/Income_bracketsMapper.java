package com.accp.dao;

import com.accp.pojo.Income_brackets;

public interface Income_bracketsMapper {
    int deleteByPrimaryKey(Integer incno);

    int insert(Income_brackets record);

    int insertSelective(Income_brackets record);

    Income_brackets selectByPrimaryKey(Integer incno);

    int updateByPrimaryKeySelective(Income_brackets record);

    int updateByPrimaryKey(Income_brackets record);
}