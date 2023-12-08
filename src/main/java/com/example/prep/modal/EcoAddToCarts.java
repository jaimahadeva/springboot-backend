package com.example.prep.modal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
@Entity
public class EcoAddToCarts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cartsId;
	private long productid;
	private long userid;
	private String productname;
	private LocalDate addedCartsDate;
	private String cartsNotifications;
	public EcoAddToCarts() {
		
	}
	public long getCartsId() {
		return cartsId;
	}
	public void setCartsId(long cartsId) {
		this.cartsId = cartsId;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public LocalDate getAddedCartsDate() {
		return addedCartsDate;
	}
	public void setAddedCartsDate(LocalDate addedCartsDate) {
		this.addedCartsDate = addedCartsDate;
	}
	public String getCartsNotifications() {
		return cartsNotifications;
	}
	public void setCartsNotifications(String cartsNotifications) {
		this.cartsNotifications = cartsNotifications;
	}
	@Override
	public String toString() {
		return "EcoAddToCarts [cartsId=" + cartsId + ", productid=" + productid + ", userid=" + userid
				+ ", productname=" + productname + ", addedCartsDate=" + addedCartsDate + ", cartsNotifications="
				+ cartsNotifications + "]";
	}
	public EcoAddToCarts(long productid, long userid, String productname, LocalDate addedCartsDate,
			String cartsNotifications) {
		super();
		this.productid = productid;
		this.userid = userid;
		this.productname = productname;
		this.addedCartsDate = addedCartsDate;
		this.cartsNotifications = cartsNotifications;
	}
	

}
