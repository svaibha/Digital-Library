package com.example.demo.entites;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="Id")
	private Integer id;
	@Column(name="Age")
	private Integer age;
	@Column(name="Name")
	private String name;
	@Column(name="Country")
	private String country;
	@Column(name="Email")
	private String Email;
	@Column(name="phonenumber")
	private String phonenumber;
	@Column(name="createdon")
	private LocalDate createdon;
	@Column(name="udatedon")
	
	private LocalDate Updatedon;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="card_id",referencedColumnName = "card_id")
	private Card card;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public LocalDate getCreatedon() {
		return createdon;
	}

	public void setCreatedon(LocalDate createdon) {
		this.createdon = createdon;
	}

	public LocalDate getUpdatedon() {
		return Updatedon;
	}

	public void setUpdatedon(LocalDate updatedon) {
		Updatedon = updatedon;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Student(Integer id, Integer age, String name, String country, String email, String phonenumber,
			LocalDate createdon, LocalDate updatedon, Card card) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.country = country;
		Email = email;
		this.phonenumber = phonenumber;
		this.createdon = createdon;
		Updatedon = updatedon;
		this.card = card;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
