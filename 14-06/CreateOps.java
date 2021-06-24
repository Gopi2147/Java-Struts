package com.datas;
import java.sql.*;
public class CreateOps {
	public static void main(String[] args)  {
		
	
	Connection connection = Practise1.getConnection();
	try {
		Statement stmt= connection.createStatement();
	stmt.execute("create table samples(empID integer primary key,"
			+ "name varchar(18) not null,"
			+ "city varchar(30) not null,"
			+ "designation varchar(20) not null)");
	System.out.println("Open SQL :)");
	}catch(SQLException se) {
		System.out.println(se.getMessage());
	}
}
}