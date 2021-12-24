//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Seeker;
import com.example.demo.services.SeekerService;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class SeekerController {
	
	@Autowired
	private SeekerService seekerService;
	
	@GetMapping("/seekers")
	public List<Seeker> getSeekers() {
		
		return seekerService.getSeekers();
	}
	
	@GetMapping("/seeker/{id}")
	public Seeker getSeeker(@PathVariable int id) {
		
		return seekerService.getSingleSeeker(id);
	}
	
	
	@PostMapping("/save")
	public Seeker saveSeeker(@RequestBody Seeker seeker) {
		
		return seekerService.saveSeeker(seeker);
		
	}
	//update
	@PutMapping("/update/{id}")
	public Seeker updateSeeker(@PathVariable int id, @RequestBody Seeker seeker) {
		
		seeker.setId(id);
		return seekerService.updateSeeker(seeker);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteSeeker(@PathVariable int id) {
		
		seekerService.deleteSeeker(id);
		
		
	}

}
