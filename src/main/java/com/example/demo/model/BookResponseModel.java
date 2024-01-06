package com.example.demo.model;

import java.time.LocalDate;
import java.util.Date;

import com.example.demo.entites.Author;

import jakarta.persistence.Column;

public class BookResponseModel {
	private Integer Book_Id;	
	private String Book_name;
	private Integer No_of_pages;
	private String Language;
	private String Available;
	private String Genre;
	private String ISBNnumber;
	private Integer Status;
	private String Msg;
	private Author author;
	private String PublishedDate;
	
	
	
	
	public String getBook_name() {
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	public Integer getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(Integer book_Id) {
		Book_Id = book_Id;
	}
	
	public Integer getNo_of_pages() {
		return No_of_pages;
	}
	public void setNo_of_pages(Integer no_of_pages) {
		No_of_pages = no_of_pages;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getAvailable() {
		return Available;
	}
	public void setAvailable(String available) {
		Available = available;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getISBNnumber() {
		return ISBNnumber;
	}
	public void setISBNnumber(String iSBNnumber) {
		ISBNnumber = iSBNnumber;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public BookResponseModel(Integer status, String msg) {
		super();
		Status = status;
		Msg = msg;
	}
	
	public String getPublishedDate() {
		return PublishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		PublishedDate = publishedDate;
	}
	public BookResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookResponseModel(Integer book_Id, String Book_name, Integer no_of_pages, String language, String available,
			String genre, String iSBNnumber, Integer status, String msg, String publishedDate) {
		super();
		Book_Id = book_Id;
		
		this.Book_name = Book_name;
		No_of_pages = no_of_pages;
		Language = language;
		Available = available;
		Genre = genre;
		ISBNnumber = iSBNnumber;
		Status = status;
		Msg = msg;
		PublishedDate = publishedDate;
	}
	public BookResponseModel(Integer book_Id, String Book_name, Integer no_of_pages, String language, String available,
			String genre, String iSBNnumber, Author author, String publishedDate) {
		super();
		Book_Id = book_Id;
		this.Book_name = Book_name;
		No_of_pages = no_of_pages;
		Language = language;
		Available = available;
		Genre = genre;
		ISBNnumber = iSBNnumber;
		this.author = author;
		PublishedDate = publishedDate;
	}
	
	
	
	
	
	
}
