package com.datas;
import java.sql.*;
import java.util.*;
public class PersonDao {
private static final Connection connection= Practise1.getConnection();
public static boolean insert(Main M) {
	
	EntityManagerFactory em= Persistence.createEntityManagerFactory("myjpa");
	  EntityManager e= em.createEntityManager();
	  EntityTransaction t= e.getTransaction();
	  t.begin();

	  e.persist(p); // jpa understands that you create a new row
	 
	  t.commit();
	 return true;
//	try {
//		PreparedStatement p= connection.prepareStatement("insert into samples values(?, ?, ?, ?)");
//		p.setInt(1, M.getEmpID());
//		p.setString(2, M.getName());
//		p.setString(3, M.getCity());
//		p.setString(4, M.getDesignation());
//		p.execute();
//		return true;
//	}catch(Exception ex) {
//		System.out.println(ex.getMessage());
//		ex.printStackTrace();
//		return false;
//	}
}
public static List<Main> getPeople(){

try      {
	        List<Main> l=new ArrayList<Main>();
		    ResultSet rs=connection.createStatement().executeQuery("select * from samples");
		    while(rs.next()) {
		    	Main p=new Main();
		    	p.setEmpID(rs.getInt(1));
		    	p.setName(rs.getString(2));			
		    	p.setCity(rs.getString(3));
		    	p.setDesignation(rs.getString(4));
		    	l.add(p);
		    }
		    return l;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return null;
		}
	}
}
