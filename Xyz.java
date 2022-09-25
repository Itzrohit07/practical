package testprogram;

 interface Xyz {
	void print();
	default void show() {
		System.out.println("hi");
	}
}
class abc implements Xyz{
	public void print() {
		System.out.println("ptint the method");
	}
}
 class app{
		
		public static void main(String[]args) {
		abc x=new abc();
		x.show();
		x.print();
	}
}

