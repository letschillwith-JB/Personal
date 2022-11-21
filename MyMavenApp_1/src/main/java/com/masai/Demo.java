package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUni");
		
		EntityManager em = emf.createEntityManager();
		
		Student s = em.find(Student.class, 6);
		
		if(s != null) {
			System.out.println(s);
		}else {
			System.out.println("Student does not exist");
		}
	}
}
