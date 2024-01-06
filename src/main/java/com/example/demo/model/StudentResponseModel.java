package com.example.demo.model;


import java.time.LocalDate;

public class StudentResponseModel {
	
	private int id;
	private int Age;
	private String Name;
	private String Country;
	private String Email;
	private String Phonenumber;
	private LocalDate creadteon;
	private LocalDate updatedon;
	private int status;
	private String msg;
	
	
	
	public StudentResponseModel(int status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
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
	public StudentResponseModel(int id, int age, String name, String country, String email, String phonenumber,
			LocalDate creadteon, LocalDate updatedon) {
		super();
		this.id = id;
		Age = age;
		Name = name;
		Country = country;
		Email = email;
		Phonenumber = phonenumber;
		this.creadteon = creadteon;
		this.updatedon = updatedon;
	}
	public StudentResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentResponseModel [id=" + id + ", Age=" + Age + ", Name=" + Name + ", Country=" + Country
				+ ", Email=" + Email + ", Phonenumber=" + Phonenumber + ", creadteon=" + creadteon + ", updatedon="
				+ updatedon + "]";
	}



	public StudentResponseModel(int id, int age, String name, String country, String email, String phonenumber,
			LocalDate creadteon, LocalDate updatedon, int status, String msg) {
		super();
		this.id = id;
		Age = age;
		Name = name;
		Country = country;
		Email = email;
		Phonenumber = phonenumber;
		this.creadteon = creadteon;
		this.updatedon = updatedon;
		this.status = status;
		this.msg = msg;
	}
	
	

}
