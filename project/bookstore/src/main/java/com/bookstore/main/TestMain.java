package com.bookstore.main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Order;

import com.bookstore.dao.DaoImpl;
import com.bookstore.entity.Admin;
import com.bookstore.entity.Book;
import com.bookstore.entity.BookOfWebsite;
import com.bookstore.entity.Customer;
import com.bookstore.entity.MyOrder;
import com.bookstore.entity.Tag;

public class TestMain {
	public static void main(String[] args) throws Exception {
		DaoImpl jobDao = new DaoImpl();
		Admin admin1 = new Admin();
		Book b1 = new Book();
		Tag Tag1 = new Tag();
		BookOfWebsite bow = new BookOfWebsite();
		bow.setBooks(b1);
		Customer cus1 = new Customer("dat", "hanoi", "0903296935");

		
		jobDao.save(admin1);
		jobDao.save(b1);
		jobDao.save(Tag1);
		jobDao.save(bow);
		jobDao.saveCS_OR(cus1);
		
	}
}
