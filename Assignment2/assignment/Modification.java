package com.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.datas.Practise1;

public class Modification {
public static void modify() {
	Connection connection= Practise1.getConnection();
	Scanner scr= new Scanner(System.in);
	try {
		PreparedStatement ps= connection.prepareStatement("update employee set number=?, salary=?, name=? where ename=?");
	System.out.println("Enter employee name whose details has to be modified");
	String name=scr.next();
	System.out.println("Enter new number: ");
	Employee emp= new Employee();
	emp.setNumber(scr.nextLong());
	System.out.println("Enter updated salary: ");
	emp.setSalary(scr.nextDouble());
	System.out.println("Enter updated department: ");
	Department dept= new Department();
	dept.setName(scr.next());
	ps.setLong(1, emp.getNumber());
	ps.setDouble(2, emp.getSalary());
	ps.setString(3, dept.getName());
	ps.setString(4, name);
	ps.executeUpdate();
	System.out.println("Data modified successfully");
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	scr.close();
}
}
