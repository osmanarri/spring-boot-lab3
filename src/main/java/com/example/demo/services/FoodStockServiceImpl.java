//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.FoodStock;

import com.example.demo.repositories.FoodStockRepo;

@Service
public class FoodStockServiceImpl implements FoodStockService{
	
	@Autowired
	private FoodStockRepo foodStockRepo;

	@Override
	public List<FoodStock> getFoodStocks() {
		// TODO Auto-generated method stub
		return foodStockRepo.findAll();
	}

	@Override
	public FoodStock saveFoodStock(FoodStock foodStock) {
		// TODO Auto-generated method stub
		return foodStockRepo.save(foodStock);
	}

	@Override
	public FoodStock getSingleFoodStock(int id) {
		// TODO Auto-generated method stub
		Optional<FoodStock> foodStock = foodStockRepo.findById(id);
		
		if(foodStock.isPresent()) {
			return foodStock.get();
		}
		throw new RuntimeException("Food Stock is not found with the ID " + id);
	}

	@Override
	public void deleteFoodStock(int id) {
		// TODO Auto-generated method stub
		foodStockRepo.deleteById(id);
	}

	@Override
	public FoodStock updateFoodStock(FoodStock foodStock) {
		// TODO Auto-generated method stub
		return foodStockRepo.save(foodStock);
	}

}
