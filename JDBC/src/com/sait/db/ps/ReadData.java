package com.sait.db.ps;

import java.sql.*;

public class ReadData {
public static void main(String[] args) {
	try {
		Connection c=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/sait",
				"root","root");
		PreparedStatement ps=c.prepareStatement("select *from students");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("sid"));
				System.out.println(rs.getString("Sname"));
				System.out.println(rs.getString("sphone"));
				System.out.println("--------------");
			}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
