package xyz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackandQueueTask {

	public static void main(String[] args) {
		Stack<String> toys=new Stack<String>();
		toys.push("Ball");
		toys.push("Blocks");
		toys.push("Puzzle");
		System.out.println("The toy is top in stack:"+toys.peek());
		System.out.println("The toy is taken from stack:"+toys.pop());
		System.out.println("The remaining toys is in stack:");
		Queue<String>icecream=new LinkedList<String>();
		icecream.add("Maya");
		icecream.add("Leo");
		icecream.add("Nina");
		System.out.println("the kids are in line:"+icecream);
		System.out.println("Server the first kid:"+icecream);

	}

}
