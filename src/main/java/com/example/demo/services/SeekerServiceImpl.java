//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Seeker;
import com.example.demo.repositories.SeekerRepo;

@Service
public class SeekerServiceImpl implements SeekerService{
	
	@Autowired
	private SeekerRepo seekerRepo;

	@Override
	public List<Seeker> getSeekers() {
		
		return seekerRepo.findAll();
	}

	@Override
	public Seeker saveSeeker(Seeker seeker) {
		
		return seekerRepo.save(seeker);
	}

	@Override
	public Seeker getSingleSeeker(int id) {
		
		Optional<Seeker> seeker = seekerRepo.findById(id);
		
		if(seeker.isPresent()) {
			return seeker.get();
		}
		throw new RuntimeException("Seeker is not found with the ID " + id);
	}

	@Override
	public void deleteSeeker(int id) {

		seekerRepo.deleteById(id);
	}

	@Override
	public Seeker updateSeeker(Seeker seeker) {
		
		return seekerRepo.save(seeker);
	}

}
