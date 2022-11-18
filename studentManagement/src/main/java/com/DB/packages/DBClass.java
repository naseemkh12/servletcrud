package com.DB.packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBClass {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/naseem";
	private static String user="root";
	private static String pass="naseem";
	public static Connection getConnection() {
		Connection con = null;
		PreparedStatement ps=null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pass);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
}
