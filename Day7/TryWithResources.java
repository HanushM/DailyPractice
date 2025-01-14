import java.util.regex.*;

/*class A implements AutoCloseable{
	A(){
		System.out.println("Allocating resource");
	}
	public void process(){
		System.out.println("Performing resource");
	}
	//public void release(){
		//System.out.println("release resource");
	//}
	public void close(){
		System.out.println("release resource");
	}	
}
class B implements AutoCloseable{
	B(){
		System.out.println("Allocating B resource");
	}
	public void process(){
		System.out.println("Performing B resource");
	}
	//public void release(){
		//System.out.println("release resource");
	//}
	public void close(){
		System.out.println("release B resource");
	}	
}
public class TryWithResources{
	public static void main(String args[]){
		//A a1 = null;
		try(A a1= new A();B b1= new B();){
			//a1 = new A();
			a1.process();
			b1.process();
			if(true){
				throw new NullPointerException();
			}

		}	
		catch(Exception e){
			System.out.println(e);
		}	
		finally{
			//a1.release();
		}

		//System.out.println(a1); even after resourece are realese they occupy menory still

	}
}*/


public class TryWithResources{
	public static void main(String args[]){
		String s1 = "Wissen Technology";
		String s2 = "Tech";

		Pattern p1 = Pattern.compile(s2);
		Matcher m1 = p1.matcher(s1);

		System.out.println(m1.find());

		long mobileNo = 9876543210L;
		Pattern p3 = Pattern.compile("[8-9][0-9]{9}");
		Matcher m3 = p3.matcher(mobileno+"");
		System.out.println(m3.matches());
		
}}




