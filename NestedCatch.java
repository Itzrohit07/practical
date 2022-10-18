package testprogram;
import java.util.*;
 class NestedCatch {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);	
 System.out.println("enter two number");
 
 try {
	 int x=sc.nextInt();
	 int y=sc.nextInt();
	 System.out.println(" "+(x/y));
 }
 catch(InputMismatchException e) {
	 System.out.println(e);
 }
 catch(Exception e) {
	 System.out.println(e);
 }
	}

}
