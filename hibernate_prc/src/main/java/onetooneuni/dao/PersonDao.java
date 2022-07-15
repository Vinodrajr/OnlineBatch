package onetooneuni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetooneuni.dto.AadharCard;
import onetooneuni.dto.Person;

public class PersonDao {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void savePerson(Person person, AadharCard aadharCard) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aadharCard);
		entityManager.persist(person);
		entityTransaction.commit();

	}

	public void updatePerson(Person person, AadharCard aadharCard) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(aadharCard);
		entityManager.merge(person);
		entityTransaction.commit();

	}

	public Person findPerson(int id) {
		EntityManager entityManager = getEntityManager();
		Person person = entityManager.find(Person.class, id);
		return person;
	}

	public void deletePerson(int id) {
		EntityManager entityManager = getEntityManager();
		Person person = findPerson(id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();

	}

	public Person findPersonByName(String name) {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select s from Person s where s.name=?1", Person.class);
		query.setParameter(1, name);
		Person person = (Person) query.getSingleResult();
		return person;
	}

}
