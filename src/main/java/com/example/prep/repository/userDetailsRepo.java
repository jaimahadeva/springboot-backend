package com.example.prep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.example.prep.modal.userDetails;

@Repository

public interface userDetailsRepo extends JpaRepository<userDetails, Long>{
	userDetails findUserByUserIdAndPassword(Long userId,String password);

	

	
	

}
