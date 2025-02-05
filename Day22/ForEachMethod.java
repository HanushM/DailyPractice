import java.util.*;
import java.util.function.*;

class A implements Consumer<String>{
	public void accept(String str){
		System.out.println("Good name is :"+ str);
	}
}

class B{
	public static void writeToFile(String str){
		System.out.println("csv logic :"+ str);
	}
}
public class ForEachMethod{
	public static void main(String args[]){
		List<String> employees= Arrays.asList("Suman","Sujatha","Supriya");;
		//employees.forEach(new A());
		employees.forEach(B::writeToFile);
		employees.forEach(
			(arg)-> System.out.println(arg)
		);
		employees.forEach(System.out::println);
	}
}