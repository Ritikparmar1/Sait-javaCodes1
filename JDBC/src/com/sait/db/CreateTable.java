package com.sait.db;
import java.sql.*;
public class CreateTable {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/sait",
				"root","root");
		Statement st=c.createStatement();
		st.executeUpdate("Create table students ("+"sid int primary key auto_increment,"+"sname varchar(50),"+"sphone varchar(10))");
		System.out.println("Table Created Successfully!!!");
		c.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
