//Thread.currentThread().getName()
//this
//this.getName()
//b1.setPriority()
//a1.setName()

class A extends Thread{
	public void run(){
		for(int i=1;i<=20;i++){
			System.out.println(Thread.currentThread().getName()+i);
			try{
				if(i%2==0){
					Thread.sleep(1000);
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class B extends Thread{
	public void run(){
		for(int i=1;i<=20;i++){
			System.out.println("Babitha"+i);
			try{
				if(i%4==0){
					Thread.sleep(2000);
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class C extends Thread{
	public void run(){
		for(int i=1;i<=20;i++){	
			System.out.println(this.getName());
			try{
				if(i%3==0){
					Thread.sleep(3000);
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}


public class ThreadDemo{
	public static void main(String[] args){
		//A a1 = new A();
		//B b1 = new B();
		//C c1 = new C();
			
		ThreadGroup tg = new ThreadGroup("Demo")		;
		Thread a1 = new Thread(tg,new A());
		Thread b1 = new Thread(tg,new B());
		Thread c1 = new Thread(tg,new C());
		a1.setName("rita");
		b1.setName("babitha");
		c1.setName("gettha");
		a1.start();
		b1.start();
		c1.start();

		for(int i=1;i<=20;i++){
			
			System.out.println("****main****"+i);
			try{
				if(i==5){
					tg.suspend();
				}
				if(i==18){
					tg.resume();
				}
				if(i==10){
					tg.stop();
				}
				/*if(i==15){	
					c1=new C();
					c1.start();
				}*/
				Thread.sleep(3000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		try{
		a1.join();
		b1.join();
		c1.join();}
		catch(Exception e){}
		System.out.println("---------System----------------");
	}
}