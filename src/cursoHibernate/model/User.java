package cursoHibernate.model;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@Embedded
	@AttributeOverride(name ="address", column= @Column(name = "residential_address"))
	private UserAddress residentialAddress;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Vehicle> vehicles;;
		
	public User() {
	}
	
	public User(Integer id, String name, Date birthDate, MaritalStatus status, Integer age, UserAddress resAddress) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.status = status;
		this.age = age;
		this.residentialAddress = resAddress;
	}
	
	public User(String name, Date birthDate, MaritalStatus status, Integer age, UserAddress resAddress) {
		this.name = name;
		this.birthDate = birthDate;
		this.status = status;
		this.age = age;
		this.residentialAddress = resAddress;
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

	public UserAddress getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(UserAddress residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	
}
