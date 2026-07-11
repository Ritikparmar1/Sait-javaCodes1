package com.sait.db.ps;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertData {
	 public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(
					"jdbc:mysql:/localhost:3306/sait",
					"root","root");
			PreparedStatement ps=c.prepareStatement("insert into students(sname,sphone) values(?,?)");
			ps.setString(1,"Ritik");
			ps.setString(2,"4654515");
			ps.executeUpdate();
					System.out.println("Data inserted Successfully!!!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
