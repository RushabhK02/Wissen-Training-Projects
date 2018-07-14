package oracle_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OracleTest {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver class loaded");
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			System.out.println("Successfully connected");
			Statement stmt = conn.createStatement();
			//String qry= "Create Table employee(emp_id number(3) primary key,emp_name varchar2(20),emp_salary number)";
			//int y = stmt.executeUpdate(qry);
			String InsertQry= "insert into employee values(2,'Rushabh',63000)";
			int x = stmt.executeUpdate(InsertQry);
			System.out.println(x+" Records added");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
