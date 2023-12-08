package com.example.prep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.prep.modal.EcoProducts;

@Repository
public interface EcoAddProductsRepo extends CrudRepository<EcoProducts, Long>{
	
	List<EcoProducts> findByUserid(Long userid);
	EcoProducts   findByProductid(Long productid);
	List<EcoProducts> findByCategory(String category);
	List<EcoProducts> findByProductname(String category);
//	product filters
	@Query(value="SELECT p from EcoProducts p WHERE p.brandname LIKE %?1%")
	List<EcoProducts> findProductsByFilters(
			@Param("brand") String brand
			);
	@Query(value="SELECT p from EcoProducts p WHERE p.productname LIKE %?1% ")
	List<EcoProducts> findproductsBycategoryId(String productid);


}
