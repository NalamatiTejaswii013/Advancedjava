package com.javapgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEstablish {
	public static void main(String[] args) throws SQLException {
		// step1 load and register the driver(mysql)
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		// step2 establish connection between java and mysql
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Teju@123");
			System.out.println("Successfully Connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
