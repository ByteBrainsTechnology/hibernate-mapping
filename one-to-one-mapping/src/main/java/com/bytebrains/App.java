package com.bytebrains;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Instructor instructor =  new Instructor("Shradha", "Jagdale", "shradha.com");
		InstructorDetails instructorDetails = new InstructorDetails("Playing Kho-Kho");
		instructor.setInstructorDetails(instructorDetails);
		Transaction tx = session.beginTransaction();
		session.save(instructor);
		tx.commit();
		session.close();
		
		// update  -- 
		// delete  -- 
		// get   -- 
		
	}
}
