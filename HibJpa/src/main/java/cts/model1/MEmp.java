package cts.model1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manage2")
//@DiscriminatorValue("memp")
public class MEmp extends Emp {
	@Column(name="malw")
	private double alloances;

	public MEmp(long eid, String ename, double basic,double alloances) {
		super(eid,ename,basic);
		
		this.alloances = alloances;
	}

	public double getAlloances() {
		return alloances;
	}

	public void setAlloances(double alloances) {
		this.alloances = alloances;
	}
	
	

}
