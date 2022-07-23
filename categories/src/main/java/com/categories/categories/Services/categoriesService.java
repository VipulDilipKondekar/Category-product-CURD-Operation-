package com.categories.categories.Services;

import java.util.List;

import com.categories.categories.Entities.Categories;

public interface categoriesService {

	public List<Categories> getcategories();
	
	public Categories addcategories (Categories categories);
	
	public Categories getcategories(Long categoriesId);
	
	public Categories UpdateCategories (Categories categories);
	
	public void deleteCategories(long parseLong);
}
