package com.assignment;

public class Department {
private Integer departmentno;
private String name;
public Integer getDepartmentno() {
	return departmentno;
}
public void setDepartmentno(Integer departmentno) {
	this.departmentno = departmentno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Department() {
	super();
}
public Department(Integer departmentno, String name) {
	super();
	this.departmentno = departmentno;
	this.name = name;
}
}
