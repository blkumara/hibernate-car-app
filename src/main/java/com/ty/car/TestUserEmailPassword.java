package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestUserEmailPassword {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "Select u From User u where u.email=?1 AND u.password=?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, "varun@gmail.com");
		query.setParameter(2, "varun123");
		List<User> list = query.getResultList();
		if (list.size() > 0) {
			// for (User user : list) {
			User user2 = list.get(0);
			System.out.println("User Id :" + user2.getId());
			System.out.println("User name:" + user2.getName());
			System.out.println("User email:" + user2.getEmail());
			System.out.println("User password :" + user2.getPassword());
			System.out.println("User gender:" + user2.getGender());

		}
		// }
		else {
			System.out.println("Invalid user mail and password");
		}
	}

}
