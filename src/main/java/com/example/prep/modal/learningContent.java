package com.example.prep.modal;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class learningContent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long contentId;
	private long courseId;
	private long topicId;
	private String questions;
	@Column(length = 100000)
	private String answers;
	
	
	public learningContent() {
		
	}


	public long getContentId() {
		return contentId;
	}


	public void setContentId(long contentId) {
		this.contentId = contentId;
	}


	public long getCourseId() {
		return courseId;
	}


	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}


	public long getTopicId() {
		return topicId;
	}


	public void setTopicId(long topicId) {
		this.topicId = topicId;
	}


	public String getQuestions() {
		return questions;
	}


	public void setQuestions(String questions) {
		this.questions = questions;
	}


	public String getAnswers() {
		return answers;
	}


	public void setAnswers(String answers) {
		this.answers = answers;
	}


	public learningContent(long courseId, long topicId, String questions, String answers) {
		super();
		this.courseId = courseId;
		this.topicId = topicId;
		this.questions = questions;
		this.answers = answers;
	}
	
	

}
