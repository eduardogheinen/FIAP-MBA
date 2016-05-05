package com.eheinen.misc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Dao {

	protected Connection con;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	private String url = "jdbc:mysql://localhost:3306/sales";
	private String user = "root";
	private String password = "fiap";
	
	protected void openConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("Could not find driver. " + e);
		} catch (SQLException e) {
			System.out.println("Could not connect database. " + e);
		}
	}
	
	protected void closeConnection(){
		try {
			if(con != null && !con.isClosed())
				con.close();
		} catch (SQLException e) {
			System.out.println("Could not close database.");
		}
	}
}
