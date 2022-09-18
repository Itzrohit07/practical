package testprogram;
  class room{
	  void bark() {
		System.out.println("Barking"); 
		
	  }
  }
  class cat extends room {
	  void bark()
	  {
		  System.out.println("meow");
	  }
  }
  class dog extends room{
	  void bark()
	  {
		  System.out.println("baff");
	  }
  }
public class Runtimepolym {
	

	public static void main(String[] args) {
		room x;
		x=new cat();
		x.bark();
		x=new dog();
		x.bark();
		
	}

}
