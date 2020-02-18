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
	
	public List<Client> findListKehu(){
		return ziLiao.findListKehu();
	}
}
