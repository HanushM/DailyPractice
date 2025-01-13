import java.util.*;
import java.io.*;


class A{
	void abc() throws IOException,ArithmeticException,UserException{
		int a = 5;
		for(int i=1;i<=20;i++){
			//int res=a/(a-i);
			//if(i==5){
			//	System.exit(0);
			//	return ;
			//}
			if(i==2){
				throw new UserException("input is 2");
			}
			if(i==18){
				throw new IOException();
			}
			if(i==15){
				throw new ArithmeticException();
			}

		}
	}
	public void xyz() throws IOException,ArithmeticException,UserException{
		try{
			abc();
		}
		catch(UserException e){
			System.out.println("xyz"+e);
		}
	}
	public void atoz() throws IOException,ArithmeticException,UserException{
		xyz();
	}
}
public class ExceptionDemo {
	public static void main(String args[]){
		try{
			A a1 = new A();
			a1.atoz();
		}
		catch(IOException e){
			System.out.println(e);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(UserException e){
			e.display();
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			System.out.println("finalllyyy......");
		}
		System.out.println("conntiuee......");
	}
}

class UserException extends RuntimeException
{
	UserException(){
		super(); //default	
	}
	UserException(String msg){
		super(msg); 
	}
	public void display(){
		System.out.println("custom method in the custom exception");
	}
}