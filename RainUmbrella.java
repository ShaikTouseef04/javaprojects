package xyz;
import java.util.*;

public class RainUmbrella {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter either true or false:");
        boolean isRaining = sc.nextBoolean();  // Use Scanner to read user input
        if (isRaining) {
            System.out.println("take the umbrella");
        } else {
            System.out.println("no need take umbrella");
        }
        sc.close();
    }
}
