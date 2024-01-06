package com.example.demo.model;

import java.time.LocalDate;
import java.util.Date;

import com.example.demo.entites.Author;

public class BookRequestModel {
	
	private Integer Book_Id;	
	private String Book_name;
	private String Name;
	private String Email;
	private Integer Age;
	private String Country;
	private Integer No_of_pages;
	private String Language;
	private String Available;
	private String Genre;
	private String ISBNnumber;
	private Integer Status;
	private String Msg;
	private Author author;
	private String PublishedDate;
	
	
	public Integer getBook_Id() {
		return Book_Id;
	}
	
	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public void setBook_Id(Integer book_Id) {
		Book_Id = book_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getPublishedDate() {
		return PublishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		PublishedDate = publishedDate;
	}
	public BookRequestModel(Integer book_Id, String Book_name,String name, Integer no_of_pages, String language, String available,
			String genre, String iSBNnumber, Integer status, String msg, Author author, String publishedDate) {
		super();
		Book_Id = book_Id;
		this.Book_name = Book_name;
		Name = name;
		No_of_pages = no_of_pages;
		Language = language;
		Available = available;
		Genre = genre;
		ISBNnumber = iSBNnumber;
		Status = status;
		Msg = msg;
		this.author = author;
		PublishedDate = publishedDate;
	}
	public BookRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookRequestModel [Book_Id=" + Book_Id + ", Name=" + Name + ", No_of_pages=" + No_of_pages
				+ ", Language=" + Language + ", Available=" + Available + ", Genre=" + Genre + ", ISBNnumber="
				+ ISBNnumber + ", Status=" + Status + ", Msg=" + Msg + ", author=" + author + ", PublishedDate="
				+ PublishedDate + "]";
	}
	public BookRequestModel(String name, String email, Integer age, String country, Integer status, String msg) {
		super();
		Name = name;
		Email = email;
		Age = age;
		Country = country;
		Status = status;
		Msg = msg;
	}

	
	
}


