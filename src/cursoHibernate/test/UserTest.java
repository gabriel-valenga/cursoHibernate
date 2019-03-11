package cursoHibernate.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cursoHibernate.model.User;
import cursoHibernate.model.enums.MaritalStatus;

public class UserTest {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		try {		
			User user1 = new User("Test", sdf.parse("21-07-1995"), MaritalStatus.MARRIED, 24 );
			User user2 = new User("Test2", sdf.parse("24-11-1990"), MaritalStatus.SINGLE, 29);
			User user3 = new User("Test3", sdf.parse("14-09-1984"), MaritalStatus.DIVORCED, 35);
	
	
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
					
			session.save(user1);
			session.save(user2);
			session.save(user3);
			
			session.getTransaction().commit();
			session.close();
		}
		catch(ParseException e) {
			e.getMessage();
		}
		
				
	}

}
