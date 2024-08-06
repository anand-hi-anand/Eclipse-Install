package JDBC;

import java.sql.*;

public class Conn {
	
	public static void main (String [] args) throws Exception  {

	String url="jdbc:postgresql://localhost:5432/test";
	String user ="postgres";
	String pass="password";
	String query="INSERT INTO person (first_name, last_name, gender, date_of_birth) VALUES ('Hey', 'there','MALE',DATE '1998-03-30');";
		
	Class.forName("org.postgresql.Driver");
	
	Connection con = DriverManager.getConnection(url, user, pass);
	Statement st = con.createStatement();
	
	int count = st.executeUpdate(query);
	
	System.out.println("Number of row/s affected " + count);
	
//	while (rs.next()){
//	
//	String name  = rs.getString(2) ;
//	String name1 = rs.getString(3) ;
//	String name2 = rs.getString(4) ;
//	String name3 = rs.getString(5) ;
//	String name4 = rs.getString(6) ;
//	
//	System.out.println(name +" "+ name1 +" "+ name2 +" "+ name3 +" "+ name4);
//	
	st.close();
	con.close();
	}
	
	
}
