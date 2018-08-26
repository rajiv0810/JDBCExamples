package com.dao;

import java.awt.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			System.out.println("creating 3 new student object...");
			
			Student student1 = new Student("paul", "wall", "paul1@gmail.com", null);
			Student student2 = new Student("paul2", "wall2", "paul2@gmail.com", null);
			Student student3 = new Student("paul3", "wall3", "paul3@gmail.com", null);

			session.beginTransaction();
			session.save(student1);
			session.save(student2);
			session.save(student3);
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}
	}


