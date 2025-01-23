import java.io.*;

public class RAFDemo{
	public static void main(String args[]){
		try{
			/*RandomAccessFile raf = new RandomAccessFile("abc.txt","rw");
			raf.writeBytes("Hi Hanush");		//overwrite the contnet on specific place not completely 
			//raf.seek(5);//skip five char
			//System.out.println(raf.readLine());
			raf.seek(raf.length());
			raf.writeBytes("Hi Hanush");*/

			//PrintWriter pw = new PrintWriter(System.out);
			PrintWriter pw = new PrintWriter(new FileOutputStream("abc.txt",true));
			pw.println("Hi");
			pw.flush();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}