package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC4 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
		Statement st = con.createStatement();
		String query = "create table student(ID int primary key, SName varchar(20), SMarks int)";
		st.executeUpdate(query);
		System.out.println("Student table creted sucessfully");
		

	}

}
