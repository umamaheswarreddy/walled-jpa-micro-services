package com.wq.training.addproduct;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	
	@RequestMapping("/product")
	List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/product")
	void addProduct(@RequestBody Product product) {
		service.addProduct(product);
	}
	
	@RequestMapping("/product/{id}")
	Optional<Product> getProductById(@PathVariable int id) {
		return service.getProductById(id);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/product/")
	void updateProducts(@RequestBody Product product) {
		 service.updateProducts(product);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/product/delete/{id}")
	void deleteProduct(@PathVariable int id) {
		service.deleteProduct(id);
	}
	
	

}
