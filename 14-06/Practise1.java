package com.datas;
import java.sql.*;
 abstract public class Practise1 {
	private static Connection connection;
	static {	   
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		connection=	DriverManager.getConnection("jdbc:sqlserver://den1.mssql8.gear.host;databaseName=databasedatabase",
					"databasedatabase","mssqldb@123");			
			System.out.println("Successfully connected to SQL server");
			
		} catch (SQLException se) {
			// TODO Auto-generated 
			se.printStackTrace();
			} catch (ClassNotFoundException ce) {
			// TODO Auto-generated catch block
			ce.printStackTrace();
		}
		
	}
	public static Connection getConnection(){
		   return connection;
	   }
}

 
