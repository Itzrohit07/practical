package testprogram;

 class operation {
	int square(int a) {
	return a*a;
}
}
public class Circlee{
	operation op;
	double pi=3.14;
	
	double area(int r) {
		op =new operation();
		int rsquare=op.square(r);
		return pi*rsquare;
	}

	public static void main(String[] args) {
		Circlee s=new Circlee();
		double result=s.area(6);
		System.out.println(result);

	}

}
