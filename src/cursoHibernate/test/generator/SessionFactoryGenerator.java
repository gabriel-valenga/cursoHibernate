package cursoHibernate.test.generator;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryGenerator {

	public static SessionFactory getSessionFactory() {
		 SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 return factory;		
	}
}
