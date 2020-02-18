package com.accp.action.hui;

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

import com.accp.biz.hui.KeHuCheBiz;
import com.accp.pojo.Client_vehicle_data;
import com.accp.vo.hui.CheLiang;
import com.accp.vo.hui.ChePinPai;
import com.accp.vo.hui.KuHuChe;

@RestController
@RequestMapping("/api/KehuChe")
public class KeHuCheAction {

	@Autowired
	private KeHuCheBiz CheBiz;

	// 查询全部车辆信息
	@GetMapping
	private List<CheLiang> findChe() {
		return CheBiz.findCheLiang();
	}

	// 查询车辆品牌
	@GetMapping("/PinPai")
	private List<ChePinPai> findChePinPai() {
		return CheBiz.findChePinPai();
	}
	// 新增车辆资料

	@PostMapping("/add")
	public Map<String, String> addKehu(@RequestBody Client_vehicle_data record) {
		Map<String, String> message = new HashMap<String, String>();
		CheBiz.addCheZiLiao(record);
		message.put("code", "200");
		return message;
	}

	@DeleteMapping("/delete")
	public Map<String, String> removeCheLiang(@RequestBody String[] cvdnumber) {
		Map<String, String> message = new HashMap<String, String>();
		for (String string : cvdnumber) {
			CheBiz.removeCheLiang(string);
		}
		message.put("code", "200");
		return message;
	}

	// 修改车辆信息
	@PutMapping("/put")
	public Map<String, String> update(@RequestBody Client_vehicle_data record) {
		Map<String, String> message = new HashMap<String, String>();
		// System.out.println(Client_vehicle_data.toString());
		CheBiz.UpdateChe(record);
		message.put("code", "200");
		return message;
	}

	// 根据车牌好查询
	@GetMapping("/Hao/{cvdnumber}")
	public Client_vehicle_data findChePaihao(@PathVariable String cvdnumber) {
		return CheBiz.selectByPrimaryKey(cvdnumber);
	}
	
	//查询客户名称
	@GetMapping("/KeHuName")
	public List<KuHuChe>findKeHuName(){
		return CheBiz.findKeName();
	}

}
