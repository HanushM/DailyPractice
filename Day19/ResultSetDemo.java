import java.sql.*;

public class ResultSetDemo{
	public static void main(String args[])throws Exception{
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demodb","postgres","tiger");

		//Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = stmt.executeQuery("select * from employee");
		rs.next();
		System.out.println("Name: "+rs.getString(1));
		System.out.println("Age: "+rs.getString(2));
		rs.next();

		rs.previous();
		System.out.println("Name: "+rs.getString(1));
		System.out.println("Age: "+rs.getString(2));

		rs.absolute(3);
		System.out.println("Name: "+rs.getString(1));
		System.out.println("Age: "+rs.getString(2));

		rs.relative(3);
		System.out.println("Name: "+rs.getString(1));
		System.out.println("Age: "+rs.getString(2));

		//rs.updateString(1,"Mohan");
		/*while(rs.next()){
			System.out.println("Name: "+rs.getString(1));
			System.out.println("Age: "+rs.getString(2));
			System.out.println("---");
		}*/
	}
}