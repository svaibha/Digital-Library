package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Emailresponse {
	private String issueremail;
	private String bookname;
	private LocalDate due_date;
	private LocalDate issued_date;
	private String from;
	private String msg;
	private String subject;
	
	public Emailresponse(String issueremail, String bookname, LocalDate due_date, LocalDate issued_date, String from) {
		super();
		this.issueremail = issueremail;
		this.bookname = bookname;
		this.due_date = due_date;
		this.issued_date = issued_date;
		this.from = from;
	}

	public String getIssueremail() {
		return issueremail;
	}

	public void setIssueremail(String issueremail) {
		this.issueremail = issueremail;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public LocalDate getDue_date() {
		return due_date;
	}

	public void setDue_date(LocalDate due_date) {
		this.due_date = due_date;
	}

	public LocalDate getIssued_date() {
		return issued_date;
	}

	public void setIssued_date(LocalDate issued_date) {
		this.issued_date = issued_date;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Emailresponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Emailresponse [issueremail=" + issueremail + ", bookname=" + bookname + ", due_date=" + due_date
				+ ", issued_date=" + issued_date + ", from=" + from + ", msg=" + msg + ", subject=" + subject + "]";
	}
	
	
	
}
