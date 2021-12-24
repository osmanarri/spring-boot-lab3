//Student name1: Osman
//student name2: Florance
//lab 3
package com.example.demo.entities;



import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodStock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String typeOfFood;

	@Column
	private int quantity;

	@Column
	private LocalDate  bestBefore;

	@Column
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(String typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate  getBestBefore() {
		return bestBefore;
	}

	public void setBestBefore(LocalDate  bestBefore) {
		this.bestBefore = bestBefore;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public FoodStock(String typeOfFood, int quantity, LocalDate  bestBefore, String status) {
		super();
		this.typeOfFood = typeOfFood;
		this.quantity = quantity;
		this.bestBefore = bestBefore;
		this.status = status;
	}

	public FoodStock() {

	}

}
