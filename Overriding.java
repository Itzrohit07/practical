package testprogram;

 class testOverriding {
   void run() {
	   System.out.println("runing moxe on");
   }
}
 public class Overriding extends testOverriding{
	void run() {
		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		//creating a object in child class
		Overriding obj=new Overriding();
		obj.run();
		

	}

}
