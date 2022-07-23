package com.categories.categories.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.categories.categories.Entities.Categories;
import com.categories.categories.Services.categoriesService;

@RestController
public class MyController {
 
	@Autowired
	private categoriesService CategoriesService;
	
	
    @GetMapping("/api/home")
	public String home() 
    {
		return "this is for testing purpose";
	}
    
//    01 get all categories 
    
    @GetMapping("/api/categories")
    public List<Categories>getCategories()
    {
    	return this.CategoriesService.getcategories();
    }
    
 //     02 add categories 
    
    @PostMapping("/api/categories")
    public Categories addCategories (@RequestBody Categories categories)
    {
    	return this.CategoriesService.addcategories(categories); 
    }
    
    // 03 Fetch Categories by id
    
    @GetMapping("/api/categories/{categoriesId}")
   public Categories getCategories(@PathVariable String categoriesId) 
    {
    	return this.CategoriesService.getcategories(Long.parseLong(categoriesId));
    }
    
    //04 Update categories by Id
    
    @PutMapping("/api/categories/{categoriesId}")
    public Categories UpdateCategories(@RequestBody Categories categories)
    {
    	return this.CategoriesService.UpdateCategories(categories);
    }
    
    //05 Delete categories by id
    
    @DeleteMapping("/api/categories/{categoriesId}")
    public ResponseEntity<HttpStatus> deleteCategories(@PathVariable String categoriesId)
    {
    	try 
    	{
    		this.CategoriesService.deleteCategories(Long.parseLong(categoriesId));
    		return new ResponseEntity<>(HttpStatus.OK);			
    	}
    	catch(Exception e)
    	{
    		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }
    
}
