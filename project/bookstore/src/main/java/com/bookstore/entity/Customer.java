package com.bookstore.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.criteria.Order;

@Entity
@Table(name = "Customer")

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerID")
	private int CustomerID;

	@Column(name = "CustomerName")
	private String CustomerName;

	@Column(name = "CustomerAddress")
	private String CustomerAddress;

	@Column(name = "CustomerPhone")
	private String CustomerPhone;

	@OneToMany(mappedBy = "customer")
	private List<MyOrder> myorders;

	public List<MyOrder> getMyorders() {
		return myorders;
	}

	public void setMyorders(List<MyOrder> myorders) {
		this.myorders = myorders;
	}

	public Customer() {
	}



	public Customer(String customerName, String customerAddress, String customerPhone) {
		super();
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		CustomerPhone = customerPhone;
	}

	public String getCustomerPhone() {
		return CustomerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		CustomerPhone = customerPhone;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}



	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}



}
