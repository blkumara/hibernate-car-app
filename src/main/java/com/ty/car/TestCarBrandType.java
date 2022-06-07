package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestCarBrandType {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Query query = entityManager.createQuery("Select c From Car c where c.brand=?1
		// AND c.type=?2");
		Query query = entityManager.createQuery("Select c From Car c where c.name=?1");
		// query.setParameter(1, "Maruti");
		// query.setParameter(2, "HashBack");
		query.setParameter(1, "Polo Gt");
		List<Car> list = query.getResultList();
		if (list.size() > 0) {
			for (Car car : list) {
				System.out.println("User Id :" + car.getId());
				System.out.println("User name:" + car.getName());
				System.out.println("User email:" + car.getBrand());
				System.out.println("User type :" + car.getType());

			}
		} else {
			System.out.println("Invalid Brand and Type");
		}

	}
}
