package com.accp.biz.sun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.Client_vehicle_dataMapper;
import com.accp.pojo.Client_vehicle_data;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class SumBiz {
	
	@Autowired
	private Client_vehicle_dataMapper cvdDao;

	public List<Client_vehicle_data> selectChepaihs() {
		return cvdDao.selectChepaihs();
	}

}
