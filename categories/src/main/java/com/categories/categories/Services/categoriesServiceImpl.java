package com.categories.categories.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.categories.categories.Dao.CategoriesDao;
import com.categories.categories.Entities.Categories;
@Service
public class categoriesServiceImpl implements categoriesService {
@Autowired	
	private CategoriesDao categoriesDao;
	
	List<Categories>list;
	public categoriesServiceImpl () 
	{
//		list=new ArrayList<>();
//		list.add(new Categories (1,"Java","This is Java"));
//		list.add(new Categories (2,"Springboot","This is Springboot"));
//		list.add(new Categories (3,"Hibernate","This is Hibernate"));


	}
	@Override
	public List<Categories> getcategories() {
		
		return categoriesDao.findAll();
	}
	
	
	@Override
	public Categories addcategories(Categories categories) {
//		list.add(categories);
		categoriesDao.save(categories);
		return categories;
		
	}
	
	
	@Override
	public Categories getcategories(Long categoriesId) {
     	//Categories c=null;
//		for(Categories categories:list)
//		{
//			if(categories.getId()==categoriesId)
//			{
//				c=categories;
//				break;
//			}
//		}
     	
		return categoriesDao.getOne(categoriesId);
	}
	
	
	@Override
	public Categories UpdateCategories(Categories categories) {
//		list.forEach(e -> {
//			if(e.getId() == categories.getId()) {
//				e.setTitle(categories.getTitle());
//				e.setDescription(categories.getDescription());
//			}
//		});
		categoriesDao.save(categories);
		return categories;
	}
	
	
	@Override
	public void deleteCategories(long parseLong) 
	{
//		list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
		Categories entity=categoriesDao.getOne(parseLong);
		categoriesDao.delete(entity);
	}

	
}
