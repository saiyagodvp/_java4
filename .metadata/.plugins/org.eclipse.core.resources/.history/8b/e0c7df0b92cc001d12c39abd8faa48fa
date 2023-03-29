package utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	
	static EntityManagerFactory factory = null;
	
	public static EntityManagerFactory getFactory() {
		//1. Load persistence => EntityMnagerFactory
		if(factory == null) {
			factory = Persistence.createEntityManagerFactory("JAVA04_PNAM2023");
		}
		return factory;
	}

}
