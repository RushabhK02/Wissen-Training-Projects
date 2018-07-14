package com.shop.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private static final Properties PROPERTIES = new Properties();

	static {

		try {
			FileInputStream fis = new FileInputStream("resources\\db.properties");
			PROPERTIES.load(fis);
			fis.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// step-1 : register mysql-jdbc-driver
		try {
			Class.forName(PROPERTIES.getProperty("driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {

		// step-2 : create connection with url,username & password
		String url = PROPERTIES.getProperty("url");
		String user = PROPERTIES.getProperty("user");
		String password = PROPERTIES.getProperty("password");
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}

}
