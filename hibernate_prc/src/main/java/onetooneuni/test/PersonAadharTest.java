package onetooneuni.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneuni.dto.AadharCard;
import onetooneuni.dto.Person;

public class PersonAadharTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setPid(3);
		person.setName("Dimple");
		person.setCity("Delhi");

		AadharCard aadharCard = new AadharCard();
		aadharCard.setAid(153);
		aadharCard.setAddress("DELHI");
		aadharCard.setDob("24/05/1969");

		person.setAadhar(aadharCard);

		entityTransaction.begin();

		entityManager.persist(person);
		entityManager.persist(aadharCard);

		entityTransaction.commit();

	}

}
