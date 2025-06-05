package xyz;


class Cap extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Bmw Car Moving" +i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
			}
		}
	}
}
class Bike extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("ninja Bike is moving"+i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
public class CAR {

	public static void main(String[] args) {
		new Cap().start();
		new Bike().start();
		
	}

}
