import java.io.*;
import java.sql.*;

public class JdbcDemo2{
	public static void main(String args[]){
		try{
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demodb","postgres","tiger");
		CallableStatement cstmt = con.prepareCall("CALL insert_emp_record()");
		cstmt.execute();
		con.close();	
		}catch(Exception e){
			System.out.println(e);
		}
	}
}