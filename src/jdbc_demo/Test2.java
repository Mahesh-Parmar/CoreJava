package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test2 {
	
	Connection con = null;
	
	public Connection getOracleConnect() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con  = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","Mahesh","12345");
		System.out.println("Connection Succesful");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	//table created
	public void createTable() {
		try {
			//String quary = "create table student (id varchar2(5),password varchar2(8),age number(4),sno varchar2(8)";
			Statement stm = con.createStatement();
			boolean check = stm.execute("create table student (sid number(3),sname varchar2(10)");
			while (check) {
				System.out.println("Table is created.");
			}
			
			} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/*public void createSequence() {
		try {
			//String quary = "create table test (id varchar2(5),password varchar2(8),age number(4),sno varchar2(8)";
			Statement stm = con.createStatement();
			boolean check = stm.execute("create sequence seq minvalue 1 maxvalue 9999999 start with 1 increment by 1 cache 20");
			while (check) {
				System.out.println("Sequence is created.");
			}
			
			} catch (Exception e) {
			System.out.println(e);
		}
	}*/
	
	
	public void insertTable() {
		try {
			String quary = "insert into test values(?,?)";
			PreparedStatement dml = con.prepareStatement(quary);
			int id = 0;
			String val1 = "null";
			
			
			Scanner object = new Scanner(System.in);
			System.out.println("Enter SID SNAME");
			id = object.nextInt();
			val1 = object.next();
			
			dml.setInt(1, id);
			dml.setString(2, val1);
			
						
			int insert  = dml.executeUpdate();
			if (insert>0) {
				System.out.println("Insert values successfully");
			} else {
				//break;
				System.out.println("Inserted data failed.");
			}
			} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void display() {
		try {
		String name= "";
		int id;
		Statement stmt = con.createStatement();
		ResultSet rst = stmt.executeQuery("select * from Student");
		while (rst.next()) {
			id = rst.getInt("SID");
			name = rst.getString("SNAME");
			System.out.println(id+" "+name);
		}
		
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		
		Test2 t = new Test2();
		t.getOracleConnect();
		t.display();
		t.insertTable();

	}

}
