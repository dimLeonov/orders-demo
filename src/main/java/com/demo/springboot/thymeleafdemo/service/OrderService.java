package com.demo.springboot.thymeleafdemo.service;

import java.util.List;

import com.demo.springboot.thymeleafdemo.entity.Order;

public interface OrderService {

	public List<Order> findAll();
	
	public Order findById(int theId);
	
	public void save(Order theOrder);
	
	public void deleteById(int theId);
	
}
