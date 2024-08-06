package JDBC;

import java.sql.*;

public class Person{
	
	public static void main(String [] args) throws Exception {
		
		String url="jdbc:postgresql://localhost:5432/test";
		String password="password";
		String user="postgres";
		String query="INSERT INTO officer VALUES('Mohit Sharma', 'Major', 59066, '1 Para SF')";
		
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(url,user,password);
		
		Statement st = con.createStatement();
		int c = st.executeUpdate(query);
		
		System.out.println("Number of rows affected is " + c);
		
		st.close();
		con.close();	
		
	}
	
}