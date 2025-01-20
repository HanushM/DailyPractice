import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Bike extends Thread{
	String name;
	long startTime;
	long endTime;
	long timeTaken;
	
	static Object lock = new Object();
	
	Bike(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Biker name : ");
		this.name = sc.next();
		sc.nextLine();
		start();
	}
	public void run(){
		System.out.println(name+" is ready to race..");
	        synchronized (lock) {
        	    try {
                	lock.wait(); 
	            } catch (InterruptedException e) {
        	        e.printStackTrace();
	            }
	        }
		startTime = System.currentTimeMillis();
		for(int i=1 ; i<RacingDetails.distance;i++){
			try{
				Thread.sleep((int) (Math.random() * 100));
				System.out.print(".");
				if(i%100==0){
					System.out.print("");
				}
			}catch (InterruptedException e) {
                		e.printStackTrace();
            		}	
		}
		endTime= System.currentTimeMillis();
		timeTaken= endTime - startTime;
	}
    public long getTimeTaken() {
        return timeTaken;
    }
}

class RacingDetails{
	static int noOfBikers=3;
	static int distance=1000;
	static String unit = "Meters";
}

public class BikeRacing {
    public static void main(String args[]) throws InterruptedException {
		Bike bikers[] = new Bike[RacingDetails.noOfBikers];
		for(int i=0;i<bikers.length;i++){
			bikers[i]=new Bike();
		}
		Thread.sleep(2000);
		System.out.println("Count Down Started");

		for(int i=0;i<bikers.length;i++){
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("GO");
		synchronized(Bike.lock){
			Bike.lock.notifyAll();
		}
		for(Bike b : bikers){
			b.join();
		}
		dashboard(bikers);
		
	    }
public static void dashboard(Bike[] bikers) {
        // Bubble Sort implementation based on timeTaken
        for (int i = 0; i < bikers.length - 1; i++) {
            for (int j = 0; j < bikers.length - i - 1; j++) {
                if (bikers[j].getTimeTaken() > bikers[j + 1].getTimeTaken()) {
                    // Swap bikers[j] and bikers[j + 1]
                    Bike temp = bikers[j];
                    bikers[j] = bikers[j + 1];
                    bikers[j + 1] = temp;
                }
            }
        }

        // Print sorted race results
        System.out.println("\nRace Results:");
        for (int i = 0; i < bikers.length; i++) {
            System.out.println((i + 1) + ". " + bikers[i].name + " - Time: " + bikers[i].getTimeTaken() + " ms");
        }
    }
}