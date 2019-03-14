package cursoHibernate.test;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import cursoHibernate.model.Employee;
import cursoHibernate.test.generator.SessionFactoryGenerator;

public class HQLTest2Params {

	public static void main(String[] args) {
		
		Session session  = SessionFactoryGenerator.getSessionFactory().openSession();
		
		Integer id = 3;
		
		Query query = session.createQuery("FROM Employee e WHERE e.id >= ?0");
		
		query.setParameter(0, id);
		
		Query query2 = session.createQuery("FROM Employee e WHERE e.id >= :idparam");
		
		query2.setParameter("idparam", id);
		
		
		List <Employee> employees = query2.list();
		
		for (Employee employee : employees) {
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			System.out.println("----------------------\n");
		}

	}
	
	

}
