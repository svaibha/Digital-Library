package com.example.demo.model;

import com.example.demo.entites.Book;

public class AuthorResponseModel {
	private Integer Author_Id;
	private String Name;
	private String Email;
	private Integer Age;
	private String Country;
	private Book book;
	private Integer status;
	private String msg;
	
	
	
	public AuthorResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthorResponseModel(Integer author_Id, String name, String email, Integer age, String country, Book book,
			Integer status, String msg) {
		super();
		Author_Id = author_Id;
		Name = name;
		Email = email;
		Age = age;
		Country = country;
		this.book = book;
		this.status = status;
		this.msg = msg;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getAuthor_Id() {
		return Author_Id;
	}
	public void setAuthor_Id(Integer author_Id) {
		Author_Id = author_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public AuthorResponseModel(Integer status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public AuthorResponseModel(Integer author_Id, String name, String email, Integer age, String country,
			Integer status, String msg) {
		super();
		Author_Id = author_Id;
		Name = name;
		Email = email;
		Age = age;
		Country = country;
		this.status = status;
		this.msg = msg;
	}
	
	
	
}
