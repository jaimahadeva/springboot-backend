package com.example.prep.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class learningSubTopics {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long subtopicId;
	private long topicId;
	private long courseId;
	private String topicName;
	private String subTopicName;
	
	public learningSubTopics() {
		
	} 
	
	public long getSubtopicId() {
		return subtopicId;
	}
	public void setSubtopicId(long subtopicId) {
		this.subtopicId = subtopicId;
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
	public String getSubTopicName() {
		return subTopicName;
	}
	public void setSubTopicName(String subTopicName) {
		this.subTopicName = subTopicName;
	}
	public learningSubTopics(long topicId, long courseId, String topicName, String subTopicName) {
		super();
		this.topicId = topicId;
		this.courseId = courseId;
		this.topicName = topicName;
		this.subTopicName = subTopicName;
	}
	
	

}
