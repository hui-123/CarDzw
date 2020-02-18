package com.accp.biz.biao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.StaffMapper;
import com.accp.pojo.Post;
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
 
 public Staff selectOne(String stano) {
	 return dao.selectOne(stano);
 }
 
 public int queryCount() {
	 return dao.selectCount();
 }
 
 public int modify(Staff sta) {
	  return dao.updateByPrimaryKey(sta);
 }
 
 public int remove(String stano) {
	   return dao.deleteByPrimaryKey(stano);
 }
 
 public int insertStaff(Staff p) {
	    return dao.insert(p);
}
 
}
