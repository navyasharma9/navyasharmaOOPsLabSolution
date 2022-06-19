package com.gl.lab;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private char[] password;
	public Employee(){
	}
	public Employee(String firstName,String lastName, String department) {
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=department;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName() {
		this.firstName=firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String toString() {
		return "Employee FirstName"+firstName+"LastName"+lastName+"Email"+email+"Password"+password;
	}
	
}
