package com.example.prep.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity

public class learningTopic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long topicId;
	private long courseId;
	private String topicName;

	
	public learningTopic() {
		
	}

	public long getTopicId() {
		return topicId;
	}

	public void setTopicId(long topicId) {
		this.topicId = topicId;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public learningTopic(long courseId, String topicName) {
		super();
		this.courseId = courseId;
		this.topicName = topicName;
	}

	
	
	

}
