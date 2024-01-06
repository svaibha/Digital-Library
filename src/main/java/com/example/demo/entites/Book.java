package com.example.demo.entites;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@Table(name="Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Book_Id")
	private Integer Book_Id;
	@Column(name="Book_Name")
	private String Book_Name;
	@Column(name="No_of_pages")
	private Integer No_of_pages;
	@Column(name="Language")
	private String Language;
	@Column(name="Available")
	private String Available;
	@Column(name="Genre")
	private String Genre;
	@Column(name="ISBNnumber")
	private String ISBNnumber;
	@Column(name="PublishedDate")
	private String PublishedDate;
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	@JsonIgnore
	@OneToMany
	@JoinColumn
	private List<Transaction> transaction;
	
	
	
	public Integer getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(Integer book_Id) {
		Book_Id = book_Id;
	}
	public String getBook_Name() {
		return Book_Name;
	}
	public void setBook_Name(String Book_Name) {
		this.Book_Name = Book_Name;
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
	public String getPublishedDate() {
		return PublishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		PublishedDate = publishedDate;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Book(Integer book_Id, String Book_Name, Integer no_of_pages, String language, String available, String genre,
			String iSBNnumber, String publishedDate, Author author) {
		super();
		Book_Id = book_Id;
		this.Book_Name = Book_Name;
		No_of_pages = no_of_pages;
		Language = language;
		Available = available;
		Genre = genre;
		ISBNnumber = iSBNnumber;
		PublishedDate = publishedDate;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [Book_Id=" + Book_Id + ", Name=" + Book_Name + ", No_of_pages=" + No_of_pages + ", Language=" + Language
				+ ", Available=" + Available + ", Genre=" + Genre + ", ISBNnumber=" + ISBNnumber + ", PublishedDate="
				+ PublishedDate + ",]";
	}
	public List<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	
	
	
	
	
}
