package testprogram;

class harry{
	void show() {
		System.out.println("show anything");
	}
}
class carry extends harry{
	void show() {
		System.out.println("show nothing");
	}
}

public class Runtimegpoly1 {

	public static void main(String[] args) {
		harry h=new harry();
		h.show();

	}

}
