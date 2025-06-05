package xyz;

import java.util.Iterator;

public class LinearSearchExample {

	public static void main(String[] args) {
		int [] numbers= {5,8,2,9,4,7};
		int target=9;
		boolean found = false;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Found" + " " +target+ "at index" + numbers[i]);
			found=true;
			break;
			
		}
		
	if(!found) {
		System.out.println("Number"+ target +"not found");
	}
	}
}
