@FunctionalInterface
interface I{
	public void abc();
	public boolean equals(Object obj);
	public int hashCode();
}

class A implements I{
	public void abc(){

	}
}

class B{
	public void demo(){
		System.out.println("Hi everybody");
	}
}

public class FunctionalInterfaceDemo{
	public static void main(String args[]){
		I i1 = new A();
		i1.abc();

		//I i1 = new I();// error
		I i2 = new I(){
			public void abc(){
				System.out.println("this is called anonymous class");
			}
		};
		i2.abc();
		
		B b1 = new B(){
			public void demo(){
				System.out.println("this is called b anonymous class");
			}
		};

		b1.demo();
		
		I i3 = ()-> System.out.println("this is called lambda exp"); //nly argument need to match since only function would be there and curly braces not needed only one stmt if mpre then required
	
	}
}	