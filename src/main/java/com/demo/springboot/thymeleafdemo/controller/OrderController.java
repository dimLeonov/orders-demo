package com.demo.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.springboot.thymeleafdemo.entity.Order;
import com.demo.springboot.thymeleafdemo.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {

	private OrderService orderService;
	
	public OrderController(OrderService theOrderService) {
		orderService = theOrderService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listOrders(Model theModel) {
		
		// get order from db
		List<Order> theOrders = orderService.findAll();
		
		// add to the spring model
		theModel.addAttribute("orders", theOrders);
		
		return "orders/list-orders";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Order theOrder = new Order();
		
		theModel.addAttribute("order", theOrder);
		
		return "orders/order-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("orderId") int theId,
									Model theModel) {
		
		// get the order from the service
		Order theOrder = orderService.findById(theId);
		
		// set order as a model attribute to pre-populate the form
		theModel.addAttribute("order", theOrder);
		
		// send over to our form
		return "orders/order-form";
	}
	
	
	@PostMapping("/save")
	public String saveOrder(@ModelAttribute("order") Order theOrder) {
		
		// save the order
		orderService.save(theOrder);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/orders/list";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("orderId") int theId) {
		
		// delete the order
		orderService.deleteById(theId);
		// redirect to /orders/list
		return "redirect:/orders/list";
		
	}
}


















