package xyz;

import java.util.HashSet;
import java.util.Iterator;

public class CricketSet {

    public static void main(String[] args) {
        HashSet<String> cricket = new HashSet<String>();

        cricket.add("Rohit");
        cricket.add("virat");
        cricket.add("Dhoni");
        cricket.add("KL Rahul");
        cricket.add("sachin");
        cricket.add("Hardik pandiya");
        cricket.add("Ravindra Jadeja");
        cricket.add("AB d");
        cricket.add("Cris Gayel");
        cricket.add("Dhoni"); 
        cricket.add("virat");
        System.out.println(cricket);
        
        
        
		Iterator<String> it=cricket.iterator();
        while(it.hasNext()) {
        	String name=it.next();
        	System.out.println(name);
        }
    }
}
