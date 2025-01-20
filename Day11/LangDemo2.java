import java.util.*;
class A{
	int x;
	A(int x){
		this.x = x;
	}
	public void finalize(){
		System.out.println("Object with x value"+this.x+"is getting removed...");
	}
}
class Clerk{
	public String toString(){
		return "this is clerk";
	}
public String hi(){
		return "this is clerk";
	}
public String hello(){
		return "this is clerk";
	}
public String ram(){
		return "this is clerk";
	}
}
public class LangDemo2{
	public static void main(String[] args) throws Exception{
		A a1=new A(10);
		A a2=new A(20);
		A a3=new A(30);
		
		//a2.finalize(); garbage collector is who calls the finalize method
	
		System.out.println(a1.x);
		System.out.println(a2.x);
		System.out.println(a3.x);
		
		a1 =null;
		a2=null;

		System.gc();

		Thread.sleep(1000);
System.out.println("Enter class name : ");
Class c2 = Class.forName(new Scanner(System.in).next());
Object obj = c2.newInstance();
System.out.println(obj);

Field fields[]  = c2.getFields();
Methods methods[] = c2.getMethods();
Constructor Constructors[] = c2.getConstructor();

	}
}