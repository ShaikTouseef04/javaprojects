package xyz;

import java.util.TreeSet;

public class Treesetmethods {

	public static void main(String[] args) {
		TreeSet<Integer>ids=new TreeSet<Integer>();
		ids.add(5000);
		ids.add(5001);
		ids.add(5002);
		ids.add(5003);
		ids.add(5003);
		System.out.println(ids);
		System.out.println(ids.first());
		System.out.println(ids.last());
		System.out.println(ids.getFirst());
		}
	

}
