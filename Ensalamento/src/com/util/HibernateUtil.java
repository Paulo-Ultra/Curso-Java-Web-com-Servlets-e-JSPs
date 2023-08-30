package com.util;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static SessionFactory sf;
	
	static {
		sf = new Configuration().configure(new File("C:/Users/paulo.ultra/Documents" +
						"/Estudos PucRs/Softblue/Servlets e JSP's/" +
						"HibernateConfig/Ensalamento/src/hibernate.cfg.xml"))
				.buildSessionFactory();
	}
	
	public static Session getSession() {
		return sf.getCurrentSession();
	}
	
	public static void beginTransaction() {
		Session session = getSession();
		session.beginTransaction();
	}

	public static void commitTransaction() {
		Session session = getSession();
		session.getTransaction().commit();
	}

	public static void rollbackTransaction() {
		Session session = getSession();
		session.getTransaction().rollback();
	}
}
