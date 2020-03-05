package com.wq.training;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellersService {
	
	@Autowired
	SellersRepository repo;

	public List<Sellers> getAllSellerss() {
		
//		Get all the users with their details from the db
		return (List<Sellers>)repo.findAll();
		
	}

	public void addSellers(Sellers user) {
		repo.save(user);
		
	}

	public Optional<Sellers> getSellersDetailsByID(int id) {
		
		return repo.findById(id);
	}

	public void updateSellers(Sellers user) {
		repo.save(user);
		
	}

	public void deleteSellers(int id) {
		repo.deleteById(id);
		
	}

	

}













