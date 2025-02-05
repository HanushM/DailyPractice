interface I{
	void abc();
}

interface J{
	Object getObject();
}

class A{
	public A(){
		System.out.println("from A constructor");
	}
	public static void classMethod(){
		System.out.println("from A static method");
	}
	public void instanceMethod(){
		System.out.println("from A instance method");
	}
}

class B{
	public B(){
		System.out.println("from B constructor");
	}
	public static void classMethod(){
		System.out.println("from B static method");
	}
	public void instanceMethod(){
		System.out.println("from Binstance method");
	}
}

class C{
	C(){
		System.out.println("from C constructor");
	}
	
	public String toString(){
		System.out.println("from C instance method");
		return "yes";
	}
}

public class MethodReference{
	public static void main(String args[]){
		I i1 = A::classMethod;   //on matching the parameter should match the abc() no param class method no param
		i1.abc();
		I i2 = new A()::instanceMethod;
		i2.abc();
		I i3 = A::new;   //will give reference
		i3.abc();	 // create object
		I i4 = B::new;
		i4.abc();

		J i5 = C::new; 		// nly refernece	   
		Object obj = i5.getObject();   // here only obj created
		System.out.println(obj);
	}
}