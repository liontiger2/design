package com.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.entity.Product;

@Repository
public class CartDao {
	@Resource
	private SessionFactory sessionFactory;
	
	private Product cartDao(int id){
		
		//Product product= sessionFactory.getCurrentSession().get(Product.class,new Integer(id));
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		Product product = session.get(Product.class,new Integer(id));
		cart.setId(id);
		cart.setUserid(userid);
		cart.setName(product.getName());
		cart.setPrice(product.getPrice());
		cart.setUsername(username);
		tran.commit();
		session.close();
		return product;
	}
}
