package xyz;
abstract class Car{
	abstract void start();
	abstract void drive();
	abstract void stop();
	
	void MusicSystem() {
		System.out.println("Playing Music");
	}
	
}
public class AbstractionTask{
	void start() {
		System.out.println("Car strated using Start Button");
	}
	void drive(){
		System.out.println("drive the car using stering");
	}
	void stop() {
		System.out.println("stop the car using breaks");
	}
	

	public static void main(String[] args) {
		car mycar=new car() {
		 mycar=start();
		 mycar=drive();
		 mycar=stop();

	}

}
}