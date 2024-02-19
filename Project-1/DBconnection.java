package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	private static String un="root";
	private static String pass ="root";
	private static String driver ="com.mysql.cj.jdbc.Driver";
	private static String  url ="jdbc:mysql://localhost:3306/hotel_db";
	
	private static Connection conn = null;
	
	public static Connection getConnection() throws SQLException{
		if(conn==null) 
			conn=DriverManager.getConnection(url,un,pass);
			return conn;

	}}
