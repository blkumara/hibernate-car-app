package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCar {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Car car=new Car();
		
		car.setName("Baleno");
		car.setBrand("Maruti");
		car.setType("HashBack");
		car.setCost(1000000.00);
		
		entityTransaction.begin();
		entityManager.persist(car);
		
		entityTransaction.commit();
		
		System.out.println("Done");
		
	}

}
