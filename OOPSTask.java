package xyz;

public class OOPSTask {
	private String name;
	private int rollNO;
	private int marks;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
		
	}
	public String classResult() {
		if(marks >=40) {
			return "pass";
		}else {
			return "fail";
		}
	}
	public void displaydetails() {
		System.out.println("Roll no"+""+getRollNo());
		System.out.println("Name"+""+getName());
		System.out.println("Marks"+""+getMarks());
		System.out.println("result"+""+checkResult());

	}
	public static void main(String[]args) {
		OOPSTask s1=new OOPSTask();
		
	}

}
