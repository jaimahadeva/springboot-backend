
package com.example.prep.modal;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class del_EcoProductOffersSuggesion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long offerid;
	private long productid;
	private LocalDate offerstartDate;
	private LocalDate offersEndDate;
	private String name;
	private String description;
	public del_EcoProductOffersSuggesion() {
		
	}
	public long getOfferid() {
		return offerid;
	}
	public void setOfferid(long offerid) {
		this.offerid = offerid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public LocalDate getOfferstartDate() {
		return offerstartDate;
	}
	public void setOfferstartDate(LocalDate offerstartDate) {
		this.offerstartDate = offerstartDate;
	}
	public LocalDate getOffersEndDate() {
		return offersEndDate;
	}
	public void setOffersEndDate(LocalDate offersEndDate) {
		this.offersEndDate = offersEndDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "EcoProductOffers [offerid=" + offerid + ", productid=" + productid + ", offerstartDate="
				+ offerstartDate + ", offersEndDate=" + offersEndDate + ", name=" + name + ", description="
				+ description + "]";
	}
	public del_EcoProductOffersSuggesion(long productid, LocalDate offerstartDate, LocalDate offersEndDate, String name,
			String description) {
		super();
		this.productid = productid;
		this.offerstartDate = offerstartDate;
		this.offersEndDate = offersEndDate;
		this.name = name;
		this.description = description;
	}
	

}
