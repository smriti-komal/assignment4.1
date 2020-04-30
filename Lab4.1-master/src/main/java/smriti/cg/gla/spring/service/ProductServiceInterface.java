package smriti.cg.gla.spring.service;

import java.util.List;

import smriti.cg.gla.spring.entity.Product;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<Product> reterive();

}
