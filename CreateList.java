package xyz;

import java.util.ArrayList;
import java.util.Collections;


public class CreateList {

	public static void main(String[] args) {
		ArrayList<String> cricket=new ArrayList<String>();{
			cricket.add("Rohit");
			cricket.add("virat");
			cricket.add("Dhoni");
			cricket.add("KL Rahul");
			cricket.add("sachin");
			cricket.add("Hardik pandiya");
			cricket.add("Ravindra Jadeja");
			cricket.add("AB d");
			cricket.add("Cris Gayel");
			
			Collections.sort(cricket);
			cricket.remove(5);
			cricket.add("sai sudarshan");
			cricket.add("subhman gill");
			Collections.reverse(cricket);
			for(int i=0;i<cricket.size();i++) {
				System.out.println(cricket.get(i));
			
			}
		}
	}

}
