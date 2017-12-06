package com.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {
	@Resource
	private CartService cartService;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String cartController(@RequestParam("id") String strid,@RequestParam("userid") String struserid){
		int id = new Integer(strid);
		int userid = new Integer(struserid);
		cartService.cartService(id, userid);
		return "index";
	}
}
