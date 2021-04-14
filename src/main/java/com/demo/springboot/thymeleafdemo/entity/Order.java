package com.demo.springboot.thymeleafdemo.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="orders")
@EqualsAndHashCode(callSuper = true)
public class Order extends BaseEntity{

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="client_name")
	private String firstName;
	
	@Column(name="client_last_name")
	private String lastName;
	
	@Column(name="client_email")
	private String email;

	@Column(name="cpu_model")
	private String cpuModel;

	@Column(name="gpu_model")
	private String gpuModel;

	@Column(name="ram_size")
	private String ramSize;


	@Column(name="status")
	private String status;

	
		
	// define constructors
	
	public Order() {
		
	}

	public Order(int id,String firstName, String lastName, String email, String cpuModel, String gpuModel, String ramSize, Date orderDate, String status) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.cpuModel = cpuModel;
		this.gpuModel = gpuModel;
		this.ramSize = ramSize;
		this.status = status;
	}


	public Order(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	// define getter/setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public String getGpuModel() {
		return gpuModel;
	}

	public void setGpuModel(String gpuModel) {
		this.gpuModel = gpuModel;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String staus) {
		this.status = staus;
	}

	// define tostring


	@Override
	public String toString() {
		return "Order[" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", cpuModel='" + cpuModel + '\'' +
				", gpuModel='" + gpuModel + '\'' +
				", ramSize='" + ramSize + '\'' +
				", staus='" + status + '\'' +
				']';
	}
}











