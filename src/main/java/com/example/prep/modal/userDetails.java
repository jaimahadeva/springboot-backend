package com.example.prep.modal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class userDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	private String firstName;
	private String lastName;
	private String emailId;

	private String address;
	private String password;

	public userDetails() {
	}

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn
//	private List<ecoNewProduct> productsjhg;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

//	public List<ecoNewProduct> getProducts() {
//		return productsjhg;
//	}
//
//	public void setProducts(List<ecoNewProduct> products) {
//		productsjhg = products;
//	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;

	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "userDetails [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", address=" + address + ", password=" + password +"]";
	}

	public userDetails(String firstName, String lastName, String emailId, String address, String password
			) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.address = address;
		this.password = password;
		
	}

}
