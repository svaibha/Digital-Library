package com.example.demo.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entites.*;
import com.example.demo.model.StudentRequestModel;
import com.example.demo.model.StudentResponseModel;
import com.example.demo.repo.Card_repo;
import com.example.demo.repo.Student_Repository;

@Service
public class StudentService {
	
	@Autowired
	Student_Repository stdrepo;
	@Autowired
	Card_repo cardrepo;
	
	public StudentResponseModel student(StudentRequestModel new_student) {
		
		
		StudentResponseModel response;
		LocalDate localdate = LocalDate.now();
		LocalDate futuredate = localdate.plusDays(100);
		
		
		
		if(new_student.getName().equals(null)|| new_student.getCountry() == null || new_student.getAge() == 0 || new_student.getEmail() == null || new_student.getPhonenumber()==null) {
			response = new StudentResponseModel(500,"something is wrong");
			return response;
		}
		if(new_student.getEmail().contains("@")) {
		
		
		Student new_std = new Student();
		new_std.setName(new_student.getName());
		new_std.setAge(new_student.getAge());
		new_std.setCountry(new_student.getCountry());
		new_std.setEmail(new_student.getEmail());
		new_std.setPhonenumber(new_student.getPhonenumber());
		new_std.setCreatedon(localdate);
		new_std.setUpdatedon(localdate);
		Card card = new Card();
		card.setStatus(new_student.getStatus());
		card.setEmail(new_student.getEmail());
		card.setValidupto(futuredate);
		card.setIsIssued(0);
		card.setCreatedon(new_std.getCreatedon());
		card.setUpdatedon(new_std.getCreatedon());
		new_std.setCard(card);
		
		stdrepo.save(new_std);
		cardrepo.save(card);
		response = new StudentResponseModel(new_std.getId(), new_std.getAge(), new_std.getCountry(), new_std.getEmail(), new_std.getPhonenumber(), new_std.getPhonenumber(), localdate, localdate,200,"Student card created");
		}else {
			response = new StudentResponseModel(400,"wrong email");
		}
		return response;
		
		
	}
	public Optional<Student> getstudnet(Integer Id) {
		 return stdrepo.findById(Id);
		
	}
	public void  deletestudent(Integer Id) {
		stdrepo.deleteById(Id);
		return;
	}
	
	public StudentResponseModel updated(StudentRequestModel newdata , int Student_id) {
		StudentResponseModel updated_response = new StudentResponseModel();
		Student response = stdrepo.findById(Student_id).get();
		Card card_status = cardrepo.findById(Student_id).get();
		LocalDate localdate = LocalDate.now();
		
		if(Objects.nonNull(newdata.getName())&& !"".equalsIgnoreCase(newdata.getName())) {
			response.setName(newdata.getName());
		}
		if(Objects.nonNull(newdata.getEmail())&& !"".equalsIgnoreCase(newdata.getEmail())) {
			response.setEmail(newdata.getEmail());
		}
		if(Objects.nonNull(newdata.getCountry())&& !"".equalsIgnoreCase(newdata.getCountry())) {
			response.setCountry(newdata.getCountry());
		}
		if(Objects.nonNull(newdata.getPhonenumber())&& !"".equalsIgnoreCase(newdata.getPhonenumber())) {
			response.setPhonenumber(newdata.getPhonenumber());
		}
		if(Objects.nonNull(newdata.getAge())&& !"".equals(newdata.getAge())) {
			response.setAge(newdata.getAge());
		}
		if(Objects.nonNull(newdata.getAge())&& !"".equals(newdata.getAge())) {
			response.setAge(newdata.getAge());
		}
		if(Objects.nonNull(newdata.getEmail())&& !"".equalsIgnoreCase(newdata.getEmail())) {
			card_status.setEmail(newdata.getEmail());
		}
		if(Objects.nonNull(newdata.getStatus())&& !"".equalsIgnoreCase(newdata.getStatus())) {
			card_status.setStatus(newdata.getStatus());
		}
		
//		response.setUpdatedon(localdate);
		card_status.setUpdatedon(localdate);
		
		stdrepo.save(response);
		cardrepo.save(card_status);
		
		updated_response  = new StudentResponseModel(newdata.getId(),newdata.getAge(),newdata.getCountry(),newdata.getName(),newdata.getEmail(),newdata.getPhonenumber(),newdata.getCreadteon(),newdata.getUpdatedon());
		
		return updated_response;
		
		
	}

}
