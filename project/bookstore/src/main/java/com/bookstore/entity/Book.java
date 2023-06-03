package com.bookstore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Book")

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BookID")
	private int BookID;

	@OneToOne(mappedBy = "Books", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private BookOfWebsite BookOfWebsites;

	@Column(name = "Title")
	private String Title;

	@Column(name = "Status")
	private String Status;

	@Column(name = "Amount")
	private String Amount;

	@OneToMany(mappedBy = "Books")
	private List<Tag> tags;

	@OneToMany(mappedBy = "Books")
	private List<PublishingHouse> PublishingHouses;

	@OneToMany(mappedBy = "Books")
	private List<Order_Book> Order_Books;

	@OneToMany(mappedBy = "Books")
	List<Book_Author> Book_Authors;

	public Book() {
		super();
	}

	public Book(int bookID, BookOfWebsite bookOfWebsites, String title, String status, String amount, List<Tag> tags,
			List<Order_Book> order_Books) {
		super();
		BookID = bookID;
		BookOfWebsites = bookOfWebsites;
		Title = title;
		Status = status;
		Amount = amount;
		this.tags = tags;
		Order_Books = order_Books;
	}

	public BookOfWebsite getBookOfWebsites() {
		return BookOfWebsites;
	}

	public String getTitle() {
		return Title;
	}

	public String getStatus() {
		return Status;
	}

	public String getAmount() {
		return Amount;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public List<Order_Book> getOrder_Books() {
		return Order_Books;
	}

	public void setBookOfWebsites(BookOfWebsite bookOfWebsites) {
		BookOfWebsites = bookOfWebsites;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public void setOrder_Books(List<Order_Book> order_Books) {
		Order_Books = order_Books;
	}

}
