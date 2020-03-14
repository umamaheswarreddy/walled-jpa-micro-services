package com.hasa.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Trainees")
public class Trainee implements Comparable<Trainee> {
	
	@Id
	private int admno;
	private String sName;
	
	@ManyToOne
	@JoinColumn(name="cid")
	private Cource course;
	
	

	public Trainee() {
		
	}



	public Trainee(int admno, String sName, Cource course) {
		super();
		this.admno = admno;
		this.sName = sName;
		this.course = course;
	}



	public int getAdmno() {
		return admno;
	}



	public void setAdmno(int admno) {
		this.admno = admno;
	}



	public String getsName() {
		return sName;
	}



	public void setsName(String sName) {
		this.sName = sName;
	}



	public Cource getCourse() {
		return course;
	}



	public void setCourse(Cource course) {
		this.course = course;
	}



	public int compareTo(Trainee o) {
		
		return (this.admno<o.admno?-1:(this.admno>o.admno?1:0));
	}
	

}
