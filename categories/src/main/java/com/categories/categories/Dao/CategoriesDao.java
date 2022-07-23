package com.categories.categories.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.categories.categories.Entities.Categories;

public interface CategoriesDao extends JpaRepository<Categories, Long> {

}
