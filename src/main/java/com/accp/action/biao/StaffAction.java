package com.accp.action.biao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.biao.StaffBiz;
import com.accp.pojo.Post;
import com.accp.pojo.Staff;

@RestController
@RequestMapping("/api/staffs")
public class StaffAction {
   @Autowired
   private StaffBiz biz;
   
   @GetMapping
   public List<Staff> queryAll(){
	   return biz.queryAll();
   }
   
   @GetMapping("/{stano}")
   public List<Staff> queryLike(@PathVariable String stano) {
	   return biz.queryLike("%"+stano+"%");
   }
   
   @GetMapping("staff/{stano}")
   public Staff selectOne(@PathVariable String stano) {
	   return biz.selectOne(stano);
   }
   
   @GetMapping("/count")
   public int queryCount() {
       return biz.queryCount();	   
   }
   
   @PutMapping("/staff")
   public Map<String, String> modify(@RequestBody Staff sta) {
	   Map<String, String> message = new HashMap<String, String>();
	   if(biz.modify(sta)>0) {
		   message.put("code", "200");
		   message.put("msg", "ok");
	   }else {
		   message.put("code", "500");
		   message.put("msg", "error");
	   }
	   return message;
   }
   
   @PostMapping("/staff")
	public Map<String, String> insert(@RequestBody Staff sta) {
	   Map<String, String> message = new HashMap<String, String>();
	   if(biz.insertStaff(sta)>0) {
		   message.put("code", "200");
		   message.put("msg", "ok");
	   }else {
		   message.put("code", "500");
		   message.put("msg", "error");
	   }
	   return message;
  }
   
   @DeleteMapping("/staff/{stano}")
	public Map<String, String> modify(@PathVariable String stano) {
	   Map<String, String> message = new HashMap<String, String>();
	   if(biz.remove(stano)>0) {
		   message.put("code", "200");
		   message.put("msg", "ok");
	   }else {
		   message.put("code", "500");
		   message.put("msg", "error");
	   }
	   return message;
  }
}
