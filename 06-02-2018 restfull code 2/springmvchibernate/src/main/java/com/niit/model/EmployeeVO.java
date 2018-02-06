package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeVO 
{
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	private String firstName;
	private String lastName;
	
	public EmployeeVO(){
		
	}
	public EmployeeVO(Integer id, String firstname, String lastname){
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
}