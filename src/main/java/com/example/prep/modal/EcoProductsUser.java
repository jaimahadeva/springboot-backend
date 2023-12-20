package com.example.prep.modal;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;
@Entity
public class EcoProductsUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productid;
	private long userid;
	private String productname;
	@Column(length=4000)
	private String desciption;
	private long oldprice;
	private long newprice;
	private long discount;
	private long itemsLeft;
	private String store;
	@Nullable
    private boolean addtocart;
	private long ratings;

	private long ratingsgiveby;
	private String category;
	private String expecteddelivery;
	@Nullable
	private String specialoffer;
	@Nullable
	private String specialdesciption;
	private long totalorders;
	private String brandname;

	private long totalansweredquestions;
	@Nullable
	private boolean openboxpolicy;
	@Column(length=4000)
	private String aboutthisitem;
	
	private LocalDate addeddate;
	
	private LocalDate orderedDate;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	@Nullable
	private List<del_EcoProductOffersSuggesion> offers;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	@Nullable
	private List<del_ECoProductKeyFeaturesSuggesion> keyfeatures;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	@Nullable
	private List<del_EcoProductReviewsSuggession> productreviews;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	@Nullable
	private  List<del_EcoProductQuestionsSuggessions> questions;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	@Nullable
	private  List<del_EcoProductSpecificationsSuggessions> specifications;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	@Nullable
	private  List<del_EcoProductImagesSuggessions> images;
	

	public EcoProductsUser() {
		
	}

	public LocalDate getAddeddate() {
		return addeddate;
	}

	public void setAddeddate(LocalDate addeddate) {
		this.addeddate = addeddate;
	}

	public LocalDate getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(LocalDate orderedDate) {
		this.orderedDate = orderedDate;
	}

	public long getProductid() {
		return productid;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
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

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
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

	public long getDiscount() {
		return discount;
	}

	public void setDiscount(long discount) {
		this.discount = discount;
	}

	public long getItemsLeft() {
		return itemsLeft;
	}

	public void setItemsLeft(long itemsLeft) {
		this.itemsLeft = itemsLeft;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public boolean isAddtocart() {
		return addtocart;
	}

	public void setAddtocart(boolean addtocart) {
		this.addtocart = addtocart;
	}

	public long getRatings() {
		return ratings;
	}

	public void setRatings(long ratings) {
		this.ratings = ratings;
	}

	public long getRatingsgiveby() {
		return ratingsgiveby;
	}

	public void setRatingsgiveby(long ratingsgiveby) {
		this.ratingsgiveby = ratingsgiveby;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getExpecteddelivery() {
		return expecteddelivery;
	}

	public void setExpecteddelivery(String expecteddelivery) {
		this.expecteddelivery = expecteddelivery;
	}

	public String getSpecialoffer() {
		return specialoffer;
	}

	public void setSpecialoffer(String specialoffer) {
		this.specialoffer = specialoffer;
	}

	public String getSpecialdesciption() {
		return specialdesciption;
	}

	public void setSpecialdesciption(String specialdesciption) {
		this.specialdesciption = specialdesciption;
	}

	public long getTotalorders() {
		return totalorders;
	}

	public void setTotalorders(long totalorders) {
		this.totalorders = totalorders;
	}

	public long getTotalansweredquestions() {
		return totalansweredquestions;
	}

	public void setTotalansweredquestions(long totalansweredquestions) {
		this.totalansweredquestions = totalansweredquestions;
	}

	public boolean isOpenboxpolicy() {
		return openboxpolicy;
	}

	public void setOpenboxpolicy(boolean openboxpolicy) {
		this.openboxpolicy = openboxpolicy;
	}

	public String getAboutthisitem() {
		return aboutthisitem;
	}

	public void setAboutthisitem(String aboutthisitem) {
		this.aboutthisitem = aboutthisitem;
	}

	public List<del_EcoProductOffersSuggesion> getOffers() {
		return offers;
	}

	public void setOffers(List<del_EcoProductOffersSuggesion> offers) {
		this.offers = offers;
	}

	public List<del_ECoProductKeyFeaturesSuggesion> getKeyfeatures() {
		return keyfeatures;
	}

	public void setKeyfeatures(List<del_ECoProductKeyFeaturesSuggesion> keyfeatures) {
		this.keyfeatures = keyfeatures;
	}

	public List<del_EcoProductReviewsSuggession> getProductreviews() {
		return productreviews;
	}

	public void setProductreviews(List<del_EcoProductReviewsSuggession> productreviews) {
		this.productreviews = productreviews;
	}

	public List<del_EcoProductQuestionsSuggessions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<del_EcoProductQuestionsSuggessions> questions) {
		this.questions = questions;
	}

	public List<del_EcoProductSpecificationsSuggessions> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(List<del_EcoProductSpecificationsSuggessions> specifications) {
		this.specifications = specifications;
	}

	public List<del_EcoProductImagesSuggessions> getImages() {
		return images;
	}

	public void setImages(List<del_EcoProductImagesSuggessions> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "EcoProducts [productid=" + productid + ", userid=" + userid + ", productname=" + productname
				+ ", desciption=" + desciption + ", oldprice=" + oldprice + ", newprice=" + newprice + ", discount="
				+ discount + ", itemsLeft=" + itemsLeft + ", store=" + store + ", addtocart=" + addtocart + ", ratings="
				+ ratings + ", ratingsgiveby=" + ratingsgiveby + ", category=" + category + ", expecteddelivery="
				+ expecteddelivery + ", specialoffer=" + specialoffer + ", specialdesciption=" + specialdesciption
				+ ", totalorders=" + totalorders + ", brandname=" + brandname + ", totalansweredquestions="
				+ totalansweredquestions + ", openboxpolicy=" + openboxpolicy + ", aboutthisitem=" + aboutthisitem
				+ ", addeddate=" + addeddate + ", orderedDate=" + orderedDate + ", offers=" + offers + ", keyfeatures="
				+ keyfeatures + ", productreviews=" + productreviews + ", questions=" + questions + ", specifications="
				+ specifications + ", images=" + images + "]";
	}

	public EcoProductsUser(long userid, String productname, String desciption, long oldprice, long newprice, long discount,
			long itemsLeft, String store, boolean addtocart, long ratings, long ratingsgiveby, String category,
			String expecteddelivery, String specialoffer, String specialdesciption, long totalorders, String brandname,
			long totalansweredquestions, boolean openboxpolicy, String aboutthisitem, LocalDate addeddate,
			LocalDate orderedDate, List<del_EcoProductOffersSuggesion> offers, List<del_ECoProductKeyFeaturesSuggesion> keyfeatures,
			List<del_EcoProductReviewsSuggession> productreviews, List<del_EcoProductQuestionsSuggessions> questions,
			List<del_EcoProductSpecificationsSuggessions> specifications, List<del_EcoProductImagesSuggessions> images) {
		super();
		this.userid = userid;
		this.productname = productname;
		this.desciption = desciption;
		this.oldprice = oldprice;
		this.newprice = newprice;
		this.discount = discount;
		this.itemsLeft = itemsLeft;
		this.store = store;
		this.addtocart = addtocart;
		this.ratings = ratings;
		this.ratingsgiveby = ratingsgiveby;
		this.category = category;
		this.expecteddelivery = expecteddelivery;
		this.specialoffer = specialoffer;
		this.specialdesciption = specialdesciption;
		this.totalorders = totalorders;
		this.brandname = brandname;
		this.totalansweredquestions = totalansweredquestions;
		this.openboxpolicy = openboxpolicy;
		this.aboutthisitem = aboutthisitem;
		this.addeddate = addeddate;
		this.orderedDate = orderedDate;
		this.offers = offers;
		this.keyfeatures = keyfeatures;
		this.productreviews = productreviews;
		this.questions = questions;
		this.specifications = specifications;
		this.images = images;
	}

	


	
}
