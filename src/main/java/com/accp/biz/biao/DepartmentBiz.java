package com.accp.biz.biao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.DepartmentMapper;
import com.accp.pojo.Department;

@Service("DepartmentBiz")
public class DepartmentBiz {
   @Autowired
   private DepartmentMapper dao;
   
   public List<Department> selectAll(){
	   return dao.selectAll();
   }
}
