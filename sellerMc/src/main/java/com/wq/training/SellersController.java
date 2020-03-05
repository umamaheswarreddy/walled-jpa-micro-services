package com.wq.training;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellersController {
	
	@Autowired
	SellersService service;

	@RequestMapping("/sellers")
	List<Sellers> getAllSellerss() {
		return service.getAllSellerss();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/sellers")
	void addSellers(@RequestBody Sellers user) {
		service.addSellers(user);
	}
	
	@RequestMapping("/users/{id}")
	Optional<Sellers> getSellersDetailsByID(@PathVariable int id) {
		return service.getSellersDetailsByID(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/sellers/")
	void updateSellers(@RequestBody Sellers user) {
		service.updateSellers(user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/sellers/{id}")
	void deleteSellers(@PathVariable int id) {
		service.deleteSellers(id);
	}
	
	
	
	
}


//	GET - Fetching all details
//	POST - Add
//	PUT - Update
//	Delete - delete













