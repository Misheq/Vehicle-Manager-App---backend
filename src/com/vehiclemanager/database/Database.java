package com.vehiclemanager.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private static Database instance = new Database();
	private Connection con;

	private Database() {

	}

	public static Database getInstance() {
		return instance;
	}

	public void connect() throws Exception {
		if(con != null) {
			return;
		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			throw new Exception("Driver not found");
		}

		String url = ("jdbc:mysql://localhost:3306/vehiclemandb");
		con = DriverManager.getConnection(url, "root", "admin");
	}

	public void disconnect() {
		if(con != null) {
			try {
				con.close();
			} catch(SQLException e) {
				System.out.println("Can't close connection");
			}
		}
	}
}
