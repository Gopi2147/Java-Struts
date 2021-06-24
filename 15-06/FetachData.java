package com.datas;
import java.sql.*;
public class FetachData {
 public static void main(String[] args) {
	 Connection connection= Practise1.getConnection();
	 try {
		 Statement stmt = connection.createStatement();
		 ResultSet rs= stmt.executeQuery("select * from samples");
		 ResultSetMetaData metadata =rs.getMetaData();
		 byte c=(byte)metadata.getColumnCount();
		 for(int i=1;i<=c;i++) {
				System.out.printf("%20s",metadata.getColumnName(i));
			}
			System.out.println("\n_____________________________________________________________________________________________");
			while(rs.next()) {
				System.out.printf("\n%20d %20s %20s %20s",rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4));
			}
	 }catch(Exception ex) {
		 System.out.println(ex.getMessage());
	 }
}
}
