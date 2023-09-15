package com.example.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BRANCH")
public class Branch 
{
	@Id
	@GeneratedValue
	private Integer bId;
	private String name;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "Hospital_Id",referencedColumnName = "Hospital_Id")
	private Hospital hospital;
	
	public Integer getbId() {
		return bId;
	}


	public void setbId(Integer bId) {
		this.bId = bId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Hospital getHospital() {
		return hospital;
	}


	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}


	

}
