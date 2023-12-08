package com.example.prep.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

@Entity
public class EcoProductReviewReplies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long replyid;
	private long productid;
	private long likescount1;
	private long dislikescount1;
	private long replycount1;
	private String date1;
	private Boolean iscertifiedBuyer1;
	@Column(length=2000)
	@Nullable
	private String reply;
	private long userId;
	private String username;
    public EcoProductReviewReplies() {
    	
    }
	public long getReplyid() {
		return replyid;
	}
	public void setReplyid(long replyid) {
		this.replyid = replyid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public long getLikescount1() {
		return likescount1;
	}
	public void setLikescount1(long likescount1) {
		this.likescount1 = likescount1;
	}
	public long getDislikescount1() {
		return dislikescount1;
	}
	public void setDislikescount1(long dislikescount1) {
		this.dislikescount1 = dislikescount1;
	}
	public long getReplycount1() {
		return replycount1;
	}
	public void setReplycount1(long replycount1) {
		this.replycount1 = replycount1;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public Boolean getIscertifiedBuyer() {
		return iscertifiedBuyer1;
	}
	public void setIscertifiedBuyer(Boolean iscertifiedBuyer) {
		this.iscertifiedBuyer1 = iscertifiedBuyer;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
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
	@Override
	public String toString() {
		return "EcoProductReviewReplies [replyid=" + replyid + ", productid=" + productid + ", likescount1="
				+ likescount1 + ", dislikescount1=" + dislikescount1 + ", replycount1=" + replycount1 + ", date1="
				+ date1 + ", iscertifiedBuyer=" + iscertifiedBuyer1 + ", reply=" + reply + ", userId=" + userId
				+ ", username=" + username + "]";
	}
	public EcoProductReviewReplies(long productid, long likescount1, long dislikescount1, long replycount1,
			String date1, Boolean iscertifiedBuyer, String reply, long userId, String username) {
		super();
		this.productid = productid;
		this.likescount1 = likescount1;
		this.dislikescount1 = dislikescount1;
		this.replycount1 = replycount1;
		this.date1 = date1;
		this.iscertifiedBuyer1 = iscertifiedBuyer;
		this.reply = reply;
		this.userId = userId;
		this.username = username;
	}
	
}
