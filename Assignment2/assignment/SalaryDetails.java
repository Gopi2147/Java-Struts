package com.assignment;


import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import java.util.Scanner;

import com.datas.Practise1;

public class SalaryDetails {
public static void salary() {
	Connection connection= Practise1.getConnection();
	Scanner scr= new Scanner(System.in);
	try{
		 Statement stmt = connection.createStatement();
		 ResultSet rs= stmt.executeQuery("select * from employee");
		 ResultSetMetaData metadata =rs.getMetaData();
		 byte c=(byte)metadata.getColumnCount();
		 for(int i=1;i<=c;i++) {
				System.out.printf("%10s",metadata.getColumnName(i));
			}
		 System.out.println("    increment by next year");
		 while(rs.next()) {
			 double increment= rs.getDouble(4)*0.5;
			 System.out.printf("\n%10s %10s %10s %10s %10s %10s", rs.getString(1), rs.getLong(2), rs.getString(3), rs.getDouble(4), rs.getString(5), increment);
		 }
		
	}catch(Exception ex) {
		ex.printStackTrace();
		System.out.println(ex.getMessage());
	}
	scr.close();
}
}
