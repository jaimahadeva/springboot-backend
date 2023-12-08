package com.example.prep.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="digitalpreprataion_table")
public class digitalPreparation {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// this is the way of genarating the primary keys automatically
	private long id;
	private String question;
	@Column(length=100000)
	private String answer;
	 
	
	public digitalPreparation() {
//		default constructor ...whenever we are creating the parameterised construction then we need to create the
//		default also 
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public digitalPreparation(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	
	
}
