package com.example.prep.modal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class EcoBuyProStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long statusid;
	private long userid;
	private long productid;
	private String productname;
	private String ordereddate;
	private String orderaccepteddate;
	private String deliveredaddress;
	private String acceptername;
	private String delivereddate;
	private String deliverypersonname;
	private String orderrecievedby;
	private String shippeddate;
	private String shippingpartner;
	private String shippercomments;
	private String ownercomments;
	private String expecteddeliverydate;
	public   EcoBuyProStatus() {
		
	}
	public long getStatusid() {
		return statusid;
	}
	public void setStatusid(long statusid) {
		this.statusid = statusid;
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
	public String getOrdereddate() {
		return ordereddate;
	}
	public void setOrdereddate(String ordereddate) {
		this.ordereddate = ordereddate;
	}
	public String getOrderaccepteddate() {
		return orderaccepteddate;
	}
	public void setOrderaccepteddate(String orderaccepteddate) {
		this.orderaccepteddate = orderaccepteddate;
	}
	public String getDeliveredaddress() {
		return deliveredaddress;
	}
	public void setDeliveredaddress(String deliveredaddress) {
		this.deliveredaddress = deliveredaddress;
	}
	public String getAcceptername() {
		return acceptername;
	}
	public void setAcceptername(String acceptername) {
		this.acceptername = acceptername;
	}
	public String getDelivereddate() {
		return delivereddate;
	}
	public void setDelivereddate(String delivereddate) {
		this.delivereddate = delivereddate;
	}
	public String getDeliverypersonname() {
		return deliverypersonname;
	}
	public void setDeliverypersonname(String deliverypersonname) {
		this.deliverypersonname = deliverypersonname;
	}
	public String getOrderrecievedby() {
		return orderrecievedby;
	}
	public void setOrderrecievedby(String orderrecievedby) {
		this.orderrecievedby = orderrecievedby;
	}
	public String getShippeddate() {
		return shippeddate;
	}
	public void setShippeddate(String shippeddate) {
		this.shippeddate = shippeddate;
	}
	public String getShippingpartner() {
		return shippingpartner;
	}
	public void setShippingpartner(String shippingpartner) {
		this.shippingpartner = shippingpartner;
	}
	public String getShippercomments() {
		return shippercomments;
	}
	public void setShippercomments(String shippercomments) {
		this.shippercomments = shippercomments;
	}
	public String getOwnercomments() {
		return ownercomments;
	}
	public void setOwnercomments(String ownercomments) {
		this.ownercomments = ownercomments;
	}
	public String getExpecteddeliverydate() {
		return expecteddeliverydate;
	}
	public void setExpecteddeliverydate(String expecteddeliverydate) {
		this.expecteddeliverydate = expecteddeliverydate;
	}
	@Override
	public String toString() {
		return "EcoBuyProStatus [statusid=" + statusid + ", userid=" + userid + ", productid=" + productid
				+ ", productname=" + productname + ", ordereddate=" + ordereddate + ", orderaccepteddate="
				+ orderaccepteddate + ", deliveredaddress=" + deliveredaddress + ", acceptername=" + acceptername
				+ ", delivereddate=" + delivereddate + ", deliverypersonname=" + deliverypersonname
				+ ", orderrecievedby=" + orderrecievedby + ", shippeddate=" + shippeddate + ", shippingpartner="
				+ shippingpartner + ", shippercomments=" + shippercomments + ", ownercomments=" + ownercomments
				+ ", expecteddeliverydate=" + expecteddeliverydate + "]";
	}
	public EcoBuyProStatus(long userid, long productid, String productname, String ordereddate,
			String orderaccepteddate, String deliveredaddress, String acceptername, String delivereddate,
			String deliverypersonname, String orderrecievedby, String shippeddate, String shippingpartner,
			String shippercomments, String ownercomments, String expecteddeliverydate) {
		super();
		this.userid = userid;
		this.productid = productid;
		this.productname = productname;
		this.ordereddate = ordereddate;
		this.orderaccepteddate = orderaccepteddate;
		this.deliveredaddress = deliveredaddress;
		this.acceptername = acceptername;
		this.delivereddate = delivereddate;
		this.deliverypersonname = deliverypersonname;
		this.orderrecievedby = orderrecievedby;
		this.shippeddate = shippeddate;
		this.shippingpartner = shippingpartner;
		this.shippercomments = shippercomments;
		this.ownercomments = ownercomments;
		this.expecteddeliverydate = expecteddeliverydate;
	}
	
}
