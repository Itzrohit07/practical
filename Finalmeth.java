package testprogram;

class that{

	final void method() {
		int a=70;
		System.out.println(a);
	}
}
	class tc extends that{
		void method() {
		System.out.println("anything");
		}
	}
	public class Finalmeth {
	public static void main(String[] args) {
		 tc p=new tc();
		p.method();
		

	}
	}
		

