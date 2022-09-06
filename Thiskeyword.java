package testprogram;

public class Thiskeyword {
	int rollno;
	String name;
	float fee;
Thiskeyword(int rollno,String name, float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
void display() {
	System.out.println(rollno+" "+name+" "+fee);
}
	public static void main(String[] args) {
	
		Thiskeyword s1=new Thiskeyword(111,"pritam",1000);
		Thiskeyword s2=new Thiskeyword(333,"Rohit",3000);
	 s1.display();
	 s2.display();
	}
}

