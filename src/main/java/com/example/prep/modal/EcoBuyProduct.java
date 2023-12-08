package com.example.prep.modal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class EcoBuyProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long buyproductid;
	private long userid;
	private long productid;
	private String productname;
	private LocalDate ordereddate;
	public EcoBuyProduct() {
		
	}
	public long getBuyproductid() {
		return buyproductid;
	}
	public void setBuyproductid(long buyproductid) {
		this.buyproductid = buyproductid;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public LocalDate getOrdereddate() {
		return ordereddate;
	}
	public void setOrdereddate(LocalDate ordereddate) {
		this.ordereddate = ordereddate;
	}
	@Override
	public String toString() {
		return "EcoBuyProduct [buyproductid=" + buyproductid + ", userid=" + userid + ", productid=" + productid
				+ ", productname=" + productname + ", ordereddate=" + ordereddate + "]";
	}
	public EcoBuyProduct(long userid, long productid, String productname, LocalDate ordereddate) {
		super();
		this.userid = userid;
		this.productid = productid;
		this.productname = productname;
		this.ordereddate = ordereddate;
	}
	

}
