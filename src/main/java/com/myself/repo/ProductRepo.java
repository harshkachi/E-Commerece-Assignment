package com.myself.repo;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.myself.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	@Query("select p from Product p where p.prodId =:id")
	public List<Product> getProductList(@Param("id") Integer sellerId);
	
	// Search by Product name
	@Query("select p from Product p where p.productName =:nam")
	public List<Product> getProductListByName(@Param("nam") String productNam);
	
	// Search by Product Type
	@Query("select p from Product p where p.productType =:type")
	public List<Product> getProductListByType(@Param("type") String productType);
	
	// Search by Product Category
	@Query("select p from Product p where p.productCategory =:cate")
	public List<Product> getProductListByCategory(@Param("cate") String productCategory);
	
	// Search by Product price range
	@Query("select p from Product p where p.productPrice BETWEEN :min AND :max ORDER BY p.productPrice")
	public List<Product> getProductListByPrice(@Param("min") Integer minPrice, @Param("max") Integer maxPrice);
	
}
