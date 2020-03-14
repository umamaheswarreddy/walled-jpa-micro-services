package cts.model1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("cemp")
@Table(name="contract2")
public class CEmp extends Emp {
	
	@Column(name="hra")
	private double hra;
	
	

	public CEmp() {
		super();
	}

    public  CEmp(long eid, String ename, double basic,double hra) {
    	super(eid,ename,basic);
    	
    	this.hra=hra;
    }

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	


	
	
	

}
