package com.myself.service;

import java.util.List;

import com.myself.model.Product;
import com.myself.model.Seller;
import com.myself.usecase.SellerUse;


public interface SellerInterface {
	
	Seller saveSeller(SellerUse seller);
	
	List<Product> getProducts(Integer sellerId);

	Product updateProduct(Product product, Integer proId);
	
	String deleteProduct(Integer proId);
}
