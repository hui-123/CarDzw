package com.accp.dao;

import com.accp.pojo.Post;

public interface PostMapper {
    int deleteByPrimaryKey(Integer posno);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer posno);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}