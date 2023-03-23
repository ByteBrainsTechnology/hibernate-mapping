package com.bytebrains;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class App {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		
		List<User> user = null;
		Session session  = factory.openSession();
		Query query = session.createQuery("FROM User");
		user = query.list();
		for(User u : user) {
			System.out.println(u);
		}
		
	}
}