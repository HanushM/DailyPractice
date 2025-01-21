import java.util.*;
public class CollectionDemo{
	public static void main(String args[]){
		Vector v1 = new Vector(2);	
		v1.add("Heloo");
		//v1.add(new Integer(2234));
		v1.add(new Date());
		v1.add(new Thread());	

		//HashSet obj = new HashSet();
		//TreeSet obj = new TreeSet();	
		//LinkedHashSet obj = new LinkedHashSet();
		//ArrayList obj = new ArrayList();
		//LinkedList obj = new LinkedList();
		//PriorityQueue obj = new PriorityQueue();
		ArrayDeque obj = new ArrayDeque();
		obj.add(2);
		obj.add(3);
		obj.add(1);
		obj.add(1);
		obj.add(4);
		obj.add(5);
		//obj.addFirst(4);   //-> linkedlist add first and also for deque
		//obj.addLast(0);	-> linked list add last and also for deque
		//obj.add(3,"middle");	-> linked list in middle
		Iterator i = obj.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

		//Hashtable mobj = new Hashtable();	
		//HashMap mobj = new HashMap();
		//TreeMap mobj = new TreeMap();
		LinkedHashMap mobj = new LinkedHashMap();
		mobj.put("114","Rajesh");
		mobj.put("113","suresh");
		mobj.put("112","ramesh");
		mobj.put("111","rakesh");

		Set s = mobj.entrySet();
		Iterator mi = s.iterator();
		while(mi.hasNext()){
			Map.Entry me = (Map.Entry)mi.next();
			System.out.println("id: "+me.getKey());
			System.out.println("name: "+me.getValue()+"\n");
		}
	}
}