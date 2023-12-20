package com.example.prep.controller;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prep.Service.EcoAddProductService;
import com.example.prep.Service.EcoBuyProductsService;
import com.example.prep.Service.EcoProductsHomeService;
import com.example.prep.modal.EcoAddToCarts;
import com.example.prep.modal.EcoBuyProStatus;
import com.example.prep.modal.EcoBuyProduct;
import com.example.prep.modal.EcoHomeloads;
import com.example.prep.modal.EcoProductOffers;
import com.example.prep.modal.EcoProductReviews;
import com.example.prep.modal.EcoProducts;
import com.example.prep.modal.EcoProductsUser;
import com.example.prep.modal.FeedBacks;
import com.example.prep.modal.userDetails;

import com.example.prep.repository.EcoAddProductsRepo;
import com.example.prep.repository.EcoBuyProStatusRepo;
import com.example.prep.repository.EcoBuyProductRepo;
import com.example.prep.repository.EcoHomeloadsRepo;
import com.example.prep.repository.EcoProductOffersRepo;
import com.example.prep.repository.EcoProductReviewsRepo;
import com.example.prep.repository.EcoProductsUserRepo;
import com.example.prep.repository.FeedBacksRepo;
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
	
	@Autowired
	private EcoBuyProductRepo EcoBuyProductRepo;
	
	@Autowired
	private EcoBuyProStatusRepo EcoBuyProStatusRepo;
	
	@Autowired
	EcoProductReviewsRepo EcoProductReviewsRepo;
	
	@Autowired
	EcoProductsHomeService EcoProductsHomeService;
	@Autowired
	FeedBacksRepo FeedBacksRepo;
	private Logger logger=LoggerFactory.getLogger(ecommerceController.class);

	//home page starts imgaes ecomcontent
    @PostMapping("/AddNewProductHome")
	public EcoHomeloads AddnewProduct(@RequestBody EcoHomeloads newproductDetails) {
		return ecoProductsRepo.save(newproductDetails);
	}
    
    
    @GetMapping("/getAllProductsHome/{PageNumber}") //
    public List<EcoHomeloads> gtAllProductDetails(@PathVariable int PageNumber){
    	return EcoProductsHomeService.gethomeloads(PageNumber);
    }
    
    @PostMapping("/getProductsByIdHome")  //to show the added products specific to the user 
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
    @PostMapping("/getSearchedProduct/{pageNumber}")  //get searched or clicked profucts
    public List<EcoProducts> getProductsList(@RequestBody EcoProducts productdetails ,
    		@PathVariable int pageNumber) {
    	String category=productdetails.getCategory();
		List<EcoProducts> searchedCategory=EcoAddProductService.findByCategory(category,pageNumber);
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
	
//	buy product
	@PostMapping("/BuyProduct")
	public EcoBuyProduct buyproduct(@RequestBody EcoBuyProduct ecobuypro ) {
	return EcoBuyProductRepo.save(ecobuypro);
	}
	@PostMapping("/BuyProductRequiredForStatus")
	public EcoBuyProStatus buyproduct1(@RequestBody EcoBuyProStatus ecobuypro ) {
	return EcoBuyProStatusRepo.save(ecobuypro);
	}
	


	@PostMapping("/GetAllBuyedProducts")
	public List<EcoBuyProduct> getAllbuyedproducts(@RequestBody EcoBuyProduct EcoBuyProduct ){
		Long userid=EcoBuyProduct.getUserid();
		return EcoBuyProductRepo.findByUserid(userid);
	}
	
	@PostMapping("/BuyedProductStatusUpdate/{productid}")
	public EcoBuyProStatus updateproductdetails(@PathVariable Long productid,@RequestBody EcoBuyProStatus EcoBuyProStatus) {
		EcoBuyProStatus update =EcoBuyProStatusRepo.findByProductid(productid);
		update.setAcceptername(EcoBuyProStatus.getAcceptername());
		update.setDeliveredaddress(EcoBuyProStatus.getDeliveredaddress());
		update.setDeliverypersonname(EcoBuyProStatus.getDeliverypersonname());
		update.setOrderaccepteddate(EcoBuyProStatus.getOrderaccepteddate());
		update.setShippeddate(EcoBuyProStatus.getShippeddate());
		update.setExpecteddeliverydate(EcoBuyProStatus.getExpecteddeliverydate());
		update.setAcceptername(update.getAcceptername().concat( EcoBuyProStatus.getAcceptername()) );
		return EcoBuyProStatusRepo.save(EcoBuyProStatus);
	}
	
	@PostMapping("/BuyedProductStatus")
	public List<EcoBuyProStatus>  findStatusofBuyedProduct(@RequestBody EcoBuyProStatus EcoBuyProStatus ){
		return EcoBuyProStatusRepo.findByUserid(EcoBuyProStatus.getUserid());
	}
//	ratings
	@PostMapping("/Productreviews/{productid}")
	public EcoProducts giveProductsRatings(@PathVariable Long productid,@RequestBody EcoProducts ecoProducts) {
		EcoProducts  addRviews= EcoAddProductsRepo.findByProductid(productid);
		addRviews.setRatingsgiveby(ecoProducts.getRatingsgiveby()+1);
		addRviews.setProductreviews(ecoProducts.getProductreviews());
		return EcoAddProductsRepo.save(addRviews);
		 
	}
	
	@PostMapping("/SubmitReview")
	public EcoProductReviews saverecord(@RequestBody  EcoProductReviews EcoProductReviews) {
	  return EcoProductReviewsRepo.save(EcoProductReviews);
	}
	
	// General Feedbacks
	@PostMapping("/submitFeedback")
	public FeedBacks submitFeedback(@RequestBody FeedBacks feedBacks ) {
		return FeedBacksRepo.save(feedBacks);
	}
	@GetMapping("/GetFeedBacks")
	public List<FeedBacks> getAllFeedbacks(){
		return FeedBacksRepo.findAll();
	}
	
	
	
  
    
    
  
    
    
   
  
    
    
	

	

}
