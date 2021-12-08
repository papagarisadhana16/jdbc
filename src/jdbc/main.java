package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class main {

	public static void main(String[] args) {
		try {
			//connection create
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
			//create  Statement
			Statement mystate=(Statement)mycon.createStatement();
			//Query create
			int rs=mystate.executeupdate("INSERT INTO EMPLOYEE('employeeid','employeename','employeerole','employeesalary')values(1,'sadhana',,dev',50000)");
			System.out.println()
			
			
			}
			}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
