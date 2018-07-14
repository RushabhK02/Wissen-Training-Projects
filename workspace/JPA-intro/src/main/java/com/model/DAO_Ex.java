package com.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO_Ex {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("rushk");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPU");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		manager.persist(employee);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
	}
}
