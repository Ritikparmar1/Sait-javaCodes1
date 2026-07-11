package com.sait.db;
import java.sql.*;
public class InsertData {
	 public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(
					"jdbc:mysql:/localhost:3306/sait",
					"root","root");
			Statement st=c.createStatement();
			st.executeUpdate("insert into students(sname,sphone) values('kaliya','12345678')");
					System.out.println("Data inserted Successfully!!!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
