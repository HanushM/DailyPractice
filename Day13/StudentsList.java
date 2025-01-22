import java.util.*;
class Student {
	int rollNo;
	String name;
	int standard;
	
	public Student(int rn , String n , int s){
		rollNo=rn;
		name=n;
		standard=s;
	}
	public boolean equals(Object obj){
		Student s = (Student) obj;
		if((this.rollNo==s.rollNo) && (this.standard==s.standard)){
			return true;
		}else{
			return false;
		}
	}
	public int hashCode(){
		return standard;	//it create bucket of standard like standard 5 are stored in same bucket if u put rollno it create sepreate bucket whick is not good

		/*if(designation.equals("Manager")){
			return 1;
		}
		if(designation.equals("Clerk")){
			return 2;
		}
		if(designation.equals("Programmer")){
			return 3;
		}*/
	}
	public String toString(){
		return "RollNo: "+rollNo +",Name: "+name +",Standard: "+standard;
	}
	/*public int compareTo(Object obj){
		Student s = (Student) obj;
		//if(s.roll>this.rollno){
			//return 1;
		//}
		//else if(s.roll<this.rollno){
			//return -1;
		//}
		//return 0;
		//return s.rollno-this.rollno;
		
		//return Integer.compare(this.rollNo, s.rollNo);
		//return name.compareTo(s.name);  //ascending
		//return name.compareTo(s.name) * -1; //descenfing
	}*/
}
class NameSorter implements Comparator<Student>{
	public int compare(Student s1 , Student s2){
		return s1.name.compareTo(s2.name);
	}
}
class RollNoSorter implements Comparator<Student>{
	public int compare(Student s1 , Student s2){
		//return new Integer(s1.rollNo).compareTo(s2.rollNo);
		return Integer.compare(s1.rollNo,s2.rollNo);
	}
}
public class StudentsList{
	public static void main(String args[]){

		//HashSet hs = new HashSet();
			
		TreeSet hs = new TreeSet(new RollNoSorter());   //which sorter to use

		hs.add(new Student(11,"Pintu",5));
		hs.add(new Student(12,"Chintu",5));
		hs.add(new Student(13,"Rinku",5));
		hs.add(new Student(14,"Sanju",5));
		hs.add(new Student(15,"Pintu",5));
		hs.add(new Student(11,"sita",5));	//value id is repeating

		Iterator i = hs.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}