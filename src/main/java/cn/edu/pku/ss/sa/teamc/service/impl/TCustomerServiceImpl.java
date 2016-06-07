package cn.edu.pku.ss.sa.teamc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.pku.ss.sa.teamc.dao.model.TCustomer;
import cn.edu.pku.ss.sa.teamc.dao.sqlmapper.TCustomerMapper;
import cn.edu.pku.ss.sa.teamc.service.TCustomerService;
/**
 * 
 * @author xuyuanming
 *
 * 2016年4月25日下午5:40:24
 */
@Service("TCustomerService")
public class TCustomerServiceImpl implements TCustomerService {
	
	@Resource
	private TCustomerMapper dao;
	
	public TCustomer addCustomer(String name, String phone, String address) {
		TCustomer c = new TCustomer();
		c.setAddress(address);
		c.setName(name);
		c.setPhone(phone);
		dao.insert(c);
		return c;
	}
}
