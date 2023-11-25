
package com.example.prep.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class del_EcoProductSpecificationsSuggessions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long specificationid;
	private long productid;
	private long userid;
	private String heading;
	private String answer;
	public del_EcoProductSpecificationsSuggessions() {
		
	}
	public long getSpecificationid() {
		return specificationid;
	}
	public void setSpecificationid(long specificationid) {
		this.specificationid = specificationid;
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
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public del_EcoProductSpecificationsSuggessions(long productid, long userid, String heading, String answer) {
		super();
		this.productid = productid;
		this.userid = userid;
		this.heading = heading;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "EcoProductSpecifications [specificationid=" + specificationid + ", productid=" + productid + ", userid="
				+ userid + ", heading=" + heading + ", answer=" + answer + "]";
	}
	

}
