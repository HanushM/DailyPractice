class AddOrJoin<T,R>{	

	//T -> placeholder for datatype R-> return type
	/*public void add(int a , int b){

	}
	public void add(String a , String b){

	}
	public void add(float a , float b){

	}*/

	public R add(T a , T b){ //datatype specified on the class is used
		System.out.println(a+b);
		System.out.println(a);
	}
}

public class CustomGeneric{
	public static void main(String args[]){
	
		AddOrJoin<Integer,Integer> obj1 = new AddOrJoin<Integer>();
		obj1.add(1,2);

		AddOrJoin<Double,Double> obj2 = new AddOrJoin<Double>();
		obj2.add(1.1,2.2);

		//AddOrJoin<String,String> obj3 = new AddOrJoin<String>();
		//obj3.add("Good"," Morning");
	}
}