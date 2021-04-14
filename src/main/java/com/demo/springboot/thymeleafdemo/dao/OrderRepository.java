package com.demo.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springboot.thymeleafdemo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	public List<Order> findAllByOrderByLastNameAsc();
	
}
