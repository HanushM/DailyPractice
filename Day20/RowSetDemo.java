

import javax.sql.*;
import javax.sql.rowset.*;
public class RowSetDemo{
	public static void main(String args[]){
		try{
			RowSetFactory rsf = RowSetProvider.newFactory();
			JdbcRowSet rs = rsf.createJdbcRowSet();
			
		
			rs.setUsername("postgres");
			rs.setPassword("tiger");

			rs.addRowSetListener(new StudentListener1());
			rs.addRowSetListener(new StudentListener2());

			rs.setCommand("select * from student");
			rs.execute();


			rs.setCommand("select * from employee");
			rs.execute();

			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			rs.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

class StudentListener1 implements RowSetListener{
	public void cursorMoved(RowSetEvent evt){
		System.out.println("-cursor1-----");
	}
	public void rowChanged(RowSetEvent evt){
		System.out.println("--rowch1----");
	}
	public void rowSetChanged(RowSetEvent evt){
		System.out.println("---rowsetch1---");
	}
}
class StudentListener2 implements RowSetListener{
	public void cursorMoved(RowSetEvent evt){
		System.out.println("*****");
	}
	public void rowChanged(RowSetEvent evt){
		System.out.println("--rowch2----");
	}
	public void rowSetChanged(RowSetEvent evt){
		System.out.println("---rsc2---");
	}
}