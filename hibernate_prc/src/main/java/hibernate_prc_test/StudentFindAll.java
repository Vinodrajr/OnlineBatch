package hibernate_prc_test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_prc_dto.Student;

public class StudentFindAll {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select asd from Student asd", Student.class);
		List<Student> list = query.getResultList();
		for (Student student : list) {
			System.out.println(student);
			System.out.println("===============================");
		}

	}

}
