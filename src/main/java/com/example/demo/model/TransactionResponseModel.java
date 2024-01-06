package com.example.demo.model;

import java.time.LocalDate;
import java.util.Date;

import com.example.demo.entites.Book;
import com.example.demo.entites.Card;


public class TransactionResponseModel {
	private Integer Trans_Id;
	private Book Book_Id;
	private Card Card_Id;
	private Date Trans_Date;
	private LocalDate Book_Due_Date;
	private String  Is_Issued;
	private String Is_Returned;
	private double Fine_Amount;
	private String  Status;
	private Date Created_On;
	private Date Updated_On;
	private Integer Code;
	private String msg;
	public Integer getTrans_Id() {
		return Trans_Id;
	}
	public void setTrans_Id(Integer trans_Id) {
		Trans_Id = trans_Id;
	}
	public Book getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(Book book_Id) {
		Book_Id = book_Id;
	}
	public Card getCard_Id() {
		return Card_Id;
	}
	public void setCard_Id(Card card_Id) {
		Card_Id = card_Id;
	}
	public Date getTrans_Date() {
		return Trans_Date;
	}
	public void setTrans_Date(Date trans_Date) {
		Trans_Date = trans_Date;
	}
	public LocalDate getBook_Due_Date() {
		return Book_Due_Date;
	}
	public void setBook_Due_Date(LocalDate book_Due_Date) {
		Book_Due_Date = book_Due_Date;
	}
	public String getIs_Issued() {
		return Is_Issued;
	}
	public void setIs_Issued(String is_Issued) {
		Is_Issued = is_Issued;
	}
	public String getIs_Returned() {
		return Is_Returned;
	}
	public void setIs_Returned(String is_Returned) {
		Is_Returned = is_Returned;
	}
	public double getFine_Amount() {
		return Fine_Amount;
	}
	public void setFine_Amount(double fine_Amount) {
		Fine_Amount = fine_Amount;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getCreated_On() {
		return Created_On;
	}
	public void setCreated_On(Date created_On) {
		Created_On = created_On;
	}
	public Date getUpdated_On() {
		return Updated_On;
	}
	public void setUpdated_On(Date updated_On) {
		Updated_On = updated_On;
	}
	public Integer getCode() {
		return Code;
	}
	public void setCode(Integer code) {
		Code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public TransactionResponseModel(Integer trans_Id, Book book_Id, Card card_Id, Date trans_Date,
			LocalDate book_Due_Date, String is_Issued, String is_Returned, double fine_Amount, String status,
			Date created_On, Date updated_On) {
		super();
		Trans_Id = trans_Id;
		Book_Id = book_Id;
		Card_Id = card_Id;
		Trans_Date = trans_Date;
		Book_Due_Date = book_Due_Date;
		Is_Issued = is_Issued;
		Is_Returned = is_Returned;
		Fine_Amount = fine_Amount;
		Status = status;
		Created_On = created_On;
		Updated_On = updated_On;
	}
	
	public TransactionResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionResponseModel(Book book_Id, Integer code, String msg) {
		super();
		Book_Id = book_Id;
		Code = code;
		this.msg = msg;
	}
	public TransactionResponseModel(Integer trans_Id, Book book_Id, Card card_Id, Date trans_Date,
			LocalDate book_Due_Date, String is_Issued, String is_Returned, double fine_Amount, String status,
			Date created_On, Date updated_On, Integer code, String msg) {
		super();
		Trans_Id = trans_Id;
		Book_Id = book_Id;
		Card_Id = card_Id;
		Trans_Date = trans_Date;
		Book_Due_Date = book_Due_Date;
		Is_Issued = is_Issued;
		Is_Returned = is_Returned;
		Fine_Amount = fine_Amount;
		Status = status;
		Created_On = created_On;
		Updated_On = updated_On;
		Code = code;
		this.msg = msg;
	}
	public TransactionResponseModel(Integer trans_Id, Book book_Id, Card card_Id, Date trans_Date,
			LocalDate book_Due_Date, double fine_Amount, Integer code, String msg) {
		super();
		Trans_Id = trans_Id;
		Book_Id = book_Id;
		Card_Id = card_Id;
		Trans_Date = trans_Date;
		Book_Due_Date = book_Due_Date;
		Fine_Amount = fine_Amount;
		Code = code;
		this.msg = msg;
	}
	
	
	
	
	
	

}
