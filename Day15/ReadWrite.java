class Person{
    	private String name;
   	private int age;
    	private float salary;
    	private String designation; 
	public static void display(){
		BufferReader fr = new BufferReader(new FileReader("employees.csv"));
		String line = null;
		while((line=fr.readLine())!=null){
			StringTokenizer st = new StringTokenizer();
			System.out.println();
		}
	}
}
public class ReadWrite{
	public static void main(String args[]) throws Exception{
		int ch=0;
		BufferReader br = new BufferReader(new InputStreamReader(System.in));
		do{
			System.out.println("----------------");
			System.out.println("1.Create");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			System.out.println("----------------");
			System.out.println("Enter Choice: ");
			
		}while(ch!=3);
	}
}