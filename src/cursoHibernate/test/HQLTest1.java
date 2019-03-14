package cursoHibernate.test;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import cursoHibernate.model.Employee;
import cursoHibernate.test.generator.SessionFactoryGenerator;

public class HQLTest1 {

	public static void main(String[] args) {
		
		Session session  = SessionFactoryGenerator.getSessionFactory().openSession();
		
		Query query = session.createQuery("FROM Employee ORDER BY name");
		
		List <Employee> employees = query.list();
		
		for (Employee employee : employees) {
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			System.out.println("----------------------\n");
		}

	}
	
	

}
