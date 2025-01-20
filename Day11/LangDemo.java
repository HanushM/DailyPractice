public class LangDemo{
	public static void main(String[] args) throws Exception{
		Runtime rt = Runtime.getRuntime();	
		Thread.sleep(10000);
		Process p1  =  rt.exec("calc.exe");
		Thread.sleep(5000);
		Process p2  =  rt.exec("calc.exe");
		Thread.sleep(10000);
		Process p3  =  rt.exec("calc.exe");
		Thread.sleep(2500);

		p1.destroy();
		p2.destroy();
		p3.destroy();
	}
}