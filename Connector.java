package com.ict.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by Shawon on 5/10/17.
 */
public class Connector {
    public static Session getSession(){
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        return factory.getCurrentSession();
    }
}
