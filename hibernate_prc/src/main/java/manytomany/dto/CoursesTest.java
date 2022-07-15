package manytomany.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CoursesTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Courses courses = new Courses();
		courses.setId(100);
		courses.setCname("Java");

		Courses courses2 = new Courses();
		courses2.setId(101);
		courses2.setCname("FrontEnd");

		Courses courses3 = new Courses();
		courses3.setId(102);
		courses3.setCname("Advance Java");

		Studentes student = new Studentes();
		student.setId(1);
		student.setName("Ram");

		List<Courses> list1 = new ArrayList<Courses>();

		list1.add(courses);
		list1.add(courses2);

		student.setCourses(list1);

		Studentes student2 = new Studentes();
		student2.setId(2);
		student2.setName("Rakesh");

		List<Courses> list2 = new ArrayList<Courses>();

		list2.add(courses);
		list2.add(courses2);
		list2.add(courses3);

		student2.setCourses(list2);

		entityTransaction.begin();

		entityManager.persist(courses);
		entityManager.persist(courses2);
		entityManager.persist(courses3);
		entityManager.persist(student);
		entityManager.persist(student2);

		entityTransaction.commit();

	}

}
