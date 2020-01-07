package com.accp.biz.hui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ClientMapper;
import com.accp.pojo.Client;



@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class KeHuBiz {

	@Autowired
	private ClientMapper ziLiao;
	//查询全部客户
	public List<Client> findListKehu(){
		return ziLiao.findListKehu();
	}
	//新增客户
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addKeHu(Client record) {
		return ziLiao.insert(record);
	}
	//删除客户
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int remove(String clino) {
		return ziLiao.deleteByPrimaryKey(clino);
	}
	//条件查询
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Client ByClino(String clino) {
		return ziLiao.selectByPrimaryKey(clino);
	}
	//修改
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int Update(Client Client) {
		return ziLiao.updateByPrimaryKeySelective(Client);
	}
	
}
