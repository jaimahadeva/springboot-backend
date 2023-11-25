package com.example.prep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prep.modal.EcoAddToCarts;
@Repository
public interface EcoAddToCartsRepo extends JpaRepository<EcoAddToCarts, Long> {
	List<EcoAddToCarts> findByUserid(Long userid);

	
	
}
