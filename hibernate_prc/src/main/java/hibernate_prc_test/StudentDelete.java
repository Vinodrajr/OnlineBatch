package hibernate_prc_test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_prc_dto.Student;

public class StudentDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Student student = entityManager.find(Student.class, 1);
		System.out.println(student);

		
	}

}
