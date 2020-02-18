package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Post;
@Mapper
public interface PostMapper {
    int deleteByPrimaryKey(Integer posno);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer posno);
    
    List<Post> selectAll();

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(@Param("post")Post record,@Param("posno")int posno);
}