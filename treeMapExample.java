package xyz;
import java.util.TreeMap;

public class treeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> student=new TreeMap<Integer, String>();
		student.put(5, "Touseef");
		student.put(2, "Mohammed");
		student.put(3, "Farsheed");
		student.put(4, "Afrieed");
		student.put(1, "Abdul");
		student.put(1, "Rab");
		
		System.out.println(student);
		System.out.println(student.remove(2));
	}

}
