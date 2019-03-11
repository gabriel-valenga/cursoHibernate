package cursoHibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import cursoHibernate.model.enums.MaritalStatus;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@Temporal(TemporalType.DATE)
	@Column(name = "birth_date")
	private Date birthDate;
	@Enumerated(EnumType.STRING)
	@Column(name = "marital_status")
	private MaritalStatus status;
	private Integer age;
	
	public User() {
	}
	
	public User(Integer id, String name, Date birthDate, MaritalStatus status, Integer age) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.status = status;
		this.age = age;
	}
	
	public User(String name, Date birthDate, MaritalStatus status, Integer age) {
		this.name = name;
		this.birthDate = birthDate;
		this.status = status;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public MaritalStatus getStatus() {
		return status;
	}

	public void setStatus(MaritalStatus status) {
		this.status = status;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
