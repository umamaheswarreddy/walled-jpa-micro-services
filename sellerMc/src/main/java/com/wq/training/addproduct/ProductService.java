package com.wq.training.addproduct;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.training.Sellers;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;

	

	public List<Product> getAllProducts() {
		
		return (List<Product>) repo.findAll();
	}



	public void addProduct(Product product) {
		
		repo.save(product);
		
	}



	public Optional<Product> getProductById(int id) {
		
		return repo.findById(id);
	}




	public void updateProducts(Product product) {

		repo.save(product);
	}



	public void deleteProduct(int id) {
		repo.deleteById(id);
		
	}



	




}
