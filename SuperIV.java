package testprogram;
class shape{
	String name="circle";//Data member of parent class
}
class size extends shape{
	String name="Triangle";//Data member of child class
	void displayname() {
		System.out.println(name);//display the name of the size
		System.out.println(super.name);//display the name of shape class
	}
	
}

public class SuperIV {

	public static void main(String[] args) {
		size obj=new size();
		obj.displayname();

	}

}
