package com.accp.dao;

import com.accp.pojo.Upkeep_brackets;

public interface Upkeep_bracketsMapper {
    int deleteByPrimaryKey(Integer upkno);

    int insert(Upkeep_brackets record);

    int insertSelective(Upkeep_brackets record);

    Upkeep_brackets selectByPrimaryKey(Integer upkno);

    int updateByPrimaryKeySelective(Upkeep_brackets record);

    int updateByPrimaryKey(Upkeep_brackets record);
}