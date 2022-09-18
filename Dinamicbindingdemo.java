package testprogram;
class Test2 {
	void show() {
		System.out.println("Dinamic binding First");
	}
}

public class Dinamicbindingdemo extends Test2 {
     void show() {
    	 System.out.println("Dynamic Binding Second");
     }
	public static void main(String[] args) {
		Test2 obj=new Dinamicbindingdemo();
        obj.show();
	}

}
