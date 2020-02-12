package com.metaform.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@NotNull
	@Column(name="name")
	private String name;

	@Column(name="email")
	private String email;

	@Column(name="address")
	private String address;
	
	@Column(name="silindi")
	private Boolean silindi=false;

	public Customer() {
	}
	
	public Customer(Long id, String name, String email, String address, Boolean silindi) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.silindi = silindi;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getSilindi() {
		return silindi;
	}
	public void setSilindi(Boolean silindi) {
		this.silindi = silindi;
	}
}
