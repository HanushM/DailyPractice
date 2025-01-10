package p2;
import p1.A;
public class D{
	void display(){
		A a1= new A();
		//System.out.println(x);
		//System.out.println(a1.y);
		//System.out.println(a1.z);
}
}
class E extends A{
	void display(){
		//System.out.println(x);
		System.out.println(y);
		//System.out.println(z);
}
}
class F extends E{
	void display(){ 
		//System.out.println(x);
		System.out.println(y);
		//System.out.println(z);
}
}