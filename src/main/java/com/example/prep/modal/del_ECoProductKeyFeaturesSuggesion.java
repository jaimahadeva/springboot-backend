
package com.example.prep.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class del_ECoProductKeyFeaturesSuggesion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long featureId;
	private long productid;
	private String imagename;
	private String featurename;
	public del_ECoProductKeyFeaturesSuggesion() {
		
	}
	public long getFeatureId() {
		return featureId;
	}
	public void setFeatureId(long featureId) {
		this.featureId = featureId;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	public String getFeaturename() {
		return featurename;
	}
	public void setFeaturename(String featurename) {
		this.featurename = featurename;
	}
	@Override
	public String toString() {
		return "ECoProductKeyFeatures [featureId=" + featureId + ", productid=" + productid + ", imagename=" + imagename
				+ ", featurename=" + featurename + "]";
	}
	public del_ECoProductKeyFeaturesSuggesion(long productid, String imagename, String featurename) {
		super();
		this.productid = productid;
		this.imagename = imagename;
		this.featurename = featurename;
	}
	

}
