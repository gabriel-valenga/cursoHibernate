package cursoHibernate.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import cursoHibernate.model.Vehicle;

@Entity
public class Motorcycle extends Vehicle {

	private static final long serialVersionUID = 1L;
	
	public Motorcycle() {
		super();
	}
	
	public Motorcycle(String model, Integer year) {
		super(model, year);
	}

}
