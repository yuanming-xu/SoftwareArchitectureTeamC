package cn.edu.pku.ss.sa.teamc.service;

import cn.edu.pku.ss.sa.teamc.dao.model.TUser;

public interface TUserService {
	public TUser getUserByName(String username);
	
	public TUser getUserByNameAndPassword(String username, String password);
}
