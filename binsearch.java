package xyz;

public class binsearch {

	public static void main(String[] args) {
		String arr[]= {"Amit","Divya","Karan","Zoya"};
		String target="Divya";
		int left=0;
		int right=arr.length;
		
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(arr[mid]==target) {
				System.out.println("Found"+" "+target+"at index"+""+mid);
				
				break;
			}else if(
) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		

	}

}
