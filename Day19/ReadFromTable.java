import java.io.*;
import java.sql.*;

public class ReadFromTable{
	public static void main(String args[]){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Table Name: ");
			String table = br.readLine();
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demodb","postgres","tiger");
			Statement stmt  = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from "+table);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();
			while(rs.next()){
				for (int i = 1 ; i<=columns ;i++){
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i));
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}