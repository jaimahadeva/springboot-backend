package com.example.prep.modal;

import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;






@Entity

public class EcoHomeloads {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	private long userId;
	private String firstName;
	private String productName;
	private String headline;
	@Column(length = 2000)
	private String description;
	private String timingLeft;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
    
	private List<EcoSubProductDetails> SubProducts;
	
	public EcoHomeloads() {
		
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTimingLeft() {
		return timingLeft;
	}
	public void setTimingLeft(String timingLeft) {
		this.timingLeft = timingLeft;
	}
	public List<EcoSubProductDetails> getSubProducts() {
		return SubProducts;
	}
	public void setSubProducts(List<EcoSubProductDetails> subProducts) {
		SubProducts = subProducts;
	}
	@Override
	public String toString() {
		return "ecoNewProduct [productId=" + productId + ", userId=" + userId + ", firstName=" + firstName
				+ ", productName=" + productName + ", headline=" + headline + ", description=" + description
				+ ", timingLeft=" + timingLeft + ", SubProducts=" + SubProducts + "]";
	}
	public EcoHomeloads(long userId, String firstName, String productName, String headline, String description,
			String timingLeft, List<EcoSubProductDetails> subProducts) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.productName = productName;
		this.headline = headline;
		this.description = description;
		this.timingLeft = timingLeft;
		SubProducts = subProducts;
	}
	
	}
