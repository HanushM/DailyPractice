import java.util.*;

public class CollectionDemo2{
	public static void main(String args[]){
		List list = new LinkedList();
	
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);

		System.out.println(list);

		Collections.swap(list,0,1);	//index
		System.out.println(list);

		Collections.sort(list); 	//collections not collection
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);
	}
}