package com.accp.action.biao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.biao.DepartmentBiz;
import com.accp.pojo.Department;
import com.accp.pojo.Staff;

@RestController
@RequestMapping("/api/departments")
public class DepartmentAction {
    @Autowired
    private DepartmentBiz biz;
	
	@GetMapping
	   public List<Department> queryAll(){
		   return biz.selectAll();
	   }
}
