package String_program;
import java.util.*;
//Represent any object to string
public class ToString {
    int rollno; //integer type variable
    String name,adder; //String
    ToString(int rollno,String name,String adder){
    	this.rollno=rollno;
    	this.name=name;
    	this.adder=adder;
    }
    public String toString() {
    //return super.toString();//object to string
    return rollno+" "+name+" "+adder;	
    }
	public static void main(String[] args) {
		ToString s1=new ToString(1,"Rohit","Tokio");
		ToString s2=new ToString(2,"Pritam","Japan");
     
		System.out.println(s1);
		System.out.println(s2);
	}

}
