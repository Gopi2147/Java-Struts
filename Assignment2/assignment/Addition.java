package com.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.datas.Practise1;

public class Addition {
public static void addition() {
	Connection connection= Practise1.getConnection();
	Scanner scr= new Scanner(System.in);
	try {
		PreparedStatement ps= connection.prepareStatement("insert into employee values(?, ?, ?, ?, ?)");
		System.out.println("Enter employee name: ");
		Employee emp= new Employee();
		Department dept= new Department();
		emp.setEname(scr.next());
		System.out.println("Enter mobile number: ");
		emp.setNumber(scr.nextLong());
		System.out.println("Enter gender: ");
		emp.setGender(scr.next());
		System.out.println("Enter salary: ");
		String gender= emp.getGender();
		double salary= scr.nextDouble();
		if(gender.equals("male")) {
			double temp= salary/10;
			salary= salary-temp;
			emp.setSalary(salary);
			System.out.println("10% Tax will be detected from salary");
		}else {
			double temp= salary/7;
			salary= salary-temp;
			emp.setSalary(salary);
			System.out.println("7% Tax will be detected from salary");
		}
		System.out.println("Enter Department: ");
	dept.setName(scr.next());
	ps.setString(1, emp.getEname());
	ps.setLong(2, emp.getNumber());
	ps.setString(3, emp.getGender());
	ps.setDouble(4, emp.getSalary());
	ps.setString(5, dept.getName());
	ps.execute();
	System.out.println("Data Added successfully");
	}catch(SQLException ex) {
		ex.printStackTrace();
	}catch(InputMismatchException im) {
		System.out.println("Invalid input!");
	}
	scr.close();
}
}
