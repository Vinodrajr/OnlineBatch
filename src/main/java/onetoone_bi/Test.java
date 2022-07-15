package onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {

		Person person = new Person();
		person.setId(1);
		person.setName("Ram");
		person.setAddress("Chn");

		AadharCard aadharCard = new AadharCard();
		aadharCard.setId(101);
		aadharCard.setName("Ram");
		aadharCard.setDob("15/09/1948");
		aadharCard.setPerson(person);

		person.setCard(aadharCard);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(aadharCard);
		entityManager.persist(person);
		entityTransaction.commit();

	}

}
