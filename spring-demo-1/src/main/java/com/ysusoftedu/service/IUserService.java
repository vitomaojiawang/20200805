package com.ysusoftedu.service;

import java.util.List;
import java.util.Map;

import com.ysusoftedu.pojo.YsUser;

public interface IUserService {
	
	YsUser login(String name,String pwd);
	
	List<YsUser> selectAllUsers(YsUser user);
	
	int insertUsers();
	
}
