//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.FoodBank;

public interface FoodBankService {
	
   List<FoodBank> getFoodBanks();
	
   FoodBank saveFoodBank(FoodBank foodBank);
	
   FoodBank getSingleFoodBank(int id);
	
	void deleteFoodBank(int id);
	
	FoodBank updateFoodBank(FoodBank foodBank);

}
