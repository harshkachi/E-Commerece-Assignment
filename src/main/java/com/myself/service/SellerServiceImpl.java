package com.myself.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myself.model.Product;
import com.myself.model.Seller;
import com.myself.repo.ProductRepo;
import com.myself.repo.SellerRepo;
import com.myself.usecase.SellerUse;

@Service
public class SellerServiceImpl implements SellerInterface {
	
	@Autowired
	private SellerRepo sr;
	
	@Autowired
	private ProductRepo pr;
	
	@Override
	public Seller saveSeller( SellerUse seller) {
		
		return sr.save(seller.getSeller())	;
	}

	@Override
	public List<Product> getProducts(Integer sellerId) {
		
		List<Product> list =  pr.getProductList(sellerId);
		
		return list;
	}

	@Override
	public Product updateProduct(Product product, Integer proId) {

		Optional<Product> prod = pr.findById(proId);
		
		if(prod.isPresent()){
			
			return pr.save(product);
			
		}
		else {
			return null;
		}
		
	}

	@Override
	public String deleteProduct(Integer proId) {
		
		Optional<Product> prod = pr.findById(proId);
		
		if(prod.isPresent()){
			
			Product deletePro = prod.get(); 
			pr.delete(deletePro);
			
			return "Successfully Deleted";
			
		}
		else {
			return "Please enter correct ProductId";
		}
		
		
	}

}
