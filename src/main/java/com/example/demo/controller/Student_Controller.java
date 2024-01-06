package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Student;
import com.example.demo.model.StudentRequestModel;
import com.example.demo.model.StudentResponseModel;
import com.example.demo.service.StudentService;

@RestController
public class Student_Controller {
	
	Student st = new Student();
	@Autowired
	StudentService stservice;
	
	@PostMapping("/student")
	
	public StudentResponseModel student(@RequestBody StudentRequestModel studentbody) {
		return stservice.student(studentbody);
	}
	
	@GetMapping("/student/{Id}")
	@Cacheable(value="Student" ,key="#Id")
	public Optional<Student> getstudnet(@PathVariable Integer Id) {
		return stservice.getstudnet(Id);
	}
	
	@DeleteMapping("/student/{Id}")
	@Cacheable(value="Student" ,key="#Id")
	public void deletestudent(@PathVariable Integer Id) {
		   stservice.deletestudent(Id);
		   return;
	}
	
	@PutMapping("/student/{Id}")
	
	public StudentResponseModel updatedata(@RequestBody StudentRequestModel new_data, @PathVariable Integer Id) {
		return stservice.updated(new_data, Id);
	}
 }
