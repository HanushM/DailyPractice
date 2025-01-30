import java.sql.*;
import java.io.*; 
//set classpath=.;postgresql-42.7.5.jar;.;%classpath%
public class TransactionDemo{
	public static void main(String args[]){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demodb", "postgres", "tiger");
			con.setAutoCommit(false);
			//Statement stmt  = con.createStatement();
			//stmt.executeUpdate("insert into EMPLOYEE values('Geetha',21)");
			for(int i=0;i<5;i++){
				System.out.println("Enter Name:");
				String name = br.readLine();
				System.out.println("Enter Age:");
				int age = Integer.parseInt(br.readLine());
				PreparedStatement pstmt = con.prepareStatement("insert into EMPLOYEE values(?,?)");
				pstmt.setString(1,name);
				pstmt.setInt(2,age);
				pstmt.executeUpdate();
				if(i==2){
					con.rollback();
				}
				if(i==4){
					con.commit();
				}

			}
			/*pstmt = con.prepareStatement("select * from employee");
			
			ResultSet re = pstmt.executeQuery();
			while(re.next()){
				System.out.println( "Name: "+re.getString("Name"));
				System.out.println("Age: "+re.getInt("Age"));
			}*/
			//pstmt.close();
			con.close();
			
		}
		catch(Exception e){System.out.println(e);}
	}
}