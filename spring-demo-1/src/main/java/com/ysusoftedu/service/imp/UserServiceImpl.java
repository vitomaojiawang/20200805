package com.ysusoftedu.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ysusoftedu.dao.YsUserMapper;
import com.ysusoftedu.pojo.YsUser;
import com.ysusoftedu.pojo.YsUserExample;
import com.ysusoftedu.pojo.YsUserExample.Criteria;
import com.ysusoftedu.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private YsUserMapper userMapper;
	
	

	@Override
	public YsUser login(String name, String pwd) {
		YsUserExample example = new YsUserExample();
		Criteria cri =example.createCriteria();
		cri.andEmailEqualTo(name);
		cri.andUserpassEqualTo(pwd);
		
		
		List<YsUser> users = userMapper.selectByExample(example);
		if(users!=null&&users.size()>0) {
			
			return users.get(0);
		}
		
		return null;
	}



	@Override
	public List<YsUser> selectAllUsers(YsUser user) {
		YsUserExample example = new YsUserExample();
		Criteria cri = example.createCriteria();
		if(user.getEmail()!=null) {
			cri.andEmailLike("%"+user.getEmail()+"%");
		}
		
		List<YsUser> users = userMapper.selectByExample(example);
		return users;
	}


	@Override
	public int insertUsers() {
		YsUser user = new YsUser();
		user.setEmail("2222222222222222222@qq.com");
		user.setMobi("188888888888");
		int i = userMapper.insertSelective(user);
		int num = 1/0;
		
		i =i+ userMapper.insertSelective(user);
		return i;
	}

	
	
	


}
