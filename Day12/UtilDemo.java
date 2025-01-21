import java.util.*;

public class UtilDemo{
	public static void main(String args[]){
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		//d1.setTime(99999999999L); // adding the milli to 1970
		System.out.println(d1);

		Date d2 = new Date();
		d2.setTime(-99999999999L); // adding the milli to 1970
		System.out.println(d2);

		//d1.setMonth(5); //June , 0-jan
		System.out.println(d1);
		//d1.setMonth(15); // 15-12 =3 ->aprl and next yr
		System.out.println(d1.getYear());  // total no of year after adding 1900
		System.out.println(d1.getYear()+1900);


		//stack

		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		s1.push(70);

		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.empty());
		System.out.println(s1.search(10));   // return 1-index 

		BitSet b1 = new BitSet(16); // it hspuld be multiple of 16
		BitSet b2 = new BitSet(16);
		System.out.println(b1);
		System.out.println(b2);
		for(int i=0;i<16;i++){	
			if(i%3==0){b1.set(i);}	 // these index are set as 1
			if(i%4==0){b2.set(i);}
		}
		System.out.println(b1);
		System.out.println(b2);
		b1.and(b2);
		System.out.println(b1);
		b1.or(b2);
		System.out.println(b1);
		b1.xor(b2);
		System.out.println(b1);
	}
}