package com.bookstore.dao;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Order;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.bookstore.entity.Admin;
import com.bookstore.entity.Customer;
import com.bookstore.entity.MyOrder;
import com.bookstore.utils.HibernateUtils;

public class DaoImpl {
    public boolean save(Object obj) throws Exception {
        Session session = null;
        Transaction transaction = null;
        
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            
            Serializable result = session.save(obj);
            
            transaction.commit();
            
            return (result != null);
            
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    public boolean saveCS_OR(Customer cs) throws Exception {
        Session session = null;
        Transaction transaction = null;
        
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            
            MyOrder order1 = new MyOrder(cs, new Date(System.currentTimeMillis()), 3);
    		MyOrder order2 = new MyOrder(cs, new Date(System.currentTimeMillis()), 2);
    		MyOrder order3 = new MyOrder(cs, new Date(System.currentTimeMillis()), 1);
    		List<MyOrder> list = new ArrayList<>();
    		list.add(order1);
    		list.add(order2);
    		list.add(order3);
    		cs.setMyorders(list);
            
            Serializable result = session.save(cs);
            session.save(order1);
            session.save(order2);
            session.save(order3);
            
            transaction.commit();
            
            return (result != null);
            
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
