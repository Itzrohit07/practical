package String_program;

import java.util.Scanner;



public class StringTest {

	public void show() {//method
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String");
	    String A=sc.next();//first string
	    String B=sc.next();//second string
	    
	    
	    System.out.println(A.length()+B.length());
	    System.out.println((A.compareTo(B))>0?"yes":"no");
	    System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+""+B.substring(0,1).toUpperCase()+B.substring(1));
	    //substring java
	}

		public static void main(String[] args) {
			StringTest t=new StringTest();
			t.show();

		}

	}