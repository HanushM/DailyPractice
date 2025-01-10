package p1;

import java.util.*;

public class A{
	private int x=10;
	protected int y=20;
	int z=30;
	
}

class C extends A{
	void display(){
		//System.out.println(x);
		System.out.println(y);
		System.out.println(z);	
	}
}

class D{
	void display(){
		//System.out.println(x);	
		A a=new A();
		System.out.println(a.y);
		System.out.println(a.z);	
	}
}