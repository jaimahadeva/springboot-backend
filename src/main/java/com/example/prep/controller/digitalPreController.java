package com.example.prep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prep.modal.digitalPreparation;
import com.example.prep.repository.digitalprepRepo;

@RestController
@RequestMapping("/preptalk/v1")
public class digitalPreController {
	@Autowired
	public digitalprepRepo digitalrepo;
	
	
//	to get the added list
	@GetMapping("/digitalquestions")
	public List<digitalPreparation> getAllQuestions(){
		return digitalrepo.findAll();
	}
//	to add the record into the table 
	@PostMapping("/digitalquestions")
	public digitalPreparation addaNeqQuestion( @RequestBody  digitalPreparation digitalprep) {
		return digitalrepo.save(digitalprep);
	}
	
	
	

}
