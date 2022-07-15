package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoone.dto.Cart;
import manytoone.dto.Item;



public class Test {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Cart cart = new Cart();
		cart.setId(101);
		cart.setName("Dimple");
		
		
		Item item1 = new Item();
		item1.setId(1);
		item1.setName("OnePlus Tv");
		item1.setManufaturer("OnePLus");
		item1.setCart(cart);

		Item item2 = new Item();
		item2.setId(10);
		item2.setName("Iphone 13");
		item2.setManufaturer("Iphone");
		item2.setCart(cart);
		
		Item item3 = new Item();
		item3.setId(25);
		item3.setName("Hp Laptop");
		item3.setManufaturer("Hp");
		item3.setCart(cart);


		transaction.begin();

		manager.persist(item1);
		manager.persist(item2);
		manager.persist(item3);
		manager.persist(cart);

		transaction.commit();

	}
}
