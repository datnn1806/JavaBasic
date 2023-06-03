package com.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tag")

public class Tag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;
	
	@ManyToOne
	@JoinColumn(name = "BookID", referencedColumnName = "BookID")
	private Book Books;

	@Column(name = "Name")
	private String Name;

	@Column(name = "Description")
	private String Description;

	@Column(name = "Level")
	private String Level;


	public Tag() {
	}


	public Tag(int iD, Book books, String name, String description, String level) {
		super();
		ID = iD;
		Books = books;
		Name = name;
		Description = description;
		Level = level;
	}


	public int getID() {
		return ID;
	}


	public Book getBooks() {
		return Books;
	}


	public String getName() {
		return Name;
	}


	public String getDescription() {
		return Description;
	}


	public String getLevel() {
		return Level;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public void setBooks(Book books) {
		Books = books;
	}


	public void setName(String name) {
		Name = name;
	}


	public void setDescription(String description) {
		Description = description;
	}

	public void setLevel(String level) {
		Level = level;
	}

}
