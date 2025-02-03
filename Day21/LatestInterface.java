interface I{
	public void abc();		//v7
	public default void xyz(){	//v8
		System.out.println("Hello");
	}
	public static void atoz(){	//v8
		System.out.println("static");
	}
	private void privatemethod(){	//v9
		System.out.println("private method");
	}
}

interface j{
	public default void hello(){
		System.out.println("interface j- hello");
	}
}
interface k{
	public static void hello(){
		System.out.println("interface K- hello");
	}
}

class B implements j,k{
	// without decalring method clashing method it produce error
	public void hello(){
		System.out.println("interface B hello");
		j.super.hello();
		k.hello();
	}

}	
class A implements I{
	public void abc(){
		System.out.println("abc");
	}
}
public interface LatestInterface{
	public static void main(String arg[]){
		System.out.println("Hi");
		I.atoz();
		A a1 =new A();
		a1.xyz();	
		
		B b1 =new B();
		b1.hello();
	}
}