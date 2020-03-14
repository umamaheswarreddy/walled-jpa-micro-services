package com.manytomany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie  implements Comparable<Movie>{
	
	@Id
	private int mid;
	private String mname;
	
	@ManyToMany(mappedBy="movies")
	private Set<Artist> artists;
	
	

	public Movie() {
		
	}

	public Movie(int mid, String mname, Set<Artist> artists) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.artists = artists;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}

	public int compareTo(Movie o) {
		return (this.mid<o.mid?-1:(this.mid>o.mid?1:0));
	}

	
	
	

}
