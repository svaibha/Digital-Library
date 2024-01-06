package com.example.demo.model;

import java.time.LocalDate;

import com.example.demo.entites.Student;

public class CardResponseModel {
	private Integer card_id;
	private String status;
	private String email;
	private LocalDate Validupto;
	private LocalDate Createdon;
	private LocalDate Updatedon;
	private Student student;
	private Integer code;
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
	public void setStatus(Integer code) {
		code = code;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	public CardResponseModel(Integer card_id, String status, String email, LocalDate validupto, LocalDate createdon,
			LocalDate updatedon,  Integer code, String msg) {
		super();
		this.card_id = card_id;
		this.status = status;
		this.email = email;
		Validupto = validupto;
		Createdon = createdon;
		Updatedon = updatedon;
		code = code;
		Msg = msg;
	}
	public CardResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardResponseModel(Integer card_id, String status, String email, LocalDate validupto, LocalDate createdon,
			LocalDate updatedon, Student student) {
		super();
		this.card_id = card_id;
		this.status = status;
		this.email = email;
		Validupto = validupto;
		Createdon = createdon;
		Updatedon = updatedon;
		this.student = student;
	}
	public CardResponseModel(Integer card_id, Integer code, String msg) {
		super();
		this.card_id = card_id;
		this.code = code;
		Msg = msg;
	}
	
	
	
	

}
