package com.example.prep.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prep.exception.CourseNotFoundException;
import com.example.prep.modal.learninCourses;
import com.example.prep.modal.learningContent;
import com.example.prep.modal.learningTopic;
import com.example.prep.repository.learningContentRepo;
import com.example.prep.repository.learningTopicRepo;



@RestController
@RequestMapping("/preptalk/topics")

public class learningTopicController {

	@Autowired
	public learningTopicRepo learningTopicRepo;
//	@Autowired
//   public learningTopicService learningTopicService;
	
	@Autowired
	public learningContentRepo learningContentRepo;
	
	@GetMapping("/AllTopics")
	public List<learningTopic> getAllTopics(){
		return learningTopicRepo.findAll();
	}
	
//	for adding a new course 
	@PostMapping("/newtopic")
	public learningTopic addNewLearningTopic(@RequestBody learningTopic learrnnewtopic) {
		return learningTopicRepo.save(learrnnewtopic);
	}
//	for getting the details of particular learning 
	@GetMapping("/topic/{id}")
	public ResponseEntity<learningTopic>getcourseById(@PathVariable Long id){
		learningTopic courses=learningTopicRepo.findById(id).orElseThrow(()->new CourseNotFoundException("This course Id not found"));
			return ResponseEntity.ok(courses);
		}
	
//	learning Content
	@GetMapping("/Allcontents")
	public List<learningContent> getAllcontents(){
		return learningContentRepo.findAll();
	}
	
	@PostMapping("/newContent")
	public learningContent addNewLearningContent(@RequestBody learningContent learrnnewtopic) {
		return learningContentRepo.save(learrnnewtopic);
	}
//	learning Content
	
	

	
	

	
	
	
	
	
	
	
	}
	

