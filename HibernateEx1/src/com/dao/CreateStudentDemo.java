package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			System.out.println("creating new object...");
			Student student = new Student("paul", "wall", "paul@gmail.com", null);
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
