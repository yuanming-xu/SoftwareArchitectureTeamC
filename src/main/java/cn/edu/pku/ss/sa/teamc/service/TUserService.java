package cn.edu.pku.ss.sa.teamc.service;

import cn.edu.pku.ss.sa.teamc.dao.model.TUser;
/**
 * 
 * @author xuyuanming
 *
 * 2016年6月7日下午2:45:29
 */
public interface TUserService {
	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	public TUser getUserByName(String username);
	
	/**
	 * 根据用户名和密码查找用户
	 * @param username
	 * @param password
	 * @return
	 */
	public TUser getUserByNameAndPassword(String username, String password);
}
