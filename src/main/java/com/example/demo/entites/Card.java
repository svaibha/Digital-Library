package com.example.demo.entites;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Card")

public class Card implements Serializable{
	@Id
	@Column(name="card_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer card_id;
	@Column(name="Status")
	private String status;
	@Column(name="Email")
	private String email;
	@Column(name="Validupto")
	private LocalDate Validupto;
	@Column(name="Createdon")
	private LocalDate Createdon;
	@Column(name="IsIssued")
	private Integer IsIssued;
	@Column(name="Updatedon")
	private LocalDate Updatedon;
	@OneToOne(mappedBy = "card")
	private Student student;
	@JsonIgnore
	@OneToMany
	@JoinColumn
	private List<Transaction> transaction;
	
	
	public List<Transaction>getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	public Integer getCard_id() {
		return card_id;
	}
	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getValidupto() {
		return Validupto;
	}
	public void setValidupto(LocalDate validupto) {
		Validupto = validupto;
	}
	public LocalDate getCreatedon() {
		return Createdon;
	}
	public void setCreatedon(LocalDate createdon) {
		Createdon = createdon;
	}
	public LocalDate getUpdatedon() {
		return Updatedon;
	}
	public void setUpdatedon(LocalDate updatedon) {
		Updatedon = updatedon;
	}
	@JsonIgnore
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Card(Integer card_id, String status, String email, LocalDate validupto, LocalDate createdon, LocalDate updatedon,
			Student student) {
		super();
		this.card_id = card_id;
		this.status = status;
		this.email = email;
		Validupto = validupto;
		Createdon = createdon;
		Updatedon = updatedon;
		this.student = student;
	}
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Card [card_id=" + card_id + ", status=" + status + ", email=" + email + ", Validupto=" + Validupto
				+ ", Createdon=" + Createdon + ", Updatedon=" + Updatedon + ", student=" + student + "]";
	}
	public Integer getIsIssued() {
		return IsIssued;
	}
	public void setIsIssued(Integer isIssued) {
		IsIssued = isIssued;
	}
	
	
	
}
