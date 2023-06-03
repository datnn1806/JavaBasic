package com.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BookOfWebsite")
public class BookOfWebsite {
	@Id
	@Column(name = "BookID")
	private int BookID;

	@OneToOne
	@MapsId
	@JoinColumn(name = "BookID")
	private Book Books;

	@Column(name = "WebsiteUrl")
	private String WebsiteUrl;

	@Column(name = "WebsiteName")
	private String WebsiteName;

	@Column(name = "Status")
	private String Status;

	public BookOfWebsite() {
		super();
	}

	public BookOfWebsite(int bookID, String websiteUrl, String websiteName, String status) {
		super();
		BookID = bookID;
		WebsiteUrl = websiteUrl;
		WebsiteName = websiteName;
		Status = status;
	}

	public int getBookID() {
		return BookID;
	}

	public Book getBooks() {
		return Books;
	}

	public String getWebsiteUrl() {
		return WebsiteUrl;
	}

	public String getWebsiteName() {
		return WebsiteName;
	}

	public String getStatus() {
		return Status;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public void setBooks(Book books) {
		Books = books;
	}

	public void setWebsiteUrl(String websiteUrl) {
		WebsiteUrl = websiteUrl;
	}

	public void setWebsiteName(String websiteName) {
		WebsiteName = websiteName;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
