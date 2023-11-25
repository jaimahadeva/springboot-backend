package com.example.prep.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EcoProductImages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long imageid;
	private long productid;
	private long userid;
	private String imagename;
	public EcoProductImages() {
		
	}
	public long getImageid() {
		return imageid;
	}
	public void setImageid(long imageid) {
		this.imageid = imageid;
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
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	@Override
	public String toString() {
		return "EcoProductImages [imageid=" + imageid + ", productid=" + productid + ", userid=" + userid
				+ ", imagename=" + imagename + "]";
	}
	public EcoProductImages(long productid, long userid, String imagename) {
		super();
		this.productid = productid;
		this.userid = userid;
		this.imagename = imagename;
	}
	
}
