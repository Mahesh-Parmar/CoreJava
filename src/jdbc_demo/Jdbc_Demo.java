package jdbc_demo;
import java.sql.*;
public class Jdbc_Demo {

	public static void main(String[] args) throws Exception{
		
		//Register Drivers
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Establish Connection
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Mahesh","12345");
		
		System.out.println("Connection Successful");

	}

}
