package com.accp.action.hui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.hui.KeHuBiz;
import com.accp.pojo.Client;
@RestController
@RequestMapping("/api/Kehu")
public class KeHuAction {

	@Autowired
	private KeHuBiz khBiz;
	
	@GetMapping
	public List<Client> findListKehu(){
		
		return khBiz.findListKehu();
	}
	
	
}
