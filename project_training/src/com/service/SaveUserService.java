package com.service;

import org.springframework.stereotype.Service;

import com.dao.Registuser;
import com.entity.User;

import javax.annotation.Resource;

@Service
public class SaveUserService {
	@Resource
	private Registuser registuser;

	public void saveuser(User user){
		registuser.saveuser(user);
	}
}
