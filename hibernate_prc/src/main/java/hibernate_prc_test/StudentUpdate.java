package hibernate_prc_test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_prc_dto.Student;

public class StudentUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = new Student();
		student.setId(2);
		student.setName("Ankit");
		student.setAge(23);
		student.setAddress("Haryana");
		student.setFather_name("qwert");
		student.setMother_name("asdf");
		student.setPhone(741852);
		student.setGender("male");

		entityTransaction.begin();

		entityManager.merge(student);

		entityTransaction.commit();

	}

}
