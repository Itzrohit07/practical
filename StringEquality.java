//write a program to check two name is equal or not
package String_program;

import java.util.Scanner;
//check equality by using equal()method
public class StringEquality {

	public static void main(String[] args) {
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first string");
		str1 =sc.nextLine();
		
		System.out.println("enter the second String");
		str2 =sc.nextLine();
		//comparing two input string
		if(str1.equals(str2))
		System.out.println("Equal string");
		else
			System.out.println("Unequal string");
		
}
}