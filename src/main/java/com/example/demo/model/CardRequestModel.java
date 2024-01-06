package com.example.demo.model;

import java.time.LocalDate;

import com.example.demo.entites.Student;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;

public class CardRequestModel {
	
	private Integer card_id;
	private String status;
	private String email;
	private LocalDate Validupto;
	private LocalDate Createdon;
	private LocalDate Updatedon;
	private Student student;
	private Integer Code;
	private String Msg;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Integer getCode() {
		return Code;
	}
	public void setCode(Integer Code) {
		Code = Code;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	public CardRequestModel(Integer card_id, String status, String email, LocalDate validupto, LocalDate createdon,
			LocalDate updatedon, Student student, Integer Code, String msg) {
		super();
		this.card_id = card_id;
		this.status = status;
		this.email = email;
		Validupto = validupto;
		Createdon = createdon;
		Updatedon = updatedon;
		this.student = student;
		Code = Code;
		Msg = msg;
	}
	public CardRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
