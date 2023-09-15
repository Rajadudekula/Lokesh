package com.example.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.entity.Branch;
import com.example.hibernate.repo.BranchRepo;

@RestController
public class BranchController 
{
	@Autowired
	BranchRepo branchRepo;
	
	@PostMapping("/saveBranch")
	public Branch saveBranch(@RequestBody Branch branch)
	{
		return branchRepo.save(branch);
	}
	
	

}
