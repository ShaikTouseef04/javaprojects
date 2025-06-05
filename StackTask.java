package xyz;

import java.util.Stack;

public class StackTask {

	public static void main(String[] args) {
		Stack<String> plates=new Stack<String>();
		plates.push("plates 1");
		plates.push("plates 2");
		plates.push("plates 3");
		plates.push("plates 4");
		plates.push("plates 5");
		System.out.println("The top plate :"+plates.peek());
		System.out.println("Take the top plate:"+plates.pop());
		System.out.println("plates are left in stack: ");
		
		for(String plate:plates) {
			System.out.println("plate");
		}
		
	}

}
