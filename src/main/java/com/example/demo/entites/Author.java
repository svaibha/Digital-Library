package com.example.demo.entites;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Author")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Author_Id")
	private Integer Author_Id;
	@Column(name="Name")
	private String Name;
	@Column(name="Email")
	private String Email;
	@Column(name="Age")
	private Integer Age;
	@Column(name="Country")
	private String Country;
	@JsonIgnore
	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
    private List<Book> booklist;
	
	






	public List<Book> getBooklist() {
		return booklist;
	}


	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}


	public Author() {
		super();
		// TODO Auto-generated constructor stub
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





	


	@Override
	public String toString() {
		return "Author [Author_Id=" + Author_Id + ", Name=" + Name + ", Email=" + Email + ", Age=" + Age + ", Country="
				+ Country + "]";
	}


//	public Author(Integer author_Id, String name, String email, Integer age, String country, List<Book> book) {
//		super();
//		Author_Id = author_Id;
//		Name = name;
//		Email = email;
//		Age = age;
//		Country = country;
//		this.book = book;
//	}
	
	
	
}
