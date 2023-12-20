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
public class EcoProductQuestions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long questionid;
	private long productid;
	private String question;
	private String username;
	private long userId;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	@Nullable
	private List<EcoProductAnswers> answers;
    public EcoProductQuestions() {
    	
    }
	public long getQuestionid() {
		return questionid;
	}
	public void setQuestionid(long questionid) {
		this.questionid = questionid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
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
	public List<EcoProductAnswers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<EcoProductAnswers> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "EcoProductQuestions [questionid=" + questionid + ", productid=" + productid + ", question=" + question
				+ ", username=" + username + ", userId=" + userId + ", answers=" + answers + "]";
	}
	public EcoProductQuestions(long productid, String question, String username, long userId,
			List<EcoProductAnswers> answers) {
		super();
		this.productid = productid;
		this.question = question;
		this.username = username;
		this.userId = userId;
		this.answers = answers;
	}
    
}
