package com.bookstore.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MyOrder")

public class MyOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID")
	private int OrderID;

	@ManyToOne
	@JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID")

	private Customer customer;

	@Column(name = "OrderDate")
	private Date OrderDate;

	@Column(name = "OrderAmount")
	private int OrderAmount;

	public MyOrder() {
	}

	public MyOrder(Customer customer, Date orderDate, int orderAmount) {
		this.customer = customer;
		OrderDate = orderDate;
		OrderAmount = orderAmount;
	}

	@OneToMany(mappedBy = "myorder")
    List<Order_Book> Order_Books;

	public int getOrderID() {
		return OrderID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getOrderAmount() {
		return OrderAmount;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public Date getOrderDate() {
		return OrderDate;
	}



	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}



	public void setOrderAmount(int orderAmount) {
		OrderAmount = orderAmount;
	}

}
