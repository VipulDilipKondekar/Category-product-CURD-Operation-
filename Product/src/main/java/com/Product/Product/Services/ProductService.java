package com.Product.Product.Services;

import java.util.List;

import com.Product.Product.Entities.Product;



public interface ProductService {


	public List<Product> getproduct();
	
	public Product addproduct (Product product);
	
	public Product getproduct(Long productId);
	
	public Product UpdateProduct (Product product);
	
	public void deleteProduct(long parseLong);
}
