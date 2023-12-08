
package com.example.prep.modal;

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
public class del_EcoProductReviewsSuggession {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reviewid;
	private long productid;
	private long likescount;
	private long dislikescount;
	private long replycount;
	private String date;
	private Boolean iscertifiedBuyer;
	private String overallExperience;
	@Column(length=2000)
	@Nullable
	private String review;
	private long userId;
	private String username;
	@Nullable
	private long ratings;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	@Nullable
	private List<del_EcoProductReviewRepliesSuggessions> replies;
	public del_EcoProductReviewsSuggession() {
		
	}
	public long getReviewid() {
		return reviewid;
	}
	public void setReviewid(long reviewid) {
		this.reviewid = reviewid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public long getLikescount() {
		return likescount;
	}
	public void setLikescount(long likescount) {
		this.likescount = likescount;
	}
	public long getDislikescount() {
		return dislikescount;
	}
	public void setDislikescount(long dislikescount) {
		this.dislikescount = dislikescount;
	}
	public long getReplycount() {
		return replycount;
	}
	public void setReplycount(long replycount) {
		this.replycount = replycount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Boolean getIscertifiedBuyer() {
		return iscertifiedBuyer;
	}
	public void setIscertifiedBuyer(Boolean iscertifiedBuyer) {
		this.iscertifiedBuyer = iscertifiedBuyer;
	}
	public String getOverallExperience() {
		return overallExperience;
	}
	public void setOverallExperience(String overallExperience) {
		this.overallExperience = overallExperience;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getRatings() {
		return ratings;
	}
	public void setRatings(long ratings) {
		this.ratings = ratings;
	}
	public List<del_EcoProductReviewRepliesSuggessions> getReplies() {
		return replies;
	}
	public void setReplies(List<del_EcoProductReviewRepliesSuggessions> replies) {
		this.replies = replies;
	}
	@Override
	public String toString() {
		return "EcoProductReviews [reviewid=" + reviewid + ", productid=" + productid + ", likescount=" + likescount
				+ ", dislikescount=" + dislikescount + ", replycount=" + replycount + ", date=" + date
				+ ", iscertifiedBuyer=" + iscertifiedBuyer + ", overallExperience=" + overallExperience + ", review="
				+ review + ", userId=" + userId + ", username=" + username + ", ratings=" + ratings + ", replies="
				+ replies + "]";
	}
	public del_EcoProductReviewsSuggession(long productid, long likescount, long dislikescount, long replycount, String date,
			Boolean iscertifiedBuyer, String overallExperience, String review, long userId, String username,
			long ratings, List<del_EcoProductReviewRepliesSuggessions> replies) {
		super();
		this.productid = productid;
		this.likescount = likescount;
		this.dislikescount = dislikescount;
		this.replycount = replycount;
		this.date = date;
		this.iscertifiedBuyer = iscertifiedBuyer;
		this.overallExperience = overallExperience;
		this.review = review;
		this.userId = userId;
		this.username = username;
		this.ratings = ratings;
		this.replies = replies;
	}
	
	
}

