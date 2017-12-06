package com.service;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.dao.Loginuser;
import com.dao.ProductDao;
import com.entity.Cart;
import com.entity.Product;

@Service
public class CartService {
	@Resource
	private ProductDao productDao;
	
	public void cartService(int id,int userid){
		
	}
}
