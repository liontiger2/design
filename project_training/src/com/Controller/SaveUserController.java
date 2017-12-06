package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.User;
import com.service.SaveUserService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/saveuser")
public class SaveUserController {
	@Resource
	private SaveUserService saveUserService;
	@RequestMapping("/save")
	public String saveUser(User user){
		System.out.println(1111111);
		System.out.println(user.getName());
		saveUserService.saveuser(user);
		return "index";
	}
}
