package com.assignment;

public class Employee {
private String ename;
private long number;	
private String gender;
private double salary;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employee(String ename, long number, String gender, double salary) {
	super();
	this.ename = ename;
	this.number = number;
	this.gender = gender;
	this.salary = salary;
}
public Employee() {
	super();
}

}
