package com.datas;
@Entity
@Table(name="samples")
public class Main {
private int empID; private String name, city, designation;
public Main(){}
public Main(int empID, String name, String city, String designation){
	super();
	this.empID= empID;
	this.name=name;
	this.city=city;
	this.designation= designation;
}

public int getEmpID() {
	return empID;
}

public void setEmpID(int empID) {
	this.empID = empID;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

}
