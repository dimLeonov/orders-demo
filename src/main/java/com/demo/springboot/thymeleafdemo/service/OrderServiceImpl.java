package com.demo.springboot.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.thymeleafdemo.dao.OrderRepository;
import com.demo.springboot.thymeleafdemo.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

	private OrderRepository orderRepository;
	
	@Autowired
	public OrderServiceImpl(OrderRepository theOrderRepository) {
		orderRepository = theOrderRepository;
	}
	
	@Override
	public List<Order> findAll() {
		return orderRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Order findById(int theId) {
		Optional<Order> result = orderRepository.findById(theId);
		
		Order theOrder = null;
		
		if (result.isPresent()) {
			theOrder = result.get();
		}
		else {
			// we didn't find the order
			throw new RuntimeException("Did not find order id - " + theId);
		}
		
		return theOrder;
	}

	@Override
	public void save(Order theOrder) {
		orderRepository.save(theOrder);
	}

	@Override
	public void deleteById(int theId) {
		orderRepository.deleteById(theId);
	}

}






