package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {

	public static void main(String[] args) {
		Queue<String>icecream=new LinkedList<String>();
		icecream.add("kid 1");
		icecream.add("kid 2");
		icecream.add("kid 3");
		icecream.add("kid 4");
		System.out.println("The kids are waiting for icecream:"+ icecream);
		icecream.add("kid 6");
		icecream.remove("kid 3");
		System.out.println(icecream);
		
	}

}
