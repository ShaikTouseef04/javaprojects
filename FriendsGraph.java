package xyz;

import java.util.*;

public class FriendsGraph {

	public static void main(String[] args) {
		Map<String, List<String>>graph=new HashMap<>();
		graph.put("Touseef", Arrays.asList("Mohammed"));
		graph.put("Mohammed", Arrays.asList("Touseef","Abdul"));
		graph.put("Abdul", Arrays.asList("Mohammed"));
		
		for(String person:graph.keySet()) {
			System.out.println(person+ " is friends with" +graph.get(person));
		}
	}

}
