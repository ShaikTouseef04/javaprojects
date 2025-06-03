package xyz;
import java.util.Scanner;

public class Calender {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day:");
        String Day = sc.nextLine().toLowerCase();

        switch (Day) {
            case "monday":
                System.out.println("Let's Learn Python");
                break;
            case "tuesday":
                System.out.println("Let's Learn Java");
                break;
            case "wednesday":
                System.out.println("Let's Learn C");
                break;
            case "thursday":
                System.out.println("Let's Learn Python");
                break;
            case "friday":
                System.out.println("Let's Learn C++");
                break;
            case "saturday":  
                System.out.println("Let's Learn Ruby");
                break;
            case "sunday":
                System.out.println("Let's Learn SQL");
                break;
            default:
                System.out.println("Invalid day entered.");
        }

        sc.close();
    }
}
