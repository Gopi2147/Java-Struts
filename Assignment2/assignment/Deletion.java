package com.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
import com.datas.Practise1;

public class Deletion {
public static void delete() {
	Connection connection= Practise1.getConnection();
Scanner scr= new Scanner(System.in);
try {
	PreparedStatement ps= connection.prepareStatement("delete from employee where ename=(?)");
	System.out.println("Enter the employee name to be removed: ");
	Employee emp= new Employee();
	emp.setEname(scr.next());
	ps.setString(1, emp.getEname());
	ps.execute();
	System.out.println("Data removed successfully");
}catch(Exception ex) {
	ex.printStackTrace();
}
scr.close();
}
}
