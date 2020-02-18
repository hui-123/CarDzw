package com.accp.biz.biao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.accp.dao.PostMapper;
import com.accp.pojo.Post;

@Service("PostBiz")
public class PostBiz {
   @Autowired
   private PostMapper dao;
   
   public List<Post> findList(){
	   return dao.selectAll();
   }
   
   public int insertPost(Post p) {
	    return dao.insert(p);
   }
   
   public int removePost(int posno) {
	   return dao.deleteByPrimaryKey(posno);
   }
   
   public int modifyPost(Post p,int posno) {
	   return dao.updateByPrimaryKey(p,posno);
   }
}
