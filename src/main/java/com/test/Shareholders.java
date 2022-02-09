package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Shareholder")
public class Shareholders {
	
	@Column(name="name")
	private String name;

	
	public Shareholders(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
