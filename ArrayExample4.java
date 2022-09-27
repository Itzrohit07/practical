package testprogram;

public class ArrayExample4 {

	public static void main(String[] args) {
		display(new int [] {10,20,30,40,50});//passing anonymous array
	}
		//creating a method which receives an array a parameter
		static void display(int arr[]) {
			for(int i=0;i<=arr.length-1;i++)
				System.out.println(arr[i]);
		
		}

	}


