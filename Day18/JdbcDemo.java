import java.sql.*;
import java.io.*; 
//set classpath=.;postgresql-42.7.5.jar;.;%classpath%
public class JdbcDemo{
	public static void main(String args[]){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demodb", "postgres", "tiger");
			//Statement stmt  = con.createStatement();
			//stmt.executeUpdate("insert into EMPLOYEE values('Geetha',21)");

			System.out.println("Enter Name:");
			String name = br.readLine();
			System.out.println("Enter Age:");
			int age = Integer.parseInt(br.readLine());
			PreparedStatement pstmt = con.prepareStatement("insert into EMPLOYEE values(?,?)");
			pstmt.setString(1,name);
			pstmt.setInt(2,age);
			pstmt.executeUpdate();

			pstmt = con.prepareStatement("select * from employee");
			
			ResultSet re = pstmt.executeQuery();
			while(re.next()){
				System.out.println( re.getString("Name"));
				System.out.println(re.getInt("Age"));
			}
			pstmt.close();
			con.close();
			
		}
		catch(Exception e){System.out.println(e);}
	}
}