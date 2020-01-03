package com.accp.dao;

import com.accp.pojo.Maintain_project;

public interface Maintain_projectMapper {
    int deleteByPrimaryKey(String mpno);

    int insert(Maintain_project record);

    int insertSelective(Maintain_project record);

    Maintain_project selectByPrimaryKey(String mpno);

    int updateByPrimaryKeySelective(Maintain_project record);

    int updateByPrimaryKey(Maintain_project record);
}