import com.X;

class y extends X{
	public y(){
		System.out.println("constructor");
	}
	void display(){
		System.out.println(a);
		demo();
	}
}

public class UseX{
	public static void main(String args[]){
		y y1 = new y();
		y1.display();
	}
}