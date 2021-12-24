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

import com.example.demo.entities.FoodStock;
import com.example.demo.services.FoodStockService;

@RestController
@RequestMapping("/food-stock")
public class FoodStockController {
	
	@Autowired
	private FoodStockService foodStockService;
	
	@GetMapping("/food-stocks")
	public List<FoodStock> getFoodStocks() {
		
		return foodStockService.getFoodStocks();
	}
	
	@GetMapping("/food-stock/{id}")
	public FoodStock getFoodStock(@PathVariable int id) {
		
		return foodStockService.getSingleFoodStock(id);
	}
	
	
	@PostMapping("/save")
	public FoodStock saveSeeker(@RequestBody FoodStock foodStock) {
		
		return foodStockService.saveFoodStock(foodStock);
		
	}
	//update
	@PutMapping("/update/{id}")
	public FoodStock updateFoodStock(@PathVariable int id, @RequestBody FoodStock foodStock) {
		
		foodStock.setId(id);
		return foodStockService.updateFoodStock(foodStock);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteFoodStock(@PathVariable int id) {
		
		foodStockService.deleteFoodStock(id);
		
		
	}

}
