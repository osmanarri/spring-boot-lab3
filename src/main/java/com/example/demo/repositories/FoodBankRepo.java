//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.FoodBank;

@Repository
public interface FoodBankRepo extends JpaRepository<FoodBank, Integer>{

}
