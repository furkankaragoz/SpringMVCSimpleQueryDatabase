package com.furkan.springdemo;

import java.util.LinkedHashMap;

public class Personel {
	
	private String firstName;
	private String lastName;
	private int salary;
	private String department;
	
	private String socialSecurityType; // radio button seçtirimi için
	
	

	public String getSocialSecurityType() {
		return socialSecurityType;
	}

	public void setSocialSecurityType(String socialSecurityType) {
		this.socialSecurityType = socialSecurityType;
	}
	LinkedHashMap<String,String> departments;
	
	
	public LinkedHashMap<String, String> getDepartments() {
		return departments;
	}
	
	public Personel() {
		
		departments = new LinkedHashMap<>();
		departments.put("HR", "Human Resources");
		departments.put("AC", "Accounting");
		departments.put("SA", "Sales");
		departments.put("SW", "Software");
		
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	
	
	
	
	
	
	
	
	
	

}
