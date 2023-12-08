package com.example.prep.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.prep.modal.EcoHomeloads;

@Repository
public interface EcoHomeloadsRepo extends CrudRepository<EcoHomeloads, Long> {
	
	
	
	List<EcoHomeloads> findByUserId(Long userid);
	
     List<EcoHomeloads> findAll(Pageable pages);

	

}
