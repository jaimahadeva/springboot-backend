package com.example.prep.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.prep.modal.EcoProductOffers;

@Repository
public interface EcoProductOffersRepo extends JpaRepository<EcoProductOffers, Long> {
	  List<EcoProductOffers> findByProductid(Long tempproductId);

	 
	}
