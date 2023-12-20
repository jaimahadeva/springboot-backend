package com.example.prep.modal;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeedBacks {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long feedbackid;
	private String username;
	@Column(length=5000)
	private String feedback;
	private LocalDate date;
	private long ratings;
	public FeedBacks() {
		
	}
	public long getFeedbackid() {
		return feedbackid;
	}
	public void setFeedbackid(long feedbackid) {
		this.feedbackid = feedbackid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public long getRatings() {
		return ratings;
	}
	public void setRatings(long ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "FeedBacks [feedbackid=" + feedbackid + ", username=" + username + ", feedback=" + feedback + ", date="
				+ date + ", ratings=" + ratings + "]";
	}
	public FeedBacks(String username, String feedback, LocalDate date, long ratings) {
		super();
		this.username = username;
		this.feedback = feedback;
		this.date = date;
		this.ratings = ratings;
	}
	
	

}
