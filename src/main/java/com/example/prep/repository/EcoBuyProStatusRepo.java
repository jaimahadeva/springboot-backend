package com.example.prep.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prep.modal.EcoBuyProStatus;
@Repository
public interface EcoBuyProStatusRepo extends JpaRepository<EcoBuyProStatus, Long>{
	
	EcoBuyProStatus findByProductid(Long productid);
    List<EcoBuyProStatus> findByUserid(Long userid);
}
