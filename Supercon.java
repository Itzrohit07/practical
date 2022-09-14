package testprogram;
class shape2{
	public shape2()
	{
		System.out.println("hello");
	}
}
	class size2 extends shape2{
		size2(){
			super();
		
			System.out.println("hi");
		}
	}

public class Supercon {

	public static void main(String[] args) {
		size2 obj=new size2();

	}

}
