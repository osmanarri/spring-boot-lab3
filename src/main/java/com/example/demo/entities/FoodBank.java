//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class FoodBank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column
	private String FoodBankName;
	
	@Column
	private String address;
	
	@Column
	private String city;
	
	@Column
	private String phone;
	
	@Column
	private String website;
	
	@Column
	private String email;
	
	
	@ManyToMany(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST },
			fetch=FetchType.LAZY)
	@JoinTable(name="FoodBank_Seeker",
				joinColumns=@JoinColumn(name="food_bank_id"),
				inverseJoinColumns=@JoinColumn(name="seeker_id"))
	private List<Seeker> seekers;
	
	public List<Seeker> getSeekers() {
		return seekers;
	}

	public void setSeekers(List<Seeker> seekers) {
		this.seekers = seekers;
	}

	public FoodBank() {
		
	}

	public FoodBank(String foodBankName, String address, String city, String phone, String website, String email) {
		super();
		FoodBankName = foodBankName;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.website = website;
		this.email = email;
	}

	public String getFoodBankName() {
		return FoodBankName;
	}

	public void setFoodBankName(String foodBankName) {
		FoodBankName = foodBankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
