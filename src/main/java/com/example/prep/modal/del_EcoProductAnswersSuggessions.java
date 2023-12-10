
package com.example.prep.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

@Entity
public class del_EcoProductAnswersSuggessions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long answerid;
	private long productid;
	private String username;
	private long userId;
	@Column(length=4000)
	private String answer;
	@Nullable
	private long likescount;
	@Nullable
	private String userphoto;
	public del_EcoProductAnswersSuggessions() {
		
	}
	public long getAnswerid() {
		return answerid;
	}
	public void setAnswerid(long answerid) {
		this.answerid = answerid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public long getLikescount() {
		return likescount;
	}
	public void setLikescount(long likescount) {
		this.likescount = likescount;
	}
	public String getUserphoto() {
		return userphoto;
	}
	public void setUserphoto(String userphoto) {
		this.userphoto = userphoto;
	}
	@Override
	public String toString() {
		return "EcoProductAnswers [answerid=" + answerid + ", productid=" + productid + ", username=" + username
				+ ", userId=" + userId + ", answer=" + answer + ", likescount=" + likescount + ", userphoto="
				+ userphoto + "]";
	}
	public del_EcoProductAnswersSuggessions(long productid, String username, long userId, String answer, long likescount,
			String userphoto) {
		super();
		this.productid = productid;
		this.username = username;
		this.userId = userId;
		this.answer = answer;
		this.likescount = likescount;
		this.userphoto = userphoto;
	}
	

}
