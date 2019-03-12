package cursoHibernate.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cursoHibernate.model.Employee;
import cursoHibernate.model.Project;

public class EmployeeProjectTest {

	public static void main(String[] args) {
		
		
		
		Employee nelson = new Employee("Nelson", 800.00);
		Employee robert = new Employee("Robert", 800.00);
		
		Project hibernate = new Project();
		hibernate.setName("Hibernate");
		
		Project jsp = new Project();
		jsp.setName("JSP");
		
		List<Project> projects = new ArrayList<>();

		projects.add(hibernate);
		projects.add(jsp);
		
		nelson.setProjects(projects);
		robert.setProjects(projects);
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session  = factory.openSession();
		
		session.beginTransaction();
		
		session.save(nelson);
		session.save(robert);
		
		session.getTransaction().commit();
		session.close();

	}

}
