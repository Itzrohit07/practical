package testprogram;
  final class Finalkeyword{
	final void method() {
		int a=70;//we  can not declare final variable
		System.out.println(a);
	}
}

 class tt extends Finalkeyword {
	void method() {
		System.out.println("anything");
	}

	public static void main(String[] args) {
		Finalkeyword cc=new Finalkeyword();
		cc.method();
	}

}
 
