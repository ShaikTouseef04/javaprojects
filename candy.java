package xyz;

class car implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("BMW car Moving " + i);
            try {
                Thread.sleep(500); // Added sleep to simulate movement
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class bike implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ninja Bike is moving " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class candy {
    public static void main(String[] args) {
        Thread carThread = new Thread(new car());
        Thread bikeThread = new Thread(new bike());

        System.out.println("Goo");
        carThread.start();
        bikeThread.start();
    }
}
