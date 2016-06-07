package cn.edu.pku.ss.sa.teamc.service;

import cn.edu.pku.ss.sa.teamc.dao.model.TCustomer;

/**
 * 
 * @author xuyuanming
 *
 * 2016年6月7日下午2:45:24
 */
public interface TCustomerService {
	/**
	 * 添加客户
	 * @param name
	 * @param phone
	 * @param address
	 */
	public TCustomer addCustomer(String name, String phone, String address);
}
