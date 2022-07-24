package com.myself.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myself.model.Product;
import com.myself.repo.ProductRepo;

@Service
public class ProductImpl implements ProductInterface {

	@Autowired
	private ProductRepo pr;
	
	@Override
	public Product saveProduct(Product product) {
		return pr.save(product);
	}

	@Override
	public List<Product> getListProduct(String name) {
		
		List<Product> list = pr.getProductListByName(name);
		
		return list;
	}

	@Override
	public List<Product> getListProductType(String type) {

		List<Product> list = pr.getProductListByType(type);
		
		return list;

	}

	@Override
	public List<Product> getListProductCategory(String productCategory) {
		
		List<Product> list = pr.getProductListByCategory(productCategory);
		
		return list;
	}

	@Override
	public List<Product> getListProductPrice(Integer min, Integer max) {

		List<Product> list = pr.getProductListByPrice(min, max);
		
		return list;
	}

}
