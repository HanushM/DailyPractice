import java.io.*;

public class KeyInput{
	public static void main(String args[]){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
	
			System.out.print("Please Enter Your Name: ");
			String name = br.readLine();

			System.out.print("Please Enter Your Age: ");
			//int age = br.read();	//read only first letter
			int age = Integer.parseInt(br.readLine());

			System.out.println("Your Name is: "+name);
			System.out.println("Your Age is: "+age);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}