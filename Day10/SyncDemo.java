class A implements Runnable{
	public void run(){
		synchronized (this){
			for(int i=1;i<=20;i++){
				System.out.println(Thread.currentThread().getName()+i);		
				try{Thread.sleep(1000);}
				catch(Exception e){}
			}	
		}
	}
}

public class SyncDemo{
	public static void main(String args[]){	
		A a1 = new A();
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		Thread t3 = new Thread(a1);   //creating thread on single obj

		t1.setName("Akash");
		t2.setName("Subash");
		t3.setName("Prakash");

		t2.setDaemon(true);
	
		t1.start();
		t2.start();
		t3.start();
	}
}