package onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test2Aadhar {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		
		AadharCard aadharCard=entityManager.find(AadharCard.class,101);
		System.out.println(aadharCard.getId());
		System.out.println(aadharCard.getName());
		System.out.println(aadharCard.getDob());
		System.out.println("==============================");
		Person person=aadharCard.getPerson();
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getAddress());
		
	
	}

}
