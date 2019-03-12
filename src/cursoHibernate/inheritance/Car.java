package cursoHibernate.inheritance;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import cursoHibernate.model.Vehicle;

@Entity
public class Car extends Vehicle {

	private static final long serialVersionUID = 1L;
	
	public Car() {
		super();
	}
	
	public Car(String model, Integer year) {
		super(model, year);
	}

}
