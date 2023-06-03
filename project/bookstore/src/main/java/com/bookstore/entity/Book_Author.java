package com.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Book_Author {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ID")
	    private int ID;

	    @ManyToOne
	    @JoinColumn(name = "bookID")
	    private Book Books;
	    
	    @ManyToOne
	    @JoinColumn(name = "authorID")
	    private Author Authors;

		public Book_Author() {
			
		}

		public Book_Author(int iD, Book books, Author authors) {
			super();
			ID = iD;
			Books = books;
			Authors = authors;
		}

		public int getID() {
			return ID;
		}

		public Book getBooks() {
			return Books;
		}

		public Author getAuthors() {
			return Authors;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public void setBooks(Book books) {
			Books = books;
		}

		public void setAuthors(Author authors) {
			Authors = authors;
		}
		

		


}
