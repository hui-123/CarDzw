package com.accp.biz.biao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.StaffMapper;
import com.accp.pojo.Staff;

@Service("StaffBiz")
public class StaffBiz {
 @Autowired
 private StaffMapper dao;
 
 public List<Staff> queryAll(){
	 return dao.selectAll();
 }
 
 public List<Staff> queryLike(String stano) {
	 return dao.selectByPrimaryKey(stano);
 }
 
 public int queryCount() {
	 return dao.selectCount();
 }
 
 
}
