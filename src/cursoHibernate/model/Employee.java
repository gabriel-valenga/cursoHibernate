package cursoHibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double salary;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="emp_proj", 
	joinColumns = @JoinColumn(name = "id_emp"),
	inverseJoinColumns = @JoinColumn(name = "id_proj"))
	private List<Project> projects;
	
	public Employee() {
		
	}
	
	public Employee( String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> project) {
		this.projects = project;
	}

}
