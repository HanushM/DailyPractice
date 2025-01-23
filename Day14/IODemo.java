import java.io.*;

public class IODemo{
	public static void main(String args[]){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br  =  new BufferedReader(isr);
			System.out.print("Enter FileName: ");
			String fName = br.readLine();
			br.close();
			File file = new File(fName);
			if(file.exists()){
				BufferedReader fr = new BufferedReader(new FileReader(fName));
				String line = null;
				while( (line=fr.readLine() )!=null){
					System.out.println(line);
				}
				fr.close();
			}else{
				System.out.println("File does not exist:( ");
			}
		}
		catch(Exception e){
			System.out.println(e);		
		}
	}
}