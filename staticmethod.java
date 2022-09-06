package testprogram;

public class staticmethod {
     int rollno;
     String name;
     float fee;
     static String collage="GMS";
     static void change() {
    	 collage="GNM";
     }
    staticmethod(int rollno,String name,float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
    }
	
	void display() {
	System.out.println(rollno+" "+name+" "+fee+" "+collage);
	}
    public static void main(String[] args) {
    	staticmethod. change();
    	staticmethod s1=new staticmethod(20,"Arnab",20000);	
    	staticmethod s2=new staticmethod(30,"Chanchal",50000);
     s1.display();
     s2.display();	
    }

}
