package testprogram;

public class MultiCatch {
static void mFunc() {
	try {
		//int i=50/2;//arithmetic
		/*int arr[]=new int[3];
		arr[4]=24;*/
	}
	/* catch(ArithmeticException e){
	 System.out.println(e);
	 }
	catch(ArrayIndexoutofBoundException e) {
		System.out.println(e);
	}
	 */
  finally {
	  System.out.println("i am finally block");
  }
}
	public static void main(String[] args) {
mFunc();

	}

}
