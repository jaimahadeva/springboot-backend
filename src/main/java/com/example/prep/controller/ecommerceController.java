package com.example.prep.controller;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prep.Service.EcoAddProductService;
import com.example.prep.modal.EcoAddToCarts;
import com.example.prep.modal.EcoHomeloads;
import com.example.prep.modal.EcoProductOffers;
import com.example.prep.modal.EcoProducts;
import com.example.prep.modal.EcoProductsUser;
import com.example.prep.modal.userDetails;

import com.example.prep.repository.EcoAddProductsRepo;
import com.example.prep.repository.EcoHomeloadsRepo;
import com.example.prep.repository.EcoProductOffersRepo;
import com.example.prep.repository.EcoProductsUserRepo;
import com.example.prep.repository.userDetailsRepo;


@RestController
@RequestMapping("/ecommerce")
public class ecommerceController {
	
	

	@Autowired
	public userDetailsRepo userdetailsRepo;
	
	@Autowired
	EcoHomeloadsRepo ecoProductsRepo;
	
	@Autowired
	EcoAddProductsRepo EcoAddProductsRepo;
	
	@Autowired
	EcoProductOffersRepo ecoProductOffersRepo;
	
	@Autowired
	EcoAddProductService EcoAddProductService;
	
	@Autowired
	private EcoProductsUserRepo EcoProductsUserRepo;
	
	@Autowired
	private com.example.prep.repository.EcoAddToCartsRepo EcoAddToCartsRepo; 
	
	private Logger logger=LoggerFactory.getLogger(ecommerceController.class);

	//home page starts imgaes ecomcontent
    @PostMapping("/AddNewProductHome")
	public EcoHomeloads AddnewProduct(@RequestBody EcoHomeloads newproductDetails) {
		return ecoProductsRepo.save(newproductDetails);
	}
    
    @GetMapping("/getAllProductsHome") //
    public List<EcoHomeloads> gtAllProductDetails(){
    	return ecoProductsRepo.findAll();
    }
    
    @PostMapping("getProductsByIdHome")  //to show the added products specific to the user 
    public List<EcoHomeloads> getProductsById(@RequestBody EcoHomeloads econewProduct){
    	Long tempId=econewProduct.getUserId();
    	List<EcoHomeloads> AllProducts=ecoProductsRepo.findByUserId(tempId);
    	return AllProducts;
    }
//home page ends
    
//all products main page starts
    @PostMapping("/addNewProduct")   //adding a new product 
    public EcoProducts addProducts(@RequestBody EcoProducts productdetails) {
    	return EcoAddProductsRepo.save(productdetails);
    }
    
    @PostMapping("/getProductsListByuserId")  //getproductList as per the login Id
    public List<EcoProducts> getProductsListByuserid(@RequestBody EcoProducts EcoProducts) throws Exception{
    	Long tempId=EcoProducts.getUserid();
    	List<EcoProducts> productsList=null;
    	if(tempId!=null) {
    		productsList= EcoAddProductsRepo.findByUserid(tempId);
    	}
        return productsList;
    }
    
    @PostMapping("/addNewOfferToProduct")   //adding new offers to product
    public EcoProductOffers addNewOffer(@RequestBody EcoProductOffers ecoProductOffers){ 
    	return ecoProductOffersRepo.save(ecoProductOffers);
    }
    
    @PostMapping("/getalloffers")  //get all offers by product id
    public List<EcoProductOffers> getAllOffers(@RequestBody EcoProductOffers ecoProductOffers) {
    	Long tempProductId=ecoProductOffers.getProductid();
    	return ecoProductOffersRepo.findByProductid(tempProductId);
    }
    
    @PostMapping("/updateProductAdmin/{productid}") //update the product details for product owner
    public EcoProducts updateProductDetails(
    		@PathVariable Long productid,
    		@RequestBody EcoProducts productdetails) {
    	EcoProducts updateDetails=EcoAddProductsRepo.findByProductid(productid);
    	updateDetails.setAboutthisitem(productdetails.getAboutthisitem());
    	updateDetails.setOldprice(productdetails.getOldprice());
    	updateDetails.setNewprice(productdetails.getNewprice());
    	updateDetails.setDiscount(productdetails.getDiscount());
    	updateDetails.setOffers(productdetails.getOffers());
    	updateDetails.setBrandname(productdetails.getBrandname());
    	updateDetails.setKeyfeatures(productdetails.getKeyfeatures());
        updateDetails.setSpecifications(productdetails.getSpecifications());
        updateDetails.setImages(productdetails.getImages());
    	return EcoAddProductsRepo.save(updateDetails);
    }
    
    @PostMapping("/updateProductNormalUser/{productid}")  //update the product details for normal user(questions and answers)
    public EcoProducts updateProductDetailsNormalUser(
    		@PathVariable Long productid,
    		@RequestBody EcoProducts productdetails) {
    	EcoProducts updateDetails=EcoAddProductsRepo.findByProductid(productid);
    	updateDetails.setProductreviews(productdetails.getProductreviews());
    	updateDetails.setQuestions(productdetails.getQuestions());
    	return EcoAddProductsRepo.save(updateDetails);
    }
    @PostMapping("/getSearchedProduct")  //get searched or clicked profucts
    public List<EcoProducts> getProductsList(@RequestBody EcoProducts productdetails ) {
    	String category=productdetails.getCategory();
    	List<EcoProducts> searchedCategory=EcoAddProductsRepo.findByCategory(category);
    	return searchedCategory;
    }
    
//    filters
    @PostMapping("/filterProductBy/{brand}")
    public List<EcoProducts> findProducts(
    		@PathVariable(value="brand") String brand){
    	return EcoAddProductService.findProductsByFilters(brand);
    }
     @PostMapping("/addToCartSave")
    public EcoAddToCarts AddCartS(@RequestBody EcoAddToCarts cartsEmp) {
    	return EcoAddToCartsRepo.save(cartsEmp);
    }
    @PostMapping("/getCartsCount")
    public List<EcoAddToCarts> getAllCarts(@RequestBody EcoAddToCarts ecocarts ){
    	Long userId=ecocarts.getUserid();
    	return EcoAddToCartsRepo.findByUserid(userId);
    }

	@PostMapping("/getProductsByCarts")
	public List<EcoProducts> findproductsBycategoryId(@RequestBody EcoProducts ecos) {
		String productid = ecos.getProductname();
		return EcoAddProductService.findproductsBycategoryId(productid);
	}
   
    
    
  
    
    
   
  
    
    
	

	

}
