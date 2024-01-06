package com.example.demo.model;

import java.sql.Date;
import java.time.LocalDate;

public class StudentRequestModel {
	
	private int id;
	private int Age;
	private String Name;
	private String Country;
	private String Email;
	private String Phonenumber;
	private LocalDate creadteon;
	private LocalDate updatedon;
	private String Status;
	
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	public LocalDate getCreadteon() {
		return creadteon;
	}
	public void setCreadteon(LocalDate creadteon) {
		this.creadteon = creadteon;
	}
	public LocalDate getUpdatedon() {
		return updatedon;
	}
	public void setUpdatedon(LocalDate updatedon) {
		this.updatedon = updatedon;
	}
	
	public StudentRequestModel(int id, int age, String name, String country, String email, String phonenumber,
			LocalDate creadteon, LocalDate updatedon, String status) {
		super();
		this.id = id;
		Age = age;
		Name = name;
		Country = country;
		Email = email;
		Phonenumber = phonenumber;
		this.creadteon = creadteon;
		this.updatedon = updatedon;
		Status = status;
	}
	public StudentRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentRequestModel [id=" + id + ", Age=" + Age + ", Name=" + Name + ", Country=" + Country + ", Email="
				+ Email + ", Phonenumber=" + Phonenumber + ", creadteon=" + creadteon + ", updatedon=" + updatedon
				+ ", Status=" + Status + "]";
	}
	
	
	
	
	
	
}
