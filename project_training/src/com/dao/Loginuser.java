package com.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.entity.Product;
import com.entity.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


@Repository
public class Loginuser {

	@Resource
	private SessionFactory sessionFactory;
	
	public boolean loginUser(User user){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		User user1 = session.get(User.class,user.getAddress());
		tx.commit();
		if(user1 != null){
			if(user.getPassword().equals(user1.getPassword())){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	public String userName(int id){
		User user = sessionFactory.getCurrentSession().get(User.class,new Integer(id));
		return user.getName();
	}
	
}
