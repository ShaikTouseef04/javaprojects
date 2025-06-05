package xyz;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> student=new HashMap<Integer, String>();
		
		student.put(1, "Touseef");
		student.put(2, "Mohammed");
		student.put(3, "Dileep");
		student.put(4, "Dada");
		student.put(5, "Lothit");
		System.out.println(student);
		student.remove(1);
		System.out.println(student);
		student.put(5,"motu");
		System.out.println(student);
		
	}

}
