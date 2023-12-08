package com.example.prep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prep.modal.EcoHomeloads;

@Repository
public interface EcoHomeloadsRepo extends JpaRepository<EcoHomeloads, Long> {
	
	
	
	List<EcoHomeloads> findByUserId(Long userid);

	

}
