//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.FoodStock;

@Repository
public interface FoodStockRepo extends JpaRepository<FoodStock, Integer>{

}
