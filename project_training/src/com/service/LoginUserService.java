package com.service;

import javax.annotation.Resource;
import com.entity.User;

import org.springframework.stereotype.Service;

import com.dao.Loginuser;

@Service
public class LoginUserService {
	@Resource
	private Loginuser loginuser;
	
	public boolean LoginUser(User user){
		return loginuser.loginUser(user);
	}
}
