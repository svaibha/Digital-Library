package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Book;

@Repository
public interface Book_Repository extends JpaRepository<Book, Integer> {
	
	
//	    List<Book> findByBookName(String Book_Name);

}
