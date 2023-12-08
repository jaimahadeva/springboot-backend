package com.example.prep.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.prep.modal.EcoProducts;
import com.example.prep.repository.EcoAddProductsRepo;

@Service
@Transactional
public class EcoAddProductService {
 @Autowired
 private EcoAddProductsRepo EcoAddProductsRepo;
  public List<EcoProducts> findProductsByFilters(String brand){
	  return EcoAddProductsRepo.findProductsByFilters(brand);
  }
  
  public List<EcoProducts> findproductsBycategoryId(String productid){
	  return EcoAddProductsRepo.findproductsBycategoryId(productid);
  }
  
  public List<EcoProducts> findByCategory(String category,int PageNumber){
	 Pageable pages= PageRequest.of(PageNumber,2 );
	 return EcoAddProductsRepo.findproductsBycategoryIdNew(category,pages);
  }
   
 
  


}	
