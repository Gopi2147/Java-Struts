package com.datas;
import java.sql.*;

import java.util.Scanner;
public class InsertOps {
public static void main(String[] args) {
	Connection connection= Practise1.getConnection();
	Scanner scr= new Scanner(System.in);
	try {
//		Scanner scr= new Scanner(System.in);
		PreparedStatement ps= connection.prepareStatement("insert into samples values(?,?,?,?)");
		while(true) {
			System.out.println("Enter ID: ");
//			int empID=Integer.parseInt(scr.next());
			int empID= scr.nextInt();
			if(empID <=0) {
			System.out.println("All data have been added to DB, Thank You!");
			break;
			}
			 System.out.println("Enter Name");
	            String name = scr.next();
	            System.out.println("Enter City");
	            String city=scr.next();
	            System.out.println("Enter designation: ");
	            String designation= scr.next();
	            ps.setInt(1, empID);
	            ps.setString(2, name);
	            ps.setString(3, city);
	            ps.setString(4, designation);
	            ps.execute();
		}
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	scr.close();
}
}
