package com.accp.action.biao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.biao.PostBiz;
import com.accp.pojo.Post;
import com.accp.pojo.Staff;

@RestController
@RequestMapping("/api/posts")
public class PostAction {
   
	@Autowired
	private PostBiz biz;
	
	@GetMapping
	public List<Post> selectAll(){
		System.out.println("11");
		return biz.findList();
	}
	
	@PostMapping("/post")
	public Map<String, String> insert(@RequestBody Post post) {
	   Map<String, String> message = new HashMap<String, String>();
	   if(biz.insertPost(post)>0) {
		   message.put("code", "200");
		   message.put("msg", "ok");
	   }else {
		   message.put("code", "500");
		   message.put("msg", "error");
	   }
	   return message;
   }
	
	@PutMapping("/post/{posno}")
	public Map<String, String> modify(@RequestBody Post post,@PathVariable int posno) {
	   Map<String, String> message = new HashMap<String, String>();
	   if(biz.modifyPost(post,posno)>0) {
		   message.put("code", "200");
		   message.put("msg", "ok");
	   }else {
		   message.put("code", "500");
		   message.put("msg", "error");
	   }
	   return message;
   }
	
	@DeleteMapping("/post/{posno}")
	public Map<String, String> modify(@PathVariable int posno) {
	   Map<String, String> message = new HashMap<String, String>();
	   if(biz.removePost(posno)>0) {
		   message.put("code", "200");
		   message.put("msg", "ok");
	   }else {
		   message.put("code", "500");
		   message.put("msg", "error");
	   }
	   return message;
   }
}
