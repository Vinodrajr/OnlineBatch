package onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test1FindPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person=entityManager.find(Person.class,1);
		
		System.out.println(person.getName());
		System.out.println(person.getAddress());
		System.out.println(person.getId());
		
		System.out.println("=================");
		
		AadharCard aadharCard=person.getCard();
		System.out.println(aadharCard.getId());
		System.out.println(aadharCard.getName());
		System.out.println(aadharCard.getDob());
		
	
	}

}
