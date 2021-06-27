package com.jsp.framework;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.datas.Main;
import com.datas.PersonDao;
@ManagedBean(name="pbean")
@RequestScoped
public class PeopleBean {
	private int empID; private String name, city, designation;
	private List<Main> people;

	public List<Main> getPeople() {
		return people;
	}

	public void setPeople(List<Main> people) {
		this.people = people;
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
	public String store() {
		   Main person=new Main(empID,name,city, designation);
		   PersonDao.insert(person);
		   return "people";
	  }
	
}
