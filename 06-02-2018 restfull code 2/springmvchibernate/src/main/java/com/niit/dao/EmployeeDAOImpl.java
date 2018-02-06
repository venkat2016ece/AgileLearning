package com.niit.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.EmployeeVO;




@Repository(value = "employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	 private SessionFactory sessionFactory;
	 @Autowired
	 public EmployeeDAOImpl(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
	 @SuppressWarnings("unchecked")
	    public List<EmployeeVO> listOfEmployeeVO() {
	        List<EmployeeVO> list = null;
	        Transaction tx = null;
	        try {
	            tx = sessionFactory.getCurrentSession().beginTransaction();
	            list = sessionFactory.getCurrentSession().createQuery("from EmployeeVO").list();
	            tx.commit();
	        } catch (HibernateException e) {
	            if (tx != null) tx.rollback();
	            e.printStackTrace();
	        }
	        return list;
	    }

	    private SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

	    private Session getCurrentSession() {
	        Session session = getSessionFactory().getCurrentSession();
	        if (session == null) {
	            session = getSessionFactory().openSession();
	        }
	        return session;
	    }	
}