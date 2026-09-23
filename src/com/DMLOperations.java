package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/student";
		String userName="root";
		String password="root";
		
		Connection conn=DriverManager.getConnection(url,userName,password);
		
		String Query="delete from details where id=1";
		String Query1="insert into details values(1,'renu',95)";
		String Query2="update details set marks=99 where id=1";
		
		Statement stat=conn.createStatement();
		
		
		stat.executeUpdate(Query);
		stat.executeUpdate(Query1);
		stat.executeUpdate(Query2);
		
		System.out.println("inserted.......");
		
		
		conn.close();
		stat.close();
		
		
		
		
		
	}

}
