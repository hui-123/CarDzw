package com.accp.dao;

import java.util.List;

import com.accp.pojo.Client_vehicle_data;
import com.accp.vo.hui.CheLiang;
import com.accp.vo.hui.ChePinPai;
import com.accp.vo.hui.KuHuChe;

public interface Client_vehicle_dataMapper {
	int deleteByPrimaryKey(String cvdnumber);

	int insert(Client_vehicle_data record);

	int insertSelective(Client_vehicle_data record);

	Client_vehicle_data selectByPrimaryKey(String cvdnumber);

	int updateByPrimaryKeySelective(Client_vehicle_data record);

	int updateByPrimaryKey(Client_vehicle_data record);

	//查询所有车牌号
	List<Client_vehicle_data> selectChepaihs();
	
	//查询全部车辆信息 		不要删了我的
	List<CheLiang> findCheLiang();
	
	//查询车辆品牌
	List<ChePinPai> findChePinPai();
	//查询客户名称
	List<KuHuChe> findKeName();
}