package cts.model.ui.composistion;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculties")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long facId;
	private String facName;
	
	@Embedded
	private Address addres;
	
	
	public Faculty() {
		super();
	}


	public Faculty( String facName, Address addres) {
		super();
		
		this.facName = facName;
		this.addres = addres;
	}


	public long getFacId() {
		return facId;
	}


	public void setFacId(long facId) {
		this.facId = facId;
	}


	public String getFacName() {
		return facName;
	}


	public void setFacName(String facName) {
		this.facName = facName;
	}


	public Address getAddres() {
		return addres;
	}


	public void setAddres(Address addres) {
		this.addres = addres;
	}
	
	
	
	
	
	
	
	

}
