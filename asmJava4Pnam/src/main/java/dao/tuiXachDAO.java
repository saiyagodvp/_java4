package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.tuiXach;

public interface tuiXachDAO {
	tuiXach them(tuiXach tuiXach);

	List<tuiXach> getAll();

	List<tuiXach> searchByName(String name);
	
	Boolean delete(Integer id);

	tuiXach readById(Integer id);

	tuiXach sua(tuiXach tuiXach);
}
