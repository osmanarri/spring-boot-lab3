//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.FoodBank;
import com.example.demo.services.FoodBankService;



@RestController
@RequestMapping("/food-bank")
public class FoodBankController {
	
	@Autowired
	private FoodBankService fService;
	
	@GetMapping("/food-banks")
	public List<FoodBank> getFoodBanks() {
		
		return fService.getFoodBanks();
	}
	
	@GetMapping("/food-bank/{id}")
	public FoodBank getSeeker(@PathVariable int id) {
		
		return fService.getSingleFoodBank(id);
	}
	
	
	@PostMapping("/save")
	public FoodBank saveSeeker(@RequestBody FoodBank foodBank) {
		
		return fService.saveFoodBank(foodBank);
		
	}
	//update
	@PutMapping("/update/{id}")
	public FoodBank updateFoodBank(@PathVariable int id, @RequestBody FoodBank foodBank) {
		
		foodBank.setId(id);
		return fService.updateFoodBank(foodBank);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletefoodBank(@PathVariable int id) {
		
		fService.deleteFoodBank(id);
		
		
	}

}
