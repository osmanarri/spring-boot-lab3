//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.FoodBank;

import com.example.demo.repositories.FoodBankRepo;


@Service
public class FoodBankServiceImpl implements FoodBankService{

	@Autowired
	private FoodBankRepo foodBankRepo;
	
	
	@Override
	public List<FoodBank> getFoodBanks() {
		// TODO Auto-generated method stub
		return foodBankRepo.findAll();
	}

	@Override
	public FoodBank saveFoodBank(FoodBank foodBank) {
		// TODO Auto-generated method stub
		return foodBankRepo.save(foodBank);
	}

	@Override
	public FoodBank getSingleFoodBank(int id) {
		// TODO Auto-generated method stub
		Optional<FoodBank> foodBank = foodBankRepo.findById(id);
		
		if(foodBank.isPresent()) {
			return foodBank.get();
		}
		throw new RuntimeException("Food Bank is not found with the ID " + id);
	}

	@Override
	public void deleteFoodBank(int id) {
		// TODO Auto-generated method stub
		
		foodBankRepo.deleteById(id);
		
	}

	@Override
	public FoodBank updateFoodBank(FoodBank foodBank) {
		// TODO Auto-generated method stub
		return foodBankRepo.save(foodBank);
	}

}
