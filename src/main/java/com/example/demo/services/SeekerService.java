//Student name1: Osman
//student name2: Florance
//lab 3

package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Seeker;

public interface SeekerService {
	
	List<Seeker> getSeekers();
	
	Seeker saveSeeker(Seeker seeker);
	
	Seeker getSingleSeeker(int id);
	
	void deleteSeeker(int id);
	
	Seeker updateSeeker(Seeker seeker);

}
