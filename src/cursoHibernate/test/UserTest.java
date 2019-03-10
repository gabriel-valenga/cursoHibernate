package cursoHibernate.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cursoHibernate.model.User;

public class UserTest {
	
	public static void main(String[] args) {
		
		User user1 = new User("Test");
		User user2 = new User("Test2");
		User user3 = new User("Test3");
	
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		
		session.save(user1);
		session.save(user2);
		session.save(user3);
		session.getTransaction().commit();
		session.close();
				
	}

}
