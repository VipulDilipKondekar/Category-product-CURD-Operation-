package com.Product.Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Product.Product.Entities.Product;
import com.Product.Product.Services.ProductServiceImpl;



@RestController
public class MyProductController {

	@Autowired
	private ProductServiceImpl ProductService;
	
	
    @GetMapping("/api/home")
	public String home() 
    {
		return "this is for testing purpose";
	}
    
//    01 get all product
    
    @GetMapping("/api/product")
    public List<Product>getProduct()
    {
    	return this.ProductService.getproduct();
    }
    
 //     02 add product 
    
    @PostMapping("/api/product")
    public Product addProduct (@RequestBody Product product)
    {
    	return this.ProductService.addproduct(product); 
    }
    
    // 03 Fetch product by id
    
    @GetMapping("/api/product/{productId}")
   public Product getProduct(@PathVariable String productId) 
    {
    	return this.ProductService.getproduct(Long.parseLong(productId));
    }
    
    //04 Update product by Id
    
    @PutMapping("/api/product/{productId}")
    public Product UpdateProduct(@RequestBody Product product)
    {
    	return this.ProductService.UpdateProduct(product);
    }
    
    //05 Delete product by id
    
    @DeleteMapping("/api/product/{productId}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId)
    {
    	try 
    	{
    		this.ProductService.deleteProduct(Long.parseLong(productId));
    		return new ResponseEntity<>(HttpStatus.OK);			
    	}
    	catch(Exception e)
    	{
    		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }
    
}


