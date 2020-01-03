package com.accp.dao;

import com.accp.pojo.Stars;

public interface StarsMapper {
    int deleteByPrimaryKey(Integer starsno);

    int insert(Stars record);

    int insertSelective(Stars record);

    Stars selectByPrimaryKey(Integer starsno);

    int updateByPrimaryKeySelective(Stars record);

    int updateByPrimaryKey(Stars record);
}