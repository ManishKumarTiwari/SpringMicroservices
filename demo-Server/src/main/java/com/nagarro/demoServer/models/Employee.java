package com.nagarro.demoServer.models;

public class Employee {
	private Long id;	
	private String name;	
	private String date;
	
	public Employee() {
		
		setName("Manish");
		setDate("26/02/1995");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}	
	

}
