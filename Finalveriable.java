//using final veriable
package testprogram;

public class Finalveriable {
//	  final variable
	final int value = 50;
//	 method
	void display() {
		 value = 30; // we can not change final variable
	}
	public static void main(String[] args) {
//		creating object of the parent class
		Finalveriable fv = new Finalveriable();
//		calling display method with  object
		fv.display();

	}

}