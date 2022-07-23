package com.Product.Product.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Product.Dao.ProductDao;
import com.Product.Product.Entities.Product;


@Service

public class ProductServiceImpl  implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	List<Product>list;
	public ProductServiceImpl () 
	{
//		list=new ArrayList<>();
//		list.add(new Product (1,"Java","This is Java"));
//		list.add(new Product (2,"Springboot","This is Springboot"));
//		list.add(new Product (3,"Hibernate","This is Hibernate"));


	}
	@Override
	public List<Product> getproduct() {
		
		return productDao.findAll();
	}
	
	
	@Override
	public Product addproduct(Product product) {
//		list.add(product);
		productDao.save(product);
		return product;
		
	}
	
	
	@Override
	public Product getproduct(Long productId) {
     	//Product c=null;
//		for(Product product:list)
//		{
//			if(product.getId()==productId)
//			{
//				c=product;
//				break;
//			}
//		}
     	
		return productDao.getOne(productId);
	}
	
	
	@Override
	public Product UpdateProduct(Product product) {
//		list.forEach(e -> {
//			if(e.getId() == product.getId()) {
//				e.setTitle(product.getTitle());
//				e.setDescription(product.getDescription());
//			}
//		});
		productDao.save(product);
		return product;
	}
	
	
	@Override
	public void deleteProduct(long parseLong) 
	{
//		list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
		Product entity=productDao.getOne(parseLong);
		productDao.delete(entity);
	}
}
