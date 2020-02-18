package com.accp.biz.hui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.Client_vehicle_dataMapper;

import com.accp.pojo.Client_vehicle_data;
import com.accp.vo.hui.CheLiang;
import com.accp.vo.hui.ChePinPai;
import com.accp.vo.hui.KuHuChe;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class KeHuCheBiz {

	@Autowired
	private Client_vehicle_dataMapper data;

	//查询全部的车辆信息
	public List<CheLiang> findCheLiang() {
		return data.findCheLiang();
				
	}
	//查询车辆品牌
	public List<ChePinPai> findChePinPai(){
		return data.findChePinPai();
	}
	//新增车资料信息
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addCheZiLiao(Client_vehicle_data record) {
		return data.insertSelective(record);
	}
	//删除车辆信息
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeCheLiang(String cvdnumber) {  
		return data.deleteByPrimaryKey(cvdnumber);
	}
	//修改车辆下信息
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int UpdateChe(Client_vehicle_data record) {
		return data.updateByPrimaryKeySelective(record);
	}
	//查询客户名称
	public List<KuHuChe> findKeName(){
		return data.findKeName();
	}
	//根据车牌号查询
	public Client_vehicle_data selectByPrimaryKey(String cvdnumber) {
		
		return data.selectByPrimaryKey(cvdnumber);
	}
}
