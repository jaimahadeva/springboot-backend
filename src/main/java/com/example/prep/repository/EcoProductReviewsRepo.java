package com.example.prep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.prep.modal.EcoProductReviews;

@Repository
public interface EcoProductReviewsRepo extends JpaRepository<EcoProductReviews, Long>{
	
	@Query("select p from EcoProductReviews p")
	List<EcoProductReviews> findList();
	
}
