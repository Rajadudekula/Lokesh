package com.example.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.entity.Hospital;
import com.example.hibernate.repo.HospitalRepo;

@RestController
public class HospitalController 
{
	@Autowired
	HospitalRepo hospitalRepo;
	
	@PostMapping("/saveHospital")
	public Hospital saveHospital(@RequestBody Hospital hstl)
	{
		return hospitalRepo.save(hstl);
	}

}
