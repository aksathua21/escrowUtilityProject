package com.escrow.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.escrow.domain.Student;
import com.escrow.repository.StudentRepository;
import com.escrow.services.SudentServiceImpl;

@RestController
@RequestMapping(value ="/api")
public class TestController {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SudentServiceImpl sudentServiceImpl;
	
	@RequestMapping(value = "/getapi", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> callApi() {
		return studentRepository.findAll();
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void create(HttpServletRequest request, @RequestBody Student student) {
		System.out.println(student);
		mongoTemplate.insert(student);
	}
	
	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getRangeOfStudents() {
		return sudentServiceImpl.getTradersList(111, 123);
	}
	
}
