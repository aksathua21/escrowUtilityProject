package com.escrow.domain;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Student")
public class Student {
	
	@Id
	private int id;
	private String name;
	private String stream;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", stream=" + stream + "]";
	}
	
}
