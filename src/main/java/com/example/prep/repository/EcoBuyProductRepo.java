package com.example.prep.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prep.modal.EcoBuyProduct;
@Repository
public interface EcoBuyProductRepo extends JpaRepository<EcoBuyProduct, Long> {
	List<EcoBuyProduct> findByUserid(Long userid);
}
