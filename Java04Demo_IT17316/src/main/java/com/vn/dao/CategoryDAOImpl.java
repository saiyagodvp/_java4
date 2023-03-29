package com.vn.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.vn.model.Category;

public class CategoryDAOImpl implements CategoryDAO {
	
	public static void main(String[] args) {
		CategoryDAO daoImpl = new CategoryDAOImpl();
		
		Category newCategory = new Category();
		newCategory.setCategoryId(3);
		newCategory.setCategoryName("Job IT");
		daoImpl.update(newCategory);
		
		Category c2 = daoImpl.detail(2);
		System.out.println(c2.getCategoryName());
	}

	@Override
	public List<Category> findAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JAVA04_2023");
		
		EntityManager entityManager = factory.createEntityManager();
	
		entityManager.getTransaction().begin();
		
		//logic
		TypedQuery<Category> query = entityManager.createQuery("SELECT c FROM Category c", Category.class);
		List<Category> list = query.getResultList();
		System.out.println(list);
	
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return list;
	}
	
	@Override
	public Category save(Category category) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JAVA04_2023");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		//logic
		entityManager.persist(category);
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return category;
	}
	
	@Override
	public Category update(Category category) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JAVA04_2023");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		//logic
		entityManager.merge(category);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return category;
	}

	@Override
	public Category delete(Integer id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JAVA04_2023");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		//logic
		Category category = entityManager.find(Category.class, id);
		entityManager.remove(category);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return category;
	}
	
	@Override
	public Category detail(Integer id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JAVA04_2023");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		//logic
		Category category = entityManager.find(Category.class, id);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return category;
	}
	
	

}
