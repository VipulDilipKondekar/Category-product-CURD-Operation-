package com.Product.Product.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Product.Product.Entities.Product;

public interface ProductDao extends JpaRepository<Product, Long>{

}
