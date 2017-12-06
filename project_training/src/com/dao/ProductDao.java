package com.dao;

import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.entity.Product;

@Repository
public class ProductDao {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public Product productdao(int id){
		
		
		//Product product= sessionFactory.getCurrentSession().get(Product.class,new Integer(id));
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Product p = session.get(Product.class, new Integer(id));
		
		t.commit();
		
		return p;
	}
}
