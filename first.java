package com.hibernate.chapter1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class first {
	public static void main(String[] args) {
		
	AnnotationConfiguration config = new AnnotationConfiguration();
	
    config.configure("hibernate.cfg.xml");
    SessionFactory factory = config.buildSessionFactory();
    Session session =factory.getCurrentSession();
    session.beginTransaction();
    session.getTransaction().commit();
	}

}
