package onetmanybi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Test {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Cart cart = new Cart();
		cart.setId(101);
		cart.setName("Dimple");
		
		
		Items item1 = new Items();
		item1.setId(1);
		item1.setName("OnePlus Tv");
		item1.setProducer("OnePLus");
		item1.setCart(cart);

		Items item2 = new Items();
		item2.setId(10);
		item2.setName("Iphone 13");
		item2.setProducer("Iphone");
		item2.setCart(cart);
		
		Items item3 = new Items();
		item3.setId(25);
		item3.setName("Hp Laptop");
		item3.setProducer("Hp");
		item3.setCart(cart);
		
		
		List<Items> items=new ArrayList<Items>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		
		cart.setItems(items);


		transaction.begin();

		manager.persist(item1);
		manager.persist(item2);
		manager.persist(item3);
		manager.persist(cart);

		transaction.commit();

	}

}
