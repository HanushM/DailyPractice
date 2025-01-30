import java.io.*;
import java.sql.*;

public class JdbcDemo3{
	public static void main(String args[]){
		try{
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demodb","postgres","tiger");
			Statement stmt = con.createStatement();
			stmt.addBatch("insert into Employee values('Aman',25)");
			stmt.addBatch("insert into Employee values('baman',25)");
			stmt.addBatch("insert into Employee values('raman',25)");
			stmt.addBatch("insert into Employee values('jaman',25)");
			System.out.println("Wait for 10 sec.....");
			Thread.sleep(30000);
			stmt.executeBatch();
			System.out.println("done.....");
			con.close();	
		}catch(Exception e){
			System.out.println(e);
		}
	}
}