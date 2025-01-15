final class Student{
	private final int rollNo;
	private final String name;
	private final int standard;
	
	public Student(int rn,String n,int s){
		rollNo=rn;
		name-n;
		standard=s;
	}
	public int getRollNo(){
		return rollNo;
	}
	public String getName(){
		
	}
	public int getRollNo(){
		
	}
	public String getStandard(){
		
	}
	public String toString(){}
	public int hashcode(){}
	public boolean equals(Object obj){}
}


// record Student(int rolNo,String name ,int standard){} // canonical

record Student()
	static String SchoolName;    //static variable are allowed
	Student(){
		schoolNmae = "KV";
	}
	Student(int rollNo,String name,int standard){
		this.rollNo=rollNo;        //no need of this since autmatic varibake initialization is done , but it good beacuse we can have validation,
		this.name=name;
		this.standard=standard;
		this();			// call student()
	}
	public void display(){
		System.out.println("demo");
	}
	public int hashcode(){
		return rollno;
	}
	public boolean equals(Object obj){
		
	}
}

public class ImmutableClass{
	public static void main(String args[]){
		Student s1 = new Student(11,"Rinku",);
		Student s1 = new Student();
	}
}





------------------

sealed class Manger permits SalesManager{
	
}
final class SalesManger{    //this is allowed but this doest not allowt this class to be extended

}
sealed class SalesManger{    

}
non-sealed class SalesManger{   //if we want our class need to perform like normal class 

}
-------------------------------------------------------------------
/* early
final class Principal{
	static private final principal p1 = new principal();
	private principla(){  //obj cant be created by making private

	}	
	public static principal getprincipal(){
		return p1;
	}
	static{
		sysout("from static",p1);
	}
}
*/

final class principal{
	private static principal p1 = null;
	private principla(){
	
	}
	public static principal getprincipal(){
		if(p1==null){
			p1=new principal();	
		}
		return p1;
	}
}

public class singleton{
	static{
		try{
			Class.forName("principal");
		}
		catch(Exception e){

		}
	}
public static void main(){
	Principal p1 = principal.getprincipal();
	Principal p2 = principal.getprincipal();
	Principal p3 = principal.getprincipal();

	sysout(p1);
	sysout(p2);
	sysout(p3);
}
}