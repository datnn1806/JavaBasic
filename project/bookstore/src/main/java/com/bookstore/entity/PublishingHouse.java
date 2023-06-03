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
@Table(name = "PublishingHouse")

public class PublishingHouse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;
	
	@ManyToOne
	@JoinColumn(name = "BookID", referencedColumnName = "BookID")
	private Book Books;

	@Column(name = "YearOfPublishing")
	private String YearOfPublishing;

	@Column(name = "CountryName")
	private String CountryName;


	public PublishingHouse() {
	}


	

}
