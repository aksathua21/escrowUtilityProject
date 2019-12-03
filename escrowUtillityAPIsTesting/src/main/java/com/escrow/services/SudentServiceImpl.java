package com.escrow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.escrow.domain.Student;


@Service
public class SudentServiceImpl {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<Student> getTradersList(int from,int to) {
		 Query query = new Query();
	     query.addCriteria(Criteria.where("id").gte(from).lte(to));
	     System.out.println("getTradersList :query "+query);
	     return mongoTemplate.find(query, Student.class, "Student");
	}
}
