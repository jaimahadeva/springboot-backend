package com.example.prep.modal;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EcoSubProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long subproductId;
	private long productid;
	private long  userid;
	@Column(length = 2000)
	private String productdescription;
	private String productname;
	private long oldprice;
	private long newprice;
	private String imagename;
	public EcoSubProductDetails() {
		
	}
	
	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public long getSubproductId() {
		return subproductId;
	}
	public void setSubproductId(long subproductId) {
		this.subproductId = subproductId;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public long getOldprice() {
		return oldprice;
	}
	public void setOldprice(long oldprice) {
		this.oldprice = oldprice;
	}
	public long getNewprice() {
		return newprice;
	}
	public void setNewprice(long newprice) {
		this.newprice = newprice;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	@Override
	public String toString() {
		return "EcoSubProductDetails [subproductId=" + subproductId + ", productid=" + productid + ", userid=" + userid
				+ ", productdescription=" + productdescription + ", productname=" + productname + ", oldprice="
				+ oldprice + ", newprice=" + newprice + ", imagename=" + imagename + "]";
	}

	public EcoSubProductDetails(long productid, long userid, String productdescription, String productname,
			long oldprice, long newprice, String imagename) {
		super();
		this.productid = productid;
		this.userid = userid;
		this.productdescription = productdescription;
		this.productname = productname;
		this.oldprice = oldprice;
		this.newprice = newprice;
		this.imagename = imagename;
	}
	

}
