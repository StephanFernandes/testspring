package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Card")
public class Card {

	
	@Column(name="account_no")
	private Long account_no;
	
	@Column(name="valid_from")
	private String valid_from;
	
	@Column(name="valid_to")
	private String valid_to;

	public Card(Long account_no, String valid_from, String valid_to) {
		super();
		this.account_no = account_no;
		this.valid_from = valid_from;
		this.valid_to = valid_to;
	}

	public Long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(Long account_no) {
		this.account_no = account_no;
	}

	public String getValid_from() {
		return valid_from;
	}

	public void setValid_from(String valid_from) {
		this.valid_from = valid_from;
	}

	public String getValid_to() {
		return valid_to;
	}

	public void setValid_to(String valid_to) {
		this.valid_to = valid_to;
	}
	
	
	
	
	
	
	
	
}
