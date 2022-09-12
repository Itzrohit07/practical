package testprogram;
import java.util.*;

public class Circle {
	
	private float redius;
	 static float pi=3.5f;
	 
	  public Circle(){
		redius=1.5f;	
	}
	 Circle(float redius){
		 this.redius=redius;
	 }
	 public Circle(float redius,float pi) {
		this.redius =redius; 
	 }
	 static float calculateCirclearea(float redius) {
		 return pi*redius*redius; 
	 }
	 static float calculateCircumference(float redius) {
		 return 2*pi*redius;
		 
	 }

 
	

	public static void main(String[] args) {
	 Circle obj=new Circle();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the redius: ");
	 float redius=sc.nextFloat();
	 
	System.out.println("circle area is:"+calculateCirclearea(redius));	
    System.out.println("calculate circumferance is:"+calculateCirclearea(redius));
    
    
    
	}

}
