package dao;

import java.util.List;

import model.Product;

public interface productDAO {
	Product create(Product p);

	List<Product> readAll();

	Product readById(Integer id);

	Product update(Product product);

	Boolean delete(Product product);

	Boolean delete(Integer id);
}
