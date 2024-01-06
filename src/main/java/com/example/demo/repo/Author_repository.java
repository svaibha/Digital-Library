package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Author;

public interface Author_repository  extends JpaRepository<Author, Integer>{

}
