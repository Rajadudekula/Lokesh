package com.example.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernate.entity.Branch;
@Repository
public interface BranchRepo extends JpaRepository<Branch, Integer>
{

}
