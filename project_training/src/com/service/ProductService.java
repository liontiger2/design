package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.entity.Product;

@Service
public class ProductService {
	@Resource
	private ProductDao productDao;
	
	public Product productService(int id){
		return productDao.productdao(id);
	}
}