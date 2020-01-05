package com.accp.action.biao;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.biao.StaffBiz;
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
   
   @GetMapping("/count")
   public int queryCount() {
       return biz.queryCount();	   
   }
   
}
