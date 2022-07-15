package onetooneuni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import onetooneuni.dto.AadharCard;

public class AadharDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public AadharCard findAadharCard(int id) {
		EntityManager entityManager =getEntityManager();
		AadharCard aadharCard=entityManager.find(AadharCard.class,id);
		return aadharCard;
	}

}
