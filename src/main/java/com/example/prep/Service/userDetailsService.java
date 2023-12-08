package com.example.prep.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prep.modal.userDetails;
import com.example.prep.repository.userDetailsRepo;


@Service
@Transactional
public class userDetailsService {

	@Autowired
	userDetailsRepo userDetailsRepo;
	
	public userDetails findUserDetailsByUserIdAndPassword(Long userId, String password) {
		return userDetailsRepo.findUserByUserIdAndPassword(userId, password);
	}
}
