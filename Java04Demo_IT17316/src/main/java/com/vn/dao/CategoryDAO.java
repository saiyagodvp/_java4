package com.vn.dao;

import java.util.List;

import com.vn.model.Category;

public interface CategoryDAO {

	List<Category> findAll();

	Category save(Category category);

	Category update(Category category);
	
	Category delete(Integer id);
	
	Category detail(Integer id);

}