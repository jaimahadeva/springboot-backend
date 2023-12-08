package com.example.prep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.prep.modal.userDetails;
import com.example.prep.repository.userDetailsRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping("/createAccount")
public class userDetailsController {

	@Autowired
	public userDetailsRepo userDetailsRepo;
	
	@Autowired
	public com.example.prep.Service.userDetailsService userDetailsService;
	
	@Autowired
	private ObjectMapper mapper;
	
	@PostMapping("/submit")
	public userDetails createAccount(
			@RequestBody userDetails userInfo) {
//			@RequestParam("file") MultipartFile file,
//			@RequestParam ("userInfo") String userInfo) throws JsonMappingException, JsonProcessingException {
//		mapper.readValue(userInfo, userDetails.class);
		return userDetailsRepo.save(userInfo);
	}
	
	@GetMapping("/all")
	public List<userDetails> findall(){
		return userDetailsRepo.findAll();
	}
	
	@PostMapping("/login")
	public userDetails loginUser(@RequestBody userDetails userdetails) throws Exception{
		Long tempUserId=userdetails.getUserId();
		String tempPasssword=userdetails.getPassword();
		userDetails userObject=null;
		if(tempUserId!=null && tempPasssword!=null) {
			userObject= userDetailsService.findUserDetailsByUserIdAndPassword(tempUserId, tempPasssword);
		}
		if(userObject==null) {
			throw new Exception("Wrong Credentials");
		}
		return userObject;
	} 
}
