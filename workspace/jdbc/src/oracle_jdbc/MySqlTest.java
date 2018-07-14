package oracle_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlTest {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
			System.out.println("Successfully connected");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
