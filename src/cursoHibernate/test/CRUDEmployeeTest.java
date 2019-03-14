package cursoHibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cursoHibernate.model.Employee;

public class CRUDEmployeeTest {

	public static void main(String[] args) {
		
		//create();
		//read(1);
		//update(1);
		//delete(1);
		
		saveOrUpdate();
		
	}
	
	
	public static void create() {
		
		Employee employee1 = new Employee("Nelson", 800.00);
	
		Session session  = getSessionFactory().openSession();
		
		session.beginTransaction();
		
		session.save(employee1);
		
		session.getTransaction().commit();
	}
	
	public static void read(Integer id) {
		
		Session session  = getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Employee result = session.get(Employee.class, id);
		
		System.out.println(result.getName());
		
	}
	
	public static void update(Integer id) {
		
		Session session  = getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Employee emp = session.get(Employee.class, id);
		
		emp.setName("Rodolfo");
		
		session.update(emp);
		
		session.getTransaction().commit();
		
	}
	
	public static void delete(Integer id) {
		
		Session session  = getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Employee emp = session.get(Employee.class, id);
			
		session.delete(emp);
		
		session.getTransaction().commit();
		
	}
	
	public static void saveOrUpdate() {
		
		Session session  = getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Employee emp = new Employee("Edson", 1200.00);
		Employee emp2 = session.get(Employee.class, 2);
		emp2.setName("Gabriel");
		
		session.saveOrUpdate(emp);
		session.saveOrUpdate(emp2);
		
		session.getTransaction().commit();
		
	}
	
	private static SessionFactory getSessionFactory() {
		 SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 return factory;		
	}

}
