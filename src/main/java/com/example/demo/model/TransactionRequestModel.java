package com.example.demo.model;

import java.util.Date;

public class TransactionRequestModel {
	
	private Integer Trans_Id;
	private Integer Book_Id;
	private Integer Card_Id;
	private Date Trans_Date;
	private Date Book_Due_Date;
	private String  Is_Issued;
	private String Is_Returned;
	private Integer Fine_Amount;
	private String  Status;
	private Date Created_On;
	private Date Updated_On;
	
	public Integer getTrans_Id() {
		return Trans_Id;
	}
	public void setTrans_Id(Integer trans_Id) {
		Trans_Id = trans_Id;
	}
	public Integer getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(Integer book_Id) {
		Book_Id = book_Id;
	}
	public Integer getCard_Id() {
		return Card_Id;
	}
	public void setCard_Id(Integer card_Id) {
		Card_Id = card_Id;
	}
	public Date getTrans_Date() {
		return Trans_Date;
	}
	public void setTrans_Date(Date trans_Date) {
		Trans_Date = trans_Date;
	}
	public Date getBook_Due_Date() {
		return Book_Due_Date;
	}
	public void setBook_Due_Date(Date book_Due_Date) {
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
	public Integer getFine_Amount() {
		return Fine_Amount;
	}
	public void setFine_Amount(Integer fine_Amount) {
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
	public TransactionRequestModel(Integer trans_Id, Integer book_Id, Integer card_Id, Date trans_Date,
			Date book_Due_Date, String is_Issued, String is_Returned, Integer fine_Amount, String status,
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
	public TransactionRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
