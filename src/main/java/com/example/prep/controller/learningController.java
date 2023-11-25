package com.example.prep.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prep.exception.CourseNotFoundException;
import com.example.prep.modal.learninCourses;
import com.example.prep.repository.learningRepo;

@RestController
@RequestMapping("/preptalk/learning")
public class learningController {
	
	@Autowired
	public learningRepo learningangularRepo;
	
//	for getting all the courses
   @GetMapping("/learningcourses")
	public List<learninCourses>getAllCourses(){
		return learningangularRepo.findAll();
	}
	
//	for adding a new course 
	@PostMapping("/newlearningtopic")
	public learninCourses addNewLearningTopic(@RequestBody learninCourses learrnnewtopic) {
		return learningangularRepo.save(learrnnewtopic);
	}
//	for getting the details of particular learning 
	@GetMapping("/{id}")
	public ResponseEntity<learninCourses>getcourseById(@PathVariable Long id){
		learninCourses courses=learningangularRepo.findById(id).orElseThrow(()->new CourseNotFoundException("This course Id not found"));
			return ResponseEntity.ok(courses);
		}
	
	
	
	
	}


