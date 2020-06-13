package jdbc_demo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	
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
	
	//table create 
	public void createTable() {
		try {
			//String quary = "create table test (id varchar2(5),password varchar2(8),age number(4),sno varchar2(8)";
			Statement stm = con.createStatement();
			boolean check = stm.execute("create table test (id varchar2(5),password varchar2(8),age number(4),sno varchar2(8)");
			while (check) {
				System.out.println("Table is created.");
			}
			
			} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void createSequence() {
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
	}
	
	public void insertTable() {
		try {
			String quary = "insert into test values(?,?,?,seq.nextval)";
			PreparedStatement dml = con.prepareStatement(quary);
			String val1 = "null";
			String val2 = "null";
			int age = 0;
			Scanner object = new Scanner(System.in);
			System.out.println("Enter ID/PWD/AGE");
			val1 = object.next();
			val2 = object.next();
			age = object.nextInt();
			dml.setString(1, val1);
			dml.setString(2, val2);
			dml.setInt(3, age);
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
	
	/*public void display() {
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
	}*/
	
	public void display() {
		try {
		String id= "";
		String password = "";
		int age;
		Statement stmt = con.createStatement();
		ResultSet rst = stmt.executeQuery("select * from test");
		while (rst.next()) {
			id = rst.getString("ID");
			password = rst.getString("PASSWORD");
			age = rst.getInt("AGE");
			System.out.println(id+" "+password+""+age);
		}
		
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.getOracleConnect();
		t.display();
		t.insertTable();

	}

}
