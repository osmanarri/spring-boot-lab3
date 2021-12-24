//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.FoodStock;



public interface FoodStockService {
	
	List<FoodStock> getFoodStocks();
	
	FoodStock saveFoodStock(FoodStock foodStock);
		
	FoodStock getSingleFoodStock(int id);
		
	void deleteFoodStock(int id);
		
	FoodStock updateFoodStock(FoodStock foodStock);

}
