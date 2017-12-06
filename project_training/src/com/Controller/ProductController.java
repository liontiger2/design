package com.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Product;
import com.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Resource
	private ProductService productservice;
	
	@RequestMapping(value="/single",method=RequestMethod.GET)
	public String productController(HttpSession session,@RequestParam("id") String id){
		System.out.println(11111);
		Product p = productservice.productService(new Integer(id));
		session.setAttribute("p",p);
			
		return "single-product";
	}
	public String getProductName(int id){
		Product product = productservice.productService(id);
		return product.getName();
	}
	public float getProductPrice(int id){
		Product product = productservice.productService(id);
		return product.getPrice();
	}
}
