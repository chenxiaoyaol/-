package com.hp.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.TOrdersMapper;
import com.hp.domain.TOrders;
import com.hp.services.TOrdersServices;
@Service("tOrdersServices")
public class TOrderServicesImpl  implements TOrdersServices{

	@Autowired
	private TOrdersMapper tOrderDao;
	
	@Override
	public List<TOrders> getAll() {
		// TODO Auto-generated method stub
		return tOrderDao.getAll();
	}

}
