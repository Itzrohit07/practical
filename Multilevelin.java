package testprogram;


class Vehcle1{
	void running() {
	System.out.println("running mode");
}
	}
class car extends Vehcle1{
	void run() {
		System.out.println("car run mode on");
	}
}
class Bike extends car{
	void speed() {
		System.out.println("speed is very high");
	}
}
public class Multilevelin {

	public static void main(String[] args) {
	Bike d= new Bike();
	d.running();
	d.run();
	d.speed();
	
	

	}

}
