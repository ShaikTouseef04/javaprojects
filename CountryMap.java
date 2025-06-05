package xyz;

import java.util.TreeMap;

public class CountryMap {

	public static void main(String[] args) {
		TreeMap<String, String>Capital=new TreeMap<String, String>();
		Capital.put("india","new Delhi");
		Capital.put("usa","washington");
		Capital.put("germany","berlin");
		Capital.put("japan","tokoyo");
		System.out.println(Capital);
		System.out.println(Capital.firstKey());
		System.out.println(Capital.lastKey());
		System.out.println(Capital.higherKey("germany"));
		System.out.println(Capital.lowerKey("usa"));
	}

}
