package xyz;
import java.util.*;

class Arraylist{
	public Arraylist(){
		ArrayList<String> st=new ArrayList<String>();
		st.add("shaik");
		st.add("pathan");
		st.add("syed");
		System.out.println("ArrayList:"+st);
		
	}
}
class Linkedlist extends Arraylist{
	public Linkedlist() {
		LinkedList<Integer> ts= new LinkedList<>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		System.out.println("LinkedList:"+ts);
	}
}
class Hashset extends Arraylist{
	public Hashset() {
		HashSet<Integer> roll=new HashSet<Integer>();
		roll.add(3301);
		roll.add(3302);
		roll.add(3303);
		roll.add(3304);
		System.out.println("HashSet:"+roll);
	}
}
class Hashmap extends Arraylist{
	public  Hashmap() {
		HashMap<Integer, String> students=new HashMap<>();
		students.put(501,"Touseef");
		students.put(502,"Saif");
		students.put(503,"Safan");
		System.out.println("HashMap:"+students);
		
	}
}



public class AllLists{

	public static void main(String[] args) {
		Arraylist a=new Arraylist();
		Linkedlist b=new Linkedlist();
		Hashset  c=new Hashset();
		Hashmap d=new Hashmap();		
	}

}
