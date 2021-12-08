package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class student {

	public static void main(String[] args) {
		try {
			//connection create
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
			//create  Statement
			Statement mystate=(Statement)mycon.createStatement();
			//Query create
			
			int r=mystate.executeUpdate("INSERT INTO `mydatabase`.`employee` (`employeeid`, `employeename`, `employeerole`, `employeesalary`) VALUES ('444', 'kaa', 'pg', '7654')");
			System.out.println("record inserted");

			
			
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}



