package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Card;

public interface Card_repo extends JpaRepository<Card, Integer> {

}
