package xyz;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetProduct {

    public static void main(String[] args) {
        TreeSet<String> abc = new TreeSet<String>();
        abc.add("Monitor");
        abc.add("Keyboard");
        abc.add("Computer");
        abc.add("Cpu");
        abc.add("Mouse");

        Scanner sc = new Scanner(System.in);

        //System.out.println("Available products: " + abc);

        System.out.print("Enter product name to search: ");
        String searchItem = sc.nextLine();

        if (abc.contains(searchItem)) {
            System.out.println("Product \"" + searchItem + "\" is available.");
        } else {
            System.out.println(" Product \"" + searchItem + "\" is not available.");
        }

        sc.close();
    }
}
