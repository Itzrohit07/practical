package testprogram;

public class Defaultconstractor {
	int age;//default value
	String name;//default value
	void show() {
		System.out.println(age+" "+ name );
	}
	public static void main(String[] args) {
	Defaultconstractor a=new Defaultconstractor();
	Defaultconstractor d=new Defaultconstractor();
	a.show();
	d.show();
	}
	

	}


