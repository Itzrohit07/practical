package testprogram;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("going to devided by 0");
				int  b=19/10;
				
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[]=new int[5];
				a[6]=4;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
				System.out.println("other statement");
			}
			catch(Exception e)
			{
				System.out.println("handled the exception(outer catch)");
			}
			System.out.println("normal flow...");
		

	}

}
