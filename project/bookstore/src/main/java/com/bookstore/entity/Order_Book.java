package com.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Order_Book {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ID")
	    private int ID;

	    @ManyToOne
	    @JoinColumn(name = "OrderID")
	    private MyOrder myorder;
	    
	    @ManyToOne
	    @JoinColumn(name = "BookID")
	    private Book Books;

		public Order_Book() {
			
		}
		

		public Order_Book(MyOrder myorder, Book Books) {
			super();
			this.myorder = myorder;
			this.Books = Books;
		}


		public int getID() {
			return ID;
		}

		public MyOrder getMyorder() {
			return myorder;
		}

		public Book getBooks() {
			return Books;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public void setMyorder(MyOrder myorder) {
			this.myorder = myorder;
		}

		public void setBooks(Book Books) {
			this.Books = Books;
		}


}
