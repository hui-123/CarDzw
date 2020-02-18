package com.accp.action.sun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sun.SumBiz;
import com.accp.pojo.Client_vehicle_data;

@RestController
@RequestMapping("/api/suns")
public class SumAction {

	@Autowired
	private SumBiz biz;

	// 接车登记-查询车牌号加载select

	@GetMapping("/chepaihs")
	public List<Client_vehicle_data> selectChepaihs() {
		return biz.selectChepaihs();
	}
	
}
