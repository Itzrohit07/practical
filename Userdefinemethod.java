package testprogram;

import java.util.Scanner;

public class Userdefinemethod {//and predefine

	public static void main(String[] args) {
		//create Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
	//taking input from user
		int a=sc.nextInt();
		//declear the method
		checkEvenOdd(a);//user define method
	}
    public static void checkEvenOdd(int a) {
    	if(a%2==0) 
    		System.out.println("this is even number"+a);
    		else 
    			System.out.println("this is odd number"+a);
    	}

{
	
}
}

