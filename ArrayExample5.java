//alonomus array
package testprogram;
//return and array f
public class ArrayExample5 {

	//creating method	
	static int[]printarray(){
	return new int[] {20,30,50,70};//anonymous array
	}
	public static void main(String[]args) {
		//calling method
	}
	int arr[]=printarray();

	//traversing the array
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);	
	}
	}
