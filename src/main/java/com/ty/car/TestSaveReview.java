package com.ty.car;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveReview {

	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Review review= new Review();
		
		review.setName("Kumara");
		review.setSubject("Worth for money");
		review.setContent("Product Is Good");
		
//		review.setCreateTime(LocalDateTime.now());
//		review.setUpdateTime(LocalDateTime.now());
		
		
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();
		System.out.println("Data Saved");
		
		
		
	}
}
