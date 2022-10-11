package String_program;
import java.util.*;
public class StringTokenizereexample {//class
    public static void my() { //my method
    	StringTokenizer t=new StringTokenizer("Anudip foundation skill and carrer Devlopment");
    	while(t.hasMoreTokens()) {
    		System.out.println(t.nextToken(","));{  //string method it checks if there is more token available or not
    			while(t.hasMoreTokens()) {//string method it returns the next token from string tokenizer obj
    				System.out.println(t.nextToken(" "));
    				{
    					StringTokenizer st=new StringTokenizer("i am Rohit,staying naihati");
    					while(st.hasMoreTokens()) {
    						System.out.println(st.nextToken(","));
    					}
    				}
    			}
  
    		}
    	}
    }
		public static void main(String[] args) {
		my();	
	}
		
	}


